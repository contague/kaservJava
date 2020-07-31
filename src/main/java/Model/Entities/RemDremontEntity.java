package Model.Entities;

import javax.persistence.*;

@Entity
@Table(name = "REM_DREMONT", schema = "", catalog = "")
public class RemDremontEntity {
    private long idRemDremont;
    private Long iddocRemDremont;
    private String primRemDremont;
    private Long idbaseRemDremont;
    private Long idextDoutRemDremont;
    private Long idextBaseRemDremont;
    private Long idzRemDremont;
    private Long idtpriceRemDremont;
    private Short typeTblRemDremont;
    private Long idhwRemDremont;
    private Long idkktRemDremont;
    private Integer typeRemontRemDremont;
    private RemGalldocEntity remGalldocByIddocRemDremont;
    private RemZEntity remZByIdzRemDremont;
//    private StpriceEntity stpriceByIdtpriceRemDremont;
//    private RemShardwareEntity remShardwareByIdhwRemDremont;
//    private RemSkktEntity remSkktByIdkktRemDremont;

    @Id
    @Column(name = "ID_REM_DREMONT", nullable = false)
    public long getIdRemDremont() {
        return idRemDremont;
    }

    public void setIdRemDremont(long idRemDremont) {
        this.idRemDremont = idRemDremont;
    }

    @Basic
    @Column(name = "IDDOC_REM_DREMONT", nullable = true)
    public Long getIddocRemDremont() {
        return iddocRemDremont;
    }

    public void setIddocRemDremont(Long iddocRemDremont) {
        this.iddocRemDremont = iddocRemDremont;
    }

    @Basic
    @Column(name = "PRIM_REM_DREMONT", nullable = true, length = 100)
    public String getPrimRemDremont() {
        return primRemDremont;
    }

    public void setPrimRemDremont(String primRemDremont) {
        this.primRemDremont = primRemDremont;
    }

    @Basic
    @Column(name = "IDBASE_REM_DREMONT", nullable = true)
    public Long getIdbaseRemDremont() {
        return idbaseRemDremont;
    }

