package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.CustUserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class ChangePass {

    public boolean changePassword(String pass, String idCustUser){
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<CustUserEntity> list;
        boolean result = false;
        try {
            list = session.createQuery("from CustUserEntity where idCustUser = '" + idCustUser + "'").list();
            Iterator<CustUserEntity> iterator = list.iterator();
            CustUserEntity custUserEntity = iterator.next();
            custUserEntity.setPasswordCustUser(pass);

            result = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return result;
    }
}
