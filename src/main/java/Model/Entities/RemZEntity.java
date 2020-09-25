package Model.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "REM_Z", schema = "", catalog = "")
public class RemZEntity {
    private long idRemZ;
    private String gidRemZ;
    private String prefiksRemZ;
    private Integer numRemZ;
    private Timestamp posRemZ;
    private Long idbaseRemZ;
    private Long idmodelRemZ;
    private Long idsklprRemZ;
    private Long idklientRemZ;
    private Long iddilerRemZ;
    private String sernumRemZ;
    private String nameRemZ;
    private String descrRemZ;
    private Long idtyperemRemZ;
    private Long idsostRemZ;
    private Long idtecsklRemZ;
    private Long iduserRemZ;
    private Integer operRemZ;
    private BigDecimal sumRemZ;
    private Date srokRemZ;
    private Short outRemZ;
    private Long idfirmRemZ;
    private Long idextDoutRemZ;
    private Long idextBaseRemZ;
    private String neisprRemZ;
    private String klientNameRemZ;
    private String klientAdrRemZ;
    private String klientPhoneRemZ;
    private String komplectRemZ;
    private String modelRemZ;
    private String sostRemZ;
    private String sernum2RemZ;
    private String comentsRemZ;
    private Timestamp posoutRemZ;
    private Timestamp posremontRemZ;
    private Integer warrantyRemZ;
    private Long idmexanikRemZ;
    private Long idbrandRemZ;
    private Long idactcatRemZ;
    private String guidRemZ;
    private Long idzosnRemZ;
    private Short flPovtorRemZ;
    private String dilerNumzRemZ;
    private Timestamp dilerPoszRemZ;
    private String dilerGuidzRemZ;
    private String scNumzRemZ;
    private Timestamp scPoszRemZ;
    private String scGuidzRemZ;
    private Short flAddreportRemZ;
    private String sernumStrRemZ;
    private Long idhwRemZ;
    private Long idkktRemZ;
    private Short typeTblRemZ;
    private Integer flKlientUvedomlRemZ;
    private Integer flTrebKonsKlRemZ;
    private Integer flKlOtvNaZaprosRemZ;
    private String prefiksNumRemZ;
    private String numGardocRemZ;
    private Integer flFictivRemZ;
    private Short flNeOtchRemZ;
    private Short flNadoOtchRemZ;
    private Short flIsmGardocRemZ;
    private String numGardocNewRemZ;
    private Short flIsmSernumRemZ;
    private String sernumNewRemZ;
    private Short flIsmSernum2RemZ;
    private String sernum2NewRemZ;
    private Short gotovoKVidacheRemZ;
//    private Collection<DzakpokEntity> dzakpoksByIdRemZ;
//    private Collection<RemCqueryEntity> remCqueriesByIdRemZ;
//    private Collection<RemDaktEntity> remDaktsByIdRemZ;
//    private Collection<RemDdilposttEntity> remDdilposttsByIdRemZ;
//    private Collection<RemDdilrettEntity> remDdilrettsByIdRemZ;
    private Collection<RemDremontEntity> remDremontsByIdRemZ;
//    private Collection<RemDscpertEntity> remDscpertsByIdRemZ;
//    private Collection<RemDscrettEntity> remDscrettsByIdRemZ;
//    private Collection<RemDvidachaHwEntity> remDvidachaHwsByIdRemZ;
//    private Collection<RemDvosvratHwEntity> remDvosvratHwsByIdRemZ;
//    private Collection<RemDvzpertEntity> remDvzpertsByIdRemZ;
//    private Collection<RemDvzvpotEntity> remDvzvpotsByIdRemZ;
//    private Collection<RemDzaktprEntity> remDzaktprsByIdRemZ;
//    private Collection<RemDzcheckEntity> remDzchecksByIdRemZ;
//    private Collection<RemDzendEntity> remDzendsByIdRemZ;
//    private Collection<RemDzoperEntity> remDzopersByIdRemZ;
//    private Collection<RemDzpertEntity> remDzpertsByIdRemZ;
//    private Collection<RemDzposttEntity> remDzposttsByIdRemZ;
//    private Collection<RemDzstartEntity> remDzstartsByIdRemZ;
//    private Collection<RemDztrebEntity> remDztrebsByIdRemZ;
//    private Collection<RemDzvidtEntity> remDzvidtsByIdRemZ;
//    private Collection<RemDzvzapEntity> remDzvzapsByIdRemZ;
//    private Collection<RemRgostzEntity> remRgostzsByIdRemZ;
//    private Collection<RemRgostzdilEntity> remRgostzdilsByIdRemZ;
//    private Collection<RemRgostzdilDvEntity> remRgostzdilDvsByIdRemZ;
//    private Collection<RemRgostzscEntity> remRgostzscsByIdRemZ;
//    private Collection<RemRgostzscDvEntity> remRgostzscDvsByIdRemZ;
//    private Collection<RemRgostzDvEntity> remRgostzDvsByIdRemZ;
//    private Collection<RemRgotprzEntity> remRgotprzsByIdRemZ;
//    private Collection<RemRgotprzDvEntity> remRgotprzDvsByIdRemZ;
//    private Collection<RemRgvzostEntity> remRgvzostsByIdRemZ;
//    private Collection<RemRgvzostDvEntity> remRgvzostDvsByIdRemZ;
//    private Collection<RemRgvzvputiEntity> remRgvzvputisByIdRemZ;
//    private Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdRemZ;
//    private SinfbaseObmenEntity sinfbaseObmenByIdbaseRemZ;
//    private RemSmodelEntity remSmodelByIdmodelRemZ;
//    private SskladEntity sskladByIdsklprRemZ;
//    private SklientEntity sklientByIdklientRemZ;
//    private SklientEntity sklientByIddilerRemZ;
    private RemStremontEntity remStremontByIdtyperemRemZ;
    private RemSsostEntity remSsostByIdsostRemZ;
    private SskladEntity sskladByIdtecsklRemZ;
//    private SuserEntity suserByIduserRemZ;
//    private SfirmEntity sfirmByIdfirmRemZ;
//    private SuserEntity suserByIdmexanikRemZ;
//    private SbrandEntity sbrandByIdbrandRemZ;
//    private RemSactcategoryEntity remSactcategoryByIdactcatRemZ;
    private RemZEntity remZByIdzosnRemZ;
    private Collection<RemZEntity> remZSByIdRemZ;
//    private RemShardwareEntity remShardwareByIdhwRemZ;
//    private RemSkktEntity remSkktByIdkktRemZ;
//    private Collection<RemZdopuslEntity> remZdopuslsByIdRemZ;
//    private Collection<RemZimageEntity> remZimagesByIdRemZ;
//    private Collection<RemZkomplEntity> remZkomplsByIdRemZ;
//    private Collection<RemZneisprEntity> remZneisprsByIdRemZ;
//    private Collection<RemZperfworkEntity> remZperfworksByIdRemZ;
//    private Collection<RemZprneisprEntity> remZprneisprsByIdRemZ;
//    private Collection<RemZ1Entity> remZ1sByIdRemZ;
//    private Collection<RemZDvEntity> remZDvsByIdRemZ;

    @Id
    @Column(name = "ID_REM_Z", nullable = false)
    public long getIdRemZ() {
        return idRemZ;
    }

    public void setIdRemZ(long idRemZ) {
        this.idRemZ = idRemZ;
    }

    @Basic
    @Column(name = "GID_REM_Z", nullable = true, length = 10)
    public String getGidRemZ() {
        return gidRemZ;
    }

    public void setGidRemZ(String gidRemZ) {
        this.gidRemZ = gidRemZ;
    }

    @Basic
    @Column(name = "PREFIKS_REM_Z", nullable = true, length = 2)
    public String getPrefiksRemZ() {
        return prefiksRemZ;
    }

    public void setPrefiksRemZ(String prefiksRemZ) {
        this.prefiksRemZ = prefiksRemZ;
    }

    @Basic
    @Column(name = "NUM_REM_Z", nullable = true)
    public Integer getNumRemZ() {
        return numRemZ;
    }

    public void setNumRemZ(Integer numRemZ) {
        this.numRemZ = numRemZ;
    }

    @Basic
    @Column(name = "POS_REM_Z", nullable = true)
    public Timestamp getPosRemZ() {
        return posRemZ;
    }

    public void setPosRemZ(Timestamp posRemZ) {
        this.posRemZ = posRemZ;
    }

