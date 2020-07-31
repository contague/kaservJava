package Model.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "REM_GALLDOC", schema = "", catalog = "")
public class RemGalldocEntity {
    private long idRemGalldoc;
    private Long idbaseRemGalldoc;
    private Long idfirmRemGalldoc;
    private Long idskladRemGalldoc;
    private Long idklientRemGalldoc;
    private Long iduserRemGalldoc;
    private Timestamp posRemGalldoc;
    private Integer numRemGalldoc;
    private Short prRemGalldoc;
    private String tdocRemGalldoc;
    private Long iddocosnRemGalldoc;
    private Integer typeextdocRemGalldoc;
    private Long idextdocRemGalldoc;
    private BigDecimal sumRemGalldoc;
    private Long idextDoutRemGalldoc;
    private Long idextBaseRemGalldoc;
    private Long idprojectRemGalldoc;
    private Long idbusinopRemGalldoc;
    private Short typeTblRemGalldoc;
    private String prefiksNumRemGalldoc;
    private Long idobjectRemGalldoc;
//    private Collection<entety.RemDaktEntity> remDaktsByIdRemGalldoc;
//    private Collection<entety.RemDakttEntity> remDakttsByIdRemGalldoc;
//    private Collection<entety.RemDdilpostEntity> remDdilpostsByIdRemGalldoc;
//    private Collection<entety.RemDdilposttEntity> remDdilposttsByIdRemGalldoc;
//    private Collection<entety.RemDdilretEntity> remDdilretsByIdRemGalldoc;
//    private Collection<entety.RemDdilrettEntity> remDdilrettsByIdRemGalldoc;
//    private Collection<entety.RemDkm1Entity> remDkm1sByIdRemGalldoc;
//    private Collection<entety.RemDkm1TEntity> remDkm1TSByIdRemGalldoc;
//    private Collection<entety.RemDkm2Entity> remDkm2sByIdRemGalldoc;
//    private Collection<entety.RemDkm2TEntity> remDkm2TSByIdRemGalldoc;
//    private Collection<entety.RemDosnEntity> remDosnsByIdRemGalldoc;
//    private Collection<entety.RemDosntEntity> remDosntsByIdRemGalldoc;
//    private Collection<entety.RemDotprpostEntity> remDotprpostsByIdRemGalldoc;
//    private Collection<entety.RemDotprposttEntity> remDotprposttsByIdRemGalldoc;
//    private Collection<entety.RemDperEntity> remDpersByIdRemGalldoc;
//    private Collection<entety.RemDpertEntity> remDpertsByIdRemGalldoc;
//    private Collection<entety.RemDprnEntity> remDprnsByIdRemGalldoc;
//    private Collection<entety.RemDprntEntity> remDprntsByIdRemGalldoc;
//    private Collection<entety.RemDrakomplEntity> remDrakomplsByIdRemGalldoc;
//    private Collection<entety.RemDrakompltEntity> remDrakompltsByIdRemGalldoc;
//    private Collection<entety.RemDrealEntity> remDrealsByIdRemGalldoc;
//    private Collection<entety.RemDrealtEntity> remDrealtsByIdRemGalldoc;
//    private Collection<entety.RemDremontEntity> remDremontsByIdRemGalldoc;
//    private Collection<entety.RemDremonthwEntity> remDremonthwsByIdRemGalldoc;
//    private Collection<entety.RemDremonthwtEntity> remDremonthwtsByIdRemGalldoc;
//    private Collection<entety.RemDremontkktEntity> remDremontkktsByIdRemGalldoc;
//    private Collection<entety.RemDremontkkttEntity> remDremontkkttsByIdRemGalldoc;
    private Collection<RemDremonttEntity> remDremonttsByIdRemGalldoc;
//    private Collection<entety.RemDrgOtchpostEntity> remDrgOtchpostsByIdRemGalldoc;
//    private Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdRemGalldoc;
//    private Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdRemGalldoc_0;
//    private Collection<entety.RemDsbkomplEntity> remDsbkomplsByIdRemGalldoc;
//    private Collection<entety.RemDsbkompltEntity> remDsbkompltsByIdRemGalldoc;
//    private Collection<entety.RemDscperEntity> remDscpersByIdRemGalldoc;
//    private Collection<entety.RemDscpertEntity> remDscpertsByIdRemGalldoc;
//    private Collection<entety.RemDscretEntity> remDscretsByIdRemGalldoc;
//    private Collection<entety.RemDscrettEntity> remDscrettsByIdRemGalldoc;
//    private Collection<entety.RemDsetservhwEntity> remDsetservhwsByIdRemGalldoc;
//    private Collection<entety.RemDsetservhwtEntity> remDsetservhwtsByIdRemGalldoc;
//    private Collection<entety.RemDsetservkktEntity> remDsetservkktsByIdRemGalldoc;
//    private Collection<entety.RemDsetservkkttEntity> remDsetservkkttsByIdRemGalldoc;
//    private Collection<entety.RemDspnEntity> remDspnsByIdRemGalldoc;
//    private Collection<entety.RemDspntEntity> remDspntsByIdRemGalldoc;
//    private Collection<entety.RemDvidachaHwEntity> remDvidachaHwsByIdRemGalldoc;
//    private Collection<entety.RemDvidachaHwtEntity> remDvidachaHwtsByIdRemGalldoc;
//    private Collection<entety.RemDvosvratHwEntity> remDvosvratHwsByIdRemGalldoc;
//    private Collection<entety.RemDvosvratHwtEntity> remDvosvratHwtsByIdRemGalldoc;
//    private Collection<entety.RemDvpoEntity> remDvposByIdRemGalldoc;
//    private Collection<entety.RemDvpokEntity> remDvpoksByIdRemGalldoc;
//    private Collection<entety.RemDvpoktEntity> remDvpoktsByIdRemGalldoc;
//    private Collection<entety.RemDvpotEntity> remDvpotsByIdRemGalldoc;
//    private Collection<entety.RemDvzperEntity> remDvzpersByIdRemGalldoc;
//    private Collection<entety.RemDvzpertEntity> remDvzpertsByIdRemGalldoc;
//    private Collection<entety.RemDvzvpoEntity> remDvzvposByIdRemGalldoc;
//    private Collection<entety.RemDvzvpotEntity> remDvzvpotsByIdRemGalldoc;
//    private Collection<entety.RemDzakpostEntity> remDzakpostsByIdRemGalldoc;
//    private Collection<entety.RemDzakposttEntity> remDzakposttsByIdRemGalldoc;
//    private Collection<entety.RemDzaktprEntity> remDzaktprsByIdRemGalldoc;
//    private Collection<entety.RemDzaktprtEntity> remDzaktprtsByIdRemGalldoc;
//    private Collection<entety.RemDzcheckEntity> remDzchecksByIdRemGalldoc;
//    private Collection<entety.RemDzchecktEntity> remDzchecktsByIdRemGalldoc;
//    private Collection<entety.RemDzendEntity> remDzendsByIdRemGalldoc;
//    private Collection<entety.RemDzoperEntity> remDzopersByIdRemGalldoc;
//    private Collection<entety.RemDzopertEntity> remDzopertsByIdRemGalldoc;
//    private Collection<entety.RemDzperEntity> remDzpersByIdRemGalldoc;
//    private Collection<entety.RemDzpertEntity> remDzpertsByIdRemGalldoc;
//    private Collection<entety.RemDzpostEntity> remDzpostsByIdRemGalldoc;
//    private Collection<entety.RemDzposttEntity> remDzposttsByIdRemGalldoc;
//    private Collection<entety.RemDzstartEntity> remDzstartsByIdRemGalldoc;
//    private Collection<entety.RemDztrebEntity> remDztrebsByIdRemGalldoc;
//    private Collection<entety.RemDztrebtEntity> remDztrebtsByIdRemGalldoc;
//    private Collection<entety.RemDzvidEntity> remDzvidsByIdRemGalldoc;
//    private Collection<entety.RemDzvidtEntity> remDzvidtsByIdRemGalldoc;
//    private Collection<entety.RemDzvzapEntity> remDzvzapsByIdRemGalldoc;
//    private Collection<entety.RemDzvzaptEntity> remDzvzaptsByIdRemGalldoc;
//    private entety.SinfbaseObmenEntity sinfbaseObmenByIdbaseRemGalldoc;
//    private entety.SfirmEntity sfirmByIdfirmRemGalldoc;
//    private entety.SskladEntity sskladByIdskladRemGalldoc;
//    private entety.SklientEntity sklientByIdklientRemGalldoc;
//    private entety.SuserEntity suserByIduserRemGalldoc;
//    private entety.RemGalldocEntity remGalldocByIddocosnRemGalldoc;
//    private Collection<entety.RemGalldocEntity> remGalldocsByIdRemGalldoc;
//    private entety.SprojectEntity sprojectByIdprojectRemGalldoc;
//    private entety.SbusinessOperEntity sbusinessOperByIdbusinopRemGalldoc;
//    private entety.SobjectEntity sobjectByIdobjectRemGalldoc;
//    private Collection<entety.RemGurProvEntity> remGurProvsByIdRemGalldoc;
//    private Collection<entety.RemGurVigrtEntity> remGurVigrtsByIdRemGalldoc;
//    private Collection<entety.RemRggoodsDvEntity> remRggoodsDvsByIdRemGalldoc;
//    private Collection<entety.RemRgosthwDvEntity> remRgosthwDvsByIdRemGalldoc;
//    private Collection<entety.RemRgostzdilDvEntity> remRgostzdilDvsByIdRemGalldoc;
//    private Collection<entety.RemRgostzscDvEntity> remRgostzscDvsByIdRemGalldoc;
//    private Collection<entety.RemRgostzDvEntity> remRgostzDvsByIdRemGalldoc;
//    private Collection<entety.RemRgotchpostDvEntity> remRgotchpostDvsByIdRemGalldoc;
//    private Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdRemGalldoc;
//    private Collection<entety.RemRgserviceDvEntity> remRgserviceDvsByIdRemGalldoc;
//    private Collection<entety.RemRgservkktDvEntity> remRgservkktDvsByIdRemGalldoc;
//    private Collection<entety.RemRgsosthwDvEntity> remRgsosthwDvsByIdRemGalldoc;
//    private Collection<entety.RemRgvzostDvEntity> remRgvzostDvsByIdRemGalldoc;
//    private Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdRemGalldoc;