    public void setIdbaseRemDremont(Long idbaseRemDremont) {
        this.idbaseRemDremont = idbaseRemDremont;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_DREMONT", nullable = true)
    public Long getIdextDoutRemDremont() {
        return idextDoutRemDremont;
    }

    public void setIdextDoutRemDremont(Long idextDoutRemDremont) {
        this.idextDoutRemDremont = idextDoutRemDremont;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_DREMONT", nullable = true)
    public Long getIdextBaseRemDremont() {
        return idextBaseRemDremont;
    }

    public void setIdextBaseRemDremont(Long idextBaseRemDremont) {
        this.idextBaseRemDremont = idextBaseRemDremont;
    }

    @Basic
    @Column(name = "IDZ_REM_DREMONT", nullable = true)
    public Long getIdzRemDremont() {
        return idzRemDremont;
    }

    public void setIdzRemDremont(Long idzRemDremont) {
        this.idzRemDremont = idzRemDremont;
    }

    @Basic
    @Column(name = "IDTPRICE_REM_DREMONT", nullable = true)
    public Long getIdtpriceRemDremont() {
        return idtpriceRemDremont;
    }

    public void setIdtpriceRemDremont(Long idtpriceRemDremont) {
        this.idtpriceRemDremont = idtpriceRemDremont;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_DREMONT", nullable = true)
    public Short getTypeTblRemDremont() {
        return typeTblRemDremont;
    }

    public void setTypeTblRemDremont(Short typeTblRemDremont) {
        this.typeTblRemDremont = typeTblRemDremont;
    }

    @Basic
    @Column(name = "IDHW_REM_DREMONT", nullable = true)
    public Long getIdhwRemDremont() {
        return idhwRemDremont;
    }

    public void setIdhwRemDremont(Long idhwRemDremont) {
        this.idhwRemDremont = idhwRemDremont;
    }

    @Basic
    @Column(name = "IDKKT_REM_DREMONT", nullable = true)
    public Long getIdkktRemDremont() {
        return idkktRemDremont;
    }

    public void setIdkktRemDremont(Long idkktRemDremont) {
        this.idkktRemDremont = idkktRemDremont;
    }

    @Basic
    @Column(name = "TYPE_REMONT_REM_DREMONT", nullable = true)
    public Integer getTypeRemontRemDremont() {
        return typeRemontRemDremont;
    }

    public void setTypeRemontRemDremont(Integer typeRemontRemDremont) {
        this.typeRemontRemDremont = typeRemontRemDremont;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemDremontEntity that = (RemDremontEntity) o;

        if (idRemDremont != that.idRemDremont) return false;
        if (iddocRemDremont != null ? !iddocRemDremont.equals(that.iddocRemDremont) : that.iddocRemDremont != null)
            return false;
        if (primRemDremont != null ? !primRemDremont.equals(that.primRemDremont) : that.primRemDremont != null)
            return false;
        if (idbaseRemDremont != null ? !idbaseRemDremont.equals(that.idbaseRemDremont) : that.idbaseRemDremont != null)
            return false;
        if (idextDoutRemDremont != null ? !idextDoutRemDremont.equals(that.idextDoutRemDremont) : that.idextDoutRemDremont != null)
            return false;
        if (idextBaseRemDremont != null ? !idextBaseRemDremont.equals(that.idextBaseRemDremont) : that.idextBaseRemDremont != null)
            return false;
        if (idzRemDremont != null ? !idzRemDremont.equals(that.idzRemDremont) : that.idzRemDremont != null)
            return false;
        if (idtpriceRemDremont != null ? !idtpriceRemDremont.equals(that.idtpriceRemDremont) : that.idtpriceRemDremont != null)
            return false;
        if (typeTblRemDremont != null ? !typeTblRemDremont.equals(that.typeTblRemDremont) : that.typeTblRemDremont != null)
            return false;
        if (idhwRemDremont != null ? !idhwRemDremont.equals(that.idhwRemDremont) : that.idhwRemDremont != null)
            return false;
        if (idkktRemDremont != null ? !idkktRemDremont.equals(that.idkktRemDremont) : that.idkktRemDremont != null)
            return false;
        if (typeRemontRemDremont != null ? !typeRemontRemDremont.equals(that.typeRemontRemDremont) : that.typeRemontRemDremont != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRemDremont ^ (idRemDremont >>> 32));
        result = 31 * result + (iddocRemDremont != null ? iddocRemDremont.hashCode() : 0);
        result = 31 * result + (primRemDremont != null ? primRemDremont.hashCode() : 0);
        result = 31 * result + (idbaseRemDremont != null ? idbaseRemDremont.hashCode() : 0);
        result = 31 * result + (idextDoutRemDremont != null ? idextDoutRemDremont.hashCode() : 0);
        result = 31 * result + (idextBaseRemDremont != null ? idextBaseRemDremont.hashCode() : 0);
        result = 31 * result + (idzRemDremont != null ? idzRemDremont.hashCode() : 0);
        result = 31 * result + (idtpriceRemDremont != null ? idtpriceRemDremont.hashCode() : 0);
        result = 31 * result + (typeTblRemDremont != null ? typeTblRemDremont.hashCode() : 0);
        result = 31 * result + (idhwRemDremont != null ? idhwRemDremont.hashCode() : 0);
        result = 31 * result + (idkktRemDremont != null ? idkktRemDremont.hashCode() : 0);
        result = 31 * result + (typeRemontRemDremont != null ? typeRemontRemDremont.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDDOC_REM_DREMONT", referencedColumnName = "ID_REM_GALLDOC")
    public RemGalldocEntity getRemGalldocByIddocRemDremont() {
        return remGalldocByIddocRemDremont;
    }

    public void setRemGalldocByIddocRemDremont(RemGalldocEntity remGalldocByIddocRemDremont) {
        this.remGalldocByIddocRemDremont = remGalldocByIddocRemDremont;
    }

    @ManyToOne
    @JoinColumn(name = "IDZ_REM_DREMONT", referencedColumnName = "ID_REM_Z")
    public RemZEntity getRemZByIdzRemDremont() {
        return remZByIdzRemDremont;
    }

    public void setRemZByIdzRemDremont(RemZEntity remZByIdzRemDremont) {
        this.remZByIdzRemDremont = remZByIdzRemDremont;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDTPRICE_REM_DREMONT", referencedColumnName = "ID_TPRICE")
//    public StpriceEntity getStpriceByIdtpriceRemDremont() {
//        return stpriceByIdtpriceRemDremont;
//    }
//
//    public void setStpriceByIdtpriceRemDremont(StpriceEntity stpriceByIdtpriceRemDremont) {
//        this.stpriceByIdtpriceRemDremont = stpriceByIdtpriceRemDremont;
//    }

//    @ManyToOne
//    @JoinColumn(name = "IDHW_REM_DREMONT", referencedColumnName = "ID_REM_SHARDWARE")
//    public RemShardwareEntity getRemShardwareByIdhwRemDremont() {
//        return remShardwareByIdhwRemDremont;
//    }
//
//    public void setRemShardwareByIdhwRemDremont(RemShardwareEntity remShardwareByIdhwRemDremont) {
//        this.remShardwareByIdhwRemDremont = remShardwareByIdhwRemDremont;
//    }

//    @ManyToOne
//    @JoinColumn(name = "IDKKT_REM_DREMONT", referencedColumnName = "ID_REM_SKKT")
//    public RemSkktEntity getRemSkktByIdkktRemDremont() {
//        return remSkktByIdkktRemDremont;
//    }
//
//    public void setRemSkktByIdkktRemDremont(RemSkktEntity remSkktByIdkktRemDremont) {
//        this.remSkktByIdkktRemDremont = remSkktByIdkktRemDremont;
//    }
}