    @Basic
    @Column(name = "IDBASE_REM_Z", nullable = true)
    public Long getIdbaseRemZ() {
        return idbaseRemZ;
    }

    public void setIdbaseRemZ(Long idbaseRemZ) {
        this.idbaseRemZ = idbaseRemZ;
    }

    @Basic
    @Column(name = "IDMODEL_REM_Z", nullable = true)
    public Long getIdmodelRemZ() {
        return idmodelRemZ;
    }

    public void setIdmodelRemZ(Long idmodelRemZ) {
        this.idmodelRemZ = idmodelRemZ;
    }

    @Basic
    @Column(name = "IDSKLPR_REM_Z", nullable = true)
    public Long getIdsklprRemZ() {
        return idsklprRemZ;
    }

    public void setIdsklprRemZ(Long idsklprRemZ) {
        this.idsklprRemZ = idsklprRemZ;
    }

    @Basic
    @Column(name = "IDKLIENT_REM_Z", nullable = true)
    public Long getIdklientRemZ() {
        return idklientRemZ;
    }

    public void setIdklientRemZ(Long idklientRemZ) {
        this.idklientRemZ = idklientRemZ;
    }

    @Basic
    @Column(name = "IDDILER_REM_Z", nullable = true)
    public Long getIddilerRemZ() {
        return iddilerRemZ;
    }

    public void setIddilerRemZ(Long iddilerRemZ) {
        this.iddilerRemZ = iddilerRemZ;
    }

    @Basic
    @Column(name = "SERNUM_REM_Z", nullable = true, length = 50)
    public String getSernumRemZ() {
        return sernumRemZ;
    }

    public void setSernumRemZ(String sernumRemZ) {
        this.sernumRemZ = sernumRemZ;
    }

    @Basic
    @Column(name = "NAME_REM_Z", nullable = true, length = 200)
    public String getNameRemZ() {
        return nameRemZ;
    }

    public void setNameRemZ(String nameRemZ) {
        this.nameRemZ = nameRemZ;
    }

    @Basic
    @Column(name = "DESCR_REM_Z", nullable = true, length = 150)
    public String getDescrRemZ() {
        return descrRemZ;
    }

    public void setDescrRemZ(String descrRemZ) {
        this.descrRemZ = descrRemZ;
    }

    @Basic
    @Column(name = "IDTYPEREM_REM_Z", nullable = true)
    public Long getIdtyperemRemZ() {
        return idtyperemRemZ;
    }

    public void setIdtyperemRemZ(Long idtyperemRemZ) {
        this.idtyperemRemZ = idtyperemRemZ;
    }

    @Basic
    @Column(name = "IDSOST_REM_Z", nullable = true)
    public Long getIdsostRemZ() {
        return idsostRemZ;
    }

    public void setIdsostRemZ(Long idsostRemZ) {
        this.idsostRemZ = idsostRemZ;
    }

    @Basic
    @Column(name = "IDTECSKL_REM_Z", nullable = true)
    public Long getIdtecsklRemZ() {
        return idtecsklRemZ;
    }

    public void setIdtecsklRemZ(Long idtecsklRemZ) {
        this.idtecsklRemZ = idtecsklRemZ;
    }

    @Basic
    @Column(name = "IDUSER_REM_Z", nullable = true)
    public Long getIduserRemZ() {
        return iduserRemZ;
    }

    public void setIduserRemZ(Long iduserRemZ) {
        this.iduserRemZ = iduserRemZ;
    }

    @Basic
    @Column(name = "OPER_REM_Z", nullable = true)
    public Integer getOperRemZ() {
        return operRemZ;
    }

    public void setOperRemZ(Integer operRemZ) {
        this.operRemZ = operRemZ;
    }

    @Basic
    @Column(name = "SUM_REM_Z", nullable = true, precision = 2)
    public BigDecimal getSumRemZ() {
        return sumRemZ;
    }

    public void setSumRemZ(BigDecimal sumRemZ) {
        this.sumRemZ = sumRemZ;
    }

    @Basic
    @Column(name = "SROK_REM_Z", nullable = true)
    public Date getSrokRemZ() {
        return srokRemZ;
    }

    public void setSrokRemZ(Date srokRemZ) {
        this.srokRemZ = srokRemZ;
    }

    @Basic
    @Column(name = "OUT_REM_Z", nullable = true)
    public Short getOutRemZ() {
        return outRemZ;
    }

    public void setOutRemZ(Short outRemZ) {
        this.outRemZ = outRemZ;
    }

    @Basic
    @Column(name = "IDFIRM_REM_Z", nullable = true)
    public Long getIdfirmRemZ() {
        return idfirmRemZ;
    }

