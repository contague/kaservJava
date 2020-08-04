package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.SetupEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class GetPhotoPath {
    public String getPath(){
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<SetupEntity> list;
        String path = "";
        try {
            list = session.createQuery("from SetupEntity where idSetup = 402").list();
            Iterator<SetupEntity> iterator = list.iterator();
            path = iterator.next().getValueSetup();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {

        }
        return path;
    }
}
