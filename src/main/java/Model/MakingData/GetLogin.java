package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.CustAccountEntity;
import Model.Entities.CustUserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GetLogin implements MapDAO {

    public HashMap getMap(String number, String surname) {
        HashMap<String, String> map = new HashMap<String, String>();
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<CustAccountEntity> custAccountEntities;

        try {
            custAccountEntities = session.createQuery("from CustAccountEntity where loginCustAccount = '" + surname + "'").list();
            CustAccountEntity custAccountEntity = custAccountEntities.get(0);
            Collection<CustUserEntity> custUserEntities = custAccountEntity.getCustUsersByIdCustAccount();
            Iterator<CustUserEntity> custUserEntityIterator = custUserEntities.iterator();
            CustUserEntity custUserEntity = custUserEntityIterator.next();
            String pass = custUserEntity.getPasswordCustUser();

            if(number.equals(pass)){
                map.put("idAccount", custUserEntity.getIdaccountCustUser() + "");
                map.put("idGroupUser", custUserEntity.getIdgrpCustUser() + "");
                map.put("role", "diler");
                map.put("idCustUser", custUserEntity.getIdCustUser() + "");
            }

            else {
                map.put("idAccount", "0");
                map.put("idGroupUser", "0");
                map.put("role", "guest");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }

        return map;
    }
}