    @Id
    @Column(name = "ID_REM_GALLDOC", nullable = false)
    public long getIdRemGalldoc() {
        return idRemGalldoc;
    }

    public void setIdRemGalldoc(long idRemGalldoc) {
        this.idRemGalldoc = idRemGalldoc;
    }

    @Basic
    @Column(name = "IDBASE_REM_GALLDOC", nullable = true)
    public Long getIdbaseRemGalldoc() {
        return idbaseRemGalldoc;
    }

    public void setIdbaseRemGalldoc(Long idbaseRemGalldoc) {
        this.idbaseRemGalldoc = idbaseRemGalldoc;
    }

    @Basic
    @Column(name = "IDFIRM_REM_GALLDOC", nullable = true)
    public Long getIdfirmRemGalldoc() {
        return idfirmRemGalldoc;
    }

    public void setIdfirmRemGalldoc(Long idfirmRemGalldoc) {
        this.idfirmRemGalldoc = idfirmRemGalldoc;
    }

    @Basic
    @Column(name = "IDSKLAD_REM_GALLDOC", nullable = true)
    public Long getIdskladRemGalldoc() {
        return idskladRemGalldoc;
    }

    public void setIdskladRemGalldoc(Long idskladRemGalldoc) {
        this.idskladRemGalldoc = idskladRemGalldoc;
    }

    @Basic
    @Column(name = "IDKLIENT_REM_GALLDOC", nullable = true)
    public Long getIdklientRemGalldoc() {
        return idklientRemGalldoc;
    }

    public void setIdklientRemGalldoc(Long idklientRemGalldoc) {
        this.idklientRemGalldoc = idklientRemGalldoc;
    }

    @Basic
    @Column(name = "IDUSER_REM_GALLDOC", nullable = true)
    public Long getIduserRemGalldoc() {
        return iduserRemGalldoc;
    }

    public void setIduserRemGalldoc(Long iduserRemGalldoc) {
        this.iduserRemGalldoc = iduserRemGalldoc;
    }

    @Basic
    @Column(name = "POS_REM_GALLDOC", nullable = true)
    public Timestamp getPosRemGalldoc() {
        return posRemGalldoc;
    }

    public void setPosRemGalldoc(Timestamp posRemGalldoc) {
        this.posRemGalldoc = posRemGalldoc;
    }

    @Basic
    @Column(name = "NUM_REM_GALLDOC", nullable = true)
    public Integer getNumRemGalldoc() {
        return numRemGalldoc;
    }

    public void setNumRemGalldoc(Integer numRemGalldoc) {
        this.numRemGalldoc = numRemGalldoc;
    }

    @Basic
    @Column(name = "PR_REM_GALLDOC", nullable = true)
    public Short getPrRemGalldoc() {
        return prRemGalldoc;
    }

    public void setPrRemGalldoc(Short prRemGalldoc) {
        this.prRemGalldoc = prRemGalldoc;
    }

    @Basic
    @Column(name = "TDOC_REM_GALLDOC", nullable = true, length = 15)
    public String getTdocRemGalldoc() {
        return tdocRemGalldoc;
    }

    public void setTdocRemGalldoc(String tdocRemGalldoc) {
        this.tdocRemGalldoc = tdocRemGalldoc;
    }

    @Basic
    @Column(name = "IDDOCOSN_REM_GALLDOC", nullable = true)
    public Long getIddocosnRemGalldoc() {
        return iddocosnRemGalldoc;
    }

    public void setIddocosnRemGalldoc(Long iddocosnRemGalldoc) {
        this.iddocosnRemGalldoc = iddocosnRemGalldoc;
    }

    @Basic
    @Column(name = "TYPEEXTDOC_REM_GALLDOC", nullable = true)
    public Integer getTypeextdocRemGalldoc() {
        return typeextdocRemGalldoc;
    }

    public void setTypeextdocRemGalldoc(Integer typeextdocRemGalldoc) {
        this.typeextdocRemGalldoc = typeextdocRemGalldoc;
    }

    @Basic
    @Column(name = "IDEXTDOC_REM_GALLDOC", nullable = true)
    public Long getIdextdocRemGalldoc() {
        return idextdocRemGalldoc;
    }

    public void setIdextdocRemGalldoc(Long idextdocRemGalldoc) {
        this.idextdocRemGalldoc = idextdocRemGalldoc;
    }

    @Basic
    @Column(name = "SUM_REM_GALLDOC", nullable = true, precision = 2)
    public BigDecimal getSumRemGalldoc() {
        return sumRemGalldoc;
    }

