package Model.Entities;

import javax.persistence.*;

@Entity
@Table(name = "CUST_KLIENT", schema = "", catalog = "")
public class CustKlientEntity {
    private long idCustKlient;
    private Long idbaseCustKlient;
    private Long idextDoutCustKlient;
    private Long idextBaseCustKlient;
    private String gidCustKlient;
    private Long idaccountCustKlient;
    private Long idklientCustKlient;
    private Short typeTblCustKlient;
    private CustAccountEntity custAccountByIdaccountCustKlient;
    private SklientEntity sklientByIdklientCustKlient;

    @Id
    @Column(name = "ID_CUST_KLIENT", nullable = false)
    public long getIdCustKlient() {
        return idCustKlient;
    }

    public void setIdCustKlient(long idCustKlient) {
        this.idCustKlient = idCustKlient;
    }

    @Basic
    @Column(name = "IDBASE_CUST_KLIENT", nullable = true)
    public Long getIdbaseCustKlient() {
        return idbaseCustKlient;
    }

    public void setIdbaseCustKlient(Long idbaseCustKlient) {
        this.idbaseCustKlient = idbaseCustKlient;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_CUST_KLIENT", nullable = true)
    public Long getIdextDoutCustKlient() {
        return idextDoutCustKlient;
    }

    public void setIdextDoutCustKlient(Long idextDoutCustKlient) {
        this.idextDoutCustKlient = idextDoutCustKlient;
    }

    @Basic
    @Column(name = "IDEXT_BASE_CUST_KLIENT", nullable = true)
    public Long getIdextBaseCustKlient() {
        return idextBaseCustKlient;
    }

    public void setIdextBaseCustKlient(Long idextBaseCustKlient) {
        this.idextBaseCustKlient = idextBaseCustKlient;
    }

    @Basic
    @Column(name = "GID_CUST_KLIENT", nullable = true, length = 10)
    public String getGidCustKlient() {
        return gidCustKlient;
    }

    public void setGidCustKlient(String gidCustKlient) {
        this.gidCustKlient = gidCustKlient;
    }

    @Basic
    @Column(name = "IDACCOUNT_CUST_KLIENT", nullable = true)
    public Long getIdaccountCustKlient() {
        return idaccountCustKlient;
    }

    public void setIdaccountCustKlient(Long idaccountCustKlient) {
        this.idaccountCustKlient = idaccountCustKlient;
    }

    @Basic
    @Column(name = "IDKLIENT_CUST_KLIENT", nullable = true)
    public Long getIdklientCustKlient() {
        return idklientCustKlient;
    }

    public void setIdklientCustKlient(Long idklientCustKlient) {
        this.idklientCustKlient = idklientCustKlient;
    }

    @Basic
    @Column(name = "TYPE_TBL_CUST_KLIENT", nullable = true)
    public Short getTypeTblCustKlient() {
        return typeTblCustKlient;
    }

    public void setTypeTblCustKlient(Short typeTblCustKlient) {
        this.typeTblCustKlient = typeTblCustKlient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustKlientEntity that = (CustKlientEntity) o;

        if (idCustKlient != that.idCustKlient) return false;
        if (idbaseCustKlient != null ? !idbaseCustKlient.equals(that.idbaseCustKlient) : that.idbaseCustKlient != null)
            return false;
        if (idextDoutCustKlient != null ? !idextDoutCustKlient.equals(that.idextDoutCustKlient) : that.idextDoutCustKlient != null)
            return false;
        if (idextBaseCustKlient != null ? !idextBaseCustKlient.equals(that.idextBaseCustKlient) : that.idextBaseCustKlient != null)
            return false;
        if (gidCustKlient != null ? !gidCustKlient.equals(that.gidCustKlient) : that.gidCustKlient != null)
            return false;
        if (idaccountCustKlient != null ? !idaccountCustKlient.equals(that.idaccountCustKlient) : that.idaccountCustKlient != null)
            return false;
        if (idklientCustKlient != null ? !idklientCustKlient.equals(that.idklientCustKlient) : that.idklientCustKlient != null)
            return false;
        if (typeTblCustKlient != null ? !typeTblCustKlient.equals(that.typeTblCustKlient) : that.typeTblCustKlient != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idCustKlient ^ (idCustKlient >>> 32));
        result = 31 * result + (idbaseCustKlient != null ? idbaseCustKlient.hashCode() : 0);
        result = 31 * result + (idextDoutCustKlient != null ? idextDoutCustKlient.hashCode() : 0);
        result = 31 * result + (idextBaseCustKlient != null ? idextBaseCustKlient.hashCode() : 0);
        result = 31 * result + (gidCustKlient != null ? gidCustKlient.hashCode() : 0);
        result = 31 * result + (idaccountCustKlient != null ? idaccountCustKlient.hashCode() : 0);
        result = 31 * result + (idklientCustKlient != null ? idklientCustKlient.hashCode() : 0);
        result = 31 * result + (typeTblCustKlient != null ? typeTblCustKlient.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDACCOUNT_CUST_KLIENT", referencedColumnName = "ID_CUST_ACCOUNT")
    public CustAccountEntity getCustAccountByIdaccountCustKlient() {
        return custAccountByIdaccountCustKlient;
    }

    public void setCustAccountByIdaccountCustKlient(CustAccountEntity custAccountByIdaccountCustKlient) {
        this.custAccountByIdaccountCustKlient = custAccountByIdaccountCustKlient;
    }

    @ManyToOne
    @JoinColumn(name = "IDKLIENT_CUST_KLIENT", referencedColumnName = "IDKLIENT")
    public SklientEntity getSklientByIdklientCustKlient() {
        return sklientByIdklientCustKlient;
    }

    public void setSklientByIdklientCustKlient(SklientEntity sklientByIdklientCustKlient) {
        this.sklientByIdklientCustKlient = sklientByIdklientCustKlient;
    }
}
