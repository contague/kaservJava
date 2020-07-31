package Model.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "REM_DREMONTT", schema = "", catalog = "")
public class RemDremonttEntity {
    private long idRemDremontt;
    private Long iddocRemDremontt;
    private Long idbaseRemDremontt;
    private Long idextDoutRemDremontt;
    private Long idextBaseRemDremontt;
    private Long idnomRemDremontt;
    private Long idedRemDremontt;
    private BigDecimal kolRemDremontt;
    private BigDecimal kfRemDremontt;
    private BigDecimal priceRemDremontt;
    private BigDecimal sumRemDremontt;
    private BigDecimal summexRemDremontt;
    private BigDecimal pricemexRemDremontt;
    private Long idhwRemDremontt;
    private Short dvregRemDremontt;
    private Short typeTblRemDremontt;
    private Short vdRemDremontt;
    private Short repProducerRemDremontt;
    private Long idhwoldRemDremontt;
    private Long idtnomRemDremontt;
    private Long idhwDonorRemDremontt;
    private Long idtypUselRemDremontt;
    private String descrRemDremontt;
    private Long idmhranRemDremontt;
//    private RemGalldocEntity remGalldocByIddocRemDremontt;
    private SnomEntity snomByIdnomRemDremontt;
//    private SedEntity sedByIdedRemDremontt;
//    private RemShardwareEntity remShardwareByIdhwRemDremontt;
//    private RemShardwareEntity remShardwareByIdhwoldRemDremontt;
//    private StnomEntity stnomByIdtnomRemDremontt;
//    private RemShardwareEntity remShardwareByIdhwDonorRemDremontt;
//    private RemStypuslovEntity remStypuslovByIdtypUselRemDremontt;
//    private SmhranEntity smhranByIdmhranRemDremontt;

    @Id
    @Column(name = "ID_REM_DREMONTT", nullable = false)
    public long getIdRemDremontt() {
        return idRemDremontt;
    }

    public void setIdRemDremontt(long idRemDremontt) {
        this.idRemDremontt = idRemDremontt;
    }

    @Basic
    @Column(name = "IDDOC_REM_DREMONTT", nullable = true)
    public Long getIddocRemDremontt() {
        return iddocRemDremontt;
    }

    public void setIddocRemDremontt(Long iddocRemDremontt) {
        this.iddocRemDremontt = iddocRemDremontt;
    }

    @Basic
    @Column(name = "IDBASE_REM_DREMONTT", nullable = true)
    public Long getIdbaseRemDremontt() {
        return idbaseRemDremontt;
    }

