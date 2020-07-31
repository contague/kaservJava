package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.ArtIbSEntity;
import Model.Entities.ArtImgEntity;
import net.iharder.Base64;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;


public class GetInfoBlock implements ListDAO {

    public ArrayList getList(int id, String firstDate, String secondDate, String option, String login) {
        ArrayList<String[]> list = new ArrayList();
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
                list.add(new String[]{artIbSEntity.getTypeArtIbS().toString(), artIbSEntity.getTextArtIbS(), img});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return list;
    }
}