package Model.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "SNOM", schema = "", catalog = "")
public class SnomEntity {
    private long idnom;
    private Short tnom;
    private int codenom;
    private String namenom;
    private String fnamenom;
    private String krnamenom;
    private Long idbasednom;
    private Long idosnednom;
    private Long idfisedSnom;
    private Long idgrpnom;
    private String artnom;
    private String gidSnom;
    private String descrSnom;
    private Long idfirmnom;
    private Integer stndsnom;
    private String gtdnom;
    private Long idcountrynom;
    private Short flChangeNom;
    private BigDecimal minostnom;
    private Long idbaseSnom;
    private Long idextDoutSnom;
    private Long idextBaseSnom;
    private BigDecimal skidka1Snom;
    private BigDecimal skidka2Snom;
    private BigDecimal skidka3Snom;
    private Long idvidSnom;
    private Short typesrgodnSnom;
    private Short srgodnSnom;
    private Timestamp godenDoSnom;
    private Long idsupplierSnom;
    private Long idproducerSnom;
    private BigDecimal pogrSnom;
    private Integer warrantySnom;
    private Short flCreditSnom;
    private Short flTransportSnom;
    private Long idbrandSnom;
    private Short flAddInSoborudSnom;
    private Short flDvregSnom;
    private Long idvidimagenaborSnom;
    private Long idpropnaborSnom;
    private Short typeTblSnom;
    private Long iddepartmentSnom;
//    private Collection<DchktEntity> dchktsByIdnom;
//    private Collection<DinvtEntity> dinvtsByIdnom;
//    private Collection<DismpricetEntity> dismpricetsByIdnom;
//    private Collection<DosntEntity> dosntsByIdnom;
//    private Collection<DotchposttEntity> dotchposttsByIdnom;
//    private Collection<DotprposttEntity> dotprposttsByIdnom;
//    private Collection<DpertEntity> dpertsByIdnom;
//    private Collection<DprntEntity> dprntsByIdnom;
//    private Collection<DrasbkomplEntity> drasbkomplsByIdnom;
//    private Collection<DrasbkompltEntity> drasbkompltsByIdnom;
//    private Collection<DrealresttEntity> drealresttsByIdnom;
//    private Collection<DrealrozntEntity> drealrozntsByIdnom;
//    private Collection<DreatEntity> dreatsByIdnom;
//    private Collection<DrepkkmtEntity> drepkkmtsByIdnom;
//    private Collection<DrevtEntity> drevtsByIdnom;
//    private Collection<DrgGoodstEntity> drgGoodstsByIdnom;
//    private Collection<DrgOstnomtEntity> drgOstnomtsByIdnom;
//    private Collection<DrgOtchposttEntity> drgOtchposttsByIdnom;
//    private Collection<DsbkomplEntity> dsbkomplsByIdnom;
//    private Collection<DsbkompltEntity> dsbkompltsByIdnom;
//    private Collection<DschfacttEntity> dschfacttsByIdnom;
//    private Collection<DschtEntity> dschtsByIdnom;
//    private Collection<DspntEntity> dspntsByIdnom;
//    private Collection<DspotrosttEntity> dspotrosttsByIdnom;
//    private Collection<DvipprodtEntity> dvipprodtsByIdnom;
//    private Collection<DvpoktEntity> dvpoktsByIdnom;
//    private Collection<DvpotEntity> dvpotsByIdnom;
//    private Collection<DzakpoktEntity> dzakpoktsByIdnom;
//    private Collection<DzakposttEntity> dzakposttsByIdnom;
//    private Collection<DzamenatEntity> dzamenatsByIdnom;
//    private Collection<DzamenatEntity> dzamenatsByIdnom_0;
//    private Collection<HotDraschettEntity> hotDraschettsByIdnom;
//    private Collection<HotDrealtEntity> hotDrealtsByIdnom;
//    private Collection<HotSprosnuslEntity> hotSprosnuslsByIdnom;
//    private Collection<HotSprosnuslEntity> hotSprosnuslsByIdnom_0;
//    private Collection<RemCquerytEntity> remCquerytsByIdnom;
//    private Collection<RemDosntEntity> remDosntsByIdnom;
//    private Collection<RemDotprposttEntity> remDotprposttsByIdnom;
//    private Collection<RemDpertEntity> remDpertsByIdnom;
//    private Collection<RemDprntEntity> remDprntsByIdnom;
//    private Collection<RemDrakomplEntity> remDrakomplsByIdnom;
//    private Collection<RemDrakompltEntity> remDrakompltsByIdnom;
//    private Collection<RemDrealtEntity> remDrealtsByIdnom;
//    private Collection<RemDremonthwtEntity> remDremonthwtsByIdnom;
//    private Collection<RemDremontkkttEntity> remDremontkkttsByIdnom;
    private Collection<RemDremonttEntity> remDremonttsByIdnom;
    /*private Collection<RemDrgOtchposttEntity> remDrgOtchposttsByIdnom;
    private Collection<RemDsbkomplEntity> remDsbkomplsByIdnom;
    private Collection<RemDsbkompltEntity> remDsbkompltsByIdnom;
    private Collection<RemDspntEntity> remDspntsByIdnom;
    private Collection<RemDvpoktEntity> remDvpoktsByIdnom;
    private Collection<RemDvpotEntity> remDvpotsByIdnom;
    private Collection<RemDvzpertEntity> remDvzpertsByIdnom;
    private Collection<RemDvzvpotEntity> remDvzvpotsByIdnom;
    private Collection<RemDzakposttEntity> remDzakposttsByIdnom;
    private Collection<RemDzakposttEntity> remDzakposttsByIdnom_0;
    private Collection<RemDzaktprtEntity> remDzaktprtsByIdnom;
    private Collection<RemDzopertEntity> remDzopertsByIdnom;
    private Collection<RemDztrebtEntity> remDztrebtsByIdnom;
    private Collection<RemDzvzaptEntity> remDzvzaptsByIdnom;
    private Collection<RemRggoodsEntity> remRggoodsByIdnom;
    private Collection<RemRggoodsDvEntity> remRggoodsDvsByIdnom;
    private Collection<RemRgosthwEntity> remRgosthwsByIdnom;
    private Collection<RemRgosthwDvEntity> remRgosthwDvsByIdnom;
    private Collection<RemRgotchpostEntity> remRgotchpostsByIdnom;
    private Collection<RemRgotchpostDvEntity> remRgotchpostDvsByIdnom;
    private Collection<RemRgsosthwEntity> remRgsosthwsByIdnom;
    private Collection<RemRgsosthwEntity> remRgsosthwsByIdnom_0;
    private Collection<RemRgsosthwDvEntity> remRgsosthwDvsByIdnom;
    private Collection<RemRgsosthwDvEntity> remRgsosthwDvsByIdnom_0;
    private Collection<RemRgvzostEntity> remRgvzostsByIdnom;
    private Collection<RemRgvzostDvEntity> remRgvzostDvsByIdnom;
    private Collection<RemRgvzvputiEntity> remRgvzvputisByIdnom;
    private Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdnom;
    private Collection<RemSkomplmodelEntity> remSkomplmodelsByIdnom;
    private Collection<RemSmodelEntity> remSmodelsByIdnom;
    private Collection<RemSmodelDetalEntity> remSmodelDetalsByIdnom;
    private Collection<RemSprrabotaEntity> remSprrabotasByIdnom;
    private Collection<RemStyprabotEntity> remStyprabotsByIdnom;
    private Collection<RemZdopuslEntity> remZdopuslsByIdnom;
    private Collection<RemZperfworkEntity> remZperfworksByIdnom;
    private Collection<RggoodsEntity> rggoodsByIdnom;
    private Collection<RggoodsDvEntity> rggoodsDvsByIdnom;
    private Collection<RgostnomEntity> rgostnomsByIdnom;
    private Collection<RgostnomDvEntity> rgostnomDvsByIdnom;
    private Collection<RgotchpostEntity> rgotchpostsByIdnom;
    private Collection<RgotchpostDvEntity> rgotchpostDvsByIdnom;
    private Collection<RgotprpostEntity> rgotprpostsByIdnom;
    private Collection<RgotprpostDvEntity> rgotprpostDvsByIdnom;
    private Collection<RgotrspisDvEntity> rgotrspisDvsByIdnom;
    private Collection<RgrealDvEntity> rgrealDvsByIdnom;
    private Collection<RgsebprodDvEntity> rgsebprodDvsByIdnom;
    private Collection<RgtrebnomEntity> rgtrebnomsByIdnom;
    private Collection<RgtrebnomDvEntity> rgtrebnomDvsByIdnom;
    private Collection<RgtrebznomEntity> rgtrebznomsByIdnom;
    private Collection<RgtrebznomDvEntity> rgtrebznomDvsByIdnom;
    private Collection<RgvipprodDvEntity> rgvipprodDvsByIdnom;
    private Collection<RgzakpostEntity> rgzakpostsByIdnom;
    private Collection<RgzakpostDvEntity> rgzakpostDvsByIdnom;
    private Collection<RgzaktEntity> rgzaktsByIdnom;
    private Collection<SbvnomEntity> sbvnomsByIdnom;
    private Collection<ScodetelEntity> scodetelsByIdnom;
    private Collection<ScodetelEntity> scodetelsByIdnom_0;
    private Collection<SedEntity> sedsByIdnom;
    private Collection<SimportedEntity> simportedsByIdnom;
    private Collection<SimportnomEntity> simportnomsByIdnom;
    private Collection<SmodEntity> smodsByIdnom;
    private Collection<SnachislEntity> snachislsByIdnom;
    private SedEntity sedByIdbasednom;
    private SedEntity sedByIdosnednom;
    private SedEntity sedByIdfisedSnom;
    private SgrpnomEntity sgrpnomByIdgrpnom;
    private SfirmEntity sfirmByIdfirmnom;
    private ScountryEntity scountryByIdcountrynom;
    private SvidnomEntity svidnomByIdvidSnom;
    private SklientEntity sklientByIdsupplierSnom;
    private SklientEntity sklientByIdproducerSnom;
    private SbrandEntity sbrandByIdbrandSnom;
    private SvidimageNaborEntity svidimageNaborByIdvidimagenaborSnom;
    private SpropnaborEntity spropnaborByIdpropnaborSnom;
    private Collection<SnomimageEntity> snomimagesByIdnom;
    private Collection<SnominetcatEntity> snominetcatsByIdnom;
    private Collection<SnompropvalueEntity> snompropvaluesByIdnom;
    private Collection<SnomrestEntity> snomrestsByIdnom;
    private Collection<SnomAnalogEntity> snomAnalogsByIdnom;
    private Collection<SnomAnalogEntity> snomAnalogsByIdnom_0;
    private Collection<SnomDopEntity> snomDopsByIdnom;
    private Collection<SpartEntity> spartsByIdnom;
    private Collection<SpriceEntity> spricesByIdnom;
    private Collection<SpriceScheduleEntity> spriceSchedulesByIdnom;
    private Collection<SprnomEntity> sprnomsByIdnom;
    private Collection<SsezkfEntity> ssezkfsByIdnom;
    private Collection<SsprodEntity> ssprodsByIdnom;
    private Collection<SvesnomEntity> svesnomsByIdnom;*/