    public void setIdbaseRemDremontt(Long idbaseRemDremontt) {
        this.idbaseRemDremontt = idbaseRemDremontt;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_DREMONTT", nullable = true)
    public Long getIdextDoutRemDremontt() {
        return idextDoutRemDremontt;
    }

    public void setIdextDoutRemDremontt(Long idextDoutRemDremontt) {
        this.idextDoutRemDremontt = idextDoutRemDremontt;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_DREMONTT", nullable = true)
    public Long getIdextBaseRemDremontt() {
        return idextBaseRemDremontt;
    }

    public void setIdextBaseRemDremontt(Long idextBaseRemDremontt) {
        this.idextBaseRemDremontt = idextBaseRemDremontt;
    }

    @Basic
    @Column(name = "IDNOM_REM_DREMONTT", nullable = true)
    public Long getIdnomRemDremontt() {
        return idnomRemDremontt;
    }

    public void setIdnomRemDremontt(Long idnomRemDremontt) {
        this.idnomRemDremontt = idnomRemDremontt;
    }

    @Basic
    @Column(name = "IDED_REM_DREMONTT", nullable = true)
    public Long getIdedRemDremontt() {
        return idedRemDremontt;
    }

    public void setIdedRemDremontt(Long idedRemDremontt) {
        this.idedRemDremontt = idedRemDremontt;
    }

    @Basic
    @Column(name = "KOL_REM_DREMONTT", nullable = true, precision = 3)
    public BigDecimal getKolRemDremontt() {
        return kolRemDremontt;
    }

    public void setKolRemDremontt(BigDecimal kolRemDremontt) {
        this.kolRemDremontt = kolRemDremontt;
    }

    @Basic
    @Column(name = "KF_REM_DREMONTT", nullable = true, precision = 3)
    public BigDecimal getKfRemDremontt() {
        return kfRemDremontt;
    }

    public void setKfRemDremontt(BigDecimal kfRemDremontt) {
        this.kfRemDremontt = kfRemDremontt;
    }

    @Basic
    @Column(name = "PRICE_REM_DREMONTT", nullable = true, precision = 2)
    public BigDecimal getPriceRemDremontt() {
        return priceRemDremontt;
    }

    public void setPriceRemDremontt(BigDecimal priceRemDremontt) {
        this.priceRemDremontt = priceRemDremontt;
    }

    @Basic
    @Column(name = "SUM_REM_DREMONTT", nullable = true, precision = 2)
    public BigDecimal getSumRemDremontt() {
        return sumRemDremontt;
    }

    public void setSumRemDremontt(BigDecimal sumRemDremontt) {
        this.sumRemDremontt = sumRemDremontt;
    }

    @Basic
    @Column(name = "SUMMEX_REM_DREMONTT", nullable = true, precision = 2)
    public BigDecimal getSummexRemDremontt() {
        return summexRemDremontt;
    }

    public void setSummexRemDremontt(BigDecimal summexRemDremontt) {
        this.summexRemDremontt = summexRemDremontt;
    }

    @Basic
    @Column(name = "PRICEMEX_REM_DREMONTT", nullable = true, precision = 2)
    public BigDecimal getPricemexRemDremontt() {
        return pricemexRemDremontt;
    }

    public void setPricemexRemDremontt(BigDecimal pricemexRemDremontt) {
        this.pricemexRemDremontt = pricemexRemDremontt;
    }

    @Basic
    @Column(name = "IDHW_REM_DREMONTT", nullable = true)
    public Long getIdhwRemDremontt() {
        return idhwRemDremontt;
    }

    public void setIdhwRemDremontt(Long idhwRemDremontt) {
        this.idhwRemDremontt = idhwRemDremontt;
    }

    @Basic
    @Column(name = "DVREG_REM_DREMONTT", nullable = true)
    public Short getDvregRemDremontt() {
        return dvregRemDremontt;
    }

    public void setDvregRemDremontt(Short dvregRemDremontt) {
        this.dvregRemDremontt = dvregRemDremontt;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_DREMONTT", nullable = true)
    public Short getTypeTblRemDremontt() {
        return typeTblRemDremontt;
    }

    public void setTypeTblRemDremontt(Short typeTblRemDremontt) {
        this.typeTblRemDremontt = typeTblRemDremontt;
    }

    @Basic
    @Column(name = "VD_REM_DREMONTT", nullable = true)
    public Short getVdRemDremontt() {
        return vdRemDremontt;
    }

    public void setVdRemDremontt(Short vdRemDremontt) {
        this.vdRemDremontt = vdRemDremontt;
    }

    @Basic
    @Column(name = "REP_PRODUCER_REM_DREMONTT", nullable = true)
    public Short getRepProducerRemDremontt() {
        return repProducerRemDremontt;
    }

    public void setRepProducerRemDremontt(Short repProducerRemDremontt) {
        this.repProducerRemDremontt = repProducerRemDremontt;
    }

    @Basic
    @Column(name = "IDHWOLD_REM_DREMONTT", nullable = true)
    public Long getIdhwoldRemDremontt() {
        return idhwoldRemDremontt;
    }

    public void setIdhwoldRemDremontt(Long idhwoldRemDremontt) {
        this.idhwoldRemDremontt = idhwoldRemDremontt;
    }

    @Basic
    @Column(name = "IDTNOM_REM_DREMONTT", nullable = true)
    public Long getIdtnomRemDremontt() {
        return idtnomRemDremontt;
    }

    public void setIdtnomRemDremontt(Long idtnomRemDremontt) {
        this.idtnomRemDremontt = idtnomRemDremontt;
    }

    @Basic
    @Column(name = "IDHW_DONOR_REM_DREMONTT", nullable = true)
    public Long getIdhwDonorRemDremontt() {
        return idhwDonorRemDremontt;
    }

    public void setIdhwDonorRemDremontt(Long idhwDonorRemDremontt) {
        this.idhwDonorRemDremontt = idhwDonorRemDremontt;
    }

    @Basic
    @Column(name = "IDTYP_USEL_REM_DREMONTT", nullable = true)
    public Long getIdtypUselRemDremontt() {
        return idtypUselRemDremontt;
    }

    public void setIdtypUselRemDremontt(Long idtypUselRemDremontt) {
        this.idtypUselRemDremontt = idtypUselRemDremontt;
    }

    @Basic
    @Column(name = "DESCR_REM_DREMONTT", nullable = true, length = 150)
    public String getDescrRemDremontt() {
        return descrRemDremontt;
    }

    public void setDescrRemDremontt(String descrRemDremontt) {
        this.descrRemDremontt = descrRemDremontt;
    }

    @Basic
    @Column(name = "IDMHRAN_REM_DREMONTT", nullable = true)
    public Long getIdmhranRemDremontt() {
        return idmhranRemDremontt;
    }

    public void setIdmhranRemDremontt(Long idmhranRemDremontt) {
        this.idmhranRemDremontt = idmhranRemDremontt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemDremonttEntity that = (RemDremonttEntity) o;

        if (idRemDremontt != that.idRemDremontt) return false;
        if (iddocRemDremontt != null ? !iddocRemDremontt.equals(that.iddocRemDremontt) : that.iddocRemDremontt != null)
            return false;
        if (idbaseRemDremontt != null ? !idbaseRemDremontt.equals(that.idbaseRemDremontt) : that.idbaseRemDremontt != null)
            return false;
        if (idextDoutRemDremontt != null ? !idextDoutRemDremontt.equals(that.idextDoutRemDremontt) : that.idextDoutRemDremontt != null)
            return false;
        if (idextBaseRemDremontt != null ? !idextBaseRemDremontt.equals(that.idextBaseRemDremontt) : that.idextBaseRemDremontt != null)
            return false;
        if (idnomRemDremontt != null ? !idnomRemDremontt.equals(that.idnomRemDremontt) : that.idnomRemDremontt != null)
            return false;
        if (idedRemDremontt != null ? !idedRemDremontt.equals(that.idedRemDremontt) : that.idedRemDremontt != null)
            return false;
        if (kolRemDremontt != null ? !kolRemDremontt.equals(that.kolRemDremontt) : that.kolRemDremontt != null)
            return false;
        if (kfRemDremontt != null ? !kfRemDremontt.equals(that.kfRemDremontt) : that.kfRemDremontt != null)
            return false;
        if (priceRemDremontt != null ? !priceRemDremontt.equals(that.priceRemDremontt) : that.priceRemDremontt != null)
            return false;
        if (sumRemDremontt != null ? !sumRemDremontt.equals(that.sumRemDremontt) : that.sumRemDremontt != null)
            return false;
        if (summexRemDremontt != null ? !summexRemDremontt.equals(that.summexRemDremontt) : that.summexRemDremontt != null)
            return false;
        if (pricemexRemDremontt != null ? !pricemexRemDremontt.equals(that.pricemexRemDremontt) : that.pricemexRemDremontt != null)
            return false;
        if (idhwRemDremontt != null ? !idhwRemDremontt.equals(that.idhwRemDremontt) : that.idhwRemDremontt != null)
            return false;
        if (dvregRemDremontt != null ? !dvregRemDremontt.equals(that.dvregRemDremontt) : that.dvregRemDremontt != null)
            return false;
        if (typeTblRemDremontt != null ? !typeTblRemDremontt.equals(that.typeTblRemDremontt) : that.typeTblRemDremontt != null)
            return false;
        if (vdRemDremontt != null ? !vdRemDremontt.equals(that.vdRemDremontt) : that.vdRemDremontt != null)
            return false;
        if (repProducerRemDremontt != null ? !repProducerRemDremontt.equals(that.repProducerRemDremontt) : that.repProducerRemDremontt != null)
            return false;
        if (idhwoldRemDremontt != null ? !idhwoldRemDremontt.equals(that.idhwoldRemDremontt) : that.idhwoldRemDremontt != null)
            return false;
        if (idtnomRemDremontt != null ? !idtnomRemDremontt.equals(that.idtnomRemDremontt) : that.idtnomRemDremontt != null)
            return false;
        if (idhwDonorRemDremontt != null ? !idhwDonorRemDremontt.equals(that.idhwDonorRemDremontt) : that.idhwDonorRemDremontt != null)
            return false;
        if (idtypUselRemDremontt != null ? !idtypUselRemDremontt.equals(that.idtypUselRemDremontt) : that.idtypUselRemDremontt != null)
            return false;
        if (descrRemDremontt != null ? !descrRemDremontt.equals(that.descrRemDremontt) : that.descrRemDremontt != null)
            return false;
        if (idmhranRemDremontt != null ? !idmhranRemDremontt.equals(that.idmhranRemDremontt) : that.idmhranRemDremontt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRemDremontt ^ (idRemDremontt >>> 32));
        result = 31 * result + (iddocRemDremontt != null ? iddocRemDremontt.hashCode() : 0);
        result = 31 * result + (idbaseRemDremontt != null ? idbaseRemDremontt.hashCode() : 0);
        result = 31 * result + (idextDoutRemDremontt != null ? idextDoutRemDremontt.hashCode() : 0);
        result = 31 * result + (idextBaseRemDremontt != null ? idextBaseRemDremontt.hashCode() : 0);
        result = 31 * result + (idnomRemDremontt != null ? idnomRemDremontt.hashCode() : 0);
        result = 31 * result + (idedRemDremontt != null ? idedRemDremontt.hashCode() : 0);
        result = 31 * result + (kolRemDremontt != null ? kolRemDremontt.hashCode() : 0);
        result = 31 * result + (kfRemDremontt != null ? kfRemDremontt.hashCode() : 0);
        result = 31 * result + (priceRemDremontt != null ? priceRemDremontt.hashCode() : 0);
        result = 31 * result + (sumRemDremontt != null ? sumRemDremontt.hashCode() : 0);
        result = 31 * result + (summexRemDremontt != null ? summexRemDremontt.hashCode() : 0);
        result = 31 * result + (pricemexRemDremontt != null ? pricemexRemDremontt.hashCode() : 0);
        result = 31 * result + (idhwRemDremontt != null ? idhwRemDremontt.hashCode() : 0);
        result = 31 * result + (dvregRemDremontt != null ? dvregRemDremontt.hashCode() : 0);
        result = 31 * result + (typeTblRemDremontt != null ? typeTblRemDremontt.hashCode() : 0);
        result = 31 * result + (vdRemDremontt != null ? vdRemDremontt.hashCode() : 0);
        result = 31 * result + (repProducerRemDremontt != null ? repProducerRemDremontt.hashCode() : 0);
        result = 31 * result + (idhwoldRemDremontt != null ? idhwoldRemDremontt.hashCode() : 0);
        result = 31 * result + (idtnomRemDremontt != null ? idtnomRemDremontt.hashCode() : 0);
        result = 31 * result + (idhwDonorRemDremontt != null ? idhwDonorRemDremontt.hashCode() : 0);
        result = 31 * result + (idtypUselRemDremontt != null ? idtypUselRemDremontt.hashCode() : 0);
        result = 31 * result + (descrRemDremontt != null ? descrRemDremontt.hashCode() : 0);
        result = 31 * result + (idmhranRemDremontt != null ? idmhranRemDremontt.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDDOC_REM_DREMONTT", referencedColumnName = "ID_REM_GALLDOC")
//    public RemGalldocEntity getRemGalldocByIddocRemDremontt() {
//        return remGalldocByIddocRemDremontt;
//    }
//
//    public void setRemGalldocByIddocRemDremontt(RemGalldocEntity remGalldocByIddocRemDremontt) {
//        this.remGalldocByIddocRemDremontt = remGalldocByIddocRemDremontt;
//    }

    @ManyToOne
    @JoinColumn(name = "IDNOM_REM_DREMONTT", referencedColumnName = "IDNOM")
    public SnomEntity getSnomByIdnomRemDremontt() {
        return snomByIdnomRemDremontt;
    }

    public void setSnomByIdnomRemDremontt(SnomEntity snomByIdnomRemDremontt) {
        this.snomByIdnomRemDremontt = snomByIdnomRemDremontt;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDED_REM_DREMONTT", referencedColumnName = "IDED")
//    public SedEntity getSedByIdedRemDremontt() {
//        return sedByIdedRemDremontt;
//    }
//
//    public void setSedByIdedRemDremontt(SedEntity sedByIdedRemDremontt) {
//        this.sedByIdedRemDremontt = sedByIdedRemDremontt;
//    }

//    @ManyToOne
//    @JoinColumn(name = "IDHW_REM_DREMONTT", referencedColumnName = "ID_REM_SHARDWARE")
//    public RemShardwareEntity getRemShardwareByIdhwRemDremontt() {
//        return remShardwareByIdhwRemDremontt;
//    }
//
//    public void setRemShardwareByIdhwRemDremontt(RemShardwareEntity remShardwareByIdhwRemDremontt) {
//        this.remShardwareByIdhwRemDremontt = remShardwareByIdhwRemDremontt;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDHWOLD_REM_DREMONTT", referencedColumnName = "ID_REM_SHARDWARE")
//    public RemShardwareEntity getRemShardwareByIdhwoldRemDremontt() {
//        return remShardwareByIdhwoldRemDremontt;
//    }
//
//    public void setRemShardwareByIdhwoldRemDremontt(RemShardwareEntity remShardwareByIdhwoldRemDremontt) {
//        this.remShardwareByIdhwoldRemDremontt = remShardwareByIdhwoldRemDremontt;
//    }

//    @ManyToOne
//    @JoinColumn(name = "IDTNOM_REM_DREMONTT", referencedColumnName = "ID_STNOM")
//    public StnomEntity getStnomByIdtnomRemDremontt() {
//        return stnomByIdtnomRemDremontt;
//    }
//
//    public void setStnomByIdtnomRemDremontt(StnomEntity stnomByIdtnomRemDremontt) {
//        this.stnomByIdtnomRemDremontt = stnomByIdtnomRemDremontt;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDHW_DONOR_REM_DREMONTT", referencedColumnName = "ID_REM_SHARDWARE")
//    public RemShardwareEntity getRemShardwareByIdhwDonorRemDremontt() {
//        return remShardwareByIdhwDonorRemDremontt;
//    }
//
//    public void setRemShardwareByIdhwDonorRemDremontt(RemShardwareEntity remShardwareByIdhwDonorRemDremontt) {
//        this.remShardwareByIdhwDonorRemDremontt = remShardwareByIdhwDonorRemDremontt;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDTYP_USEL_REM_DREMONTT", referencedColumnName = "ID_REM_STYPUSLOV")
//    public RemStypuslovEntity getRemStypuslovByIdtypUselRemDremontt() {
//        return remStypuslovByIdtypUselRemDremontt;
//    }
//
//    public void setRemStypuslovByIdtypUselRemDremontt(RemStypuslovEntity remStypuslovByIdtypUselRemDremontt) {
//        this.remStypuslovByIdtypUselRemDremontt = remStypuslovByIdtypUselRemDremontt;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDMHRAN_REM_DREMONTT", referencedColumnName = "ID_SMHRAN")
//    public SmhranEntity getSmhranByIdmhranRemDremontt() {
//        return smhranByIdmhranRemDremontt;
//    }
//
//    public void setSmhranByIdmhranRemDremontt(SmhranEntity smhranByIdmhranRemDremontt) {
//        this.smhranByIdmhranRemDremontt = smhranByIdmhranRemDremontt;
//    }
}
