package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.CustUserEntity;
import Model.Entity.ResultChangePassEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class ChangePass {

    private String pass;
    private String idCustUser;

    public ChangePass() {
    }

    public ChangePass(String pass, String idCustUser) {
        this.pass = pass;
        this.idCustUser = idCustUser;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getIdCustUser() {
        return idCustUser;
    }

    public void setIdCustUser(String idCustUser) {
        this.idCustUser = idCustUser;
    }

    public ResultChangePassEntity changePassword(){
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
        return new ResultChangePassEntity(result);
    }
}