    public void setIdfirmRemZ(Long idfirmRemZ) {
        this.idfirmRemZ = idfirmRemZ;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_Z", nullable = true)
    public Long getIdextDoutRemZ() {
        return idextDoutRemZ;
    }

    public void setIdextDoutRemZ(Long idextDoutRemZ) {
        this.idextDoutRemZ = idextDoutRemZ;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_Z", nullable = true)
    public Long getIdextBaseRemZ() {
        return idextBaseRemZ;
    }

    public void setIdextBaseRemZ(Long idextBaseRemZ) {
        this.idextBaseRemZ = idextBaseRemZ;
    }

    @Basic
    @Column(name = "NEISPR_REM_Z", nullable = true, length = 250)
    public String getNeisprRemZ() {
        return neisprRemZ;
    }

    public void setNeisprRemZ(String neisprRemZ) {
        this.neisprRemZ = neisprRemZ;
    }

    @Basic
    @Column(name = "KLIENT_NAME_REM_Z", nullable = true, length = 200)
    public String getKlientNameRemZ() {
        return klientNameRemZ;
    }

    public void setKlientNameRemZ(String klientNameRemZ) {
        this.klientNameRemZ = klientNameRemZ;
    }

    @Basic
    @Column(name = "KLIENT_ADR_REM_Z", nullable = true, length = 200)
    public String getKlientAdrRemZ() {
        return klientAdrRemZ;
    }

    public void setKlientAdrRemZ(String klientAdrRemZ) {
        this.klientAdrRemZ = klientAdrRemZ;
    }

    @Basic
    @Column(name = "KLIENT_PHONE_REM_Z", nullable = true, length = 40)
    public String getKlientPhoneRemZ() {
        return klientPhoneRemZ;
    }

    public void setKlientPhoneRemZ(String klientPhoneRemZ) {
        this.klientPhoneRemZ = klientPhoneRemZ;
    }

    @Basic
    @Column(name = "KOMPLECT_REM_Z", nullable = true, length = 200)
    public String getKomplectRemZ() {
        return komplectRemZ;
    }

    public void setKomplectRemZ(String komplectRemZ) {
        this.komplectRemZ = komplectRemZ;
    }

    @Basic
    @Column(name = "MODEL_REM_Z", nullable = true, length = 40)
    public String getModelRemZ() {
        return modelRemZ;
    }

    public void setModelRemZ(String modelRemZ) {
        this.modelRemZ = modelRemZ;
    }

    @Basic
    @Column(name = "SOST_REM_Z", nullable = true, length = 200)
    public String getSostRemZ() {
        return sostRemZ;
    }

    public void setSostRemZ(String sostRemZ) {
        this.sostRemZ = sostRemZ;
    }

    @Basic
    @Column(name = "SERNUM2_REM_Z", nullable = true, length = 50)
    public String getSernum2RemZ() {
        return sernum2RemZ;
    }

    public void setSernum2RemZ(String sernum2RemZ) {
        this.sernum2RemZ = sernum2RemZ;
    }

    @Basic
    @Column(name = "COMENTS_REM_Z", nullable = true, length = 250)
    public String getComentsRemZ() {
        return comentsRemZ;
    }

    public void setComentsRemZ(String comentsRemZ) {
        this.comentsRemZ = comentsRemZ;
    }

    @Basic
    @Column(name = "POSOUT_REM_Z", nullable = true)
    public Timestamp getPosoutRemZ() {
        return posoutRemZ;
    }

    public void setPosoutRemZ(Timestamp posoutRemZ) {
        this.posoutRemZ = posoutRemZ;
    }

    @Basic
    @Column(name = "POSREMONT_REM_Z", nullable = true)
    public Timestamp getPosremontRemZ() {
        return posremontRemZ;
    }

    public void setPosremontRemZ(Timestamp posremontRemZ) {
        this.posremontRemZ = posremontRemZ;
    }

    @Basic
    @Column(name = "WARRANTY_REM_Z", nullable = true)
    public Integer getWarrantyRemZ() {
        return warrantyRemZ;
    }

    public void setWarrantyRemZ(Integer warrantyRemZ) {
        this.warrantyRemZ = warrantyRemZ;
    }

    @Basic
    @Column(name = "IDMEXANIK_REM_Z", nullable = true)
    public Long getIdmexanikRemZ() {
        return idmexanikRemZ;
    }

    public void setIdmexanikRemZ(Long idmexanikRemZ) {
        this.idmexanikRemZ = idmexanikRemZ;
    }

    @Basic
    @Column(name = "IDBRAND_REM_Z", nullable = true)
    public Long getIdbrandRemZ() {
        return idbrandRemZ;
    }

    public void setIdbrandRemZ(Long idbrandRemZ) {
        this.idbrandRemZ = idbrandRemZ;
    }

    @Basic
    @Column(name = "IDACTCAT_REM_Z", nullable = true)
    public Long getIdactcatRemZ() {
        return idactcatRemZ;
    }

    public void setIdactcatRemZ(Long idactcatRemZ) {
        this.idactcatRemZ = idactcatRemZ;
    }

    @Basic
    @Column(name = "GUID_REM_Z", nullable = true, length = 38)
    public String getGuidRemZ() {
        return guidRemZ;
    }

    public void setGuidRemZ(String guidRemZ) {
        this.guidRemZ = guidRemZ;
    }

    @Basic
    @Column(name = "IDZOSN_REM_Z", nullable = true)
    public Long getIdzosnRemZ() {
        return idzosnRemZ;
    }

    public void setIdzosnRemZ(Long idzosnRemZ) {
        this.idzosnRemZ = idzosnRemZ;
    }

    @Basic
    @Column(name = "FL_POVTOR_REM_Z", nullable = true)
    public Short getFlPovtorRemZ() {
        return flPovtorRemZ;
    }

    public void setFlPovtorRemZ(Short flPovtorRemZ) {
        this.flPovtorRemZ = flPovtorRemZ;
    }

    @Basic
    @Column(name = "DILER_NUMZ_REM_Z", nullable = true, length = 10)
    public String getDilerNumzRemZ() {
        return dilerNumzRemZ;
    }

    public void setDilerNumzRemZ(String dilerNumzRemZ) {
        this.dilerNumzRemZ = dilerNumzRemZ;
    }

    @Basic
    @Column(name = "DILER_POSZ_REM_Z", nullable = true)
    public Timestamp getDilerPoszRemZ() {
        return dilerPoszRemZ;
    }

    public void setDilerPoszRemZ(Timestamp dilerPoszRemZ) {
        this.dilerPoszRemZ = dilerPoszRemZ;
    }

    @Basic
    @Column(name = "DILER_GUIDZ_REM_Z", nullable = true, length = 38)
    public String getDilerGuidzRemZ() {
        return dilerGuidzRemZ;
    }

    public void setDilerGuidzRemZ(String dilerGuidzRemZ) {
        this.dilerGuidzRemZ = dilerGuidzRemZ;
    }

    @Basic
    @Column(name = "SC_NUMZ_REM_Z", nullable = true, length = 10)
    public String getScNumzRemZ() {
        return scNumzRemZ;
    }

    public void setScNumzRemZ(String scNumzRemZ) {
        this.scNumzRemZ = scNumzRemZ;
    }

    @Basic
    @Column(name = "SC_POSZ_REM_Z", nullable = true)
    public Timestamp getScPoszRemZ() {
        return scPoszRemZ;
    }

    public void setScPoszRemZ(Timestamp scPoszRemZ) {
        this.scPoszRemZ = scPoszRemZ;
    }

    @Basic
    @Column(name = "SC_GUIDZ_REM_Z", nullable = true, length = 38)
    public String getScGuidzRemZ() {
        return scGuidzRemZ;
    }

    public void setScGuidzRemZ(String scGuidzRemZ) {
        this.scGuidzRemZ = scGuidzRemZ;
    }

    @Basic
    @Column(name = "FL_ADDREPORT_REM_Z", nullable = true)
    public Short getFlAddreportRemZ() {
        return flAddreportRemZ;
    }

    public void setFlAddreportRemZ(Short flAddreportRemZ) {
        this.flAddreportRemZ = flAddreportRemZ;
    }

    @Basic
    @Column(name = "SERNUM_STR_REM_Z", nullable = true, length = 200)
    public String getSernumStrRemZ() {
        return sernumStrRemZ;
    }

    public void setSernumStrRemZ(String sernumStrRemZ) {
        this.sernumStrRemZ = sernumStrRemZ;
    }

    @Basic
    @Column(name = "IDHW_REM_Z", nullable = true)
    public Long getIdhwRemZ() {
        return idhwRemZ;
    }

    public void setIdhwRemZ(Long idhwRemZ) {
        this.idhwRemZ = idhwRemZ;
    }

    @Basic
    @Column(name = "IDKKT_REM_Z", nullable = true)
    public Long getIdkktRemZ() {
        return idkktRemZ;
    }

    public void setIdkktRemZ(Long idkktRemZ) {
        this.idkktRemZ = idkktRemZ;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_Z", nullable = true)
    public Short getTypeTblRemZ() {
        return typeTblRemZ;
    }

    public void setTypeTblRemZ(Short typeTblRemZ) {
        this.typeTblRemZ = typeTblRemZ;
    }

    @Basic
    @Column(name = "FL_KLIENT_UVEDOML_REM_Z", nullable = true)
    public Integer getFlKlientUvedomlRemZ() {
        return flKlientUvedomlRemZ;
    }

    public void setFlKlientUvedomlRemZ(Integer flKlientUvedomlRemZ) {
        this.flKlientUvedomlRemZ = flKlientUvedomlRemZ;
    }

    @Basic
    @Column(name = "FL_TREB_KONS_KL_REM_Z", nullable = true)
    public Integer getFlTrebKonsKlRemZ() {
        return flTrebKonsKlRemZ;
    }

    public void setFlTrebKonsKlRemZ(Integer flTrebKonsKlRemZ) {
        this.flTrebKonsKlRemZ = flTrebKonsKlRemZ;
    }

    @Basic
    @Column(name = "FL_KL_OTV_NA_ZAPROS_REM_Z", nullable = true)
    public Integer getFlKlOtvNaZaprosRemZ() {
        return flKlOtvNaZaprosRemZ;
    }

    public void setFlKlOtvNaZaprosRemZ(Integer flKlOtvNaZaprosRemZ) {
        this.flKlOtvNaZaprosRemZ = flKlOtvNaZaprosRemZ;
    }

    @Basic
    @Column(name = "PREFIKS_NUM_REM_Z", nullable = true, length = 12)
    public String getPrefiksNumRemZ() {
        return prefiksNumRemZ;
    }

    public void setPrefiksNumRemZ(String prefiksNumRemZ) {
        this.prefiksNumRemZ = prefiksNumRemZ;
    }

    @Basic
    @Column(name = "NUM_GARDOC_REM_Z", nullable = true, length = 50)
    public String getNumGardocRemZ() {
        return numGardocRemZ;
    }

    public void setNumGardocRemZ(String numGardocRemZ) {
        this.numGardocRemZ = numGardocRemZ;
    }

    @Basic
    @Column(name = "FL_FICTIV_REM_Z", nullable = true)
    public Integer getFlFictivRemZ() {
        return flFictivRemZ;
    }

    public void setFlFictivRemZ(Integer flFictivRemZ) {
        this.flFictivRemZ = flFictivRemZ;
    }

    @Basic
    @Column(name = "FL_NE_OTCH_REM_Z", nullable = true)
    public Short getFlNeOtchRemZ() {
        return flNeOtchRemZ;
    }

    public void setFlNeOtchRemZ(Short flNeOtchRemZ) {
        this.flNeOtchRemZ = flNeOtchRemZ;
    }

    @Basic
    @Column(name = "FL_NADO_OTCH_REM_Z", nullable = true)
    public Short getFlNadoOtchRemZ() {
        return flNadoOtchRemZ;
    }

    public void setFlNadoOtchRemZ(Short flNadoOtchRemZ) {
        this.flNadoOtchRemZ = flNadoOtchRemZ;
    }

    @Basic
    @Column(name = "FL_ISM_GARDOC_REM_Z", nullable = true)
    public Short getFlIsmGardocRemZ() {
        return flIsmGardocRemZ;
    }

    public void setFlIsmGardocRemZ(Short flIsmGardocRemZ) {
        this.flIsmGardocRemZ = flIsmGardocRemZ;
    }

    @Basic
    @Column(name = "NUM_GARDOC_NEW_REM_Z", nullable = true, length = 50)
    public String getNumGardocNewRemZ() {
        return numGardocNewRemZ;
    }

    public void setNumGardocNewRemZ(String numGardocNewRemZ) {
        this.numGardocNewRemZ = numGardocNewRemZ;
    }

    @Basic
    @Column(name = "FL_ISM_SERNUM_REM_Z", nullable = true)
    public Short getFlIsmSernumRemZ() {
        return flIsmSernumRemZ;
    }

    public void setFlIsmSernumRemZ(Short flIsmSernumRemZ) {
        this.flIsmSernumRemZ = flIsmSernumRemZ;
    }

    @Basic
    @Column(name = "SERNUM_NEW_REM_Z", nullable = true, length = 50)
    public String getSernumNewRemZ() {
        return sernumNewRemZ;
    }

    public void setSernumNewRemZ(String sernumNewRemZ) {
        this.sernumNewRemZ = sernumNewRemZ;
    }

    @Basic
    @Column(name = "FL_ISM_SERNUM2_REM_Z", nullable = true)
    public Short getFlIsmSernum2RemZ() {
        return flIsmSernum2RemZ;
    }

    public void setFlIsmSernum2RemZ(Short flIsmSernum2RemZ) {
        this.flIsmSernum2RemZ = flIsmSernum2RemZ;
    }

    @Basic
    @Column(name = "SERNUM2_NEW_REM_Z", nullable = true, length = 50)
    public String getSernum2NewRemZ() {
        return sernum2NewRemZ;
    }

    public void setSernum2NewRemZ(String sernum2NewRemZ) {
        this.sernum2NewRemZ = sernum2NewRemZ;
    }

    @Basic
    @Column(name = "GOTOVO_K_VIDACHE_REM_Z", nullable = true)
    public Short getGotovoKVidacheRemZ() {
        return gotovoKVidacheRemZ;
    }

    public void setGotovoKVidacheRemZ(Short gotovoKVidacheRemZ) {
        this.gotovoKVidacheRemZ = gotovoKVidacheRemZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemZEntity that = (RemZEntity) o;

        if (idRemZ != that.idRemZ) return false;
        if (gidRemZ != null ? !gidRemZ.equals(that.gidRemZ) : that.gidRemZ != null) return false;
        if (prefiksRemZ != null ? !prefiksRemZ.equals(that.prefiksRemZ) : that.prefiksRemZ != null) return false;
        if (numRemZ != null ? !numRemZ.equals(that.numRemZ) : that.numRemZ != null) return false;
        if (posRemZ != null ? !posRemZ.equals(that.posRemZ) : that.posRemZ != null) return false;
        if (idbaseRemZ != null ? !idbaseRemZ.equals(that.idbaseRemZ) : that.idbaseRemZ != null) return false;
        if (idmodelRemZ != null ? !idmodelRemZ.equals(that.idmodelRemZ) : that.idmodelRemZ != null) return false;
        if (idsklprRemZ != null ? !idsklprRemZ.equals(that.idsklprRemZ) : that.idsklprRemZ != null) return false;
        if (idklientRemZ != null ? !idklientRemZ.equals(that.idklientRemZ) : that.idklientRemZ != null) return false;
        if (iddilerRemZ != null ? !iddilerRemZ.equals(that.iddilerRemZ) : that.iddilerRemZ != null) return false;
        if (sernumRemZ != null ? !sernumRemZ.equals(that.sernumRemZ) : that.sernumRemZ != null) return false;
        if (nameRemZ != null ? !nameRemZ.equals(that.nameRemZ) : that.nameRemZ != null) return false;
        if (descrRemZ != null ? !descrRemZ.equals(that.descrRemZ) : that.descrRemZ != null) return false;
        if (idtyperemRemZ != null ? !idtyperemRemZ.equals(that.idtyperemRemZ) : that.idtyperemRemZ != null)
            return false;
        if (idsostRemZ != null ? !idsostRemZ.equals(that.idsostRemZ) : that.idsostRemZ != null) return false;
        if (idtecsklRemZ != null ? !idtecsklRemZ.equals(that.idtecsklRemZ) : that.idtecsklRemZ != null) return false;
        if (iduserRemZ != null ? !iduserRemZ.equals(that.iduserRemZ) : that.iduserRemZ != null) return false;
        if (operRemZ != null ? !operRemZ.equals(that.operRemZ) : that.operRemZ != null) return false;
        if (sumRemZ != null ? !sumRemZ.equals(that.sumRemZ) : that.sumRemZ != null) return false;
        if (srokRemZ != null ? !srokRemZ.equals(that.srokRemZ) : that.srokRemZ != null) return false;
        if (outRemZ != null ? !outRemZ.equals(that.outRemZ) : that.outRemZ != null) return false;
        if (idfirmRemZ != null ? !idfirmRemZ.equals(that.idfirmRemZ) : that.idfirmRemZ != null) return false;
        if (idextDoutRemZ != null ? !idextDoutRemZ.equals(that.idextDoutRemZ) : that.idextDoutRemZ != null)
            return false;
        if (idextBaseRemZ != null ? !idextBaseRemZ.equals(that.idextBaseRemZ) : that.idextBaseRemZ != null)
            return false;
        if (neisprRemZ != null ? !neisprRemZ.equals(that.neisprRemZ) : that.neisprRemZ != null) return false;
        if (klientNameRemZ != null ? !klientNameRemZ.equals(that.klientNameRemZ) : that.klientNameRemZ != null)
            return false;
        if (klientAdrRemZ != null ? !klientAdrRemZ.equals(that.klientAdrRemZ) : that.klientAdrRemZ != null)
            return false;
        if (klientPhoneRemZ != null ? !klientPhoneRemZ.equals(that.klientPhoneRemZ) : that.klientPhoneRemZ != null)
            return false;
        if (komplectRemZ != null ? !komplectRemZ.equals(that.komplectRemZ) : that.komplectRemZ != null) return false;
        if (modelRemZ != null ? !modelRemZ.equals(that.modelRemZ) : that.modelRemZ != null) return false;
        if (sostRemZ != null ? !sostRemZ.equals(that.sostRemZ) : that.sostRemZ != null) return false;
        if (sernum2RemZ != null ? !sernum2RemZ.equals(that.sernum2RemZ) : that.sernum2RemZ != null) return false;
        if (comentsRemZ != null ? !comentsRemZ.equals(that.comentsRemZ) : that.comentsRemZ != null) return false;
        if (posoutRemZ != null ? !posoutRemZ.equals(that.posoutRemZ) : that.posoutRemZ != null) return false;
        if (posremontRemZ != null ? !posremontRemZ.equals(that.posremontRemZ) : that.posremontRemZ != null)
            return false;
        if (warrantyRemZ != null ? !warrantyRemZ.equals(that.warrantyRemZ) : that.warrantyRemZ != null) return false;
        if (idmexanikRemZ != null ? !idmexanikRemZ.equals(that.idmexanikRemZ) : that.idmexanikRemZ != null)
            return false;
        if (idbrandRemZ != null ? !idbrandRemZ.equals(that.idbrandRemZ) : that.idbrandRemZ != null) return false;
        if (idactcatRemZ != null ? !idactcatRemZ.equals(that.idactcatRemZ) : that.idactcatRemZ != null) return false;
        if (guidRemZ != null ? !guidRemZ.equals(that.guidRemZ) : that.guidRemZ != null) return false;
        if (idzosnRemZ != null ? !idzosnRemZ.equals(that.idzosnRemZ) : that.idzosnRemZ != null) return false;
        if (flPovtorRemZ != null ? !flPovtorRemZ.equals(that.flPovtorRemZ) : that.flPovtorRemZ != null) return false;
        if (dilerNumzRemZ != null ? !dilerNumzRemZ.equals(that.dilerNumzRemZ) : that.dilerNumzRemZ != null)
            return false;
        if (dilerPoszRemZ != null ? !dilerPoszRemZ.equals(that.dilerPoszRemZ) : that.dilerPoszRemZ != null)
            return false;
        if (dilerGuidzRemZ != null ? !dilerGuidzRemZ.equals(that.dilerGuidzRemZ) : that.dilerGuidzRemZ != null)
            return false;
        if (scNumzRemZ != null ? !scNumzRemZ.equals(that.scNumzRemZ) : that.scNumzRemZ != null) return false;
        if (scPoszRemZ != null ? !scPoszRemZ.equals(that.scPoszRemZ) : that.scPoszRemZ != null) return false;
        if (scGuidzRemZ != null ? !scGuidzRemZ.equals(that.scGuidzRemZ) : that.scGuidzRemZ != null) return false;
        if (flAddreportRemZ != null ? !flAddreportRemZ.equals(that.flAddreportRemZ) : that.flAddreportRemZ != null)
            return false;
        if (sernumStrRemZ != null ? !sernumStrRemZ.equals(that.sernumStrRemZ) : that.sernumStrRemZ != null)
            return false;
        if (idhwRemZ != null ? !idhwRemZ.equals(that.idhwRemZ) : that.idhwRemZ != null) return false;
        if (idkktRemZ != null ? !idkktRemZ.equals(that.idkktRemZ) : that.idkktRemZ != null) return false;
        if (typeTblRemZ != null ? !typeTblRemZ.equals(that.typeTblRemZ) : that.typeTblRemZ != null) return false;
        if (flKlientUvedomlRemZ != null ? !flKlientUvedomlRemZ.equals(that.flKlientUvedomlRemZ) : that.flKlientUvedomlRemZ != null)
            return false;
        if (flTrebKonsKlRemZ != null ? !flTrebKonsKlRemZ.equals(that.flTrebKonsKlRemZ) : that.flTrebKonsKlRemZ != null)
            return false;
        if (flKlOtvNaZaprosRemZ != null ? !flKlOtvNaZaprosRemZ.equals(that.flKlOtvNaZaprosRemZ) : that.flKlOtvNaZaprosRemZ != null)
            return false;
        if (prefiksNumRemZ != null ? !prefiksNumRemZ.equals(that.prefiksNumRemZ) : that.prefiksNumRemZ != null)
            return false;
        if (numGardocRemZ != null ? !numGardocRemZ.equals(that.numGardocRemZ) : that.numGardocRemZ != null)
            return false;
        if (flFictivRemZ != null ? !flFictivRemZ.equals(that.flFictivRemZ) : that.flFictivRemZ != null) return false;
        if (flNeOtchRemZ != null ? !flNeOtchRemZ.equals(that.flNeOtchRemZ) : that.flNeOtchRemZ != null) return false;
        if (flNadoOtchRemZ != null ? !flNadoOtchRemZ.equals(that.flNadoOtchRemZ) : that.flNadoOtchRemZ != null)
            return false;
        if (flIsmGardocRemZ != null ? !flIsmGardocRemZ.equals(that.flIsmGardocRemZ) : that.flIsmGardocRemZ != null)
            return false;
        if (numGardocNewRemZ != null ? !numGardocNewRemZ.equals(that.numGardocNewRemZ) : that.numGardocNewRemZ != null)
            return false;
        if (flIsmSernumRemZ != null ? !flIsmSernumRemZ.equals(that.flIsmSernumRemZ) : that.flIsmSernumRemZ != null)
            return false;
        if (sernumNewRemZ != null ? !sernumNewRemZ.equals(that.sernumNewRemZ) : that.sernumNewRemZ != null)
            return false;
        if (flIsmSernum2RemZ != null ? !flIsmSernum2RemZ.equals(that.flIsmSernum2RemZ) : that.flIsmSernum2RemZ != null)
            return false;
        if (sernum2NewRemZ != null ? !sernum2NewRemZ.equals(that.sernum2NewRemZ) : that.sernum2NewRemZ != null)
            return false;
        if (gotovoKVidacheRemZ != null ? !gotovoKVidacheRemZ.equals(that.gotovoKVidacheRemZ) : that.gotovoKVidacheRemZ != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRemZ ^ (idRemZ >>> 32));
        result = 31 * result + (gidRemZ != null ? gidRemZ.hashCode() : 0);
        result = 31 * result + (prefiksRemZ != null ? prefiksRemZ.hashCode() : 0);
        result = 31 * result + (numRemZ != null ? numRemZ.hashCode() : 0);
        result = 31 * result + (posRemZ != null ? posRemZ.hashCode() : 0);
        result = 31 * result + (idbaseRemZ != null ? idbaseRemZ.hashCode() : 0);
        result = 31 * result + (idmodelRemZ != null ? idmodelRemZ.hashCode() : 0);
        result = 31 * result + (idsklprRemZ != null ? idsklprRemZ.hashCode() : 0);
        result = 31 * result + (idklientRemZ != null ? idklientRemZ.hashCode() : 0);
        result = 31 * result + (iddilerRemZ != null ? iddilerRemZ.hashCode() : 0);
        result = 31 * result + (sernumRemZ != null ? sernumRemZ.hashCode() : 0);
        result = 31 * result + (nameRemZ != null ? nameRemZ.hashCode() : 0);
        result = 31 * result + (descrRemZ != null ? descrRemZ.hashCode() : 0);
        result = 31 * result + (idtyperemRemZ != null ? idtyperemRemZ.hashCode() : 0);
        result = 31 * result + (idsostRemZ != null ? idsostRemZ.hashCode() : 0);
        result = 31 * result + (idtecsklRemZ != null ? idtecsklRemZ.hashCode() : 0);
        result = 31 * result + (iduserRemZ != null ? iduserRemZ.hashCode() : 0);
        result = 31 * result + (operRemZ != null ? operRemZ.hashCode() : 0);
        result = 31 * result + (sumRemZ != null ? sumRemZ.hashCode() : 0);
        result = 31 * result + (srokRemZ != null ? srokRemZ.hashCode() : 0);
        result = 31 * result + (outRemZ != null ? outRemZ.hashCode() : 0);
        result = 31 * result + (idfirmRemZ != null ? idfirmRemZ.hashCode() : 0);
        result = 31 * result + (idextDoutRemZ != null ? idextDoutRemZ.hashCode() : 0);
        result = 31 * result + (idextBaseRemZ != null ? idextBaseRemZ.hashCode() : 0);
        result = 31 * result + (neisprRemZ != null ? neisprRemZ.hashCode() : 0);
        result = 31 * result + (klientNameRemZ != null ? klientNameRemZ.hashCode() : 0);
        result = 31 * result + (klientAdrRemZ != null ? klientAdrRemZ.hashCode() : 0);
        result = 31 * result + (klientPhoneRemZ != null ? klientPhoneRemZ.hashCode() : 0);
        result = 31 * result + (komplectRemZ != null ? komplectRemZ.hashCode() : 0);
        result = 31 * result + (modelRemZ != null ? modelRemZ.hashCode() : 0);
        result = 31 * result + (sostRemZ != null ? sostRemZ.hashCode() : 0);
        result = 31 * result + (sernum2RemZ != null ? sernum2RemZ.hashCode() : 0);
        result = 31 * result + (comentsRemZ != null ? comentsRemZ.hashCode() : 0);
        result = 31 * result + (posoutRemZ != null ? posoutRemZ.hashCode() : 0);
        result = 31 * result + (posremontRemZ != null ? posremontRemZ.hashCode() : 0);
        result = 31 * result + (warrantyRemZ != null ? warrantyRemZ.hashCode() : 0);
        result = 31 * result + (idmexanikRemZ != null ? idmexanikRemZ.hashCode() : 0);
        result = 31 * result + (idbrandRemZ != null ? idbrandRemZ.hashCode() : 0);
        result = 31 * result + (idactcatRemZ != null ? idactcatRemZ.hashCode() : 0);
        result = 31 * result + (guidRemZ != null ? guidRemZ.hashCode() : 0);
        result = 31 * result + (idzosnRemZ != null ? idzosnRemZ.hashCode() : 0);
        result = 31 * result + (flPovtorRemZ != null ? flPovtorRemZ.hashCode() : 0);
        result = 31 * result + (dilerNumzRemZ != null ? dilerNumzRemZ.hashCode() : 0);
        result = 31 * result + (dilerPoszRemZ != null ? dilerPoszRemZ.hashCode() : 0);
        result = 31 * result + (dilerGuidzRemZ != null ? dilerGuidzRemZ.hashCode() : 0);
        result = 31 * result + (scNumzRemZ != null ? scNumzRemZ.hashCode() : 0);
        result = 31 * result + (scPoszRemZ != null ? scPoszRemZ.hashCode() : 0);
        result = 31 * result + (scGuidzRemZ != null ? scGuidzRemZ.hashCode() : 0);
        result = 31 * result + (flAddreportRemZ != null ? flAddreportRemZ.hashCode() : 0);
        result = 31 * result + (sernumStrRemZ != null ? sernumStrRemZ.hashCode() : 0);
        result = 31 * result + (idhwRemZ != null ? idhwRemZ.hashCode() : 0);
        result = 31 * result + (idkktRemZ != null ? idkktRemZ.hashCode() : 0);
        result = 31 * result + (typeTblRemZ != null ? typeTblRemZ.hashCode() : 0);
        result = 31 * result + (flKlientUvedomlRemZ != null ? flKlientUvedomlRemZ.hashCode() : 0);
        result = 31 * result + (flTrebKonsKlRemZ != null ? flTrebKonsKlRemZ.hashCode() : 0);
        result = 31 * result + (flKlOtvNaZaprosRemZ != null ? flKlOtvNaZaprosRemZ.hashCode() : 0);
        result = 31 * result + (prefiksNumRemZ != null ? prefiksNumRemZ.hashCode() : 0);
        result = 31 * result + (numGardocRemZ != null ? numGardocRemZ.hashCode() : 0);
        result = 31 * result + (flFictivRemZ != null ? flFictivRemZ.hashCode() : 0);
        result = 31 * result + (flNeOtchRemZ != null ? flNeOtchRemZ.hashCode() : 0);
        result = 31 * result + (flNadoOtchRemZ != null ? flNadoOtchRemZ.hashCode() : 0);
        result = 31 * result + (flIsmGardocRemZ != null ? flIsmGardocRemZ.hashCode() : 0);
        result = 31 * result + (numGardocNewRemZ != null ? numGardocNewRemZ.hashCode() : 0);
        result = 31 * result + (flIsmSernumRemZ != null ? flIsmSernumRemZ.hashCode() : 0);
        result = 31 * result + (sernumNewRemZ != null ? sernumNewRemZ.hashCode() : 0);
        result = 31 * result + (flIsmSernum2RemZ != null ? flIsmSernum2RemZ.hashCode() : 0);
        result = 31 * result + (sernum2NewRemZ != null ? sernum2NewRemZ.hashCode() : 0);
        result = 31 * result + (gotovoKVidacheRemZ != null ? gotovoKVidacheRemZ.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "remZByIdzDzakpok")
//    public Collection<DzakpokEntity> getDzakpoksByIdRemZ() {
//        return dzakpoksByIdRemZ;
//    }
//
//    public void setDzakpoksByIdRemZ(Collection<DzakpokEntity> dzakpoksByIdRemZ) {
//        this.dzakpoksByIdRemZ = dzakpoksByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemCquery")
//    public Collection<RemCqueryEntity> getRemCqueriesByIdRemZ() {
//        return remCqueriesByIdRemZ;
//    }
//
//    public void setRemCqueriesByIdRemZ(Collection<RemCqueryEntity> remCqueriesByIdRemZ) {
//        this.remCqueriesByIdRemZ = remCqueriesByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDakt")
//    public Collection<RemDaktEntity> getRemDaktsByIdRemZ() {
//        return remDaktsByIdRemZ;
//    }
//
//    public void setRemDaktsByIdRemZ(Collection<RemDaktEntity> remDaktsByIdRemZ) {
//        this.remDaktsByIdRemZ = remDaktsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDdilpostt")
//    public Collection<RemDdilposttEntity> getRemDdilposttsByIdRemZ() {
//        return remDdilposttsByIdRemZ;
//    }
//
//    public void setRemDdilposttsByIdRemZ(Collection<RemDdilposttEntity> remDdilposttsByIdRemZ) {
//        this.remDdilposttsByIdRemZ = remDdilposttsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDdilrett")
//    public Collection<RemDdilrettEntity> getRemDdilrettsByIdRemZ() {
//        return remDdilrettsByIdRemZ;
//    }
//
//    public void setRemDdilrettsByIdRemZ(Collection<RemDdilrettEntity> remDdilrettsByIdRemZ) {
//        this.remDdilrettsByIdRemZ = remDdilrettsByIdRemZ;
//    }

    @OneToMany(mappedBy = "remZByIdzRemDremont")
    public Collection<RemDremontEntity> getRemDremontsByIdRemZ() {
        return remDremontsByIdRemZ;
    }

    public void setRemDremontsByIdRemZ(Collection<RemDremontEntity> remDremontsByIdRemZ) {
        this.remDremontsByIdRemZ = remDremontsByIdRemZ;
    }

//    @OneToMany(mappedBy = "remZByIdzRemDscpert")
//    public Collection<RemDscpertEntity> getRemDscpertsByIdRemZ() {
//        return remDscpertsByIdRemZ;
//    }
//
//    public void setRemDscpertsByIdRemZ(Collection<RemDscpertEntity> remDscpertsByIdRemZ) {
//        this.remDscpertsByIdRemZ = remDscpertsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDscrett")
//    public Collection<RemDscrettEntity> getRemDscrettsByIdRemZ() {
//        return remDscrettsByIdRemZ;
//    }
//
//    public void setRemDscrettsByIdRemZ(Collection<RemDscrettEntity> remDscrettsByIdRemZ) {
//        this.remDscrettsByIdRemZ = remDscrettsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDvidachaHw")
//    public Collection<RemDvidachaHwEntity> getRemDvidachaHwsByIdRemZ() {
//        return remDvidachaHwsByIdRemZ;
//    }
//
//    public void setRemDvidachaHwsByIdRemZ(Collection<RemDvidachaHwEntity> remDvidachaHwsByIdRemZ) {
//        this.remDvidachaHwsByIdRemZ = remDvidachaHwsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDvosvratHw")
//    public Collection<RemDvosvratHwEntity> getRemDvosvratHwsByIdRemZ() {
//        return remDvosvratHwsByIdRemZ;
//    }
//
//    public void setRemDvosvratHwsByIdRemZ(Collection<RemDvosvratHwEntity> remDvosvratHwsByIdRemZ) {
//        this.remDvosvratHwsByIdRemZ = remDvosvratHwsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDvzpert")
//    public Collection<RemDvzpertEntity> getRemDvzpertsByIdRemZ() {
//        return remDvzpertsByIdRemZ;
//    }
//
//    public void setRemDvzpertsByIdRemZ(Collection<RemDvzpertEntity> remDvzpertsByIdRemZ) {
//        this.remDvzpertsByIdRemZ = remDvzpertsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDvzvpot")
//    public Collection<RemDvzvpotEntity> getRemDvzvpotsByIdRemZ() {
//        return remDvzvpotsByIdRemZ;
//    }
//
//    public void setRemDvzvpotsByIdRemZ(Collection<RemDvzvpotEntity> remDvzvpotsByIdRemZ) {
//        this.remDvzvpotsByIdRemZ = remDvzvpotsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzaktpr")
//    public Collection<RemDzaktprEntity> getRemDzaktprsByIdRemZ() {
//        return remDzaktprsByIdRemZ;
//    }
//
//    public void setRemDzaktprsByIdRemZ(Collection<RemDzaktprEntity> remDzaktprsByIdRemZ) {
//        this.remDzaktprsByIdRemZ = remDzaktprsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzcheck")
//    public Collection<RemDzcheckEntity> getRemDzchecksByIdRemZ() {
//        return remDzchecksByIdRemZ;
//    }
//
//    public void setRemDzchecksByIdRemZ(Collection<RemDzcheckEntity> remDzchecksByIdRemZ) {
//        this.remDzchecksByIdRemZ = remDzchecksByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzend")
//    public Collection<RemDzendEntity> getRemDzendsByIdRemZ() {
//        return remDzendsByIdRemZ;
//    }
//
//    public void setRemDzendsByIdRemZ(Collection<RemDzendEntity> remDzendsByIdRemZ) {
//        this.remDzendsByIdRemZ = remDzendsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzoper")
//    public Collection<RemDzoperEntity> getRemDzopersByIdRemZ() {
//        return remDzopersByIdRemZ;
//    }
//
//    public void setRemDzopersByIdRemZ(Collection<RemDzoperEntity> remDzopersByIdRemZ) {
//        this.remDzopersByIdRemZ = remDzopersByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzpert")
//    public Collection<RemDzpertEntity> getRemDzpertsByIdRemZ() {
//        return remDzpertsByIdRemZ;
//    }
//
//    public void setRemDzpertsByIdRemZ(Collection<RemDzpertEntity> remDzpertsByIdRemZ) {
//        this.remDzpertsByIdRemZ = remDzpertsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzpostt")
//    public Collection<RemDzposttEntity> getRemDzposttsByIdRemZ() {
//        return remDzposttsByIdRemZ;
//    }
//
//    public void setRemDzposttsByIdRemZ(Collection<RemDzposttEntity> remDzposttsByIdRemZ) {
//        this.remDzposttsByIdRemZ = remDzposttsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzstart")
//    public Collection<RemDzstartEntity> getRemDzstartsByIdRemZ() {
//        return remDzstartsByIdRemZ;
//    }
//
//    public void setRemDzstartsByIdRemZ(Collection<RemDzstartEntity> remDzstartsByIdRemZ) {
//        this.remDzstartsByIdRemZ = remDzstartsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDztreb")
//    public Collection<RemDztrebEntity> getRemDztrebsByIdRemZ() {
//        return remDztrebsByIdRemZ;
//    }
//
//    public void setRemDztrebsByIdRemZ(Collection<RemDztrebEntity> remDztrebsByIdRemZ) {
//        this.remDztrebsByIdRemZ = remDztrebsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzvidt")
//    public Collection<RemDzvidtEntity> getRemDzvidtsByIdRemZ() {
//        return remDzvidtsByIdRemZ;
//    }
//
//    public void setRemDzvidtsByIdRemZ(Collection<RemDzvidtEntity> remDzvidtsByIdRemZ) {
//        this.remDzvidtsByIdRemZ = remDzvidtsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemDzvzap")
//    public Collection<RemDzvzapEntity> getRemDzvzapsByIdRemZ() {
//        return remDzvzapsByIdRemZ;
//    }
//
//    public void setRemDzvzapsByIdRemZ(Collection<RemDzvzapEntity> remDzvzapsByIdRemZ) {
//        this.remDzvzapsByIdRemZ = remDzvzapsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostz")
//    public Collection<RemRgostzEntity> getRemRgostzsByIdRemZ() {
//        return remRgostzsByIdRemZ;
//    }
//
//    public void setRemRgostzsByIdRemZ(Collection<RemRgostzEntity> remRgostzsByIdRemZ) {
//        this.remRgostzsByIdRemZ = remRgostzsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostzdil")
//    public Collection<RemRgostzdilEntity> getRemRgostzdilsByIdRemZ() {
//        return remRgostzdilsByIdRemZ;
//    }
//
//    public void setRemRgostzdilsByIdRemZ(Collection<RemRgostzdilEntity> remRgostzdilsByIdRemZ) {
//        this.remRgostzdilsByIdRemZ = remRgostzdilsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostzdilDv")
//    public Collection<RemRgostzdilDvEntity> getRemRgostzdilDvsByIdRemZ() {
//        return remRgostzdilDvsByIdRemZ;
//    }
//
//    public void setRemRgostzdilDvsByIdRemZ(Collection<RemRgostzdilDvEntity> remRgostzdilDvsByIdRemZ) {
//        this.remRgostzdilDvsByIdRemZ = remRgostzdilDvsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostzsc")
//    public Collection<RemRgostzscEntity> getRemRgostzscsByIdRemZ() {
//        return remRgostzscsByIdRemZ;
//    }
//
//    public void setRemRgostzscsByIdRemZ(Collection<RemRgostzscEntity> remRgostzscsByIdRemZ) {
//        this.remRgostzscsByIdRemZ = remRgostzscsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostzscDv")
//    public Collection<RemRgostzscDvEntity> getRemRgostzscDvsByIdRemZ() {
//        return remRgostzscDvsByIdRemZ;
//    }
//
//    public void setRemRgostzscDvsByIdRemZ(Collection<RemRgostzscDvEntity> remRgostzscDvsByIdRemZ) {
//        this.remRgostzscDvsByIdRemZ = remRgostzscDvsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgostzDv")
//    public Collection<RemRgostzDvEntity> getRemRgostzDvsByIdRemZ() {
//        return remRgostzDvsByIdRemZ;
//    }
//
//    public void setRemRgostzDvsByIdRemZ(Collection<RemRgostzDvEntity> remRgostzDvsByIdRemZ) {
//        this.remRgostzDvsByIdRemZ = remRgostzDvsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgotprz")
//    public Collection<RemRgotprzEntity> getRemRgotprzsByIdRemZ() {
//        return remRgotprzsByIdRemZ;
//    }
//
//    public void setRemRgotprzsByIdRemZ(Collection<RemRgotprzEntity> remRgotprzsByIdRemZ) {
//        this.remRgotprzsByIdRemZ = remRgotprzsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgotprzDv")
//    public Collection<RemRgotprzDvEntity> getRemRgotprzDvsByIdRemZ() {
//        return remRgotprzDvsByIdRemZ;
//    }
//
//    public void setRemRgotprzDvsByIdRemZ(Collection<RemRgotprzDvEntity> remRgotprzDvsByIdRemZ) {
//        this.remRgotprzDvsByIdRemZ = remRgotprzDvsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgvzost")
//    public Collection<RemRgvzostEntity> getRemRgvzostsByIdRemZ() {
//        return remRgvzostsByIdRemZ;
//    }
//
//    public void setRemRgvzostsByIdRemZ(Collection<RemRgvzostEntity> remRgvzostsByIdRemZ) {
//        this.remRgvzostsByIdRemZ = remRgvzostsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgvzostDv")
//    public Collection<RemRgvzostDvEntity> getRemRgvzostDvsByIdRemZ() {
//        return remRgvzostDvsByIdRemZ;
//    }
//
//    public void setRemRgvzostDvsByIdRemZ(Collection<RemRgvzostDvEntity> remRgvzostDvsByIdRemZ) {
//        this.remRgvzostDvsByIdRemZ = remRgvzostDvsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgvzvputi")
//    public Collection<RemRgvzvputiEntity> getRemRgvzvputisByIdRemZ() {
//        return remRgvzvputisByIdRemZ;
//    }
//
//    public void setRemRgvzvputisByIdRemZ(Collection<RemRgvzvputiEntity> remRgvzvputisByIdRemZ) {
//        this.remRgvzvputisByIdRemZ = remRgvzvputisByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemRgvzvputiDv")
//    public Collection<RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdRemZ() {
//        return remRgvzvputiDvsByIdRemZ;
//    }
//
//    public void setRemRgvzvputiDvsByIdRemZ(Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdRemZ) {
//        this.remRgvzvputiDvsByIdRemZ = remRgvzvputiDvsByIdRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBASE_REM_Z", referencedColumnName = "ID_SINFBASE_OBMEN")
//    public SinfbaseObmenEntity getSinfbaseObmenByIdbaseRemZ() {
//        return sinfbaseObmenByIdbaseRemZ;
//    }
//
//    public void setSinfbaseObmenByIdbaseRemZ(SinfbaseObmenEntity sinfbaseObmenByIdbaseRemZ) {
//        this.sinfbaseObmenByIdbaseRemZ = sinfbaseObmenByIdbaseRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDMODEL_REM_Z", referencedColumnName = "ID_REM_SMODEL")
//    public RemSmodelEntity getRemSmodelByIdmodelRemZ() {
//        return remSmodelByIdmodelRemZ;
//    }
//
//    public void setRemSmodelByIdmodelRemZ(RemSmodelEntity remSmodelByIdmodelRemZ) {
//        this.remSmodelByIdmodelRemZ = remSmodelByIdmodelRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDSKLPR_REM_Z", referencedColumnName = "IDSKLAD")
//    public SskladEntity getSskladByIdsklprRemZ() {
//        return sskladByIdsklprRemZ;
//    }
//
//    public void setSskladByIdsklprRemZ(SskladEntity sskladByIdsklprRemZ) {
//        this.sskladByIdsklprRemZ = sskladByIdsklprRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDKLIENT_REM_Z", referencedColumnName = "IDKLIENT")
//    public SklientEntity getSklientByIdklientRemZ() {
//        return sklientByIdklientRemZ;
//    }
//
//    public void setSklientByIdklientRemZ(SklientEntity sklientByIdklientRemZ) {
//        this.sklientByIdklientRemZ = sklientByIdklientRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDDILER_REM_Z", referencedColumnName = "IDKLIENT")
//    public SklientEntity getSklientByIddilerRemZ() {
//        return sklientByIddilerRemZ;
//    }
//
//    public void setSklientByIddilerRemZ(SklientEntity sklientByIddilerRemZ) {
//        this.sklientByIddilerRemZ = sklientByIddilerRemZ;
//    }
//
    @ManyToOne
    @JoinColumn(name = "IDTYPEREM_REM_Z", referencedColumnName = "ID_STREMONT", insertable = false, updatable = false)
    public RemStremontEntity getRemStremontByIdtyperemRemZ() {
        return remStremontByIdtyperemRemZ;
    }

    public void setRemStremontByIdtyperemRemZ(RemStremontEntity remStremontByIdtyperemRemZ) {
        this.remStremontByIdtyperemRemZ = remStremontByIdtyperemRemZ;
    }

    @ManyToOne
    @JoinColumn(name = "IDSOST_REM_Z", referencedColumnName = "ID_REMSSOST", insertable = false, updatable = false)
    public RemSsostEntity getRemSsostByIdsostRemZ() {
        return remSsostByIdsostRemZ;
    }

    public void setRemSsostByIdsostRemZ(RemSsostEntity remSsostByIdsostRemZ) {
        this.remSsostByIdsostRemZ = remSsostByIdsostRemZ;
    }

    @ManyToOne
    @JoinColumn(name = "IDTECSKL_REM_Z", referencedColumnName = "IDSKLAD", insertable = false, updatable = false)
    public SskladEntity getSskladByIdtecsklRemZ() {
        return sskladByIdtecsklRemZ;
    }

    public void setSskladByIdtecsklRemZ(SskladEntity sskladByIdtecsklRemZ) {
        this.sskladByIdtecsklRemZ = sskladByIdtecsklRemZ;
    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDUSER_REM_Z", referencedColumnName = "ID_USER")
//    public SuserEntity getSuserByIduserRemZ() {
//        return suserByIduserRemZ;
//    }
//
//    public void setSuserByIduserRemZ(SuserEntity suserByIduserRemZ) {
//        this.suserByIduserRemZ = suserByIduserRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDFIRM_REM_Z", referencedColumnName = "IDFIRM")
//    public SfirmEntity getSfirmByIdfirmRemZ() {
//        return sfirmByIdfirmRemZ;
//    }
//
//    public void setSfirmByIdfirmRemZ(SfirmEntity sfirmByIdfirmRemZ) {
//        this.sfirmByIdfirmRemZ = sfirmByIdfirmRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDMEXANIK_REM_Z", referencedColumnName = "ID_USER")
//    public SuserEntity getSuserByIdmexanikRemZ() {
//        return suserByIdmexanikRemZ;
//    }
//
//    public void setSuserByIdmexanikRemZ(SuserEntity suserByIdmexanikRemZ) {
//        this.suserByIdmexanikRemZ = suserByIdmexanikRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBRAND_REM_Z", referencedColumnName = "ID_SBRAND")
//    public SbrandEntity getSbrandByIdbrandRemZ() {
//        return sbrandByIdbrandRemZ;
//    }
//
//    public void setSbrandByIdbrandRemZ(SbrandEntity sbrandByIdbrandRemZ) {
//        this.sbrandByIdbrandRemZ = sbrandByIdbrandRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDACTCAT_REM_Z", referencedColumnName = "ID_REM_SACTCATEGORY")
//    public RemSactcategoryEntity getRemSactcategoryByIdactcatRemZ() {
//        return remSactcategoryByIdactcatRemZ;
//    }
//
//    public void setRemSactcategoryByIdactcatRemZ(RemSactcategoryEntity remSactcategoryByIdactcatRemZ) {
//        this.remSactcategoryByIdactcatRemZ = remSactcategoryByIdactcatRemZ;
//    }

    @ManyToOne
    @JoinColumn(name = "IDZOSN_REM_Z", referencedColumnName = "ID_REM_Z", insertable = false, updatable = false)
    public RemZEntity getRemZByIdzosnRemZ() {
        return remZByIdzosnRemZ;
    }

    public void setRemZByIdzosnRemZ(RemZEntity remZByIdzosnRemZ) {
        this.remZByIdzosnRemZ = remZByIdzosnRemZ;
    }

//    @OneToMany(mappedBy = "remZByIdzosnRemZ")
//    public Collection<RemZEntity> getRemZSByIdRemZ() {
//        return remZSByIdRemZ;
//    }
//
//    public void setRemZSByIdRemZ(Collection<RemZEntity> remZSByIdRemZ) {
//        this.remZSByIdRemZ = remZSByIdRemZ;
//    }

//    @ManyToOne
//    @JoinColumn(name = "IDHW_REM_Z", referencedColumnName = "ID_REM_SHARDWARE")
//    public RemShardwareEntity getRemShardwareByIdhwRemZ() {
//        return remShardwareByIdhwRemZ;
//    }
//
//    public void setRemShardwareByIdhwRemZ(RemShardwareEntity remShardwareByIdhwRemZ) {
//        this.remShardwareByIdhwRemZ = remShardwareByIdhwRemZ;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDKKT_REM_Z", referencedColumnName = "ID_REM_SKKT")
//    public RemSkktEntity getRemSkktByIdkktRemZ() {
//        return remSkktByIdkktRemZ;
//    }
//
//    public void setRemSkktByIdkktRemZ(RemSkktEntity remSkktByIdkktRemZ) {
//        this.remSkktByIdkktRemZ = remSkktByIdkktRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZdopusl")
//    public Collection<RemZdopuslEntity> getRemZdopuslsByIdRemZ() {
//        return remZdopuslsByIdRemZ;
//    }
//
//    public void setRemZdopuslsByIdRemZ(Collection<RemZdopuslEntity> remZdopuslsByIdRemZ) {
//        this.remZdopuslsByIdRemZ = remZdopuslsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZimage")
//    public Collection<RemZimageEntity> getRemZimagesByIdRemZ() {
//        return remZimagesByIdRemZ;
//    }
//
//    public void setRemZimagesByIdRemZ(Collection<RemZimageEntity> remZimagesByIdRemZ) {
//        this.remZimagesByIdRemZ = remZimagesByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZkompl")
//    public Collection<RemZkomplEntity> getRemZkomplsByIdRemZ() {
//        return remZkomplsByIdRemZ;
//    }
//
//    public void setRemZkomplsByIdRemZ(Collection<RemZkomplEntity> remZkomplsByIdRemZ) {
//        this.remZkomplsByIdRemZ = remZkomplsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZneispr")
//    public Collection<RemZneisprEntity> getRemZneisprsByIdRemZ() {
//        return remZneisprsByIdRemZ;
//    }
//
//    public void setRemZneisprsByIdRemZ(Collection<RemZneisprEntity> remZneisprsByIdRemZ) {
//        this.remZneisprsByIdRemZ = remZneisprsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZperfwork")
//    public Collection<RemZperfworkEntity> getRemZperfworksByIdRemZ() {
//        return remZperfworksByIdRemZ;
//    }
//
//    public void setRemZperfworksByIdRemZ(Collection<RemZperfworkEntity> remZperfworksByIdRemZ) {
//        this.remZperfworksByIdRemZ = remZperfworksByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZprneispr")
//    public Collection<RemZprneisprEntity> getRemZprneisprsByIdRemZ() {
//        return remZprneisprsByIdRemZ;
//    }
//
//    public void setRemZprneisprsByIdRemZ(Collection<RemZprneisprEntity> remZprneisprsByIdRemZ) {
//        this.remZprneisprsByIdRemZ = remZprneisprsByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZ1")
//    public Collection<RemZ1Entity> getRemZ1sByIdRemZ() {
//        return remZ1sByIdRemZ;
//    }
//
//    public void setRemZ1sByIdRemZ(Collection<RemZ1Entity> remZ1sByIdRemZ) {
//        this.remZ1sByIdRemZ = remZ1sByIdRemZ;
//    }
//
//    @OneToMany(mappedBy = "remZByIdzRemZDv")
//    public Collection<RemZDvEntity> getRemZDvsByIdRemZ() {
//        return remZDvsByIdRemZ;
//    }
//
//    public void setRemZDvsByIdRemZ(Collection<RemZDvEntity> remZDvsByIdRemZ) {
//        this.remZDvsByIdRemZ = remZDvsByIdRemZ;
//    }
}