    @Id
    @Column(name = "IDNOM", nullable = false)
    public long getIdnom() {
        return idnom;
    }

    public void setIdnom(long idnom) {
        this.idnom = idnom;
    }

    @Basic
    @Column(name = "TNOM", nullable = true)
    public Short getTnom() {
        return tnom;
    }

    public void setTnom(Short tnom) {
        this.tnom = tnom;
    }

    @Basic
    @Column(name = "CODENOM", nullable = false)
    public int getCodenom() {
        return codenom;
    }

    public void setCodenom(int codenom) {
        this.codenom = codenom;
    }

    @Basic
    @Column(name = "NAMENOM", nullable = true, length = 200)
    public String getNamenom() {
        return namenom;
    }

    public void setNamenom(String namenom) {
        this.namenom = namenom;
    }

    @Basic
    @Column(name = "FNAMENOM", nullable = true, length = 200)
    public String getFnamenom() {
        return fnamenom;
    }

    public void setFnamenom(String fnamenom) {
        this.fnamenom = fnamenom;
    }

    @Basic
    @Column(name = "KRNAMENOM", nullable = true, length = 40)
    public String getKrnamenom() {
        return krnamenom;
    }

    public void setKrnamenom(String krnamenom) {
        this.krnamenom = krnamenom;
    }

    @Basic
    @Column(name = "IDBASEDNOM", nullable = true)
    public Long getIdbasednom() {
        return idbasednom;
    }

    public void setIdbasednom(Long idbasednom) {
        this.idbasednom = idbasednom;
    }

    @Basic
    @Column(name = "IDOSNEDNOM", nullable = true)
    public Long getIdosnednom() {
        return idosnednom;
    }

    public void setIdosnednom(Long idosnednom) {
        this.idosnednom = idosnednom;
    }

    @Basic
    @Column(name = "IDFISED_SNOM", nullable = true)
    public Long getIdfisedSnom() {
        return idfisedSnom;
    }

    public void setIdfisedSnom(Long idfisedSnom) {
        this.idfisedSnom = idfisedSnom;
    }

    @Basic
    @Column(name = "IDGRPNOM", nullable = true)
    public Long getIdgrpnom() {
        return idgrpnom;
    }

    public void setIdgrpnom(Long idgrpnom) {
        this.idgrpnom = idgrpnom;
    }

    @Basic
    @Column(name = "ARTNOM", nullable = true, length = 40)
    public String getArtnom() {
        return artnom;
    }

    public void setArtnom(String artnom) {
        this.artnom = artnom;
    }

    @Basic
    @Column(name = "GID_SNOM", nullable = true, length = 10)
    public String getGidSnom() {
        return gidSnom;
    }

    public void setGidSnom(String gidSnom) {
        this.gidSnom = gidSnom;
    }

    @Basic
    @Column(name = "DESCR_SNOM", nullable = true, length = 250)
    public String getDescrSnom() {
        return descrSnom;
    }

    public void setDescrSnom(String descrSnom) {
        this.descrSnom = descrSnom;
    }

    @Basic
    @Column(name = "IDFIRMNOM", nullable = true)
    public Long getIdfirmnom() {
        return idfirmnom;
    }

    public void setIdfirmnom(Long idfirmnom) {
        this.idfirmnom = idfirmnom;
    }

    @Basic
    @Column(name = "STNDSNOM", nullable = true)
    public Integer getStndsnom() {
        return stndsnom;
    }

    public void setStndsnom(Integer stndsnom) {
        this.stndsnom = stndsnom;
    }

    @Basic
    @Column(name = "GTDNOM", nullable = true, length = 40)
    public String getGtdnom() {
        return gtdnom;
    }

    public void setGtdnom(String gtdnom) {
        this.gtdnom = gtdnom;
    }

    @Basic
    @Column(name = "IDCOUNTRYNOM", nullable = true)
    public Long getIdcountrynom() {
        return idcountrynom;
    }

    public void setIdcountrynom(Long idcountrynom) {
        this.idcountrynom = idcountrynom;
    }

    @Basic
    @Column(name = "FL_CHANGE_NOM", nullable = true)
    public Short getFlChangeNom() {
        return flChangeNom;
    }

    public void setFlChangeNom(Short flChangeNom) {
        this.flChangeNom = flChangeNom;
    }

    @Basic
    @Column(name = "MINOSTNOM", nullable = true, precision = 3)
    public BigDecimal getMinostnom() {
        return minostnom;
    }

    public void setMinostnom(BigDecimal minostnom) {
        this.minostnom = minostnom;
    }

    @Basic
    @Column(name = "IDBASE_SNOM", nullable = true)
    public Long getIdbaseSnom() {
        return idbaseSnom;
    }

