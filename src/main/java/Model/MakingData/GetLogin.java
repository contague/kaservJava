package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entities.CustAccountEntity;
import Model.Entities.CustUserEntity;
import Model.Entity.LoginSessionEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GetLogin {

    private String log;
    private String pass;

    public GetLogin() {
    }

    public GetLogin(String log, String pass) {
        this.log = log;
        this.pass = pass;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public LoginSessionEntity getLogin(LoginSessionEntity loginSessionEntity) {
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<CustAccountEntity> custAccountEntities;

        try {
            custAccountEntities = session.createQuery("from CustAccountEntity where loginCustAccount = '" + log + "'").list();
            CustAccountEntity custAccountEntity = custAccountEntities.get(0);
            Collection<CustUserEntity> custUserEntities = custAccountEntity.getCustUsersByIdCustAccount();
            Iterator<CustUserEntity> custUserEntityIterator = custUserEntities.iterator();
            CustUserEntity custUserEntity = custUserEntityIterator.next();
            String password = custUserEntity.getPasswordCustUser();

            if(pass.equals(password)){
                loginSessionEntity.setIdAccount(custUserEntity.getIdaccountCustUser() + "");
                loginSessionEntity.setIdGroupUser(custUserEntity.getIdgrpCustUser() + "");
                loginSessionEntity.setRole("diler");
                loginSessionEntity.setIdCustUser(custUserEntity.getIdCustUser() + "");
            }

            else {
                loginSessionEntity.setIdAccount("0");
                loginSessionEntity.setIdGroupUser("0");
                loginSessionEntity.setRole("guest");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }

        return loginSessionEntity;
    }
}
