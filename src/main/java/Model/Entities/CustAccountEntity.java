package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CUST_ACCOUNT", schema = "", catalog = "")
public class CustAccountEntity {
    private long idCustAccount;
    private Long idbaseCustAccount;
    private Long idextDoutCustAccount;
    private Long idextBaseCustAccount;
    private String gidCustAccount;
    private Long idgrpCustAccount;
    private String nameCustAccount;
    private String descrCustAccount;
    private Long iduserCustAccount;
    private String passwordCustAccount;
    private String loginCustAccount;
    private Short typeTblCustAccount;
//    private CustAccountGrpEntity custAccountGrpByIdgrpCustAccount;
//    private SuserEntity suserByIduserCustAccount;
    private Collection<CustKlientEntity> custKlientsByIdCustAccount;
//    private Collection<CustMainmenuEntity> custMainmenusByIdCustAccount;
//    private Collection<CustMainmenuGrpEntity> custMainmenuGrpsByIdCustAccount;
//    private Collection<CustPrivEntity> custPrivsByIdCustAccount;
//    private Collection<CustPrivGrpEntity> custPrivGrpsByIdCustAccount;
    private Collection<CustUserEntity> custUsersByIdCustAccount;
//    private Collection<CustUserGrpEntity> custUserGrpsByIdCustAccount;

    @Id
    @Column(name = "ID_CUST_ACCOUNT", nullable = false)
    public long getIdCustAccount() {
        return idCustAccount;
    }

    public void setIdCustAccount(long idCustAccount) {
        this.idCustAccount = idCustAccount;
    }

    @Basic
    @Column(name = "IDBASE_CUST_ACCOUNT", nullable = true)
    public Long getIdbaseCustAccount() {
        return idbaseCustAccount;
    }

