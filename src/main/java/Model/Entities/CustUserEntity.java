package Model.Entities;

import javax.persistence.*;

@Entity
@Table(name = "CUST_USER", schema = "", catalog = "")
public class CustUserEntity {
    private long idCustUser;
//    private Long idbaseCustUser;
//    private Long idextBaseCustUser;
//    private Long idextDoutCustUser;
//    private String gidCustUser;
    private Long idaccountCustUser;
    private Long idgrpCustUser;
//    private String nameCustUser;
//    private String loginCustUser;
    private String passwordCustUser;
//    private Short typeTblCustUser;
    private CustAccountEntity custAccountByIdaccountCustUser;
    //private CustUserGrpEntity custUserGrpByIdgrpCustUser;

    @Id
    @Column(name = "ID_CUST_USER", nullable = false)
    public long getIdCustUser() {
        return idCustUser;
    }

    public void setIdCustUser(long idCustUser) {
        this.idCustUser = idCustUser;
    }

//    @Basic
//    @Column(name = "IDBASE_CUST_USER", nullable = true)
//    public Long getIdbaseCustUser() {
//        return idbaseCustUser;
//    }
//
//    public void setIdbaseCustUser(Long idbaseCustUser) {
//        this.idbaseCustUser = idbaseCustUser;
//    }
//
//    @Basic
//    @Column(name = "IDEXT_BASE_CUST_USER", nullable = true)
//    public Long getIdextBaseCustUser() {
//        return idextBaseCustUser;
//    }
//
//    public void setIdextBaseCustUser(Long idextBaseCustUser) {
//        this.idextBaseCustUser = idextBaseCustUser;
//    }
//
//    @Basic
//    @Column(name = "IDEXT_DOUT_CUST_USER", nullable = true)
//    public Long getIdextDoutCustUser() {
//        return idextDoutCustUser;
//    }
//
//    public void setIdextDoutCustUser(Long idextDoutCustUser) {
//        this.idextDoutCustUser = idextDoutCustUser;
//    }
//
//    @Basic
//    @Column(name = "GID_CUST_USER", nullable = true, length = 10)
//    public String getGidCustUser() {
//        return gidCustUser;
//    }
//
//    public void setGidCustUser(String gidCustUser) {
//        this.gidCustUser = gidCustUser;
//    }
//
    @Basic
    @Column(name = "IDACCOUNT_CUST_USER", nullable = true)
    public Long getIdaccountCustUser() {
        return idaccountCustUser;
    }

    public void setIdaccountCustUser(Long idaccountCustUser) {
        this.idaccountCustUser = idaccountCustUser;
    }
//
    @Basic
    @Column(name = "IDGRP_CUST_USER", nullable = true)
    public Long getIdgrpCustUser() {
        return idgrpCustUser;
    }

    public void setIdgrpCustUser(Long idgrpCustUser) {
        this.idgrpCustUser = idgrpCustUser;
    }
//
//    @Basic
//    @Column(name = "NAME_CUST_USER", nullable = true, length = 200)
//    public String getNameCustUser() {
//        return nameCustUser;
//    }
//
//    public void setNameCustUser(String nameCustUser) {
//        this.nameCustUser = nameCustUser;
//    }
//
//    @Basic
//    @Column(name = "LOGIN_CUST_USER", nullable = true, length = 40)
//    public String getLoginCustUser() {
//        return loginCustUser;
//    }
//
//    public void setLoginCustUser(String loginCustUser) {
//        this.loginCustUser = loginCustUser;
//    }
//
    @Basic
    @Column(name = "PASSWORD_CUST_USER", nullable = true, length = 60)
    public String getPasswordCustUser() {
        return passwordCustUser;
    }

    public void setPasswordCustUser(String passwordCustUser) {
        this.passwordCustUser = passwordCustUser;
    }

//    @Basic
//    @Column(name = "TYPE_TBL_CUST_USER", nullable = true)
//    public Short getTypeTblCustUser() {
//        return typeTblCustUser;
//    }
//
//    public void setTypeTblCustUser(Short typeTblCustUser) {
//        this.typeTblCustUser = typeTblCustUser;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustUserEntity that = (CustUserEntity) o;

        if (idCustUser != that.idCustUser) return false;
//        if (idbaseCustUser != null ? !idbaseCustUser.equals(that.idbaseCustUser) : that.idbaseCustUser != null)
//            return false;
//        if (idextBaseCustUser != null ? !idextBaseCustUser.equals(that.idextBaseCustUser) : that.idextBaseCustUser != null)
//            return false;
//        if (idextDoutCustUser != null ? !idextDoutCustUser.equals(that.idextDoutCustUser) : that.idextDoutCustUser != null)
//            return false;
//        if (gidCustUser != null ? !gidCustUser.equals(that.gidCustUser) : that.gidCustUser != null) return false;
        if (idaccountCustUser != null ? !idaccountCustUser.equals(that.idaccountCustUser) : that.idaccountCustUser != null)
            return false;
        if (idgrpCustUser != null ? !idgrpCustUser.equals(that.idgrpCustUser) : that.idgrpCustUser != null)
            return false;
//        if (nameCustUser != null ? !nameCustUser.equals(that.nameCustUser) : that.nameCustUser != null) return false;
//        if (loginCustUser != null ? !loginCustUser.equals(that.loginCustUser) : that.loginCustUser != null)
//            return false;
        if (passwordCustUser != null ? !passwordCustUser.equals(that.passwordCustUser) : that.passwordCustUser != null)
            return false;
//        if (typeTblCustUser != null ? !typeTblCustUser.equals(that.typeTblCustUser) : that.typeTblCustUser != null)
//            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idCustUser ^ (idCustUser >>> 32));
//        result = 31 * result + (idbaseCustUser != null ? idbaseCustUser.hashCode() : 0);
//        result = 31 * result + (idextBaseCustUser != null ? idextBaseCustUser.hashCode() : 0);
//        result = 31 * result + (idextDoutCustUser != null ? idextDoutCustUser.hashCode() : 0);
//        result = 31 * result + (gidCustUser != null ? gidCustUser.hashCode() : 0);
        result = 31 * result + (idaccountCustUser != null ? idaccountCustUser.hashCode() : 0);
        result = 31 * result + (idgrpCustUser != null ? idgrpCustUser.hashCode() : 0);
//        result = 31 * result + (nameCustUser != null ? nameCustUser.hashCode() : 0);
//        result = 31 * result + (loginCustUser != null ? loginCustUser.hashCode() : 0);
        result = 31 * result + (passwordCustUser != null ? passwordCustUser.hashCode() : 0);
//        result = 31 * result + (typeTblCustUser != null ? typeTblCustUser.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDACCOUNT_CUST_USER", referencedColumnName = "ID_CUST_ACCOUNT", insertable = false, updatable = false)
    public CustAccountEntity getCustAccountByIdaccountCustUser() {
        return custAccountByIdaccountCustUser;
    }

    public void setCustAccountByIdaccountCustUser(CustAccountEntity custAccountByIdaccountCustUser) {
        this.custAccountByIdaccountCustUser = custAccountByIdaccountCustUser;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDGRP_CUST_USER", referencedColumnName = "ID_CUST_USER_GRP")
//    public CustUserGrpEntity getCustUserGrpByIdgrpCustUser() {
//        return custUserGrpByIdgrpCustUser;
//    }
//
//    public void setCustUserGrpByIdgrpCustUser(CustUserGrpEntity custUserGrpByIdgrpCustUser) {
//        this.custUserGrpByIdgrpCustUser = custUserGrpByIdgrpCustUser;
//    }
}
