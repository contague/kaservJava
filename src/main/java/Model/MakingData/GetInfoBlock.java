package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.ArtIbSEntity;
import Model.Entities.ArtImgEntity;
import Model.Entity.InfoBlockElementEntity;
import net.iharder.Base64;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;


public class GetInfoBlock {

    private String id;

    public GetInfoBlock() {
    }

    public GetInfoBlock(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<InfoBlockElementEntity> getList() {

        ArrayList<InfoBlockElementEntity> infoBlockList = new ArrayList<InfoBlockElementEntity>();

        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<ArtIbSEntity> entityList;
        String img;
        try {
            entityList = session.createQuery("from ArtIbSEntity where idibArtIbS = " + id + " order by indexArtIbS").list();

            for (ArtIbSEntity artIbSEntity : entityList) {
                ArtImgEntity imgEntity = artIbSEntity.getArtImgByIdimgArtIbS();
                if ((imgEntity != null) && (imgEntity.getImageArtImg() != null)) {
                    img = Base64.encodeBytes(imgEntity.getImageArtImg());
                } else img = "";
                infoBlockList.add(new InfoBlockElementEntity(artIbSEntity.getTypeArtIbS().toString(), artIbSEntity.getTextArtIbS(), img));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return infoBlockList;
    }
}