    public void setIdbaseCustAccount(Long idbaseCustAccount) {
        this.idbaseCustAccount = idbaseCustAccount;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_CUST_ACCOUNT", nullable = true)
    public Long getIdextDoutCustAccount() {
        return idextDoutCustAccount;
    }

    public void setIdextDoutCustAccount(Long idextDoutCustAccount) {
        this.idextDoutCustAccount = idextDoutCustAccount;
    }

    @Basic
    @Column(name = "IDEXT_BASE_CUST_ACCOUNT", nullable = true)
    public Long getIdextBaseCustAccount() {
        return idextBaseCustAccount;
    }

    public void setIdextBaseCustAccount(Long idextBaseCustAccount) {
        this.idextBaseCustAccount = idextBaseCustAccount;
    }

    @Basic
    @Column(name = "GID_CUST_ACCOUNT", nullable = true, length = 10)
    public String getGidCustAccount() {
        return gidCustAccount;
    }

    public void setGidCustAccount(String gidCustAccount) {
        this.gidCustAccount = gidCustAccount;
    }

    @Basic
    @Column(name = "IDGRP_CUST_ACCOUNT", nullable = true)
    public Long getIdgrpCustAccount() {
        return idgrpCustAccount;
    }

    public void setIdgrpCustAccount(Long idgrpCustAccount) {
        this.idgrpCustAccount = idgrpCustAccount;
    }

    @Basic
    @Column(name = "NAME_CUST_ACCOUNT", nullable = true, length = 200)
    public String getNameCustAccount() {
        return nameCustAccount;
    }

    public void setNameCustAccount(String nameCustAccount) {
        this.nameCustAccount = nameCustAccount;
    }

    @Basic
    @Column(name = "DESCR_CUST_ACCOUNT", nullable = true, length = 200)
    public String getDescrCustAccount() {
        return descrCustAccount;
    }

    public void setDescrCustAccount(String descrCustAccount) {
        this.descrCustAccount = descrCustAccount;
    }

    @Basic
    @Column(name = "IDUSER_CUST_ACCOUNT", nullable = true)
    public Long getIduserCustAccount() {
        return iduserCustAccount;
    }

    public void setIduserCustAccount(Long iduserCustAccount) {
        this.iduserCustAccount = iduserCustAccount;
    }

    @Basic
    @Column(name = "PASSWORD_CUST_ACCOUNT", nullable = true, length = 60)
    public String getPasswordCustAccount() {
        return passwordCustAccount;
    }

    public void setPasswordCustAccount(String passwordCustAccount) {
        this.passwordCustAccount = passwordCustAccount;
    }

    @Basic
    @Column(name = "LOGIN_CUST_ACCOUNT", nullable = true, length = 40)
    public String getLoginCustAccount() {
        return loginCustAccount;
    }

    public void setLoginCustAccount(String loginCustAccount) {
        this.loginCustAccount = loginCustAccount;
    }

    @Basic
    @Column(name = "TYPE_TBL_CUST_ACCOUNT", nullable = true)
    public Short getTypeTblCustAccount() {
        return typeTblCustAccount;
    }

    public void setTypeTblCustAccount(Short typeTblCustAccount) {
        this.typeTblCustAccount = typeTblCustAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustAccountEntity that = (CustAccountEntity) o;

        if (idCustAccount != that.idCustAccount) return false;
        if (idbaseCustAccount != null ? !idbaseCustAccount.equals(that.idbaseCustAccount) : that.idbaseCustAccount != null)
            return false;
        if (idextDoutCustAccount != null ? !idextDoutCustAccount.equals(that.idextDoutCustAccount) : that.idextDoutCustAccount != null)
            return false;
        if (idextBaseCustAccount != null ? !idextBaseCustAccount.equals(that.idextBaseCustAccount) : that.idextBaseCustAccount != null)
            return false;
        if (gidCustAccount != null ? !gidCustAccount.equals(that.gidCustAccount) : that.gidCustAccount != null)
            return false;
        if (idgrpCustAccount != null ? !idgrpCustAccount.equals(that.idgrpCustAccount) : that.idgrpCustAccount != null)
            return false;
        if (nameCustAccount != null ? !nameCustAccount.equals(that.nameCustAccount) : that.nameCustAccount != null)
            return false;
        if (descrCustAccount != null ? !descrCustAccount.equals(that.descrCustAccount) : that.descrCustAccount != null)
            return false;
        if (iduserCustAccount != null ? !iduserCustAccount.equals(that.iduserCustAccount) : that.iduserCustAccount != null)
            return false;
        if (passwordCustAccount != null ? !passwordCustAccount.equals(that.passwordCustAccount) : that.passwordCustAccount != null)
            return false;
        if (loginCustAccount != null ? !loginCustAccount.equals(that.loginCustAccount) : that.loginCustAccount != null)
            return false;
        if (typeTblCustAccount != null ? !typeTblCustAccount.equals(that.typeTblCustAccount) : that.typeTblCustAccount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idCustAccount ^ (idCustAccount >>> 32));
        result = 31 * result + (idbaseCustAccount != null ? idbaseCustAccount.hashCode() : 0);
        result = 31 * result + (idextDoutCustAccount != null ? idextDoutCustAccount.hashCode() : 0);
        result = 31 * result + (idextBaseCustAccount != null ? idextBaseCustAccount.hashCode() : 0);
        result = 31 * result + (gidCustAccount != null ? gidCustAccount.hashCode() : 0);
        result = 31 * result + (idgrpCustAccount != null ? idgrpCustAccount.hashCode() : 0);
        result = 31 * result + (nameCustAccount != null ? nameCustAccount.hashCode() : 0);
        result = 31 * result + (descrCustAccount != null ? descrCustAccount.hashCode() : 0);
        result = 31 * result + (iduserCustAccount != null ? iduserCustAccount.hashCode() : 0);
        result = 31 * result + (passwordCustAccount != null ? passwordCustAccount.hashCode() : 0);
        result = 31 * result + (loginCustAccount != null ? loginCustAccount.hashCode() : 0);
        result = 31 * result + (typeTblCustAccount != null ? typeTblCustAccount.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDGRP_CUST_ACCOUNT", referencedColumnName = "ID_CUST_ACCOUNT_GRP")
//    public CustAccountGrpEntity getCustAccountGrpByIdgrpCustAccount() {
//        return custAccountGrpByIdgrpCustAccount;
//    }
//
//    public void setCustAccountGrpByIdgrpCustAccount(CustAccountGrpEntity custAccountGrpByIdgrpCustAccount) {
//        this.custAccountGrpByIdgrpCustAccount = custAccountGrpByIdgrpCustAccount;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDUSER_CUST_ACCOUNT", referencedColumnName = "ID_USER")
//    public SuserEntity getSuserByIduserCustAccount() {
//        return suserByIduserCustAccount;
//    }
//
//    public void setSuserByIduserCustAccount(SuserEntity suserByIduserCustAccount) {
//        this.suserByIduserCustAccount = suserByIduserCustAccount;
//    }

    @OneToMany(mappedBy = "custAccountByIdaccountCustKlient")
    public Collection<CustKlientEntity> getCustKlientsByIdCustAccount() {
        return custKlientsByIdCustAccount;
    }

    public void setCustKlientsByIdCustAccount(Collection<CustKlientEntity> custKlientsByIdCustAccount) {
        this.custKlientsByIdCustAccount = custKlientsByIdCustAccount;
    }
//
//    @OneToMany(mappedBy = "custAccountByIdaccountCustMainmenu")
//    public Collection<CustMainmenuEntity> getCustMainmenusByIdCustAccount() {
//        return custMainmenusByIdCustAccount;
//    }
//
//    public void setCustMainmenusByIdCustAccount(Collection<CustMainmenuEntity> custMainmenusByIdCustAccount) {
//        this.custMainmenusByIdCustAccount = custMainmenusByIdCustAccount;
//    }

//    @OneToMany(mappedBy = "custAccountByIdaccountCustMainmenuGrp")
//    public Collection<CustMainmenuGrpEntity> getCustMainmenuGrpsByIdCustAccount() {
//        return custMainmenuGrpsByIdCustAccount;
//    }
//
//    public void setCustMainmenuGrpsByIdCustAccount(Collection<CustMainmenuGrpEntity> custMainmenuGrpsByIdCustAccount) {
//        this.custMainmenuGrpsByIdCustAccount = custMainmenuGrpsByIdCustAccount;
//    }
//
//    @OneToMany(mappedBy = "custAccountByIdaccountCustPriv")
//    public Collection<CustPrivEntity> getCustPrivsByIdCustAccount() {
//        return custPrivsByIdCustAccount;
//    }
//
//    public void setCustPrivsByIdCustAccount(Collection<CustPrivEntity> custPrivsByIdCustAccount) {
//        this.custPrivsByIdCustAccount = custPrivsByIdCustAccount;
//    }
//
//    @OneToMany(mappedBy = "custAccountByIdaccountCustPrivGrp")
//    public Collection<CustPrivGrpEntity> getCustPrivGrpsByIdCustAccount() {
//        return custPrivGrpsByIdCustAccount;
//    }
//
//    public void setCustPrivGrpsByIdCustAccount(Collection<CustPrivGrpEntity> custPrivGrpsByIdCustAccount) {
//        this.custPrivGrpsByIdCustAccount = custPrivGrpsByIdCustAccount;
//    }

    @OneToMany(mappedBy = "custAccountByIdaccountCustUser")
    public Collection<CustUserEntity> getCustUsersByIdCustAccount() {
        return custUsersByIdCustAccount;
    }

    public void setCustUsersByIdCustAccount(Collection<CustUserEntity> custUsersByIdCustAccount) {
        this.custUsersByIdCustAccount = custUsersByIdCustAccount;
    }

//    @OneToMany(mappedBy = "custAccountByIdaccountCustUserGrp")
//    public Collection<CustUserGrpEntity> getCustUserGrpsByIdCustAccount() {
//        return custUserGrpsByIdCustAccount;
//    }
//
//    public void setCustUserGrpsByIdCustAccount(Collection<CustUserGrpEntity> custUserGrpsByIdCustAccount) {
//        this.custUserGrpsByIdCustAccount = custUserGrpsByIdCustAccount;
//    }
}