    public void setIdbaseSnom(Long idbaseSnom) {
        this.idbaseSnom = idbaseSnom;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_SNOM", nullable = true)
    public Long getIdextDoutSnom() {
        return idextDoutSnom;
    }

    public void setIdextDoutSnom(Long idextDoutSnom) {
        this.idextDoutSnom = idextDoutSnom;
    }

    @Basic
    @Column(name = "IDEXT_BASE_SNOM", nullable = true)
    public Long getIdextBaseSnom() {
        return idextBaseSnom;
    }

    public void setIdextBaseSnom(Long idextBaseSnom) {
        this.idextBaseSnom = idextBaseSnom;
    }

    @Basic
    @Column(name = "SKIDKA1_SNOM", nullable = true, precision = 2)
    public BigDecimal getSkidka1Snom() {
        return skidka1Snom;
    }

    public void setSkidka1Snom(BigDecimal skidka1Snom) {
        this.skidka1Snom = skidka1Snom;
    }

    @Basic
    @Column(name = "SKIDKA2_SNOM", nullable = true, precision = 2)
    public BigDecimal getSkidka2Snom() {
        return skidka2Snom;
    }

    public void setSkidka2Snom(BigDecimal skidka2Snom) {
        this.skidka2Snom = skidka2Snom;
    }

    @Basic
    @Column(name = "SKIDKA3_SNOM", nullable = true, precision = 2)
    public BigDecimal getSkidka3Snom() {
        return skidka3Snom;
    }

    public void setSkidka3Snom(BigDecimal skidka3Snom) {
        this.skidka3Snom = skidka3Snom;
    }

    @Basic
    @Column(name = "IDVID_SNOM", nullable = true)
    public Long getIdvidSnom() {
        return idvidSnom;
    }

    public void setIdvidSnom(Long idvidSnom) {
        this.idvidSnom = idvidSnom;
    }

    @Basic
    @Column(name = "TYPESRGODN_SNOM", nullable = true)
    public Short getTypesrgodnSnom() {
        return typesrgodnSnom;
    }

    public void setTypesrgodnSnom(Short typesrgodnSnom) {
        this.typesrgodnSnom = typesrgodnSnom;
    }

    @Basic
    @Column(name = "SRGODN_SNOM", nullable = true)
    public Short getSrgodnSnom() {
        return srgodnSnom;
    }

    public void setSrgodnSnom(Short srgodnSnom) {
        this.srgodnSnom = srgodnSnom;
    }

    @Basic
    @Column(name = "GODEN_DO_SNOM", nullable = true)
    public Timestamp getGodenDoSnom() {
        return godenDoSnom;
    }

    public void setGodenDoSnom(Timestamp godenDoSnom) {
        this.godenDoSnom = godenDoSnom;
    }

    @Basic
    @Column(name = "IDSUPPLIER_SNOM", nullable = true)
    public Long getIdsupplierSnom() {
        return idsupplierSnom;
    }

    public void setIdsupplierSnom(Long idsupplierSnom) {
        this.idsupplierSnom = idsupplierSnom;
    }

    @Basic
    @Column(name = "IDPRODUCER_SNOM", nullable = true)
    public Long getIdproducerSnom() {
        return idproducerSnom;
    }

    public void setIdproducerSnom(Long idproducerSnom) {
        this.idproducerSnom = idproducerSnom;
    }

    @Basic
    @Column(name = "POGR_SNOM", nullable = true, precision = 3)
    public BigDecimal getPogrSnom() {
        return pogrSnom;
    }

    public void setPogrSnom(BigDecimal pogrSnom) {
        this.pogrSnom = pogrSnom;
    }

    @Basic
    @Column(name = "WARRANTY_SNOM", nullable = true)
    public Integer getWarrantySnom() {
        return warrantySnom;
    }

    public void setWarrantySnom(Integer warrantySnom) {
        this.warrantySnom = warrantySnom;
    }

    @Basic
    @Column(name = "FL_CREDIT_SNOM", nullable = true)
    public Short getFlCreditSnom() {
        return flCreditSnom;
    }

    public void setFlCreditSnom(Short flCreditSnom) {
        this.flCreditSnom = flCreditSnom;
    }

    @Basic
    @Column(name = "FL_TRANSPORT_SNOM", nullable = true)
    public Short getFlTransportSnom() {
        return flTransportSnom;
    }

    public void setFlTransportSnom(Short flTransportSnom) {
        this.flTransportSnom = flTransportSnom;
    }

    @Basic
    @Column(name = "IDBRAND_SNOM", nullable = true)
    public Long getIdbrandSnom() {
        return idbrandSnom;
    }

    public void setIdbrandSnom(Long idbrandSnom) {
        this.idbrandSnom = idbrandSnom;
    }

    @Basic
    @Column(name = "FL_ADD_IN_SOBORUD_SNOM", nullable = true)
    public Short getFlAddInSoborudSnom() {
        return flAddInSoborudSnom;
    }

    public void setFlAddInSoborudSnom(Short flAddInSoborudSnom) {
        this.flAddInSoborudSnom = flAddInSoborudSnom;
    }

    @Basic
    @Column(name = "FL_DVREG_SNOM", nullable = true)
    public Short getFlDvregSnom() {
        return flDvregSnom;
    }

    public void setFlDvregSnom(Short flDvregSnom) {
        this.flDvregSnom = flDvregSnom;
    }

    @Basic
    @Column(name = "IDVIDIMAGENABOR_SNOM", nullable = true)
    public Long getIdvidimagenaborSnom() {
        return idvidimagenaborSnom;
    }

    public void setIdvidimagenaborSnom(Long idvidimagenaborSnom) {
        this.idvidimagenaborSnom = idvidimagenaborSnom;
    }

    @Basic
    @Column(name = "IDPROPNABOR_SNOM", nullable = true)
    public Long getIdpropnaborSnom() {
        return idpropnaborSnom;
    }

    public void setIdpropnaborSnom(Long idpropnaborSnom) {
        this.idpropnaborSnom = idpropnaborSnom;
    }

    @Basic
    @Column(name = "TYPE_TBL_SNOM", nullable = true)
    public Short getTypeTblSnom() {
        return typeTblSnom;
    }

    public void setTypeTblSnom(Short typeTblSnom) {
        this.typeTblSnom = typeTblSnom;
    }

    @Basic
    @Column(name = "IDDEPARTMENT_SNOM", nullable = true)
    public Long getIddepartmentSnom() {
        return iddepartmentSnom;
    }

    public void setIddepartmentSnom(Long iddepartmentSnom) {
        this.iddepartmentSnom = iddepartmentSnom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnomEntity that = (SnomEntity) o;

        if (idnom != that.idnom) return false;
        if (codenom != that.codenom) return false;
        if (tnom != null ? !tnom.equals(that.tnom) : that.tnom != null) return false;
        if (namenom != null ? !namenom.equals(that.namenom) : that.namenom != null) return false;
        if (fnamenom != null ? !fnamenom.equals(that.fnamenom) : that.fnamenom != null) return false;
        if (krnamenom != null ? !krnamenom.equals(that.krnamenom) : that.krnamenom != null) return false;
        if (idbasednom != null ? !idbasednom.equals(that.idbasednom) : that.idbasednom != null) return false;
        if (idosnednom != null ? !idosnednom.equals(that.idosnednom) : that.idosnednom != null) return false;
        if (idfisedSnom != null ? !idfisedSnom.equals(that.idfisedSnom) : that.idfisedSnom != null) return false;
        if (idgrpnom != null ? !idgrpnom.equals(that.idgrpnom) : that.idgrpnom != null) return false;
        if (artnom != null ? !artnom.equals(that.artnom) : that.artnom != null) return false;
        if (gidSnom != null ? !gidSnom.equals(that.gidSnom) : that.gidSnom != null) return false;
        if (descrSnom != null ? !descrSnom.equals(that.descrSnom) : that.descrSnom != null) return false;
        if (idfirmnom != null ? !idfirmnom.equals(that.idfirmnom) : that.idfirmnom != null) return false;
        if (stndsnom != null ? !stndsnom.equals(that.stndsnom) : that.stndsnom != null) return false;
        if (gtdnom != null ? !gtdnom.equals(that.gtdnom) : that.gtdnom != null) return false;
        if (idcountrynom != null ? !idcountrynom.equals(that.idcountrynom) : that.idcountrynom != null) return false;
        if (flChangeNom != null ? !flChangeNom.equals(that.flChangeNom) : that.flChangeNom != null) return false;
        if (minostnom != null ? !minostnom.equals(that.minostnom) : that.minostnom != null) return false;
        if (idbaseSnom != null ? !idbaseSnom.equals(that.idbaseSnom) : that.idbaseSnom != null) return false;
        if (idextDoutSnom != null ? !idextDoutSnom.equals(that.idextDoutSnom) : that.idextDoutSnom != null)
            return false;
        if (idextBaseSnom != null ? !idextBaseSnom.equals(that.idextBaseSnom) : that.idextBaseSnom != null)
            return false;
        if (skidka1Snom != null ? !skidka1Snom.equals(that.skidka1Snom) : that.skidka1Snom != null) return false;
        if (skidka2Snom != null ? !skidka2Snom.equals(that.skidka2Snom) : that.skidka2Snom != null) return false;
        if (skidka3Snom != null ? !skidka3Snom.equals(that.skidka3Snom) : that.skidka3Snom != null) return false;
        if (idvidSnom != null ? !idvidSnom.equals(that.idvidSnom) : that.idvidSnom != null) return false;
        if (typesrgodnSnom != null ? !typesrgodnSnom.equals(that.typesrgodnSnom) : that.typesrgodnSnom != null)
            return false;
        if (srgodnSnom != null ? !srgodnSnom.equals(that.srgodnSnom) : that.srgodnSnom != null) return false;
        if (godenDoSnom != null ? !godenDoSnom.equals(that.godenDoSnom) : that.godenDoSnom != null) return false;
        if (idsupplierSnom != null ? !idsupplierSnom.equals(that.idsupplierSnom) : that.idsupplierSnom != null)
            return false;
        if (idproducerSnom != null ? !idproducerSnom.equals(that.idproducerSnom) : that.idproducerSnom != null)
            return false;
        if (pogrSnom != null ? !pogrSnom.equals(that.pogrSnom) : that.pogrSnom != null) return false;
        if (warrantySnom != null ? !warrantySnom.equals(that.warrantySnom) : that.warrantySnom != null) return false;
        if (flCreditSnom != null ? !flCreditSnom.equals(that.flCreditSnom) : that.flCreditSnom != null) return false;
        if (flTransportSnom != null ? !flTransportSnom.equals(that.flTransportSnom) : that.flTransportSnom != null)
            return false;
        if (idbrandSnom != null ? !idbrandSnom.equals(that.idbrandSnom) : that.idbrandSnom != null) return false;
        if (flAddInSoborudSnom != null ? !flAddInSoborudSnom.equals(that.flAddInSoborudSnom) : that.flAddInSoborudSnom != null)
            return false;
        if (flDvregSnom != null ? !flDvregSnom.equals(that.flDvregSnom) : that.flDvregSnom != null) return false;
        if (idvidimagenaborSnom != null ? !idvidimagenaborSnom.equals(that.idvidimagenaborSnom) : that.idvidimagenaborSnom != null)
            return false;
        if (idpropnaborSnom != null ? !idpropnaborSnom.equals(that.idpropnaborSnom) : that.idpropnaborSnom != null)
            return false;
        if (typeTblSnom != null ? !typeTblSnom.equals(that.typeTblSnom) : that.typeTblSnom != null) return false;
        if (iddepartmentSnom != null ? !iddepartmentSnom.equals(that.iddepartmentSnom) : that.iddepartmentSnom != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idnom ^ (idnom >>> 32));
        result = 31 * result + (tnom != null ? tnom.hashCode() : 0);
        result = 31 * result + codenom;
        result = 31 * result + (namenom != null ? namenom.hashCode() : 0);
        result = 31 * result + (fnamenom != null ? fnamenom.hashCode() : 0);
        result = 31 * result + (krnamenom != null ? krnamenom.hashCode() : 0);
        result = 31 * result + (idbasednom != null ? idbasednom.hashCode() : 0);
        result = 31 * result + (idosnednom != null ? idosnednom.hashCode() : 0);
        result = 31 * result + (idfisedSnom != null ? idfisedSnom.hashCode() : 0);
        result = 31 * result + (idgrpnom != null ? idgrpnom.hashCode() : 0);
        result = 31 * result + (artnom != null ? artnom.hashCode() : 0);
        result = 31 * result + (gidSnom != null ? gidSnom.hashCode() : 0);
        result = 31 * result + (descrSnom != null ? descrSnom.hashCode() : 0);
        result = 31 * result + (idfirmnom != null ? idfirmnom.hashCode() : 0);
        result = 31 * result + (stndsnom != null ? stndsnom.hashCode() : 0);
        result = 31 * result + (gtdnom != null ? gtdnom.hashCode() : 0);
        result = 31 * result + (idcountrynom != null ? idcountrynom.hashCode() : 0);
        result = 31 * result + (flChangeNom != null ? flChangeNom.hashCode() : 0);
        result = 31 * result + (minostnom != null ? minostnom.hashCode() : 0);
        result = 31 * result + (idbaseSnom != null ? idbaseSnom.hashCode() : 0);
        result = 31 * result + (idextDoutSnom != null ? idextDoutSnom.hashCode() : 0);
        result = 31 * result + (idextBaseSnom != null ? idextBaseSnom.hashCode() : 0);
        result = 31 * result + (skidka1Snom != null ? skidka1Snom.hashCode() : 0);
        result = 31 * result + (skidka2Snom != null ? skidka2Snom.hashCode() : 0);
        result = 31 * result + (skidka3Snom != null ? skidka3Snom.hashCode() : 0);
        result = 31 * result + (idvidSnom != null ? idvidSnom.hashCode() : 0);
        result = 31 * result + (typesrgodnSnom != null ? typesrgodnSnom.hashCode() : 0);
        result = 31 * result + (srgodnSnom != null ? srgodnSnom.hashCode() : 0);
        result = 31 * result + (godenDoSnom != null ? godenDoSnom.hashCode() : 0);
        result = 31 * result + (idsupplierSnom != null ? idsupplierSnom.hashCode() : 0);
        result = 31 * result + (idproducerSnom != null ? idproducerSnom.hashCode() : 0);
        result = 31 * result + (pogrSnom != null ? pogrSnom.hashCode() : 0);
        result = 31 * result + (warrantySnom != null ? warrantySnom.hashCode() : 0);
        result = 31 * result + (flCreditSnom != null ? flCreditSnom.hashCode() : 0);
        result = 31 * result + (flTransportSnom != null ? flTransportSnom.hashCode() : 0);
        result = 31 * result + (idbrandSnom != null ? idbrandSnom.hashCode() : 0);
        result = 31 * result + (flAddInSoborudSnom != null ? flAddInSoborudSnom.hashCode() : 0);
        result = 31 * result + (flDvregSnom != null ? flDvregSnom.hashCode() : 0);
        result = 31 * result + (idvidimagenaborSnom != null ? idvidimagenaborSnom.hashCode() : 0);
        result = 31 * result + (idpropnaborSnom != null ? idpropnaborSnom.hashCode() : 0);
        result = 31 * result + (typeTblSnom != null ? typeTblSnom.hashCode() : 0);
        result = 31 * result + (iddepartmentSnom != null ? iddepartmentSnom.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "snomByIdnomchkt")
//    public Collection<DchktEntity> getDchktsByIdnom() {
//        return dchktsByIdnom;
//    }
//
//    public void setDchktsByIdnom(Collection<DchktEntity> dchktsByIdnom) {
//        this.dchktsByIdnom = dchktsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomInvt")
//    public Collection<DinvtEntity> getDinvtsByIdnom() {
//        return dinvtsByIdnom;
//    }
//
//    public void setDinvtsByIdnom(Collection<DinvtEntity> dinvtsByIdnom) {
//        this.dinvtsByIdnom = dinvtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDismpricet")
//    public Collection<DismpricetEntity> getDismpricetsByIdnom() {
//        return dismpricetsByIdnom;
//    }
//
//    public void setDismpricetsByIdnom(Collection<DismpricetEntity> dismpricetsByIdnom) {
//        this.dismpricetsByIdnom = dismpricetsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomosnt")
//    public Collection<DosntEntity> getDosntsByIdnom() {
//        return dosntsByIdnom;
//    }
//
//    public void setDosntsByIdnom(Collection<DosntEntity> dosntsByIdnom) {
//        this.dosntsByIdnom = dosntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDotchpostt")
//    public Collection<DotchposttEntity> getDotchposttsByIdnom() {
//        return dotchposttsByIdnom;
//    }
//
//    public void setDotchposttsByIdnom(Collection<DotchposttEntity> dotchposttsByIdnom) {
//        this.dotchposttsByIdnom = dotchposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDotprpostt")
//    public Collection<DotprposttEntity> getDotprposttsByIdnom() {
//        return dotprposttsByIdnom;
//    }
//
//    public void setDotprposttsByIdnom(Collection<DotprposttEntity> dotprposttsByIdnom) {
//        this.dotprposttsByIdnom = dotprposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnompert")
//    public Collection<DpertEntity> getDpertsByIdnom() {
//        return dpertsByIdnom;
//    }
//
//    public void setDpertsByIdnom(Collection<DpertEntity> dpertsByIdnom) {
//        this.dpertsByIdnom = dpertsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomprnt")
//    public Collection<DprntEntity> getDprntsByIdnom() {
//        return dprntsByIdnom;
//    }
//
//    public void setDprntsByIdnom(Collection<DprntEntity> dprntsByIdnom) {
//        this.dprntsByIdnom = dprntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrasbkompl")
//    public Collection<DrasbkomplEntity> getDrasbkomplsByIdnom() {
//        return drasbkomplsByIdnom;
//    }
//
//    public void setDrasbkomplsByIdnom(Collection<DrasbkomplEntity> drasbkomplsByIdnom) {
//        this.drasbkomplsByIdnom = drasbkomplsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrasbkomplt")
//    public Collection<DrasbkompltEntity> getDrasbkompltsByIdnom() {
//        return drasbkompltsByIdnom;
//    }
//
//    public void setDrasbkompltsByIdnom(Collection<DrasbkompltEntity> drasbkompltsByIdnom) {
//        this.drasbkompltsByIdnom = drasbkompltsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRealrestt")
//    public Collection<DrealresttEntity> getDrealresttsByIdnom() {
//        return drealresttsByIdnom;
//    }
//
//    public void setDrealresttsByIdnom(Collection<DrealresttEntity> drealresttsByIdnom) {
//        this.drealresttsByIdnom = drealresttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrealroznt")
//    public Collection<DrealrozntEntity> getDrealrozntsByIdnom() {
//        return drealrozntsByIdnom;
//    }
//
//    public void setDrealrozntsByIdnom(Collection<DrealrozntEntity> drealrozntsByIdnom) {
//        this.drealrozntsByIdnom = drealrozntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomreat")
//    public Collection<DreatEntity> getDreatsByIdnom() {
//        return dreatsByIdnom;
//    }
//
//    public void setDreatsByIdnom(Collection<DreatEntity> dreatsByIdnom) {
//        this.dreatsByIdnom = dreatsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrepkkmt")
//    public Collection<DrepkkmtEntity> getDrepkkmtsByIdnom() {
//        return drepkkmtsByIdnom;
//    }
//
//    public void setDrepkkmtsByIdnom(Collection<DrepkkmtEntity> drepkkmtsByIdnom) {
//        this.drepkkmtsByIdnom = drepkkmtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrevt")
//    public Collection<DrevtEntity> getDrevtsByIdnom() {
//        return drevtsByIdnom;
//    }
//
//    public void setDrevtsByIdnom(Collection<DrevtEntity> drevtsByIdnom) {
//        this.drevtsByIdnom = drevtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrgGoodst")
//    public Collection<DrgGoodstEntity> getDrgGoodstsByIdnom() {
//        return drgGoodstsByIdnom;
//    }
//
//    public void setDrgGoodstsByIdnom(Collection<DrgGoodstEntity> drgGoodstsByIdnom) {
//        this.drgGoodstsByIdnom = drgGoodstsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrgOstnomt")
//    public Collection<DrgOstnomtEntity> getDrgOstnomtsByIdnom() {
//        return drgOstnomtsByIdnom;
//    }
//
//    public void setDrgOstnomtsByIdnom(Collection<DrgOstnomtEntity> drgOstnomtsByIdnom) {
//        this.drgOstnomtsByIdnom = drgOstnomtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDrgOtchpostt")
//    public Collection<DrgOtchposttEntity> getDrgOtchposttsByIdnom() {
//        return drgOtchposttsByIdnom;
//    }
//
//    public void setDrgOtchposttsByIdnom(Collection<DrgOtchposttEntity> drgOtchposttsByIdnom) {
//        this.drgOtchposttsByIdnom = drgOtchposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDsbkompl")
//    public Collection<DsbkomplEntity> getDsbkomplsByIdnom() {
//        return dsbkomplsByIdnom;
//    }
//
//    public void setDsbkomplsByIdnom(Collection<DsbkomplEntity> dsbkomplsByIdnom) {
//        this.dsbkomplsByIdnom = dsbkomplsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDsbkomplt")
//    public Collection<DsbkompltEntity> getDsbkompltsByIdnom() {
//        return dsbkompltsByIdnom;
//    }
//
//    public void setDsbkompltsByIdnom(Collection<DsbkompltEntity> dsbkompltsByIdnom) {
//        this.dsbkompltsByIdnom = dsbkompltsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDschfactt")
//    public Collection<DschfacttEntity> getDschfacttsByIdnom() {
//        return dschfacttsByIdnom;
//    }
//
//    public void setDschfacttsByIdnom(Collection<DschfacttEntity> dschfacttsByIdnom) {
//        this.dschfacttsByIdnom = dschfacttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomscht")
//    public Collection<DschtEntity> getDschtsByIdnom() {
//        return dschtsByIdnom;
//    }
//
//    public void setDschtsByIdnom(Collection<DschtEntity> dschtsByIdnom) {
//        this.dschtsByIdnom = dschtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomspnt")
//    public Collection<DspntEntity> getDspntsByIdnom() {
//        return dspntsByIdnom;
//    }
//
//    public void setDspntsByIdnom(Collection<DspntEntity> dspntsByIdnom) {
//        this.dspntsByIdnom = dspntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDspotrostt")
//    public Collection<DspotrosttEntity> getDspotrosttsByIdnom() {
//        return dspotrosttsByIdnom;
//    }
//
//    public void setDspotrosttsByIdnom(Collection<DspotrosttEntity> dspotrosttsByIdnom) {
//        this.dspotrosttsByIdnom = dspotrosttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDvipprodt")
//    public Collection<DvipprodtEntity> getDvipprodtsByIdnom() {
//        return dvipprodtsByIdnom;
//    }
//
//    public void setDvipprodtsByIdnom(Collection<DvipprodtEntity> dvipprodtsByIdnom) {
//        this.dvipprodtsByIdnom = dvipprodtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDvpokt")
//    public Collection<DvpoktEntity> getDvpoktsByIdnom() {
//        return dvpoktsByIdnom;
//    }
//
//    public void setDvpoktsByIdnom(Collection<DvpoktEntity> dvpoktsByIdnom) {
//        this.dvpoktsByIdnom = dvpoktsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomvpot")
//    public Collection<DvpotEntity> getDvpotsByIdnom() {
//        return dvpotsByIdnom;
//    }
//
//    public void setDvpotsByIdnom(Collection<DvpotEntity> dvpotsByIdnom) {
//        this.dvpotsByIdnom = dvpotsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDzakpokt")
//    public Collection<DzakpoktEntity> getDzakpoktsByIdnom() {
//        return dzakpoktsByIdnom;
//    }
//
//    public void setDzakpoktsByIdnom(Collection<DzakpoktEntity> dzakpoktsByIdnom) {
//        this.dzakpoktsByIdnom = dzakpoktsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomDzakpostt")
//    public Collection<DzakposttEntity> getDzakposttsByIdnom() {
//        return dzakposttsByIdnom;
//    }
//
//    public void setDzakposttsByIdnom(Collection<DzakposttEntity> dzakposttsByIdnom) {
//        this.dzakposttsByIdnom = dzakposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomBySIdnomDzamenat")
//    public Collection<DzamenatEntity> getDzamenatsByIdnom() {
//        return dzamenatsByIdnom;
//    }
//
//    public void setDzamenatsByIdnom(Collection<DzamenatEntity> dzamenatsByIdnom) {
//        this.dzamenatsByIdnom = dzamenatsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByPIdnomDzamenat")
//    public Collection<DzamenatEntity> getDzamenatsByIdnom_0() {
//        return dzamenatsByIdnom_0;
//    }
//
//    public void setDzamenatsByIdnom_0(Collection<DzamenatEntity> dzamenatsByIdnom_0) {
//        this.dzamenatsByIdnom_0 = dzamenatsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomHotDraschett")
//    public Collection<HotDraschettEntity> getHotDraschettsByIdnom() {
//        return hotDraschettsByIdnom;
//    }
//
//    public void setHotDraschettsByIdnom(Collection<HotDraschettEntity> hotDraschettsByIdnom) {
//        this.hotDraschettsByIdnom = hotDraschettsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomHotDrealt")
//    public Collection<HotDrealtEntity> getHotDrealtsByIdnom() {
//        return hotDrealtsByIdnom;
//    }
//
//    public void setHotDrealtsByIdnom(Collection<HotDrealtEntity> hotDrealtsByIdnom) {
//        this.hotDrealtsByIdnom = hotDrealtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomprHotSprosnusl")
//    public Collection<HotSprosnuslEntity> getHotSprosnuslsByIdnom() {
//        return hotSprosnuslsByIdnom;
//    }
//
//    public void setHotSprosnuslsByIdnom(Collection<HotSprosnuslEntity> hotSprosnuslsByIdnom) {
//        this.hotSprosnuslsByIdnom = hotSprosnuslsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnombrHotSprosnusl")
//    public Collection<HotSprosnuslEntity> getHotSprosnuslsByIdnom_0() {
//        return hotSprosnuslsByIdnom_0;
//    }
//
//    public void setHotSprosnuslsByIdnom_0(Collection<HotSprosnuslEntity> hotSprosnuslsByIdnom_0) {
//        this.hotSprosnuslsByIdnom_0 = hotSprosnuslsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemCqueryt")
//    public Collection<RemCquerytEntity> getRemCquerytsByIdnom() {
//        return remCquerytsByIdnom;
//    }
//
//    public void setRemCquerytsByIdnom(Collection<RemCquerytEntity> remCquerytsByIdnom) {
//        this.remCquerytsByIdnom = remCquerytsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDosnt")
//    public Collection<RemDosntEntity> getRemDosntsByIdnom() {
//        return remDosntsByIdnom;
//    }
//
//    public void setRemDosntsByIdnom(Collection<RemDosntEntity> remDosntsByIdnom) {
//        this.remDosntsByIdnom = remDosntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDotprpostt")
//    public Collection<RemDotprposttEntity> getRemDotprposttsByIdnom() {
//        return remDotprposttsByIdnom;
//    }
//
//    public void setRemDotprposttsByIdnom(Collection<RemDotprposttEntity> remDotprposttsByIdnom) {
//        this.remDotprposttsByIdnom = remDotprposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDpert")
//    public Collection<RemDpertEntity> getRemDpertsByIdnom() {
//        return remDpertsByIdnom;
//    }
//
//    public void setRemDpertsByIdnom(Collection<RemDpertEntity> remDpertsByIdnom) {
//        this.remDpertsByIdnom = remDpertsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDprnt")
//    public Collection<RemDprntEntity> getRemDprntsByIdnom() {
//        return remDprntsByIdnom;
//    }
//
//    public void setRemDprntsByIdnom(Collection<RemDprntEntity> remDprntsByIdnom) {
//        this.remDprntsByIdnom = remDprntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDrakompl")
//    public Collection<RemDrakomplEntity> getRemDrakomplsByIdnom() {
//        return remDrakomplsByIdnom;
//    }
//
//    public void setRemDrakomplsByIdnom(Collection<RemDrakomplEntity> remDrakomplsByIdnom) {
//        this.remDrakomplsByIdnom = remDrakomplsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDrakomplt")
//    public Collection<RemDrakompltEntity> getRemDrakompltsByIdnom() {
//        return remDrakompltsByIdnom;
//    }
//
//    public void setRemDrakompltsByIdnom(Collection<RemDrakompltEntity> remDrakompltsByIdnom) {
//        this.remDrakompltsByIdnom = remDrakompltsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDrealt")
//    public Collection<RemDrealtEntity> getRemDrealtsByIdnom() {
//        return remDrealtsByIdnom;
//    }
//
//    public void setRemDrealtsByIdnom(Collection<RemDrealtEntity> remDrealtsByIdnom) {
//        this.remDrealtsByIdnom = remDrealtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDremonthwt")
//    public Collection<RemDremonthwtEntity> getRemDremonthwtsByIdnom() {
//        return remDremonthwtsByIdnom;
//    }
//
//    public void setRemDremonthwtsByIdnom(Collection<RemDremonthwtEntity> remDremonthwtsByIdnom) {
//        this.remDremonthwtsByIdnom = remDremonthwtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDremontkktt")
//    public Collection<RemDremontkkttEntity> getRemDremontkkttsByIdnom() {
//        return remDremontkkttsByIdnom;
//    }
//
//    public void setRemDremontkkttsByIdnom(Collection<RemDremontkkttEntity> remDremontkkttsByIdnom) {
//        this.remDremontkkttsByIdnom = remDremontkkttsByIdnom;
//    }

    @OneToMany(mappedBy = "snomByIdnomRemDremontt")
    public Collection<RemDremonttEntity> getRemDremonttsByIdnom() {
        return remDremonttsByIdnom;
    }

    public void setRemDremonttsByIdnom(Collection<RemDremonttEntity> remDremonttsByIdnom) {
        this.remDremonttsByIdnom = remDremonttsByIdnom;
    }

//    @OneToMany(mappedBy = "snomByIdnomRemDrgOtchpostt")
//    public Collection<RemDrgOtchposttEntity> getRemDrgOtchposttsByIdnom() {
//        return remDrgOtchposttsByIdnom;
//    }
//
//    public void setRemDrgOtchposttsByIdnom(Collection<RemDrgOtchposttEntity> remDrgOtchposttsByIdnom) {
//        this.remDrgOtchposttsByIdnom = remDrgOtchposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDsbkompl")
//    public Collection<RemDsbkomplEntity> getRemDsbkomplsByIdnom() {
//        return remDsbkomplsByIdnom;
//    }
//
//    public void setRemDsbkomplsByIdnom(Collection<RemDsbkomplEntity> remDsbkomplsByIdnom) {
//        this.remDsbkomplsByIdnom = remDsbkomplsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDsbkomplt")
//    public Collection<RemDsbkompltEntity> getRemDsbkompltsByIdnom() {
//        return remDsbkompltsByIdnom;
//    }
//
//    public void setRemDsbkompltsByIdnom(Collection<RemDsbkompltEntity> remDsbkompltsByIdnom) {
//        this.remDsbkompltsByIdnom = remDsbkompltsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDspnt")
//    public Collection<RemDspntEntity> getRemDspntsByIdnom() {
//        return remDspntsByIdnom;
//    }
//
//    public void setRemDspntsByIdnom(Collection<RemDspntEntity> remDspntsByIdnom) {
//        this.remDspntsByIdnom = remDspntsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDvpokt")
//    public Collection<RemDvpoktEntity> getRemDvpoktsByIdnom() {
//        return remDvpoktsByIdnom;
//    }
//
//    public void setRemDvpoktsByIdnom(Collection<RemDvpoktEntity> remDvpoktsByIdnom) {
//        this.remDvpoktsByIdnom = remDvpoktsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDvpot")
//    public Collection<RemDvpotEntity> getRemDvpotsByIdnom() {
//        return remDvpotsByIdnom;
//    }
//
//    public void setRemDvpotsByIdnom(Collection<RemDvpotEntity> remDvpotsByIdnom) {
//        this.remDvpotsByIdnom = remDvpotsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDvzpert")
//    public Collection<RemDvzpertEntity> getRemDvzpertsByIdnom() {
//        return remDvzpertsByIdnom;
//    }
//
//    public void setRemDvzpertsByIdnom(Collection<RemDvzpertEntity> remDvzpertsByIdnom) {
//        this.remDvzpertsByIdnom = remDvzpertsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDvzvpot")
//    public Collection<RemDvzvpotEntity> getRemDvzvpotsByIdnom() {
//        return remDvzvpotsByIdnom;
//    }
//
//    public void setRemDvzvpotsByIdnom(Collection<RemDvzvpotEntity> remDvzvpotsByIdnom) {
//        this.remDvzvpotsByIdnom = remDvzvpotsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDzakpostt")
//    public Collection<RemDzakposttEntity> getRemDzakposttsByIdnom() {
//        return remDzakposttsByIdnom;
//    }
//
//    public void setRemDzakposttsByIdnom(Collection<RemDzakposttEntity> remDzakposttsByIdnom) {
//        this.remDzakposttsByIdnom = remDzakposttsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomzRemDzakpostt")
//    public Collection<RemDzakposttEntity> getRemDzakposttsByIdnom_0() {
//        return remDzakposttsByIdnom_0;
//    }
//
//    public void setRemDzakposttsByIdnom_0(Collection<RemDzakposttEntity> remDzakposttsByIdnom_0) {
//        this.remDzakposttsByIdnom_0 = remDzakposttsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDzaktprt")
//    public Collection<RemDzaktprtEntity> getRemDzaktprtsByIdnom() {
//        return remDzaktprtsByIdnom;
//    }
//
//    public void setRemDzaktprtsByIdnom(Collection<RemDzaktprtEntity> remDzaktprtsByIdnom) {
//        this.remDzaktprtsByIdnom = remDzaktprtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDzopert")
//    public Collection<RemDzopertEntity> getRemDzopertsByIdnom() {
//        return remDzopertsByIdnom;
//    }
//
//    public void setRemDzopertsByIdnom(Collection<RemDzopertEntity> remDzopertsByIdnom) {
//        this.remDzopertsByIdnom = remDzopertsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDztrebt")
//    public Collection<RemDztrebtEntity> getRemDztrebtsByIdnom() {
//        return remDztrebtsByIdnom;
//    }
//
//    public void setRemDztrebtsByIdnom(Collection<RemDztrebtEntity> remDztrebtsByIdnom) {
//        this.remDztrebtsByIdnom = remDztrebtsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemDzvzapt")
//    public Collection<RemDzvzaptEntity> getRemDzvzaptsByIdnom() {
//        return remDzvzaptsByIdnom;
//    }
//
//    public void setRemDzvzaptsByIdnom(Collection<RemDzvzaptEntity> remDzvzaptsByIdnom) {
//        this.remDzvzaptsByIdnom = remDzvzaptsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRggoods")
//    public Collection<RemRggoodsEntity> getRemRggoodsByIdnom() {
//        return remRggoodsByIdnom;
//    }
//
//    public void setRemRggoodsByIdnom(Collection<RemRggoodsEntity> remRggoodsByIdnom) {
//        this.remRggoodsByIdnom = remRggoodsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRggoodsDv")
//    public Collection<RemRggoodsDvEntity> getRemRggoodsDvsByIdnom() {
//        return remRggoodsDvsByIdnom;
//    }
//
//    public void setRemRggoodsDvsByIdnom(Collection<RemRggoodsDvEntity> remRggoodsDvsByIdnom) {
//        this.remRggoodsDvsByIdnom = remRggoodsDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgosthw")
//    public Collection<RemRgosthwEntity> getRemRgosthwsByIdnom() {
//        return remRgosthwsByIdnom;
//    }
//
//    public void setRemRgosthwsByIdnom(Collection<RemRgosthwEntity> remRgosthwsByIdnom) {
//        this.remRgosthwsByIdnom = remRgosthwsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgosthwDv")
//    public Collection<RemRgosthwDvEntity> getRemRgosthwDvsByIdnom() {
//        return remRgosthwDvsByIdnom;
//    }
//
//    public void setRemRgosthwDvsByIdnom(Collection<RemRgosthwDvEntity> remRgosthwDvsByIdnom) {
//        this.remRgosthwDvsByIdnom = remRgosthwDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgotchpost")
//    public Collection<RemRgotchpostEntity> getRemRgotchpostsByIdnom() {
//        return remRgotchpostsByIdnom;
//    }
//
//    public void setRemRgotchpostsByIdnom(Collection<RemRgotchpostEntity> remRgotchpostsByIdnom) {
//        this.remRgotchpostsByIdnom = remRgotchpostsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgotchpostDv")
//    public Collection<RemRgotchpostDvEntity> getRemRgotchpostDvsByIdnom() {
//        return remRgotchpostDvsByIdnom;
//    }
//
//    public void setRemRgotchpostDvsByIdnom(Collection<RemRgotchpostDvEntity> remRgotchpostDvsByIdnom) {
//        this.remRgotchpostDvsByIdnom = remRgotchpostDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgsosthw")
//    public Collection<RemRgsosthwEntity> getRemRgsosthwsByIdnom() {
//        return remRgsosthwsByIdnom;
//    }
//
//    public void setRemRgsosthwsByIdnom(Collection<RemRgsosthwEntity> remRgsosthwsByIdnom) {
//        this.remRgsosthwsByIdnom = remRgsosthwsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomkomplRemRgsosthw")
//    public Collection<RemRgsosthwEntity> getRemRgsosthwsByIdnom_0() {
//        return remRgsosthwsByIdnom_0;
//    }
//
//    public void setRemRgsosthwsByIdnom_0(Collection<RemRgsosthwEntity> remRgsosthwsByIdnom_0) {
//        this.remRgsosthwsByIdnom_0 = remRgsosthwsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgsosthwDv")
//    public Collection<RemRgsosthwDvEntity> getRemRgsosthwDvsByIdnom() {
//        return remRgsosthwDvsByIdnom;
//    }
//
//    public void setRemRgsosthwDvsByIdnom(Collection<RemRgsosthwDvEntity> remRgsosthwDvsByIdnom) {
//        this.remRgsosthwDvsByIdnom = remRgsosthwDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomkomplRemRgsosthwDv")
//    public Collection<RemRgsosthwDvEntity> getRemRgsosthwDvsByIdnom_0() {
//        return remRgsosthwDvsByIdnom_0;
//    }
//
//    public void setRemRgsosthwDvsByIdnom_0(Collection<RemRgsosthwDvEntity> remRgsosthwDvsByIdnom_0) {
//        this.remRgsosthwDvsByIdnom_0 = remRgsosthwDvsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgvzost")
//    public Collection<RemRgvzostEntity> getRemRgvzostsByIdnom() {
//        return remRgvzostsByIdnom;
//    }
//
//    public void setRemRgvzostsByIdnom(Collection<RemRgvzostEntity> remRgvzostsByIdnom) {
//        this.remRgvzostsByIdnom = remRgvzostsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgvzostDv")
//    public Collection<RemRgvzostDvEntity> getRemRgvzostDvsByIdnom() {
//        return remRgvzostDvsByIdnom;
//    }
//
//    public void setRemRgvzostDvsByIdnom(Collection<RemRgvzostDvEntity> remRgvzostDvsByIdnom) {
//        this.remRgvzostDvsByIdnom = remRgvzostDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgvzvputi")
//    public Collection<RemRgvzvputiEntity> getRemRgvzvputisByIdnom() {
//        return remRgvzvputisByIdnom;
//    }
//
//    public void setRemRgvzvputisByIdnom(Collection<RemRgvzvputiEntity> remRgvzvputisByIdnom) {
//        this.remRgvzvputisByIdnom = remRgvzvputisByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemRgvzvputiDv")
//    public Collection<RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdnom() {
//        return remRgvzvputiDvsByIdnom;
//    }
//
//    public void setRemRgvzvputiDvsByIdnom(Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdnom) {
//        this.remRgvzvputiDvsByIdnom = remRgvzvputiDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemSkomplmodel")
//    public Collection<RemSkomplmodelEntity> getRemSkomplmodelsByIdnom() {
//        return remSkomplmodelsByIdnom;
//    }
//
//    public void setRemSkomplmodelsByIdnom(Collection<RemSkomplmodelEntity> remSkomplmodelsByIdnom) {
//        this.remSkomplmodelsByIdnom = remSkomplmodelsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemSmodel")
//    public Collection<RemSmodelEntity> getRemSmodelsByIdnom() {
//        return remSmodelsByIdnom;
//    }
//
//    public void setRemSmodelsByIdnom(Collection<RemSmodelEntity> remSmodelsByIdnom) {
//        this.remSmodelsByIdnom = remSmodelsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemSmodelDetal")
//    public Collection<RemSmodelDetalEntity> getRemSmodelDetalsByIdnom() {
//        return remSmodelDetalsByIdnom;
//    }
//
//    public void setRemSmodelDetalsByIdnom(Collection<RemSmodelDetalEntity> remSmodelDetalsByIdnom) {
//        this.remSmodelDetalsByIdnom = remSmodelDetalsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemSprrabota")
//    public Collection<RemSprrabotaEntity> getRemSprrabotasByIdnom() {
//        return remSprrabotasByIdnom;
//    }
//
//    public void setRemSprrabotasByIdnom(Collection<RemSprrabotaEntity> remSprrabotasByIdnom) {
//        this.remSprrabotasByIdnom = remSprrabotasByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemStyprabot")
//    public Collection<RemStyprabotEntity> getRemStyprabotsByIdnom() {
//        return remStyprabotsByIdnom;
//    }
//
//    public void setRemStyprabotsByIdnom(Collection<RemStyprabotEntity> remStyprabotsByIdnom) {
//        this.remStyprabotsByIdnom = remStyprabotsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemZdopusl")
//    public Collection<RemZdopuslEntity> getRemZdopuslsByIdnom() {
//        return remZdopuslsByIdnom;
//    }
//
//    public void setRemZdopuslsByIdnom(Collection<RemZdopuslEntity> remZdopuslsByIdnom) {
//        this.remZdopuslsByIdnom = remZdopuslsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRemZperfwork")
//    public Collection<RemZperfworkEntity> getRemZperfworksByIdnom() {
//        return remZperfworksByIdnom;
//    }
//
//    public void setRemZperfworksByIdnom(Collection<RemZperfworkEntity> remZperfworksByIdnom) {
//        this.remZperfworksByIdnom = remZperfworksByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRggoods")
//    public Collection<RggoodsEntity> getRggoodsByIdnom() {
//        return rggoodsByIdnom;
//    }
//
//    public void setRggoodsByIdnom(Collection<RggoodsEntity> rggoodsByIdnom) {
//        this.rggoodsByIdnom = rggoodsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRggoodsDv")
//    public Collection<RggoodsDvEntity> getRggoodsDvsByIdnom() {
//        return rggoodsDvsByIdnom;
//    }
//
//    public void setRggoodsDvsByIdnom(Collection<RggoodsDvEntity> rggoodsDvsByIdnom) {
//        this.rggoodsDvsByIdnom = rggoodsDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomostnom")
//    public Collection<RgostnomEntity> getRgostnomsByIdnom() {
//        return rgostnomsByIdnom;
//    }
//
//    public void setRgostnomsByIdnom(Collection<RgostnomEntity> rgostnomsByIdnom) {
//        this.rgostnomsByIdnom = rgostnomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomOstnomdv")
//    public Collection<RgostnomDvEntity> getRgostnomDvsByIdnom() {
//        return rgostnomDvsByIdnom;
//    }
//
//    public void setRgostnomDvsByIdnom(Collection<RgostnomDvEntity> rgostnomDvsByIdnom) {
//        this.rgostnomDvsByIdnom = rgostnomDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgotchpost")
//    public Collection<RgotchpostEntity> getRgotchpostsByIdnom() {
//        return rgotchpostsByIdnom;
//    }
//
//    public void setRgotchpostsByIdnom(Collection<RgotchpostEntity> rgotchpostsByIdnom) {
//        this.rgotchpostsByIdnom = rgotchpostsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgotchpostDv")
//    public Collection<RgotchpostDvEntity> getRgotchpostDvsByIdnom() {
//        return rgotchpostDvsByIdnom;
//    }
//
//    public void setRgotchpostDvsByIdnom(Collection<RgotchpostDvEntity> rgotchpostDvsByIdnom) {
//        this.rgotchpostDvsByIdnom = rgotchpostDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgotprpost")
//    public Collection<RgotprpostEntity> getRgotprpostsByIdnom() {
//        return rgotprpostsByIdnom;
//    }
//
//    public void setRgotprpostsByIdnom(Collection<RgotprpostEntity> rgotprpostsByIdnom) {
//        this.rgotprpostsByIdnom = rgotprpostsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgotprpostDv")
//    public Collection<RgotprpostDvEntity> getRgotprpostDvsByIdnom() {
//        return rgotprpostDvsByIdnom;
//    }
//
//    public void setRgotprpostDvsByIdnom(Collection<RgotprpostDvEntity> rgotprpostDvsByIdnom) {
//        this.rgotprpostDvsByIdnom = rgotprpostDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgotrspisDv")
//    public Collection<RgotrspisDvEntity> getRgotrspisDvsByIdnom() {
//        return rgotrspisDvsByIdnom;
//    }
//
//    public void setRgotrspisDvsByIdnom(Collection<RgotrspisDvEntity> rgotrspisDvsByIdnom) {
//        this.rgotrspisDvsByIdnom = rgotrspisDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgrealDv")
//    public Collection<RgrealDvEntity> getRgrealDvsByIdnom() {
//        return rgrealDvsByIdnom;
//    }
//
//    public void setRgrealDvsByIdnom(Collection<RgrealDvEntity> rgrealDvsByIdnom) {
//        this.rgrealDvsByIdnom = rgrealDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgsebprodDv")
//    public Collection<RgsebprodDvEntity> getRgsebprodDvsByIdnom() {
//        return rgsebprodDvsByIdnom;
//    }
//
//    public void setRgsebprodDvsByIdnom(Collection<RgsebprodDvEntity> rgsebprodDvsByIdnom) {
//        this.rgsebprodDvsByIdnom = rgsebprodDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgtrebnom")
//    public Collection<RgtrebnomEntity> getRgtrebnomsByIdnom() {
//        return rgtrebnomsByIdnom;
//    }
//
//    public void setRgtrebnomsByIdnom(Collection<RgtrebnomEntity> rgtrebnomsByIdnom) {
//        this.rgtrebnomsByIdnom = rgtrebnomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgtrebnomDv")
//    public Collection<RgtrebnomDvEntity> getRgtrebnomDvsByIdnom() {
//        return rgtrebnomDvsByIdnom;
//    }
//
//    public void setRgtrebnomDvsByIdnom(Collection<RgtrebnomDvEntity> rgtrebnomDvsByIdnom) {
//        this.rgtrebnomDvsByIdnom = rgtrebnomDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgtrebznom")
//    public Collection<RgtrebznomEntity> getRgtrebznomsByIdnom() {
//        return rgtrebznomsByIdnom;
//    }
//
//    public void setRgtrebznomsByIdnom(Collection<RgtrebznomEntity> rgtrebznomsByIdnom) {
//        this.rgtrebznomsByIdnom = rgtrebznomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgtrebznomDv")
//    public Collection<RgtrebznomDvEntity> getRgtrebznomDvsByIdnom() {
//        return rgtrebznomDvsByIdnom;
//    }
//
//    public void setRgtrebznomDvsByIdnom(Collection<RgtrebznomDvEntity> rgtrebznomDvsByIdnom) {
//        this.rgtrebznomDvsByIdnom = rgtrebznomDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgvipprodDv")
//    public Collection<RgvipprodDvEntity> getRgvipprodDvsByIdnom() {
//        return rgvipprodDvsByIdnom;
//    }
//
//    public void setRgvipprodDvsByIdnom(Collection<RgvipprodDvEntity> rgvipprodDvsByIdnom) {
//        this.rgvipprodDvsByIdnom = rgvipprodDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgzakpost")
//    public Collection<RgzakpostEntity> getRgzakpostsByIdnom() {
//        return rgzakpostsByIdnom;
//    }
//
//    public void setRgzakpostsByIdnom(Collection<RgzakpostEntity> rgzakpostsByIdnom) {
//        this.rgzakpostsByIdnom = rgzakpostsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomRgzakpostDv")
//    public Collection<RgzakpostDvEntity> getRgzakpostDvsByIdnom() {
//        return rgzakpostDvsByIdnom;
//    }
//
//    public void setRgzakpostDvsByIdnom(Collection<RgzakpostDvEntity> rgzakpostDvsByIdnom) {
//        this.rgzakpostDvsByIdnom = rgzakpostDvsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomZakt")
//    public Collection<RgzaktEntity> getRgzaktsByIdnom() {
//        return rgzaktsByIdnom;
//    }
//
//    public void setRgzaktsByIdnom(Collection<RgzaktEntity> rgzaktsByIdnom) {
//        this.rgzaktsByIdnom = rgzaktsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomBvnom")
//    public Collection<SbvnomEntity> getSbvnomsByIdnom() {
//        return sbvnomsByIdnom;
//    }
//
//    public void setSbvnomsByIdnom(Collection<SbvnomEntity> sbvnomsByIdnom) {
//        this.sbvnomsByIdnom = sbvnomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomCodetel")
//    public Collection<ScodetelEntity> getScodetelsByIdnom() {
//        return scodetelsByIdnom;
//    }
//
//    public void setScodetelsByIdnom(Collection<ScodetelEntity> scodetelsByIdnom) {
//        this.scodetelsByIdnom = scodetelsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomcomCodetel")
//    public Collection<ScodetelEntity> getScodetelsByIdnom_0() {
//        return scodetelsByIdnom_0;
//    }
//
//    public void setScodetelsByIdnom_0(Collection<ScodetelEntity> scodetelsByIdnom_0) {
//        this.scodetelsByIdnom_0 = scodetelsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomed")
//    public Collection<SedEntity> getSedsByIdnom() {
//        return sedsByIdnom;
//    }
//
//    public void setSedsByIdnom(Collection<SedEntity> sedsByIdnom) {
//        this.sedsByIdnom = sedsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSimported")
//    public Collection<SimportedEntity> getSimportedsByIdnom() {
//        return simportedsByIdnom;
//    }
//
//    public void setSimportedsByIdnom(Collection<SimportedEntity> simportedsByIdnom) {
//        this.simportedsByIdnom = simportedsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSimportnom")
//    public Collection<SimportnomEntity> getSimportnomsByIdnom() {
//        return simportnomsByIdnom;
//    }
//
//    public void setSimportnomsByIdnom(Collection<SimportnomEntity> simportnomsByIdnom) {
//        this.simportnomsByIdnom = simportnomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomMod")
//    public Collection<SmodEntity> getSmodsByIdnom() {
//        return smodsByIdnom;
//    }
//
//    public void setSmodsByIdnom(Collection<SmodEntity> smodsByIdnom) {
//        this.smodsByIdnom = smodsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnachisl")
//    public Collection<SnachislEntity> getSnachislsByIdnom() {
//        return snachislsByIdnom;
//    }
//
//    public void setSnachislsByIdnom(Collection<SnachislEntity> snachislsByIdnom) {
//        this.snachislsByIdnom = snachislsByIdnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBASEDNOM", referencedColumnName = "IDED")
//    public SedEntity getSedByIdbasednom() {
//        return sedByIdbasednom;
//    }
//
//    public void setSedByIdbasednom(SedEntity sedByIdbasednom) {
//        this.sedByIdbasednom = sedByIdbasednom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDOSNEDNOM", referencedColumnName = "IDED")
//    public SedEntity getSedByIdosnednom() {
//        return sedByIdosnednom;
//    }
//
//    public void setSedByIdosnednom(SedEntity sedByIdosnednom) {
//        this.sedByIdosnednom = sedByIdosnednom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDFISED_SNOM", referencedColumnName = "IDED")
//    public SedEntity getSedByIdfisedSnom() {
//        return sedByIdfisedSnom;
//    }
//
//    public void setSedByIdfisedSnom(SedEntity sedByIdfisedSnom) {
//        this.sedByIdfisedSnom = sedByIdfisedSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDGRPNOM", referencedColumnName = "IDGN")
//    public SgrpnomEntity getSgrpnomByIdgrpnom() {
//        return sgrpnomByIdgrpnom;
//    }
//
//    public void setSgrpnomByIdgrpnom(SgrpnomEntity sgrpnomByIdgrpnom) {
//        this.sgrpnomByIdgrpnom = sgrpnomByIdgrpnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDFIRMNOM", referencedColumnName = "IDFIRM")
//    public SfirmEntity getSfirmByIdfirmnom() {
//        return sfirmByIdfirmnom;
//    }
//
//    public void setSfirmByIdfirmnom(SfirmEntity sfirmByIdfirmnom) {
//        this.sfirmByIdfirmnom = sfirmByIdfirmnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDCOUNTRYNOM", referencedColumnName = "ID_SCOUNTRY")
//    public ScountryEntity getScountryByIdcountrynom() {
//        return scountryByIdcountrynom;
//    }
//
//    public void setScountryByIdcountrynom(ScountryEntity scountryByIdcountrynom) {
//        this.scountryByIdcountrynom = scountryByIdcountrynom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDVID_SNOM", referencedColumnName = "ID_SVIDNOM")
//    public SvidnomEntity getSvidnomByIdvidSnom() {
//        return svidnomByIdvidSnom;
//    }
//
//    public void setSvidnomByIdvidSnom(SvidnomEntity svidnomByIdvidSnom) {
//        this.svidnomByIdvidSnom = svidnomByIdvidSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDSUPPLIER_SNOM", referencedColumnName = "IDKLIENT")
//    public SklientEntity getSklientByIdsupplierSnom() {
//        return sklientByIdsupplierSnom;
//    }
//
//    public void setSklientByIdsupplierSnom(SklientEntity sklientByIdsupplierSnom) {
//        this.sklientByIdsupplierSnom = sklientByIdsupplierSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDPRODUCER_SNOM", referencedColumnName = "IDKLIENT")
//    public SklientEntity getSklientByIdproducerSnom() {
//        return sklientByIdproducerSnom;
//    }
//
//    public void setSklientByIdproducerSnom(SklientEntity sklientByIdproducerSnom) {
//        this.sklientByIdproducerSnom = sklientByIdproducerSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBRAND_SNOM", referencedColumnName = "ID_SBRAND")
//    public SbrandEntity getSbrandByIdbrandSnom() {
//        return sbrandByIdbrandSnom;
//    }
//
//    public void setSbrandByIdbrandSnom(SbrandEntity sbrandByIdbrandSnom) {
//        this.sbrandByIdbrandSnom = sbrandByIdbrandSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDVIDIMAGENABOR_SNOM", referencedColumnName = "ID_SVIDIMAGE_NABOR")
//    public SvidimageNaborEntity getSvidimageNaborByIdvidimagenaborSnom() {
//        return svidimageNaborByIdvidimagenaborSnom;
//    }
//
//    public void setSvidimageNaborByIdvidimagenaborSnom(SvidimageNaborEntity svidimageNaborByIdvidimagenaborSnom) {
//        this.svidimageNaborByIdvidimagenaborSnom = svidimageNaborByIdvidimagenaborSnom;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDPROPNABOR_SNOM", referencedColumnName = "ID_SPROPNABOR")
//    public SpropnaborEntity getSpropnaborByIdpropnaborSnom() {
//        return spropnaborByIdpropnaborSnom;
//    }
//
//    public void setSpropnaborByIdpropnaborSnom(SpropnaborEntity spropnaborByIdpropnaborSnom) {
//        this.spropnaborByIdpropnaborSnom = spropnaborByIdpropnaborSnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnomimage")
//    public Collection<SnomimageEntity> getSnomimagesByIdnom() {
//        return snomimagesByIdnom;
//    }
//
//    public void setSnomimagesByIdnom(Collection<SnomimageEntity> snomimagesByIdnom) {
//        this.snomimagesByIdnom = snomimagesByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnominetcat")
//    public Collection<SnominetcatEntity> getSnominetcatsByIdnom() {
//        return snominetcatsByIdnom;
//    }
//
//    public void setSnominetcatsByIdnom(Collection<SnominetcatEntity> snominetcatsByIdnom) {
//        this.snominetcatsByIdnom = snominetcatsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnompropvalue")
//    public Collection<SnompropvalueEntity> getSnompropvaluesByIdnom() {
//        return snompropvaluesByIdnom;
//    }
//
//    public void setSnompropvaluesByIdnom(Collection<SnompropvalueEntity> snompropvaluesByIdnom) {
//        this.snompropvaluesByIdnom = snompropvaluesByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomNomrest")
//    public Collection<SnomrestEntity> getSnomrestsByIdnom() {
//        return snomrestsByIdnom;
//    }
//
//    public void setSnomrestsByIdnom(Collection<SnomrestEntity> snomrestsByIdnom) {
//        this.snomrestsByIdnom = snomrestsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnomAnalog")
//    public Collection<SnomAnalogEntity> getSnomAnalogsByIdnom() {
//        return snomAnalogsByIdnom;
//    }
//
//    public void setSnomAnalogsByIdnom(Collection<SnomAnalogEntity> snomAnalogsByIdnom) {
//        this.snomAnalogsByIdnom = snomAnalogsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomanalogSnomAnalog")
//    public Collection<SnomAnalogEntity> getSnomAnalogsByIdnom_0() {
//        return snomAnalogsByIdnom_0;
//    }
//
//    public void setSnomAnalogsByIdnom_0(Collection<SnomAnalogEntity> snomAnalogsByIdnom_0) {
//        this.snomAnalogsByIdnom_0 = snomAnalogsByIdnom_0;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSnomDop")
//    public Collection<SnomDopEntity> getSnomDopsByIdnom() {
//        return snomDopsByIdnom;
//    }
//
//    public void setSnomDopsByIdnom(Collection<SnomDopEntity> snomDopsByIdnom) {
//        this.snomDopsByIdnom = snomDopsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnompart")
//    public Collection<SpartEntity> getSpartsByIdnom() {
//        return spartsByIdnom;
//    }
//
//    public void setSpartsByIdnom(Collection<SpartEntity> spartsByIdnom) {
//        this.spartsByIdnom = spartsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomPrice")
//    public Collection<SpriceEntity> getSpricesByIdnom() {
//        return spricesByIdnom;
//    }
//
//    public void setSpricesByIdnom(Collection<SpriceEntity> spricesByIdnom) {
//        this.spricesByIdnom = spricesByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSpriceSchedule")
//    public Collection<SpriceScheduleEntity> getSpriceSchedulesByIdnom() {
//        return spriceSchedulesByIdnom;
//    }
//
//    public void setSpriceSchedulesByIdnom(Collection<SpriceScheduleEntity> spriceSchedulesByIdnom) {
//        this.spriceSchedulesByIdnom = spriceSchedulesByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSprnom")
//    public Collection<SprnomEntity> getSprnomsByIdnom() {
//        return sprnomsByIdnom;
//    }
//
//    public void setSprnomsByIdnom(Collection<SprnomEntity> sprnomsByIdnom) {
//        this.sprnomsByIdnom = sprnomsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSsezkf")
//    public Collection<SsezkfEntity> getSsezkfsByIdnom() {
//        return ssezkfsByIdnom;
//    }
//
//    public void setSsezkfsByIdnom(Collection<SsezkfEntity> ssezkfsByIdnom) {
//        this.ssezkfsByIdnom = ssezkfsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdkomplSprod")
//    public Collection<SsprodEntity> getSsprodsByIdnom() {
//        return ssprodsByIdnom;
//    }
//
//    public void setSsprodsByIdnom(Collection<SsprodEntity> ssprodsByIdnom) {
//        this.ssprodsByIdnom = ssprodsByIdnom;
//    }
//
//    @OneToMany(mappedBy = "snomByIdnomSvesnom")
//    public Collection<SvesnomEntity> getSvesnomsByIdnom() {
//        return svesnomsByIdnom;
//    }
//
//    public void setSvesnomsByIdnom(Collection<SvesnomEntity> svesnomsByIdnom) {
//        this.svesnomsByIdnom = svesnomsByIdnom;
//    }
}
