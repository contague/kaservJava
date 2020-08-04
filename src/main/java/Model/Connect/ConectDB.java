package Model.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectDB {
    private static final String URL = "jdbc:firebirdsql://178.69.191.239:3050/d:/old.fdb?charSet=utf-8&roleName=yourRole";
    private static final String driver = "org.firebirdsql.jdbc.FBDriver";
    private static final String name = "SYSDBA";
    private static final String pass = "masterkey";
    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(URL, name, pass);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