    public void setSumRemGalldoc(BigDecimal sumRemGalldoc) {
        this.sumRemGalldoc = sumRemGalldoc;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_GALLDOC", nullable = true)
    public Long getIdextDoutRemGalldoc() {
        return idextDoutRemGalldoc;
    }

    public void setIdextDoutRemGalldoc(Long idextDoutRemGalldoc) {
        this.idextDoutRemGalldoc = idextDoutRemGalldoc;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_GALLDOC", nullable = true)
    public Long getIdextBaseRemGalldoc() {
        return idextBaseRemGalldoc;
    }

    public void setIdextBaseRemGalldoc(Long idextBaseRemGalldoc) {
        this.idextBaseRemGalldoc = idextBaseRemGalldoc;
    }

    @Basic
    @Column(name = "IDPROJECT_REM_GALLDOC", nullable = true)
    public Long getIdprojectRemGalldoc() {
        return idprojectRemGalldoc;
    }

    public void setIdprojectRemGalldoc(Long idprojectRemGalldoc) {
        this.idprojectRemGalldoc = idprojectRemGalldoc;
    }

    @Basic
    @Column(name = "IDBUSINOP_REM_GALLDOC", nullable = true)
    public Long getIdbusinopRemGalldoc() {
        return idbusinopRemGalldoc;
    }

    public void setIdbusinopRemGalldoc(Long idbusinopRemGalldoc) {
        this.idbusinopRemGalldoc = idbusinopRemGalldoc;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_GALLDOC", nullable = true)
    public Short getTypeTblRemGalldoc() {
        return typeTblRemGalldoc;
    }

    public void setTypeTblRemGalldoc(Short typeTblRemGalldoc) {
        this.typeTblRemGalldoc = typeTblRemGalldoc;
    }

    @Basic
    @Column(name = "PREFIKS_NUM_REM_GALLDOC", nullable = true, length = 12)
    public String getPrefiksNumRemGalldoc() {
        return prefiksNumRemGalldoc;
    }

    public void setPrefiksNumRemGalldoc(String prefiksNumRemGalldoc) {
        this.prefiksNumRemGalldoc = prefiksNumRemGalldoc;
    }

    @Basic
    @Column(name = "IDOBJECT_REM_GALLDOC", nullable = true)
    public Long getIdobjectRemGalldoc() {
        return idobjectRemGalldoc;
    }

    public void setIdobjectRemGalldoc(Long idobjectRemGalldoc) {
        this.idobjectRemGalldoc = idobjectRemGalldoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemGalldocEntity that = (RemGalldocEntity) o;

        if (idRemGalldoc != that.idRemGalldoc) return false;
        if (idbaseRemGalldoc != null ? !idbaseRemGalldoc.equals(that.idbaseRemGalldoc) : that.idbaseRemGalldoc != null)
            return false;
        if (idfirmRemGalldoc != null ? !idfirmRemGalldoc.equals(that.idfirmRemGalldoc) : that.idfirmRemGalldoc != null)
            return false;
        if (idskladRemGalldoc != null ? !idskladRemGalldoc.equals(that.idskladRemGalldoc) : that.idskladRemGalldoc != null)
            return false;
        if (idklientRemGalldoc != null ? !idklientRemGalldoc.equals(that.idklientRemGalldoc) : that.idklientRemGalldoc != null)
            return false;
        if (iduserRemGalldoc != null ? !iduserRemGalldoc.equals(that.iduserRemGalldoc) : that.iduserRemGalldoc != null)
            return false;
        if (posRemGalldoc != null ? !posRemGalldoc.equals(that.posRemGalldoc) : that.posRemGalldoc != null)
            return false;
        if (numRemGalldoc != null ? !numRemGalldoc.equals(that.numRemGalldoc) : that.numRemGalldoc != null)
            return false;
        if (prRemGalldoc != null ? !prRemGalldoc.equals(that.prRemGalldoc) : that.prRemGalldoc != null) return false;
        if (tdocRemGalldoc != null ? !tdocRemGalldoc.equals(that.tdocRemGalldoc) : that.tdocRemGalldoc != null)
            return false;
        if (iddocosnRemGalldoc != null ? !iddocosnRemGalldoc.equals(that.iddocosnRemGalldoc) : that.iddocosnRemGalldoc != null)
            return false;
        if (typeextdocRemGalldoc != null ? !typeextdocRemGalldoc.equals(that.typeextdocRemGalldoc) : that.typeextdocRemGalldoc != null)
            return false;
        if (idextdocRemGalldoc != null ? !idextdocRemGalldoc.equals(that.idextdocRemGalldoc) : that.idextdocRemGalldoc != null)
            return false;
        if (sumRemGalldoc != null ? !sumRemGalldoc.equals(that.sumRemGalldoc) : that.sumRemGalldoc != null)
            return false;
        if (idextDoutRemGalldoc != null ? !idextDoutRemGalldoc.equals(that.idextDoutRemGalldoc) : that.idextDoutRemGalldoc != null)
            return false;
        if (idextBaseRemGalldoc != null ? !idextBaseRemGalldoc.equals(that.idextBaseRemGalldoc) : that.idextBaseRemGalldoc != null)
            return false;
        if (idprojectRemGalldoc != null ? !idprojectRemGalldoc.equals(that.idprojectRemGalldoc) : that.idprojectRemGalldoc != null)
            return false;
        if (idbusinopRemGalldoc != null ? !idbusinopRemGalldoc.equals(that.idbusinopRemGalldoc) : that.idbusinopRemGalldoc != null)
            return false;
        if (typeTblRemGalldoc != null ? !typeTblRemGalldoc.equals(that.typeTblRemGalldoc) : that.typeTblRemGalldoc != null)
            return false;
        if (prefiksNumRemGalldoc != null ? !prefiksNumRemGalldoc.equals(that.prefiksNumRemGalldoc) : that.prefiksNumRemGalldoc != null)
            return false;
        if (idobjectRemGalldoc != null ? !idobjectRemGalldoc.equals(that.idobjectRemGalldoc) : that.idobjectRemGalldoc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRemGalldoc ^ (idRemGalldoc >>> 32));
        result = 31 * result + (idbaseRemGalldoc != null ? idbaseRemGalldoc.hashCode() : 0);
        result = 31 * result + (idfirmRemGalldoc != null ? idfirmRemGalldoc.hashCode() : 0);
        result = 31 * result + (idskladRemGalldoc != null ? idskladRemGalldoc.hashCode() : 0);
        result = 31 * result + (idklientRemGalldoc != null ? idklientRemGalldoc.hashCode() : 0);
        result = 31 * result + (iduserRemGalldoc != null ? iduserRemGalldoc.hashCode() : 0);
        result = 31 * result + (posRemGalldoc != null ? posRemGalldoc.hashCode() : 0);
        result = 31 * result + (numRemGalldoc != null ? numRemGalldoc.hashCode() : 0);
        result = 31 * result + (prRemGalldoc != null ? prRemGalldoc.hashCode() : 0);
        result = 31 * result + (tdocRemGalldoc != null ? tdocRemGalldoc.hashCode() : 0);
        result = 31 * result + (iddocosnRemGalldoc != null ? iddocosnRemGalldoc.hashCode() : 0);
        result = 31 * result + (typeextdocRemGalldoc != null ? typeextdocRemGalldoc.hashCode() : 0);
        result = 31 * result + (idextdocRemGalldoc != null ? idextdocRemGalldoc.hashCode() : 0);
        result = 31 * result + (sumRemGalldoc != null ? sumRemGalldoc.hashCode() : 0);
        result = 31 * result + (idextDoutRemGalldoc != null ? idextDoutRemGalldoc.hashCode() : 0);
        result = 31 * result + (idextBaseRemGalldoc != null ? idextBaseRemGalldoc.hashCode() : 0);
        result = 31 * result + (idprojectRemGalldoc != null ? idprojectRemGalldoc.hashCode() : 0);
        result = 31 * result + (idbusinopRemGalldoc != null ? idbusinopRemGalldoc.hashCode() : 0);
        result = 31 * result + (typeTblRemGalldoc != null ? typeTblRemGalldoc.hashCode() : 0);
        result = 31 * result + (prefiksNumRemGalldoc != null ? prefiksNumRemGalldoc.hashCode() : 0);
        result = 31 * result + (idobjectRemGalldoc != null ? idobjectRemGalldoc.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "remGalldocByIddocRemDakt")
//    public Collection<entety.RemDaktEntity> getRemDaktsByIdRemGalldoc() {
//        return remDaktsByIdRemGalldoc;
//    }
//
//    public void setRemDaktsByIdRemGalldoc(Collection<entety.RemDaktEntity> remDaktsByIdRemGalldoc) {
//        this.remDaktsByIdRemGalldoc = remDaktsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDaktt")
//    public Collection<entety.RemDakttEntity> getRemDakttsByIdRemGalldoc() {
//        return remDakttsByIdRemGalldoc;
//    }
//
//    public void setRemDakttsByIdRemGalldoc(Collection<entety.RemDakttEntity> remDakttsByIdRemGalldoc) {
//        this.remDakttsByIdRemGalldoc = remDakttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDdilpost")
//    public Collection<entety.RemDdilpostEntity> getRemDdilpostsByIdRemGalldoc() {
//        return remDdilpostsByIdRemGalldoc;
//    }
//
//    public void setRemDdilpostsByIdRemGalldoc(Collection<entety.RemDdilpostEntity> remDdilpostsByIdRemGalldoc) {
//        this.remDdilpostsByIdRemGalldoc = remDdilpostsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDdilpostt")
//    public Collection<entety.RemDdilposttEntity> getRemDdilposttsByIdRemGalldoc() {
//        return remDdilposttsByIdRemGalldoc;
//    }
//
//    public void setRemDdilposttsByIdRemGalldoc(Collection<entety.RemDdilposttEntity> remDdilposttsByIdRemGalldoc) {
//        this.remDdilposttsByIdRemGalldoc = remDdilposttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDdilret")
//    public Collection<entety.RemDdilretEntity> getRemDdilretsByIdRemGalldoc() {
//        return remDdilretsByIdRemGalldoc;
//    }
//
//    public void setRemDdilretsByIdRemGalldoc(Collection<entety.RemDdilretEntity> remDdilretsByIdRemGalldoc) {
//        this.remDdilretsByIdRemGalldoc = remDdilretsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDdilrett")
//    public Collection<entety.RemDdilrettEntity> getRemDdilrettsByIdRemGalldoc() {
//        return remDdilrettsByIdRemGalldoc;
//    }
//
//    public void setRemDdilrettsByIdRemGalldoc(Collection<entety.RemDdilrettEntity> remDdilrettsByIdRemGalldoc) {
//        this.remDdilrettsByIdRemGalldoc = remDdilrettsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDkm1")
//    public Collection<entety.RemDkm1Entity> getRemDkm1sByIdRemGalldoc() {
//        return remDkm1sByIdRemGalldoc;
//    }
//
//    public void setRemDkm1sByIdRemGalldoc(Collection<entety.RemDkm1Entity> remDkm1sByIdRemGalldoc) {
//        this.remDkm1sByIdRemGalldoc = remDkm1sByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDkm1T")
//    public Collection<entety.RemDkm1TEntity> getRemDkm1TSByIdRemGalldoc() {
//        return remDkm1TSByIdRemGalldoc;
//    }
//
//    public void setRemDkm1TSByIdRemGalldoc(Collection<entety.RemDkm1TEntity> remDkm1TSByIdRemGalldoc) {
//        this.remDkm1TSByIdRemGalldoc = remDkm1TSByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDkm2")
//    public Collection<entety.RemDkm2Entity> getRemDkm2sByIdRemGalldoc() {
//        return remDkm2sByIdRemGalldoc;
//    }
//
//    public void setRemDkm2sByIdRemGalldoc(Collection<entety.RemDkm2Entity> remDkm2sByIdRemGalldoc) {
//        this.remDkm2sByIdRemGalldoc = remDkm2sByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDkm2T")
//    public Collection<entety.RemDkm2TEntity> getRemDkm2TSByIdRemGalldoc() {
//        return remDkm2TSByIdRemGalldoc;
//    }
//
//    public void setRemDkm2TSByIdRemGalldoc(Collection<entety.RemDkm2TEntity> remDkm2TSByIdRemGalldoc) {
//        this.remDkm2TSByIdRemGalldoc = remDkm2TSByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDosn")
//    public Collection<entety.RemDosnEntity> getRemDosnsByIdRemGalldoc() {
//        return remDosnsByIdRemGalldoc;
//    }
//
//    public void setRemDosnsByIdRemGalldoc(Collection<entety.RemDosnEntity> remDosnsByIdRemGalldoc) {
//        this.remDosnsByIdRemGalldoc = remDosnsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDosnt")
//    public Collection<entety.RemDosntEntity> getRemDosntsByIdRemGalldoc() {
//        return remDosntsByIdRemGalldoc;
//    }
//
//    public void setRemDosntsByIdRemGalldoc(Collection<entety.RemDosntEntity> remDosntsByIdRemGalldoc) {
//        this.remDosntsByIdRemGalldoc = remDosntsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDotprpost")
//    public Collection<entety.RemDotprpostEntity> getRemDotprpostsByIdRemGalldoc() {
//        return remDotprpostsByIdRemGalldoc;
//    }
//
//    public void setRemDotprpostsByIdRemGalldoc(Collection<entety.RemDotprpostEntity> remDotprpostsByIdRemGalldoc) {
//        this.remDotprpostsByIdRemGalldoc = remDotprpostsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDotprpostt")
//    public Collection<entety.RemDotprposttEntity> getRemDotprposttsByIdRemGalldoc() {
//        return remDotprposttsByIdRemGalldoc;
//    }
//
//    public void setRemDotprposttsByIdRemGalldoc(Collection<entety.RemDotprposttEntity> remDotprposttsByIdRemGalldoc) {
//        this.remDotprposttsByIdRemGalldoc = remDotprposttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDper")
//    public Collection<entety.RemDperEntity> getRemDpersByIdRemGalldoc() {
//        return remDpersByIdRemGalldoc;
//    }
//
//    public void setRemDpersByIdRemGalldoc(Collection<entety.RemDperEntity> remDpersByIdRemGalldoc) {
//        this.remDpersByIdRemGalldoc = remDpersByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDpert")
//    public Collection<entety.RemDpertEntity> getRemDpertsByIdRemGalldoc() {
//        return remDpertsByIdRemGalldoc;
//    }
//
//    public void setRemDpertsByIdRemGalldoc(Collection<entety.RemDpertEntity> remDpertsByIdRemGalldoc) {
//        this.remDpertsByIdRemGalldoc = remDpertsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDprn")
//    public Collection<entety.RemDprnEntity> getRemDprnsByIdRemGalldoc() {
//        return remDprnsByIdRemGalldoc;
//    }
//
//    public void setRemDprnsByIdRemGalldoc(Collection<entety.RemDprnEntity> remDprnsByIdRemGalldoc) {
//        this.remDprnsByIdRemGalldoc = remDprnsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDprnt")
//    public Collection<entety.RemDprntEntity> getRemDprntsByIdRemGalldoc() {
//        return remDprntsByIdRemGalldoc;
//    }
//
//    public void setRemDprntsByIdRemGalldoc(Collection<entety.RemDprntEntity> remDprntsByIdRemGalldoc) {
//        this.remDprntsByIdRemGalldoc = remDprntsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDrakompl")
//    public Collection<entety.RemDrakomplEntity> getRemDrakomplsByIdRemGalldoc() {
//        return remDrakomplsByIdRemGalldoc;
//    }
//
//    public void setRemDrakomplsByIdRemGalldoc(Collection<entety.RemDrakomplEntity> remDrakomplsByIdRemGalldoc) {
//        this.remDrakomplsByIdRemGalldoc = remDrakomplsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDrakomplt")
//    public Collection<entety.RemDrakompltEntity> getRemDrakompltsByIdRemGalldoc() {
//        return remDrakompltsByIdRemGalldoc;
//    }
//
//    public void setRemDrakompltsByIdRemGalldoc(Collection<entety.RemDrakompltEntity> remDrakompltsByIdRemGalldoc) {
//        this.remDrakompltsByIdRemGalldoc = remDrakompltsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDreal")
//    public Collection<entety.RemDrealEntity> getRemDrealsByIdRemGalldoc() {
//        return remDrealsByIdRemGalldoc;
//    }
//
//    public void setRemDrealsByIdRemGalldoc(Collection<entety.RemDrealEntity> remDrealsByIdRemGalldoc) {
//        this.remDrealsByIdRemGalldoc = remDrealsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDrealt")
//    public Collection<entety.RemDrealtEntity> getRemDrealtsByIdRemGalldoc() {
//        return remDrealtsByIdRemGalldoc;
//    }
//
//    public void setRemDrealtsByIdRemGalldoc(Collection<entety.RemDrealtEntity> remDrealtsByIdRemGalldoc) {
//        this.remDrealtsByIdRemGalldoc = remDrealtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDremont")
//    public Collection<entety.RemDremontEntity> getRemDremontsByIdRemGalldoc() {
//        return remDremontsByIdRemGalldoc;
//    }
//
//    public void setRemDremontsByIdRemGalldoc(Collection<entety.RemDremontEntity> remDremontsByIdRemGalldoc) {
//        this.remDremontsByIdRemGalldoc = remDremontsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDremonthw")
//    public Collection<entety.RemDremonthwEntity> getRemDremonthwsByIdRemGalldoc() {
//        return remDremonthwsByIdRemGalldoc;
//    }
//
//    public void setRemDremonthwsByIdRemGalldoc(Collection<entety.RemDremonthwEntity> remDremonthwsByIdRemGalldoc) {
//        this.remDremonthwsByIdRemGalldoc = remDremonthwsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDremonthwt")
//    public Collection<entety.RemDremonthwtEntity> getRemDremonthwtsByIdRemGalldoc() {
//        return remDremonthwtsByIdRemGalldoc;
//    }
//
//    public void setRemDremonthwtsByIdRemGalldoc(Collection<entety.RemDremonthwtEntity> remDremonthwtsByIdRemGalldoc) {
//        this.remDremonthwtsByIdRemGalldoc = remDremonthwtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDremontkkt")
//    public Collection<entety.RemDremontkktEntity> getRemDremontkktsByIdRemGalldoc() {
//        return remDremontkktsByIdRemGalldoc;
//    }
//
//    public void setRemDremontkktsByIdRemGalldoc(Collection<entety.RemDremontkktEntity> remDremontkktsByIdRemGalldoc) {
//        this.remDremontkktsByIdRemGalldoc = remDremontkktsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDremontkktt")
//    public Collection<entety.RemDremontkkttEntity> getRemDremontkkttsByIdRemGalldoc() {
//        return remDremontkkttsByIdRemGalldoc;
//    }
//
//    public void setRemDremontkkttsByIdRemGalldoc(Collection<entety.RemDremontkkttEntity> remDremontkkttsByIdRemGalldoc) {
//        this.remDremontkkttsByIdRemGalldoc = remDremontkkttsByIdRemGalldoc;
//    }
//
    @OneToMany(mappedBy = "remGalldocByIddocRemDremontt")
    public Collection<RemDremonttEntity> getRemDremonttsByIdRemGalldoc() {
        return remDremonttsByIdRemGalldoc;
    }

    public void setRemDremonttsByIdRemGalldoc(Collection<RemDremonttEntity> remDremonttsByIdRemGalldoc) {
        this.remDremonttsByIdRemGalldoc = remDremonttsByIdRemGalldoc;
    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDrgOtchpost")
//    public Collection<entety.RemDrgOtchpostEntity> getRemDrgOtchpostsByIdRemGalldoc() {
//        return remDrgOtchpostsByIdRemGalldoc;
//    }
//
//    public void setRemDrgOtchpostsByIdRemGalldoc(Collection<entety.RemDrgOtchpostEntity> remDrgOtchpostsByIdRemGalldoc) {
//        this.remDrgOtchpostsByIdRemGalldoc = remDrgOtchpostsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDrgOtchpostt")
//    public Collection<entety.RemDrgOtchposttEntity> getRemDrgOtchposttsByIdRemGalldoc() {
//        return remDrgOtchposttsByIdRemGalldoc;
//    }
//
//    public void setRemDrgOtchposttsByIdRemGalldoc(Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdRemGalldoc) {
//        this.remDrgOtchposttsByIdRemGalldoc = remDrgOtchposttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocpostRemDrgOtchpostt")
//    public Collection<entety.RemDrgOtchposttEntity> getRemDrgOtchposttsByIdRemGalldoc_0() {
//        return remDrgOtchposttsByIdRemGalldoc_0;
//    }
//
//    public void setRemDrgOtchposttsByIdRemGalldoc_0(Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdRemGalldoc_0) {
//        this.remDrgOtchposttsByIdRemGalldoc_0 = remDrgOtchposttsByIdRemGalldoc_0;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsbkompl")
//    public Collection<entety.RemDsbkomplEntity> getRemDsbkomplsByIdRemGalldoc() {
//        return remDsbkomplsByIdRemGalldoc;
//    }
//
//    public void setRemDsbkomplsByIdRemGalldoc(Collection<entety.RemDsbkomplEntity> remDsbkomplsByIdRemGalldoc) {
//        this.remDsbkomplsByIdRemGalldoc = remDsbkomplsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsbkomplt")
//    public Collection<entety.RemDsbkompltEntity> getRemDsbkompltsByIdRemGalldoc() {
//        return remDsbkompltsByIdRemGalldoc;
//    }
//
//    public void setRemDsbkompltsByIdRemGalldoc(Collection<entety.RemDsbkompltEntity> remDsbkompltsByIdRemGalldoc) {
//        this.remDsbkompltsByIdRemGalldoc = remDsbkompltsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDscper")
//    public Collection<entety.RemDscperEntity> getRemDscpersByIdRemGalldoc() {
//        return remDscpersByIdRemGalldoc;
//    }
//
//    public void setRemDscpersByIdRemGalldoc(Collection<entety.RemDscperEntity> remDscpersByIdRemGalldoc) {
//        this.remDscpersByIdRemGalldoc = remDscpersByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDscpert")
//    public Collection<entety.RemDscpertEntity> getRemDscpertsByIdRemGalldoc() {
//        return remDscpertsByIdRemGalldoc;
//    }
//
//    public void setRemDscpertsByIdRemGalldoc(Collection<entety.RemDscpertEntity> remDscpertsByIdRemGalldoc) {
//        this.remDscpertsByIdRemGalldoc = remDscpertsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDscret")
//    public Collection<entety.RemDscretEntity> getRemDscretsByIdRemGalldoc() {
//        return remDscretsByIdRemGalldoc;
//    }
//
//    public void setRemDscretsByIdRemGalldoc(Collection<entety.RemDscretEntity> remDscretsByIdRemGalldoc) {
//        this.remDscretsByIdRemGalldoc = remDscretsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDscrett")
//    public Collection<entety.RemDscrettEntity> getRemDscrettsByIdRemGalldoc() {
//        return remDscrettsByIdRemGalldoc;
//    }
//
//    public void setRemDscrettsByIdRemGalldoc(Collection<entety.RemDscrettEntity> remDscrettsByIdRemGalldoc) {
//        this.remDscrettsByIdRemGalldoc = remDscrettsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsetservhw")
//    public Collection<entety.RemDsetservhwEntity> getRemDsetservhwsByIdRemGalldoc() {
//        return remDsetservhwsByIdRemGalldoc;
//    }
//
//    public void setRemDsetservhwsByIdRemGalldoc(Collection<entety.RemDsetservhwEntity> remDsetservhwsByIdRemGalldoc) {
//        this.remDsetservhwsByIdRemGalldoc = remDsetservhwsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsetservhwt")
//    public Collection<entety.RemDsetservhwtEntity> getRemDsetservhwtsByIdRemGalldoc() {
//        return remDsetservhwtsByIdRemGalldoc;
//    }
//
//    public void setRemDsetservhwtsByIdRemGalldoc(Collection<entety.RemDsetservhwtEntity> remDsetservhwtsByIdRemGalldoc) {
//        this.remDsetservhwtsByIdRemGalldoc = remDsetservhwtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsetservkkt")
//    public Collection<entety.RemDsetservkktEntity> getRemDsetservkktsByIdRemGalldoc() {
//        return remDsetservkktsByIdRemGalldoc;
//    }
//
//    public void setRemDsetservkktsByIdRemGalldoc(Collection<entety.RemDsetservkktEntity> remDsetservkktsByIdRemGalldoc) {
//        this.remDsetservkktsByIdRemGalldoc = remDsetservkktsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDsetservkktt")
//    public Collection<entety.RemDsetservkkttEntity> getRemDsetservkkttsByIdRemGalldoc() {
//        return remDsetservkkttsByIdRemGalldoc;
//    }
//
//    public void setRemDsetservkkttsByIdRemGalldoc(Collection<entety.RemDsetservkkttEntity> remDsetservkkttsByIdRemGalldoc) {
//        this.remDsetservkkttsByIdRemGalldoc = remDsetservkkttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDspn")
//    public Collection<entety.RemDspnEntity> getRemDspnsByIdRemGalldoc() {
//        return remDspnsByIdRemGalldoc;
//    }
//
//    public void setRemDspnsByIdRemGalldoc(Collection<entety.RemDspnEntity> remDspnsByIdRemGalldoc) {
//        this.remDspnsByIdRemGalldoc = remDspnsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDspnt")
//    public Collection<entety.RemDspntEntity> getRemDspntsByIdRemGalldoc() {
//        return remDspntsByIdRemGalldoc;
//    }
//
//    public void setRemDspntsByIdRemGalldoc(Collection<entety.RemDspntEntity> remDspntsByIdRemGalldoc) {
//        this.remDspntsByIdRemGalldoc = remDspntsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvidachaHw")
//    public Collection<entety.RemDvidachaHwEntity> getRemDvidachaHwsByIdRemGalldoc() {
//        return remDvidachaHwsByIdRemGalldoc;
//    }
//
//    public void setRemDvidachaHwsByIdRemGalldoc(Collection<entety.RemDvidachaHwEntity> remDvidachaHwsByIdRemGalldoc) {
//        this.remDvidachaHwsByIdRemGalldoc = remDvidachaHwsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvidachaHwt")
//    public Collection<entety.RemDvidachaHwtEntity> getRemDvidachaHwtsByIdRemGalldoc() {
//        return remDvidachaHwtsByIdRemGalldoc;
//    }
//
//    public void setRemDvidachaHwtsByIdRemGalldoc(Collection<entety.RemDvidachaHwtEntity> remDvidachaHwtsByIdRemGalldoc) {
//        this.remDvidachaHwtsByIdRemGalldoc = remDvidachaHwtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvosvratHw")
//    public Collection<entety.RemDvosvratHwEntity> getRemDvosvratHwsByIdRemGalldoc() {
//        return remDvosvratHwsByIdRemGalldoc;
//    }
//
//    public void setRemDvosvratHwsByIdRemGalldoc(Collection<entety.RemDvosvratHwEntity> remDvosvratHwsByIdRemGalldoc) {
//        this.remDvosvratHwsByIdRemGalldoc = remDvosvratHwsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvosvratHwt")
//    public Collection<entety.RemDvosvratHwtEntity> getRemDvosvratHwtsByIdRemGalldoc() {
//        return remDvosvratHwtsByIdRemGalldoc;
//    }
//
//    public void setRemDvosvratHwtsByIdRemGalldoc(Collection<entety.RemDvosvratHwtEntity> remDvosvratHwtsByIdRemGalldoc) {
//        this.remDvosvratHwtsByIdRemGalldoc = remDvosvratHwtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvpo")
//    public Collection<entety.RemDvpoEntity> getRemDvposByIdRemGalldoc() {
//        return remDvposByIdRemGalldoc;
//    }
//
//    public void setRemDvposByIdRemGalldoc(Collection<entety.RemDvpoEntity> remDvposByIdRemGalldoc) {
//        this.remDvposByIdRemGalldoc = remDvposByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvpok")
//    public Collection<entety.RemDvpokEntity> getRemDvpoksByIdRemGalldoc() {
//        return remDvpoksByIdRemGalldoc;
//    }
//
//    public void setRemDvpoksByIdRemGalldoc(Collection<entety.RemDvpokEntity> remDvpoksByIdRemGalldoc) {
//        this.remDvpoksByIdRemGalldoc = remDvpoksByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvpokt")
//    public Collection<entety.RemDvpoktEntity> getRemDvpoktsByIdRemGalldoc() {
//        return remDvpoktsByIdRemGalldoc;
//    }
//
//    public void setRemDvpoktsByIdRemGalldoc(Collection<entety.RemDvpoktEntity> remDvpoktsByIdRemGalldoc) {
//        this.remDvpoktsByIdRemGalldoc = remDvpoktsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvpot")
//    public Collection<entety.RemDvpotEntity> getRemDvpotsByIdRemGalldoc() {
//        return remDvpotsByIdRemGalldoc;
//    }
//
//    public void setRemDvpotsByIdRemGalldoc(Collection<entety.RemDvpotEntity> remDvpotsByIdRemGalldoc) {
//        this.remDvpotsByIdRemGalldoc = remDvpotsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvzper")
//    public Collection<entety.RemDvzperEntity> getRemDvzpersByIdRemGalldoc() {
//        return remDvzpersByIdRemGalldoc;
//    }
//
//    public void setRemDvzpersByIdRemGalldoc(Collection<entety.RemDvzperEntity> remDvzpersByIdRemGalldoc) {
//        this.remDvzpersByIdRemGalldoc = remDvzpersByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvzpert")
//    public Collection<entety.RemDvzpertEntity> getRemDvzpertsByIdRemGalldoc() {
//        return remDvzpertsByIdRemGalldoc;
//    }
//
//    public void setRemDvzpertsByIdRemGalldoc(Collection<entety.RemDvzpertEntity> remDvzpertsByIdRemGalldoc) {
//        this.remDvzpertsByIdRemGalldoc = remDvzpertsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvzvpo")
//    public Collection<entety.RemDvzvpoEntity> getRemDvzvposByIdRemGalldoc() {
//        return remDvzvposByIdRemGalldoc;
//    }
//
//    public void setRemDvzvposByIdRemGalldoc(Collection<entety.RemDvzvpoEntity> remDvzvposByIdRemGalldoc) {
//        this.remDvzvposByIdRemGalldoc = remDvzvposByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDvzvpot")
//    public Collection<entety.RemDvzvpotEntity> getRemDvzvpotsByIdRemGalldoc() {
//        return remDvzvpotsByIdRemGalldoc;
//    }
//
//    public void setRemDvzvpotsByIdRemGalldoc(Collection<entety.RemDvzvpotEntity> remDvzvpotsByIdRemGalldoc) {
//        this.remDvzvpotsByIdRemGalldoc = remDvzvpotsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzakpost")
//    public Collection<entety.RemDzakpostEntity> getRemDzakpostsByIdRemGalldoc() {
//        return remDzakpostsByIdRemGalldoc;
//    }
//
//    public void setRemDzakpostsByIdRemGalldoc(Collection<entety.RemDzakpostEntity> remDzakpostsByIdRemGalldoc) {
//        this.remDzakpostsByIdRemGalldoc = remDzakpostsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzakpostt")
//    public Collection<entety.RemDzakposttEntity> getRemDzakposttsByIdRemGalldoc() {
//        return remDzakposttsByIdRemGalldoc;
//    }
//
//    public void setRemDzakposttsByIdRemGalldoc(Collection<entety.RemDzakposttEntity> remDzakposttsByIdRemGalldoc) {
//        this.remDzakposttsByIdRemGalldoc = remDzakposttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzaktpr")
//    public Collection<entety.RemDzaktprEntity> getRemDzaktprsByIdRemGalldoc() {
//        return remDzaktprsByIdRemGalldoc;
//    }
//
//    public void setRemDzaktprsByIdRemGalldoc(Collection<entety.RemDzaktprEntity> remDzaktprsByIdRemGalldoc) {
//        this.remDzaktprsByIdRemGalldoc = remDzaktprsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzaktprt")
//    public Collection<entety.RemDzaktprtEntity> getRemDzaktprtsByIdRemGalldoc() {
//        return remDzaktprtsByIdRemGalldoc;
//    }
//
//    public void setRemDzaktprtsByIdRemGalldoc(Collection<entety.RemDzaktprtEntity> remDzaktprtsByIdRemGalldoc) {
//        this.remDzaktprtsByIdRemGalldoc = remDzaktprtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzcheck")
//    public Collection<entety.RemDzcheckEntity> getRemDzchecksByIdRemGalldoc() {
//        return remDzchecksByIdRemGalldoc;
//    }
//
//    public void setRemDzchecksByIdRemGalldoc(Collection<entety.RemDzcheckEntity> remDzchecksByIdRemGalldoc) {
//        this.remDzchecksByIdRemGalldoc = remDzchecksByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzcheckt")
//    public Collection<entety.RemDzchecktEntity> getRemDzchecktsByIdRemGalldoc() {
//        return remDzchecktsByIdRemGalldoc;
//    }
//
//    public void setRemDzchecktsByIdRemGalldoc(Collection<entety.RemDzchecktEntity> remDzchecktsByIdRemGalldoc) {
//        this.remDzchecktsByIdRemGalldoc = remDzchecktsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzend")
//    public Collection<entety.RemDzendEntity> getRemDzendsByIdRemGalldoc() {
//        return remDzendsByIdRemGalldoc;
//    }
//
//    public void setRemDzendsByIdRemGalldoc(Collection<entety.RemDzendEntity> remDzendsByIdRemGalldoc) {
//        this.remDzendsByIdRemGalldoc = remDzendsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzoper")
//    public Collection<entety.RemDzoperEntity> getRemDzopersByIdRemGalldoc() {
//        return remDzopersByIdRemGalldoc;
//    }
//
//    public void setRemDzopersByIdRemGalldoc(Collection<entety.RemDzoperEntity> remDzopersByIdRemGalldoc) {
//        this.remDzopersByIdRemGalldoc = remDzopersByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzopert")
//    public Collection<entety.RemDzopertEntity> getRemDzopertsByIdRemGalldoc() {
//        return remDzopertsByIdRemGalldoc;
//    }
//
//    public void setRemDzopertsByIdRemGalldoc(Collection<entety.RemDzopertEntity> remDzopertsByIdRemGalldoc) {
//        this.remDzopertsByIdRemGalldoc = remDzopertsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzper")
//    public Collection<entety.RemDzperEntity> getRemDzpersByIdRemGalldoc() {
//        return remDzpersByIdRemGalldoc;
//    }
//
//    public void setRemDzpersByIdRemGalldoc(Collection<entety.RemDzperEntity> remDzpersByIdRemGalldoc) {
//        this.remDzpersByIdRemGalldoc = remDzpersByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzpert")
//    public Collection<entety.RemDzpertEntity> getRemDzpertsByIdRemGalldoc() {
//        return remDzpertsByIdRemGalldoc;
//    }
//
//    public void setRemDzpertsByIdRemGalldoc(Collection<entety.RemDzpertEntity> remDzpertsByIdRemGalldoc) {
//        this.remDzpertsByIdRemGalldoc = remDzpertsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzpost")
//    public Collection<entety.RemDzpostEntity> getRemDzpostsByIdRemGalldoc() {
//        return remDzpostsByIdRemGalldoc;
//    }
//
//    public void setRemDzpostsByIdRemGalldoc(Collection<entety.RemDzpostEntity> remDzpostsByIdRemGalldoc) {
//        this.remDzpostsByIdRemGalldoc = remDzpostsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzpostt")
//    public Collection<entety.RemDzposttEntity> getRemDzposttsByIdRemGalldoc() {
//        return remDzposttsByIdRemGalldoc;
//    }
//
//    public void setRemDzposttsByIdRemGalldoc(Collection<entety.RemDzposttEntity> remDzposttsByIdRemGalldoc) {
//        this.remDzposttsByIdRemGalldoc = remDzposttsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzstart")
//    public Collection<entety.RemDzstartEntity> getRemDzstartsByIdRemGalldoc() {
//        return remDzstartsByIdRemGalldoc;
//    }
//
//    public void setRemDzstartsByIdRemGalldoc(Collection<entety.RemDzstartEntity> remDzstartsByIdRemGalldoc) {
//        this.remDzstartsByIdRemGalldoc = remDzstartsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDztreb")
//    public Collection<entety.RemDztrebEntity> getRemDztrebsByIdRemGalldoc() {
//        return remDztrebsByIdRemGalldoc;
//    }
//
//    public void setRemDztrebsByIdRemGalldoc(Collection<entety.RemDztrebEntity> remDztrebsByIdRemGalldoc) {
//        this.remDztrebsByIdRemGalldoc = remDztrebsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDztrebt")
//    public Collection<entety.RemDztrebtEntity> getRemDztrebtsByIdRemGalldoc() {
//        return remDztrebtsByIdRemGalldoc;
//    }
//
//    public void setRemDztrebtsByIdRemGalldoc(Collection<entety.RemDztrebtEntity> remDztrebtsByIdRemGalldoc) {
//        this.remDztrebtsByIdRemGalldoc = remDztrebtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzvid")
//    public Collection<entety.RemDzvidEntity> getRemDzvidsByIdRemGalldoc() {
//        return remDzvidsByIdRemGalldoc;
//    }
//
//    public void setRemDzvidsByIdRemGalldoc(Collection<entety.RemDzvidEntity> remDzvidsByIdRemGalldoc) {
//        this.remDzvidsByIdRemGalldoc = remDzvidsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzvidt")
//    public Collection<entety.RemDzvidtEntity> getRemDzvidtsByIdRemGalldoc() {
//        return remDzvidtsByIdRemGalldoc;
//    }
//
//    public void setRemDzvidtsByIdRemGalldoc(Collection<entety.RemDzvidtEntity> remDzvidtsByIdRemGalldoc) {
//        this.remDzvidtsByIdRemGalldoc = remDzvidtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzvzap")
//    public Collection<entety.RemDzvzapEntity> getRemDzvzapsByIdRemGalldoc() {
//        return remDzvzapsByIdRemGalldoc;
//    }
//
//    public void setRemDzvzapsByIdRemGalldoc(Collection<entety.RemDzvzapEntity> remDzvzapsByIdRemGalldoc) {
//        this.remDzvzapsByIdRemGalldoc = remDzvzapsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemDzvzapt")
//    public Collection<entety.RemDzvzaptEntity> getRemDzvzaptsByIdRemGalldoc() {
//        return remDzvzaptsByIdRemGalldoc;
//    }
//
//    public void setRemDzvzaptsByIdRemGalldoc(Collection<entety.RemDzvzaptEntity> remDzvzaptsByIdRemGalldoc) {
//        this.remDzvzaptsByIdRemGalldoc = remDzvzaptsByIdRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBASE_REM_GALLDOC", referencedColumnName = "ID_SINFBASE_OBMEN")
//    public entety.SinfbaseObmenEntity getSinfbaseObmenByIdbaseRemGalldoc() {
//        return sinfbaseObmenByIdbaseRemGalldoc;
//    }
//
//    public void setSinfbaseObmenByIdbaseRemGalldoc(entety.SinfbaseObmenEntity sinfbaseObmenByIdbaseRemGalldoc) {
//        this.sinfbaseObmenByIdbaseRemGalldoc = sinfbaseObmenByIdbaseRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDFIRM_REM_GALLDOC", referencedColumnName = "IDFIRM")
//    public entety.SfirmEntity getSfirmByIdfirmRemGalldoc() {
//        return sfirmByIdfirmRemGalldoc;
//    }
//
//    public void setSfirmByIdfirmRemGalldoc(entety.SfirmEntity sfirmByIdfirmRemGalldoc) {
//        this.sfirmByIdfirmRemGalldoc = sfirmByIdfirmRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDSKLAD_REM_GALLDOC", referencedColumnName = "IDSKLAD")
//    public entety.SskladEntity getSskladByIdskladRemGalldoc() {
//        return sskladByIdskladRemGalldoc;
//    }
//
//    public void setSskladByIdskladRemGalldoc(entety.SskladEntity sskladByIdskladRemGalldoc) {
//        this.sskladByIdskladRemGalldoc = sskladByIdskladRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDKLIENT_REM_GALLDOC", referencedColumnName = "IDKLIENT")
//    public entety.SklientEntity getSklientByIdklientRemGalldoc() {
//        return sklientByIdklientRemGalldoc;
//    }
//
//    public void setSklientByIdklientRemGalldoc(entety.SklientEntity sklientByIdklientRemGalldoc) {
//        this.sklientByIdklientRemGalldoc = sklientByIdklientRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDUSER_REM_GALLDOC", referencedColumnName = "ID_USER")
//    public entety.SuserEntity getSuserByIduserRemGalldoc() {
//        return suserByIduserRemGalldoc;
//    }
//
//    public void setSuserByIduserRemGalldoc(entety.SuserEntity suserByIduserRemGalldoc) {
//        this.suserByIduserRemGalldoc = suserByIduserRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDDOCOSN_REM_GALLDOC", referencedColumnName = "ID_REM_GALLDOC")
//    public entety.RemGalldocEntity getRemGalldocByIddocosnRemGalldoc() {
//        return remGalldocByIddocosnRemGalldoc;
//    }
//
//    public void setRemGalldocByIddocosnRemGalldoc(entety.RemGalldocEntity remGalldocByIddocosnRemGalldoc) {
//        this.remGalldocByIddocosnRemGalldoc = remGalldocByIddocosnRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocosnRemGalldoc")
//    public Collection<entety.RemGalldocEntity> getRemGalldocsByIdRemGalldoc() {
//        return remGalldocsByIdRemGalldoc;
//    }
//
//    public void setRemGalldocsByIdRemGalldoc(Collection<entety.RemGalldocEntity> remGalldocsByIdRemGalldoc) {
//        this.remGalldocsByIdRemGalldoc = remGalldocsByIdRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDPROJECT_REM_GALLDOC", referencedColumnName = "ID_SPROJECT")
//    public entety.SprojectEntity getSprojectByIdprojectRemGalldoc() {
//        return sprojectByIdprojectRemGalldoc;
//    }
//
//    public void setSprojectByIdprojectRemGalldoc(entety.SprojectEntity sprojectByIdprojectRemGalldoc) {
//        this.sprojectByIdprojectRemGalldoc = sprojectByIdprojectRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBUSINOP_REM_GALLDOC", referencedColumnName = "ID_SBUSINESS_OPER")
//    public entety.SbusinessOperEntity getSbusinessOperByIdbusinopRemGalldoc() {
//        return sbusinessOperByIdbusinopRemGalldoc;
//    }
//
//    public void setSbusinessOperByIdbusinopRemGalldoc(entety.SbusinessOperEntity sbusinessOperByIdbusinopRemGalldoc) {
//        this.sbusinessOperByIdbusinopRemGalldoc = sbusinessOperByIdbusinopRemGalldoc;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDOBJECT_REM_GALLDOC", referencedColumnName = "ID_SOBJECT")
//    public entety.SobjectEntity getSobjectByIdobjectRemGalldoc() {
//        return sobjectByIdobjectRemGalldoc;
//    }
//
//    public void setSobjectByIdobjectRemGalldoc(entety.SobjectEntity sobjectByIdobjectRemGalldoc) {
//        this.sobjectByIdobjectRemGalldoc = sobjectByIdobjectRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemGurProv")
//    public Collection<entety.RemGurProvEntity> getRemGurProvsByIdRemGalldoc() {
//        return remGurProvsByIdRemGalldoc;
//    }
//
//    public void setRemGurProvsByIdRemGalldoc(Collection<entety.RemGurProvEntity> remGurProvsByIdRemGalldoc) {
//        this.remGurProvsByIdRemGalldoc = remGurProvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocvigrRemGurVigrt")
//    public Collection<entety.RemGurVigrtEntity> getRemGurVigrtsByIdRemGalldoc() {
//        return remGurVigrtsByIdRemGalldoc;
//    }
//
//    public void setRemGurVigrtsByIdRemGalldoc(Collection<entety.RemGurVigrtEntity> remGurVigrtsByIdRemGalldoc) {
//        this.remGurVigrtsByIdRemGalldoc = remGurVigrtsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRggoodsDv")
//    public Collection<entety.RemRggoodsDvEntity> getRemRggoodsDvsByIdRemGalldoc() {
//        return remRggoodsDvsByIdRemGalldoc;
//    }
//
//    public void setRemRggoodsDvsByIdRemGalldoc(Collection<entety.RemRggoodsDvEntity> remRggoodsDvsByIdRemGalldoc) {
//        this.remRggoodsDvsByIdRemGalldoc = remRggoodsDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgosthwDv")
//    public Collection<entety.RemRgosthwDvEntity> getRemRgosthwDvsByIdRemGalldoc() {
//        return remRgosthwDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgosthwDvsByIdRemGalldoc(Collection<entety.RemRgosthwDvEntity> remRgosthwDvsByIdRemGalldoc) {
//        this.remRgosthwDvsByIdRemGalldoc = remRgosthwDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgostzdilDv")
//    public Collection<entety.RemRgostzdilDvEntity> getRemRgostzdilDvsByIdRemGalldoc() {
//        return remRgostzdilDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgostzdilDvsByIdRemGalldoc(Collection<entety.RemRgostzdilDvEntity> remRgostzdilDvsByIdRemGalldoc) {
//        this.remRgostzdilDvsByIdRemGalldoc = remRgostzdilDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgostzscDv")
//    public Collection<entety.RemRgostzscDvEntity> getRemRgostzscDvsByIdRemGalldoc() {
//        return remRgostzscDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgostzscDvsByIdRemGalldoc(Collection<entety.RemRgostzscDvEntity> remRgostzscDvsByIdRemGalldoc) {
//        this.remRgostzscDvsByIdRemGalldoc = remRgostzscDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgostzDv")
//    public Collection<entety.RemRgostzDvEntity> getRemRgostzDvsByIdRemGalldoc() {
//        return remRgostzDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgostzDvsByIdRemGalldoc(Collection<entety.RemRgostzDvEntity> remRgostzDvsByIdRemGalldoc) {
//        this.remRgostzDvsByIdRemGalldoc = remRgostzDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgotchpostDv")
//    public Collection<entety.RemRgotchpostDvEntity> getRemRgotchpostDvsByIdRemGalldoc() {
//        return remRgotchpostDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgotchpostDvsByIdRemGalldoc(Collection<entety.RemRgotchpostDvEntity> remRgotchpostDvsByIdRemGalldoc) {
//        this.remRgotchpostDvsByIdRemGalldoc = remRgotchpostDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgotprzDv")
//    public Collection<entety.RemRgotprzDvEntity> getRemRgotprzDvsByIdRemGalldoc() {
//        return remRgotprzDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgotprzDvsByIdRemGalldoc(Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdRemGalldoc) {
//        this.remRgotprzDvsByIdRemGalldoc = remRgotprzDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgserviceDv")
//    public Collection<entety.RemRgserviceDvEntity> getRemRgserviceDvsByIdRemGalldoc() {
//        return remRgserviceDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgserviceDvsByIdRemGalldoc(Collection<entety.RemRgserviceDvEntity> remRgserviceDvsByIdRemGalldoc) {
//        this.remRgserviceDvsByIdRemGalldoc = remRgserviceDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgservkktDv")
//    public Collection<entety.RemRgservkktDvEntity> getRemRgservkktDvsByIdRemGalldoc() {
//        return remRgservkktDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgservkktDvsByIdRemGalldoc(Collection<entety.RemRgservkktDvEntity> remRgservkktDvsByIdRemGalldoc) {
//        this.remRgservkktDvsByIdRemGalldoc = remRgservkktDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgsosthwDv")
//    public Collection<entety.RemRgsosthwDvEntity> getRemRgsosthwDvsByIdRemGalldoc() {
//        return remRgsosthwDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgsosthwDvsByIdRemGalldoc(Collection<entety.RemRgsosthwDvEntity> remRgsosthwDvsByIdRemGalldoc) {
//        this.remRgsosthwDvsByIdRemGalldoc = remRgsosthwDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgvzostDv")
//    public Collection<entety.RemRgvzostDvEntity> getRemRgvzostDvsByIdRemGalldoc() {
//        return remRgvzostDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgvzostDvsByIdRemGalldoc(Collection<entety.RemRgvzostDvEntity> remRgvzostDvsByIdRemGalldoc) {
//        this.remRgvzostDvsByIdRemGalldoc = remRgvzostDvsByIdRemGalldoc;
//    }
//
//    @OneToMany(mappedBy = "remGalldocByIddocRemRgvzvputiDv")
//    public Collection<entety.RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdRemGalldoc() {
//        return remRgvzvputiDvsByIdRemGalldoc;
//    }
//
//    public void setRemRgvzvputiDvsByIdRemGalldoc(Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdRemGalldoc) {
//        this.remRgvzvputiDvsByIdRemGalldoc = remRgvzvputiDvsByIdRemGalldoc;
//    }
}
