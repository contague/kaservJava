package Model.MakingData;

import Model.Connect.ConectDB;
import Model.Connect.GetSession;
import Model.Entities.CustKlientEntity;
import Model.Entities.CustUserEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class ChangePass {

    public boolean changeData(String pass, String idCustUser){
        Connection connection = null;
        String command;
        boolean result = false;
        try {
            connection = new ConectDB().getConnection();
            command = "UPDATE CUST_USER SET PASSWORD_CUST_USER = '" + pass + "' WHERE ID_CUST_USER = " + idCustUser;
            Statement statement = connection.createStatement();
            statement.executeUpdate(command);
            result = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return result;
    }
}
