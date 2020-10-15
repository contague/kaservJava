package Model.Entity;

public class LoginSessionEntity {
    private String idAccount = "0";
    private String role = "guest";
    private String idGroupUser = "0";
    private String idCustUser;
    private String login;

    public LoginSessionEntity() {
    }

    public LoginSessionEntity(String idAccount, String role, String idGroupUser, String idCustUser, String login) {
        this.idAccount = idAccount;
        this.role = role;
        this.idGroupUser = idGroupUser;
        this.idCustUser = idCustUser;
        this.login = login;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIdGroupUser() {
        return idGroupUser;
    }

    public void setIdGroupUser(String idGroupUser) {
        this.idGroupUser = idGroupUser;
    }

    public String getIdCustUser() {
        return idCustUser;
    }

    public void setIdCustUser(String idCustUser) {
        this.idCustUser = idCustUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LoginEntity getLog(){
        return new LoginEntity(role);
    }

}
