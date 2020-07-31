package Model.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name = "SKLIENT", schema = "", catalog = "")
public class SklientEntity {
    private long idklient;
    private String nameklient;
    private String fname;
    private String adrklient;
    private String telklient;
    private String innklient;
    private String kppklient;
    private Short tklient;
    private Long idtpriceklient;
    private Long idgrpklient;
    private String gidSklient;
    private String okpoklient;
    private Long idvidklient;
    private Long idcountryklient;
    private Long idbaseSklient;
    private Long idextDoutSklient;
    private Long idextBaseSklient;
    private String krnameSklient;
    private String descrSklient;
    private String messageSklient;
    private String emailSklient;
    private String wwwSklient;
    private BigDecimal maxcreditSklient;
    private Short typeTblSklient;
    private String yurAdressSklient;
    private String pochtAdrressSklient;
    private String familiyaSklient;
    private String imyaSklient;
    private String otchestvoSklient;
    private Integer typePoiskSklient;
    private Long idgrpnomSklient;
    private Long idgrphwSklient;
//    private Collection<CustKlientEntity> custKlientsByIdklient;
//    private Collection<DkorrvstEntity> dkorrvstsByIdklient;
//    private Collection<DostvsEntity> dostvsByIdklient;
//    private Collection<DpkoEntity> dpkosByIdklient;
//    private Collection<DreaEntity> dreasByIdklient;
//    private Collection<DrealrestEntity> drealrestsByIdklient;
//    private Collection<DrgAdvcusttEntity> drgAdvcusttsByIdklient;
//    private Collection<DrgOtchposttEntity> drgOtchposttsByIdklient;
//    private Collection<DrgPaysaletEntity> drgPaysaletsByIdklient;
//    private Collection<DrgVsraschtEntity> drgVsraschtsByIdklient;
//    private Collection<DrkoEntity> drkosByIdklient;
//    private Collection<DschfactEntity> dschfactsByIdklient;
//    private Collection<DvipbanktEntity> dvipbanktsByIdklient;
//    private Collection<DvpoEntity> dvposByIdklient;
//    private Collection<GalldocEntity> galldocsByIdklient;
//    private Collection<GurnalplatEntity> gurnalplatsByIdklient;
//    private Collection<GuroperDcardEntity> guroperDcardsByIdklient;
//    private Collection<HotDraschettEntity> hotDraschettsByIdklient;
//    private Collection<HotDrealtEntity> hotDrealtsByIdklient;
//    private Collection<HotGalldocEntity> hotGalldocsByIdklient;
//    private Collection<HotSostnfEntity> hotSostnfsByIdklient;
//    private Collection<HotSostnfEntity> hotSostnfsByIdklient_0;
//    private Collection<RemCqueryEntity> remCqueriesByIdklient;
//    private Collection<RemDrgOtchposttEntity> remDrgOtchposttsByIdklient;
//    private Collection<RemDvzpertEntity> remDvzpertsByIdklient;
//    private Collection<RemDzaktprEntity> remDzaktprsByIdklient;
//    private Collection<RemDzaktprEntity> remDzaktprsByIdklient_0;
//    private Collection<RemGalldocEntity> remGalldocsByIdklient;
//    private Collection<RemGurVigrEntity> remGurVigrsByIdklient;
//    private Collection<RemRgostzdilEntity> remRgostzdilsByIdklient;
//    private Collection<RemRgostzdilDvEntity> remRgostzdilDvsByIdklient;
//    private Collection<RemRgostzscEntity> remRgostzscsByIdklient;
//    private Collection<RemRgostzscDvEntity> remRgostzscDvsByIdklient;
//    private Collection<RemRgotchpostEntity> remRgotchpostsByIdklient;
//    private Collection<RemRgotchpostDvEntity> remRgotchpostDvsByIdklient;
//    private Collection<RemRgvzostEntity> remRgvzostsByIdklient;
//    private Collection<RemRgvzostDvEntity> remRgvzostDvsByIdklient;
//    private Collection<RemRgvzvputiEntity> remRgvzvputisByIdklient;
//    private Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdklient;
//    private Collection<RemShardwareEntity> remShardwaresByIdklient;
//    private Collection<RemShardwareEntity> remShardwaresByIdklient_0;
//    private Collection<RemSkktEntity> remSkktsByIdklient;
//    private Collection<RemSkktDvEntity> remSkktDvsByIdklient;
//    private Collection<RemZEntity> remZSByIdklient;
//    private Collection<RemZEntity> remZSByIdklient_0;
//    private Collection<RgadvcustEntity> rgadvcustsByIdklient;
//    private Collection<RgadvcustDvEntity> rgadvcustDvsByIdklient;
//    private Collection<RgotchpostEntity> rgotchpostsByIdklient;
//    private Collection<RgotchpostDvEntity> rgotchpostDvsByIdklient;
//    private Collection<RgotprpostEntity> rgotprpostsByIdklient;
//    private Collection<RgotprpostDvEntity> rgotprpostDvsByIdklient;
//    private Collection<RgpaysaleEntity> rgpaysalesByIdklient;
//    private Collection<RgpaysaleDvEntity> rgpaysaleDvsByIdklient;
//    private Collection<RgrealDvEntity> rgrealDvsByIdklient;
//    private Collection<RgvsraschEntity> rgvsraschesByIdklient;
//    private Collection<RgvsraschDvEntity> rgvsraschDvsByIdklient;
//    private Collection<RgzakEntity> rgzaksByIdklient;
//    private Collection<RgzakpostEntity> rgzakpostsByIdklient;
//    private Collection<RgzakpostDvEntity> rgzakpostDvsByIdklient;
//    private Collection<SdiscountCardEntity> sdiscountCardsByIdklient;
//    private Collection<SdocklientEntity> sdocklientsByIdklient;
//    private Collection<SdogEntity> sdogsByIdklient;
//    private Collection<SimportedEntity> simportedsByIdklient;
//    private Collection<SimportnomEntity> simportnomsByIdklient;
//    private StpriceEntity stpriceByIdtpriceklient;
//    private SgrpklEntity sgrpklByIdgrpklient;
//    private SvidklientEntity svidklientByIdvidklient;
//    private ScountryEntity scountryByIdcountryklient;
//    private SgrpnomEntity sgrpnomByIdgrpnomSklient;
//    private RemSgrpHardwareEntity remSgrpHardwareByIdgrphwSklient;
//    private Collection<SklientDopfislEntity> sklientDopfislsByIdklient;
//    private Collection<SklientDopurlEntity> sklientDopurlsByIdklient;
//    private Collection<SnomEntity> snomsByIdklient;
//    private Collection<SnomEntity> snomsByIdklient_0;
//    private Collection<SnumtelEntity> snumtelsByIdklient;
//    private Collection<SpartEntity> spartsByIdklient;
//    private Collection<SproducerEntity> sproducersByIdklient;
//    private Collection<SproducerEntity> sproducersByIdklient_0;
//    private Collection<SrschetEntity> srschetsByIdklient;
//    private Collection<SsellerEntity> ssellersByIdklient;
//    private Collection<ZpGalldocEntity> zpGalldocsByIdklient;

    @Id
    @Column(name = "IDKLIENT", nullable = false)
    public long getIdklient() {
        return idklient;
    }

    public void setIdklient(long idklient) {
        this.idklient = idklient;
    }

    @Basic
    @Column(name = "NAMEKLIENT", nullable = true, length = 200)
    public String getNameklient() {
        return nameklient;
    }

    public void setNameklient(String nameklient) {
        this.nameklient = nameklient;
    }

    @Basic
    @Column(name = "FNAME", nullable = true, length = 200)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "ADRKLIENT", nullable = true, length = 200)
    public String getAdrklient() {
        return adrklient;
    }

    public void setAdrklient(String adrklient) {
        this.adrklient = adrklient;
    }

    @Basic
    @Column(name = "TELKLIENT", nullable = true, length = 200)
    public String getTelklient() {
        return telklient;
    }

    public void setTelklient(String telklient) {
        this.telklient = telklient;
    }

    @Basic
    @Column(name = "INNKLIENT", nullable = true, length = 12)
    public String getInnklient() {
        return innklient;
    }

    public void setInnklient(String innklient) {
        this.innklient = innklient;
    }

    @Basic
    @Column(name = "KPPKLIENT", nullable = true, length = 9)
    public String getKppklient() {
        return kppklient;
    }

    public void setKppklient(String kppklient) {
        this.kppklient = kppklient;
    }

    @Basic
    @Column(name = "TKLIENT", nullable = true)
    public Short getTklient() {
        return tklient;
    }

    public void setTklient(Short tklient) {
        this.tklient = tklient;
    }

    @Basic
    @Column(name = "IDTPRICEKLIENT", nullable = true)
    public Long getIdtpriceklient() {
        return idtpriceklient;
    }

    public void setIdtpriceklient(Long idtpriceklient) {
        this.idtpriceklient = idtpriceklient;
    }

    @Basic
    @Column(name = "IDGRPKLIENT", nullable = true)
    public Long getIdgrpklient() {
        return idgrpklient;
    }

    public void setIdgrpklient(Long idgrpklient) {
        this.idgrpklient = idgrpklient;
    }

    @Basic
    @Column(name = "GID_SKLIENT", nullable = true, length = 10)
    public String getGidSklient() {
        return gidSklient;
    }

    public void setGidSklient(String gidSklient) {
        this.gidSklient = gidSklient;
    }

    @Basic
    @Column(name = "OKPOKLIENT", nullable = true, length = 10)
    public String getOkpoklient() {
        return okpoklient;
    }

    public void setOkpoklient(String okpoklient) {
        this.okpoklient = okpoklient;
    }

    @Basic
    @Column(name = "IDVIDKLIENT", nullable = true)
    public Long getIdvidklient() {
        return idvidklient;
    }

    public void setIdvidklient(Long idvidklient) {
        this.idvidklient = idvidklient;
    }

    @Basic
    @Column(name = "IDCOUNTRYKLIENT", nullable = true)
    public Long getIdcountryklient() {
        return idcountryklient;
    }

    public void setIdcountryklient(Long idcountryklient) {
        this.idcountryklient = idcountryklient;
    }

    @Basic
    @Column(name = "IDBASE_SKLIENT", nullable = true)
    public Long getIdbaseSklient() {
        return idbaseSklient;
    }

    public void setIdbaseSklient(Long idbaseSklient) {
        this.idbaseSklient = idbaseSklient;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_SKLIENT", nullable = true)
    public Long getIdextDoutSklient() {
        return idextDoutSklient;
    }

    public void setIdextDoutSklient(Long idextDoutSklient) {
        this.idextDoutSklient = idextDoutSklient;
    }

    @Basic
    @Column(name = "IDEXT_BASE_SKLIENT", nullable = true)
    public Long getIdextBaseSklient() {
        return idextBaseSklient;
    }

    public void setIdextBaseSklient(Long idextBaseSklient) {
        this.idextBaseSklient = idextBaseSklient;
    }

    @Basic
    @Column(name = "KRNAME_SKLIENT", nullable = true, length = 200)
    public String getKrnameSklient() {
        return krnameSklient;
    }

    public void setKrnameSklient(String krnameSklient) {
        this.krnameSklient = krnameSklient;
    }

    @Basic
    @Column(name = "DESCR_SKLIENT", nullable = true, length = 250)
    public String getDescrSklient() {
        return descrSklient;
    }

    public void setDescrSklient(String descrSklient) {
        this.descrSklient = descrSklient;
    }

    @Basic
    @Column(name = "MESSAGE_SKLIENT", nullable = true, length = 150)
    public String getMessageSklient() {
        return messageSklient;
    }

    public void setMessageSklient(String messageSklient) {
        this.messageSklient = messageSklient;
    }

    @Basic
    @Column(name = "EMAIL_SKLIENT", nullable = true, length = 200)
    public String getEmailSklient() {
        return emailSklient;
    }

    public void setEmailSklient(String emailSklient) {
        this.emailSklient = emailSklient;
    }

    @Basic
    @Column(name = "WWW_SKLIENT", nullable = true, length = 200)
    public String getWwwSklient() {
        return wwwSklient;
    }

    public void setWwwSklient(String wwwSklient) {
        this.wwwSklient = wwwSklient;
    }

    @Basic
    @Column(name = "MAXCREDIT_SKLIENT", nullable = true, precision = 2)
    public BigDecimal getMaxcreditSklient() {
        return maxcreditSklient;
    }

    public void setMaxcreditSklient(BigDecimal maxcreditSklient) {
        this.maxcreditSklient = maxcreditSklient;
    }

    @Basic
    @Column(name = "TYPE_TBL_SKLIENT", nullable = true)
    public Short getTypeTblSklient() {
        return typeTblSklient;
    }

    public void setTypeTblSklient(Short typeTblSklient) {
        this.typeTblSklient = typeTblSklient;
    }

    @Basic
    @Column(name = "YUR_ADRESS_SKLIENT", nullable = true, length = 200)
    public String getYurAdressSklient() {
        return yurAdressSklient;
    }

    public void setYurAdressSklient(String yurAdressSklient) {
        this.yurAdressSklient = yurAdressSklient;
    }

    @Basic
    @Column(name = "POCHT_ADRRESS_SKLIENT", nullable = true, length = 200)
    public String getPochtAdrressSklient() {
        return pochtAdrressSklient;
    }

    public void setPochtAdrressSklient(String pochtAdrressSklient) {
        this.pochtAdrressSklient = pochtAdrressSklient;
    }

    @Basic
    @Column(name = "FAMILIYA_SKLIENT", nullable = true, length = 30)
    public String getFamiliyaSklient() {
        return familiyaSklient;
    }

    public void setFamiliyaSklient(String familiyaSklient) {
        this.familiyaSklient = familiyaSklient;
    }

    @Basic
    @Column(name = "IMYA_SKLIENT", nullable = true, length = 30)
    public String getImyaSklient() {
        return imyaSklient;
    }

    public void setImyaSklient(String imyaSklient) {
        this.imyaSklient = imyaSklient;
    }

    @Basic
    @Column(name = "OTCHESTVO_SKLIENT", nullable = true, length = 30)
    public String getOtchestvoSklient() {
        return otchestvoSklient;
    }

    public void setOtchestvoSklient(String otchestvoSklient) {
        this.otchestvoSklient = otchestvoSklient;
    }

    @Basic
    @Column(name = "TYPE_POISK_SKLIENT", nullable = true)
    public Integer getTypePoiskSklient() {
        return typePoiskSklient;
    }

    public void setTypePoiskSklient(Integer typePoiskSklient) {
        this.typePoiskSklient = typePoiskSklient;
    }

    @Basic
    @Column(name = "IDGRPNOM_SKLIENT", nullable = true)
    public Long getIdgrpnomSklient() {
        return idgrpnomSklient;
    }

    public void setIdgrpnomSklient(Long idgrpnomSklient) {
        this.idgrpnomSklient = idgrpnomSklient;
    }

    @Basic
    @Column(name = "IDGRPHW_SKLIENT", nullable = true)
    public Long getIdgrphwSklient() {
        return idgrphwSklient;
    }

    public void setIdgrphwSklient(Long idgrphwSklient) {
        this.idgrphwSklient = idgrphwSklient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SklientEntity that = (SklientEntity) o;

        if (idklient != that.idklient) return false;
        if (nameklient != null ? !nameklient.equals(that.nameklient) : that.nameklient != null) return false;
        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (adrklient != null ? !adrklient.equals(that.adrklient) : that.adrklient != null) return false;
        if (telklient != null ? !telklient.equals(that.telklient) : that.telklient != null) return false;
        if (innklient != null ? !innklient.equals(that.innklient) : that.innklient != null) return false;
        if (kppklient != null ? !kppklient.equals(that.kppklient) : that.kppklient != null) return false;
        if (tklient != null ? !tklient.equals(that.tklient) : that.tklient != null) return false;
        if (idtpriceklient != null ? !idtpriceklient.equals(that.idtpriceklient) : that.idtpriceklient != null)
            return false;
        if (idgrpklient != null ? !idgrpklient.equals(that.idgrpklient) : that.idgrpklient != null) return false;
        if (gidSklient != null ? !gidSklient.equals(that.gidSklient) : that.gidSklient != null) return false;
        if (okpoklient != null ? !okpoklient.equals(that.okpoklient) : that.okpoklient != null) return false;
        if (idvidklient != null ? !idvidklient.equals(that.idvidklient) : that.idvidklient != null) return false;
        if (idcountryklient != null ? !idcountryklient.equals(that.idcountryklient) : that.idcountryklient != null)
            return false;
        if (idbaseSklient != null ? !idbaseSklient.equals(that.idbaseSklient) : that.idbaseSklient != null)
            return false;
        if (idextDoutSklient != null ? !idextDoutSklient.equals(that.idextDoutSklient) : that.idextDoutSklient != null)
            return false;
        if (idextBaseSklient != null ? !idextBaseSklient.equals(that.idextBaseSklient) : that.idextBaseSklient != null)
            return false;
        if (krnameSklient != null ? !krnameSklient.equals(that.krnameSklient) : that.krnameSklient != null)
            return false;
        if (descrSklient != null ? !descrSklient.equals(that.descrSklient) : that.descrSklient != null) return false;
        if (messageSklient != null ? !messageSklient.equals(that.messageSklient) : that.messageSklient != null)
            return false;
        if (emailSklient != null ? !emailSklient.equals(that.emailSklient) : that.emailSklient != null) return false;
        if (wwwSklient != null ? !wwwSklient.equals(that.wwwSklient) : that.wwwSklient != null) return false;
        if (maxcreditSklient != null ? !maxcreditSklient.equals(that.maxcreditSklient) : that.maxcreditSklient != null)
            return false;
        if (typeTblSklient != null ? !typeTblSklient.equals(that.typeTblSklient) : that.typeTblSklient != null)
            return false;
        if (yurAdressSklient != null ? !yurAdressSklient.equals(that.yurAdressSklient) : that.yurAdressSklient != null)
            return false;
        if (pochtAdrressSklient != null ? !pochtAdrressSklient.equals(that.pochtAdrressSklient) : that.pochtAdrressSklient != null)
            return false;
        if (familiyaSklient != null ? !familiyaSklient.equals(that.familiyaSklient) : that.familiyaSklient != null)
            return false;
        if (imyaSklient != null ? !imyaSklient.equals(that.imyaSklient) : that.imyaSklient != null) return false;
        if (otchestvoSklient != null ? !otchestvoSklient.equals(that.otchestvoSklient) : that.otchestvoSklient != null)
            return false;
        if (typePoiskSklient != null ? !typePoiskSklient.equals(that.typePoiskSklient) : that.typePoiskSklient != null)
            return false;
        if (idgrpnomSklient != null ? !idgrpnomSklient.equals(that.idgrpnomSklient) : that.idgrpnomSklient != null)
            return false;
        if (idgrphwSklient != null ? !idgrphwSklient.equals(that.idgrphwSklient) : that.idgrphwSklient != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idklient ^ (idklient >>> 32));
        result = 31 * result + (nameklient != null ? nameklient.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (adrklient != null ? adrklient.hashCode() : 0);
        result = 31 * result + (telklient != null ? telklient.hashCode() : 0);
        result = 31 * result + (innklient != null ? innklient.hashCode() : 0);
        result = 31 * result + (kppklient != null ? kppklient.hashCode() : 0);
        result = 31 * result + (tklient != null ? tklient.hashCode() : 0);
        result = 31 * result + (idtpriceklient != null ? idtpriceklient.hashCode() : 0);
        result = 31 * result + (idgrpklient != null ? idgrpklient.hashCode() : 0);
        result = 31 * result + (gidSklient != null ? gidSklient.hashCode() : 0);
        result = 31 * result + (okpoklient != null ? okpoklient.hashCode() : 0);
        result = 31 * result + (idvidklient != null ? idvidklient.hashCode() : 0);
        result = 31 * result + (idcountryklient != null ? idcountryklient.hashCode() : 0);
        result = 31 * result + (idbaseSklient != null ? idbaseSklient.hashCode() : 0);
        result = 31 * result + (idextDoutSklient != null ? idextDoutSklient.hashCode() : 0);
        result = 31 * result + (idextBaseSklient != null ? idextBaseSklient.hashCode() : 0);
        result = 31 * result + (krnameSklient != null ? krnameSklient.hashCode() : 0);
        result = 31 * result + (descrSklient != null ? descrSklient.hashCode() : 0);
        result = 31 * result + (messageSklient != null ? messageSklient.hashCode() : 0);
        result = 31 * result + (emailSklient != null ? emailSklient.hashCode() : 0);
        result = 31 * result + (wwwSklient != null ? wwwSklient.hashCode() : 0);
        result = 31 * result + (maxcreditSklient != null ? maxcreditSklient.hashCode() : 0);
        result = 31 * result + (typeTblSklient != null ? typeTblSklient.hashCode() : 0);
        result = 31 * result + (yurAdressSklient != null ? yurAdressSklient.hashCode() : 0);
        result = 31 * result + (pochtAdrressSklient != null ? pochtAdrressSklient.hashCode() : 0);
        result = 31 * result + (familiyaSklient != null ? familiyaSklient.hashCode() : 0);
        result = 31 * result + (imyaSklient != null ? imyaSklient.hashCode() : 0);
        result = 31 * result + (otchestvoSklient != null ? otchestvoSklient.hashCode() : 0);
        result = 31 * result + (typePoiskSklient != null ? typePoiskSklient.hashCode() : 0);
        result = 31 * result + (idgrpnomSklient != null ? idgrpnomSklient.hashCode() : 0);
        result = 31 * result + (idgrphwSklient != null ? idgrphwSklient.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "sklientByIdklientCustKlient")
//    public Collection<CustKlientEntity> getCustKlientsByIdklient() {
//        return custKlientsByIdklient;
//    }
//
//    public void setCustKlientsByIdklient(Collection<CustKlientEntity> custKlientsByIdklient) {
//        this.custKlientsByIdklient = custKlientsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDkorrvst")
//    public Collection<DkorrvstEntity> getDkorrvstsByIdklient() {
//        return dkorrvstsByIdklient;
//    }
//
//    public void setDkorrvstsByIdklient(Collection<DkorrvstEntity> dkorrvstsByIdklient) {
//        this.dkorrvstsByIdklient = dkorrvstsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDostvs")
//    public Collection<DostvsEntity> getDostvsByIdklient() {
//        return dostvsByIdklient;
//    }
//
//    public void setDostvsByIdklient(Collection<DostvsEntity> dostvsByIdklient) {
//        this.dostvsByIdklient = dostvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklpko")
//    public Collection<DpkoEntity> getDpkosByIdklient() {
//        return dpkosByIdklient;
//    }
//
//    public void setDpkosByIdklient(Collection<DpkoEntity> dpkosByIdklient) {
//        this.dpkosByIdklient = dpkosByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdgrpolrea")
//    public Collection<DreaEntity> getDreasByIdklient() {
//        return dreasByIdklient;
//    }
//
//    public void setDreasByIdklient(Collection<DreaEntity> dreasByIdklient) {
//        this.dreasByIdklient = dreasByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpokRealrest")
//    public Collection<DrealrestEntity> getDrealrestsByIdklient() {
//        return drealrestsByIdklient;
//    }
//
//    public void setDrealrestsByIdklient(Collection<DrealrestEntity> drealrestsByIdklient) {
//        this.drealrestsByIdklient = drealrestsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDrgAdvcustt")
//    public Collection<DrgAdvcusttEntity> getDrgAdvcusttsByIdklient() {
//        return drgAdvcusttsByIdklient;
//    }
//
//    public void setDrgAdvcusttsByIdklient(Collection<DrgAdvcusttEntity> drgAdvcusttsByIdklient) {
//        this.drgAdvcusttsByIdklient = drgAdvcusttsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostDrgOtchpostt")
//    public Collection<DrgOtchposttEntity> getDrgOtchposttsByIdklient() {
//        return drgOtchposttsByIdklient;
//    }
//
//    public void setDrgOtchposttsByIdklient(Collection<DrgOtchposttEntity> drgOtchposttsByIdklient) {
//        this.drgOtchposttsByIdklient = drgOtchposttsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDrgPaysalet")
//    public Collection<DrgPaysaletEntity> getDrgPaysaletsByIdklient() {
//        return drgPaysaletsByIdklient;
//    }
//
//    public void setDrgPaysaletsByIdklient(Collection<DrgPaysaletEntity> drgPaysaletsByIdklient) {
//        this.drgPaysaletsByIdklient = drgPaysaletsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDrgVsrascht")
//    public Collection<DrgVsraschtEntity> getDrgVsraschtsByIdklient() {
//        return drgVsraschtsByIdklient;
//    }
//
//    public void setDrgVsraschtsByIdklient(Collection<DrgVsraschtEntity> drgVsraschtsByIdklient) {
//        this.drgVsraschtsByIdklient = drgVsraschtsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklrko")
//    public Collection<DrkoEntity> getDrkosByIdklient() {
//        return drkosByIdklient;
//    }
//
//    public void setDrkosByIdklient(Collection<DrkoEntity> drkosByIdklient) {
//        this.drkosByIdklient = drkosByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdgrpolDschfact")
//    public Collection<DschfactEntity> getDschfactsByIdklient() {
//        return dschfactsByIdklient;
//    }
//
//    public void setDschfactsByIdklient(Collection<DschfactEntity> dschfactsByIdklient) {
//        this.dschfactsByIdklient = dschfactsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientDvipbankt")
//    public Collection<DvipbanktEntity> getDvipbanktsByIdklient() {
//        return dvipbanktsByIdklient;
//    }
//
//    public void setDvipbanktsByIdklient(Collection<DvipbanktEntity> dvipbanktsByIdklient) {
//        this.dvipbanktsByIdklient = dvipbanktsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdgrpolDvpo")
//    public Collection<DvpoEntity> getDvposByIdklient() {
//        return dvposByIdklient;
//    }
//
//    public void setDvposByIdklient(Collection<DvpoEntity> dvposByIdklient) {
//        this.dvposByIdklient = dvposByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdkldoc")
//    public Collection<GalldocEntity> getGalldocsByIdklient() {
//        return galldocsByIdklient;
//    }
//
//    public void setGalldocsByIdklient(Collection<GalldocEntity> galldocsByIdklient) {
//        this.galldocsByIdklient = galldocsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientGurnalplat")
//    public Collection<GurnalplatEntity> getGurnalplatsByIdklient() {
//        return gurnalplatsByIdklient;
//    }
//
//    public void setGurnalplatsByIdklient(Collection<GurnalplatEntity> gurnalplatsByIdklient) {
//        this.gurnalplatsByIdklient = gurnalplatsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientGuroperDcard")
//    public Collection<GuroperDcardEntity> getGuroperDcardsByIdklient() {
//        return guroperDcardsByIdklient;
//    }
//
//    public void setGuroperDcardsByIdklient(Collection<GuroperDcardEntity> guroperDcardsByIdklient) {
//        this.guroperDcardsByIdklient = guroperDcardsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdguestHotDraschett")
//    public Collection<HotDraschettEntity> getHotDraschettsByIdklient() {
//        return hotDraschettsByIdklient;
//    }
//
//    public void setHotDraschettsByIdklient(Collection<HotDraschettEntity> hotDraschettsByIdklient) {
//        this.hotDraschettsByIdklient = hotDraschettsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdguestHotDrealt")
//    public Collection<HotDrealtEntity> getHotDrealtsByIdklient() {
//        return hotDrealtsByIdklient;
//    }
//
//    public void setHotDrealtsByIdklient(Collection<HotDrealtEntity> hotDrealtsByIdklient) {
//        this.hotDrealtsByIdklient = hotDrealtsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklHotGalldoc")
//    public Collection<HotGalldocEntity> getHotGalldocsByIdklient() {
//        return hotGalldocsByIdklient;
//    }
//
//    public void setHotGalldocsByIdklient(Collection<HotGalldocEntity> hotGalldocsByIdklient) {
//        this.hotGalldocsByIdklient = hotGalldocsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdplatHotSostnf")
//    public Collection<HotSostnfEntity> getHotSostnfsByIdklient() {
//        return hotSostnfsByIdklient;
//    }
//
//    public void setHotSostnfsByIdklient(Collection<HotSostnfEntity> hotSostnfsByIdklient) {
//        this.hotSostnfsByIdklient = hotSostnfsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdguestHotSostnf")
//    public Collection<HotSostnfEntity> getHotSostnfsByIdklient_0() {
//        return hotSostnfsByIdklient_0;
//    }
//
//    public void setHotSostnfsByIdklient_0(Collection<HotSostnfEntity> hotSostnfsByIdklient_0) {
//        this.hotSostnfsByIdklient_0 = hotSostnfsByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemCquery")
//    public Collection<RemCqueryEntity> getRemCqueriesByIdklient() {
//        return remCqueriesByIdklient;
//    }
//
//    public void setRemCqueriesByIdklient(Collection<RemCqueryEntity> remCqueriesByIdklient) {
//        this.remCqueriesByIdklient = remCqueriesByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRemDrgOtchpostt")
//    public Collection<RemDrgOtchposttEntity> getRemDrgOtchposttsByIdklient() {
//        return remDrgOtchposttsByIdklient;
//    }
//
//    public void setRemDrgOtchposttsByIdklient(Collection<RemDrgOtchposttEntity> remDrgOtchposttsByIdklient) {
//        this.remDrgOtchposttsByIdklient = remDrgOtchposttsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemDvzpert")
//    public Collection<RemDvzpertEntity> getRemDvzpertsByIdklient() {
//        return remDvzpertsByIdklient;
//    }
//
//    public void setRemDvzpertsByIdklient(Collection<RemDvzpertEntity> remDvzpertsByIdklient) {
//        this.remDvzpertsByIdklient = remDvzpertsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIddilerRemDzaktpr")
//    public Collection<RemDzaktprEntity> getRemDzaktprsByIdklient() {
//        return remDzaktprsByIdklient;
//    }
//
//    public void setRemDzaktprsByIdklient(Collection<RemDzaktprEntity> remDzaktprsByIdklient) {
//        this.remDzaktprsByIdklient = remDzaktprsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostZipRemDzaktpr")
//    public Collection<RemDzaktprEntity> getRemDzaktprsByIdklient_0() {
//        return remDzaktprsByIdklient_0;
//    }
//
//    public void setRemDzaktprsByIdklient_0(Collection<RemDzaktprEntity> remDzaktprsByIdklient_0) {
//        this.remDzaktprsByIdklient_0 = remDzaktprsByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemGalldoc")
//    public Collection<RemGalldocEntity> getRemGalldocsByIdklient() {
//        return remGalldocsByIdklient;
//    }
//
//    public void setRemGalldocsByIdklient(Collection<RemGalldocEntity> remGalldocsByIdklient) {
//        this.remGalldocsByIdklient = remGalldocsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemGurVigr")
//    public Collection<RemGurVigrEntity> getRemGurVigrsByIdklient() {
//        return remGurVigrsByIdklient;
//    }
//
//    public void setRemGurVigrsByIdklient(Collection<RemGurVigrEntity> remGurVigrsByIdklient) {
//        this.remGurVigrsByIdklient = remGurVigrsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgostzdil")
//    public Collection<RemRgostzdilEntity> getRemRgostzdilsByIdklient() {
//        return remRgostzdilsByIdklient;
//    }
//
//    public void setRemRgostzdilsByIdklient(Collection<RemRgostzdilEntity> remRgostzdilsByIdklient) {
//        this.remRgostzdilsByIdklient = remRgostzdilsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgostzdilDv")
//    public Collection<RemRgostzdilDvEntity> getRemRgostzdilDvsByIdklient() {
//        return remRgostzdilDvsByIdklient;
//    }
//
//    public void setRemRgostzdilDvsByIdklient(Collection<RemRgostzdilDvEntity> remRgostzdilDvsByIdklient) {
//        this.remRgostzdilDvsByIdklient = remRgostzdilDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgostzsc")
//    public Collection<RemRgostzscEntity> getRemRgostzscsByIdklient() {
//        return remRgostzscsByIdklient;
//    }
//
//    public void setRemRgostzscsByIdklient(Collection<RemRgostzscEntity> remRgostzscsByIdklient) {
//        this.remRgostzscsByIdklient = remRgostzscsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgostzscDv")
//    public Collection<RemRgostzscDvEntity> getRemRgostzscDvsByIdklient() {
//        return remRgostzscDvsByIdklient;
//    }
//
//    public void setRemRgostzscDvsByIdklient(Collection<RemRgostzscDvEntity> remRgostzscDvsByIdklient) {
//        this.remRgostzscDvsByIdklient = remRgostzscDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRemRgotchpost")
//    public Collection<RemRgotchpostEntity> getRemRgotchpostsByIdklient() {
//        return remRgotchpostsByIdklient;
//    }
//
//    public void setRemRgotchpostsByIdklient(Collection<RemRgotchpostEntity> remRgotchpostsByIdklient) {
//        this.remRgotchpostsByIdklient = remRgotchpostsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRemRgotchpostDv")
//    public Collection<RemRgotchpostDvEntity> getRemRgotchpostDvsByIdklient() {
//        return remRgotchpostDvsByIdklient;
//    }
//
//    public void setRemRgotchpostDvsByIdklient(Collection<RemRgotchpostDvEntity> remRgotchpostDvsByIdklient) {
//        this.remRgotchpostDvsByIdklient = remRgotchpostDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgvzost")
//    public Collection<RemRgvzostEntity> getRemRgvzostsByIdklient() {
//        return remRgvzostsByIdklient;
//    }
//
//    public void setRemRgvzostsByIdklient(Collection<RemRgvzostEntity> remRgvzostsByIdklient) {
//        this.remRgvzostsByIdklient = remRgvzostsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemRgvzostDv")
//    public Collection<RemRgvzostDvEntity> getRemRgvzostDvsByIdklient() {
//        return remRgvzostDvsByIdklient;
//    }
//
//    public void setRemRgvzostDvsByIdklient(Collection<RemRgvzostDvEntity> remRgvzostDvsByIdklient) {
//        this.remRgvzostDvsByIdklient = remRgvzostDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklpolRemRgvzvputi")
//    public Collection<RemRgvzvputiEntity> getRemRgvzvputisByIdklient() {
//        return remRgvzvputisByIdklient;
//    }
//
//    public void setRemRgvzvputisByIdklient(Collection<RemRgvzvputiEntity> remRgvzvputisByIdklient) {
//        this.remRgvzvputisByIdklient = remRgvzvputisByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklpolRemRgvzvputiDv")
//    public Collection<RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdklient() {
//        return remRgvzvputiDvsByIdklient;
//    }
//
//    public void setRemRgvzvputiDvsByIdklient(Collection<RemRgvzvputiDvEntity> remRgvzvputiDvsByIdklient) {
//        this.remRgvzvputiDvsByIdklient = remRgvzvputiDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRemShardware")
//    public Collection<RemShardwareEntity> getRemShardwaresByIdklient() {
//        return remShardwaresByIdklient;
//    }
//
//    public void setRemShardwaresByIdklient(Collection<RemShardwareEntity> remShardwaresByIdklient) {
//        this.remShardwaresByIdklient = remShardwaresByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdvladRemShardware")
//    public Collection<RemShardwareEntity> getRemShardwaresByIdklient_0() {
//        return remShardwaresByIdklient_0;
//    }
//
//    public void setRemShardwaresByIdklient_0(Collection<RemShardwareEntity> remShardwaresByIdklient_0) {
//        this.remShardwaresByIdklient_0 = remShardwaresByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemSkkt")
//    public Collection<RemSkktEntity> getRemSkktsByIdklient() {
//        return remSkktsByIdklient;
//    }
//
//    public void setRemSkktsByIdklient(Collection<RemSkktEntity> remSkktsByIdklient) {
//        this.remSkktsByIdklient = remSkktsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemSkktDv")
//    public Collection<RemSkktDvEntity> getRemSkktDvsByIdklient() {
//        return remSkktDvsByIdklient;
//    }
//
//    public void setRemSkktDvsByIdklient(Collection<RemSkktDvEntity> remSkktDvsByIdklient) {
//        this.remSkktDvsByIdklient = remSkktDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRemZ")
//    public Collection<RemZEntity> getRemZSByIdklient() {
//        return remZSByIdklient;
//    }
//
//    public void setRemZSByIdklient(Collection<RemZEntity> remZSByIdklient) {
//        this.remZSByIdklient = remZSByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIddilerRemZ")
//    public Collection<RemZEntity> getRemZSByIdklient_0() {
//        return remZSByIdklient_0;
//    }
//
//    public void setRemZSByIdklient_0(Collection<RemZEntity> remZSByIdklient_0) {
//        this.remZSByIdklient_0 = remZSByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRgadvcust")
//    public Collection<RgadvcustEntity> getRgadvcustsByIdklient() {
//        return rgadvcustsByIdklient;
//    }
//
//    public void setRgadvcustsByIdklient(Collection<RgadvcustEntity> rgadvcustsByIdklient) {
//        this.rgadvcustsByIdklient = rgadvcustsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRgadvcustDv")
//    public Collection<RgadvcustDvEntity> getRgadvcustDvsByIdklient() {
//        return rgadvcustDvsByIdklient;
//    }
//
//    public void setRgadvcustDvsByIdklient(Collection<RgadvcustDvEntity> rgadvcustDvsByIdklient) {
//        this.rgadvcustDvsByIdklient = rgadvcustDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgotchpost")
//    public Collection<RgotchpostEntity> getRgotchpostsByIdklient() {
//        return rgotchpostsByIdklient;
//    }
//
//    public void setRgotchpostsByIdklient(Collection<RgotchpostEntity> rgotchpostsByIdklient) {
//        this.rgotchpostsByIdklient = rgotchpostsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgotchpostDv")
//    public Collection<RgotchpostDvEntity> getRgotchpostDvsByIdklient() {
//        return rgotchpostDvsByIdklient;
//    }
//
//    public void setRgotchpostDvsByIdklient(Collection<RgotchpostDvEntity> rgotchpostDvsByIdklient) {
//        this.rgotchpostDvsByIdklient = rgotchpostDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgotprpost")
//    public Collection<RgotprpostEntity> getRgotprpostsByIdklient() {
//        return rgotprpostsByIdklient;
//    }
//
//    public void setRgotprpostsByIdklient(Collection<RgotprpostEntity> rgotprpostsByIdklient) {
//        this.rgotprpostsByIdklient = rgotprpostsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgotprpostDv")
//    public Collection<RgotprpostDvEntity> getRgotprpostDvsByIdklient() {
//        return rgotprpostDvsByIdklient;
//    }
//
//    public void setRgotprpostDvsByIdklient(Collection<RgotprpostDvEntity> rgotprpostDvsByIdklient) {
//        this.rgotprpostDvsByIdklient = rgotprpostDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRgpaysale")
//    public Collection<RgpaysaleEntity> getRgpaysalesByIdklient() {
//        return rgpaysalesByIdklient;
//    }
//
//    public void setRgpaysalesByIdklient(Collection<RgpaysaleEntity> rgpaysalesByIdklient) {
//        this.rgpaysalesByIdklient = rgpaysalesByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientRgpaysaleDv")
//    public Collection<RgpaysaleDvEntity> getRgpaysaleDvsByIdklient() {
//        return rgpaysaleDvsByIdklient;
//    }
//
//    public void setRgpaysaleDvsByIdklient(Collection<RgpaysaleDvEntity> rgpaysaleDvsByIdklient) {
//        this.rgpaysaleDvsByIdklient = rgpaysaleDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpokRgrealDv")
//    public Collection<RgrealDvEntity> getRgrealDvsByIdklient() {
//        return rgrealDvsByIdklient;
//    }
//
//    public void setRgrealDvsByIdklient(Collection<RgrealDvEntity> rgrealDvsByIdklient) {
//        this.rgrealDvsByIdklient = rgrealDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientVsrasch")
//    public Collection<RgvsraschEntity> getRgvsraschesByIdklient() {
//        return rgvsraschesByIdklient;
//    }
//
//    public void setRgvsraschesByIdklient(Collection<RgvsraschEntity> rgvsraschesByIdklient) {
//        this.rgvsraschesByIdklient = rgvsraschesByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientVsraschDv")
//    public Collection<RgvsraschDvEntity> getRgvsraschDvsByIdklient() {
//        return rgvsraschDvsByIdklient;
//    }
//
//    public void setRgvsraschDvsByIdklient(Collection<RgvsraschDvEntity> rgvsraschDvsByIdklient) {
//        this.rgvsraschDvsByIdklient = rgvsraschDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientZak")
//    public Collection<RgzakEntity> getRgzaksByIdklient() {
//        return rgzaksByIdklient;
//    }
//
//    public void setRgzaksByIdklient(Collection<RgzakEntity> rgzaksByIdklient) {
//        this.rgzaksByIdklient = rgzaksByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgzakpost")
//    public Collection<RgzakpostEntity> getRgzakpostsByIdklient() {
//        return rgzakpostsByIdklient;
//    }
//
//    public void setRgzakpostsByIdklient(Collection<RgzakpostEntity> rgzakpostsByIdklient) {
//        this.rgzakpostsByIdklient = rgzakpostsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostRgzakpostDv")
//    public Collection<RgzakpostDvEntity> getRgzakpostDvsByIdklient() {
//        return rgzakpostDvsByIdklient;
//    }
//
//    public void setRgzakpostDvsByIdklient(Collection<RgzakpostDvEntity> rgzakpostDvsByIdklient) {
//        this.rgzakpostDvsByIdklient = rgzakpostDvsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSdiscountCard")
//    public Collection<SdiscountCardEntity> getSdiscountCardsByIdklient() {
//        return sdiscountCardsByIdklient;
//    }
//
//    public void setSdiscountCardsByIdklient(Collection<SdiscountCardEntity> sdiscountCardsByIdklient) {
//        this.sdiscountCardsByIdklient = sdiscountCardsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSdocklient")
//    public Collection<SdocklientEntity> getSdocklientsByIdklient() {
//        return sdocklientsByIdklient;
//    }
//
//    public void setSdocklientsByIdklient(Collection<SdocklientEntity> sdocklientsByIdklient) {
//        this.sdocklientsByIdklient = sdocklientsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSdog")
//    public Collection<SdogEntity> getSdogsByIdklient() {
//        return sdogsByIdklient;
//    }
//
//    public void setSdogsByIdklient(Collection<SdogEntity> sdogsByIdklient) {
//        this.sdogsByIdklient = sdogsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSimported")
//    public Collection<SimportedEntity> getSimportedsByIdklient() {
//        return simportedsByIdklient;
//    }
//
//    public void setSimportedsByIdklient(Collection<SimportedEntity> simportedsByIdklient) {
//        this.simportedsByIdklient = simportedsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSimportnom")
//    public Collection<SimportnomEntity> getSimportnomsByIdklient() {
//        return simportnomsByIdklient;
//    }
//
//    public void setSimportnomsByIdklient(Collection<SimportnomEntity> simportnomsByIdklient) {
//        this.simportnomsByIdklient = simportnomsByIdklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDTPRICEKLIENT", referencedColumnName = "ID_TPRICE")
//    public StpriceEntity getStpriceByIdtpriceklient() {
//        return stpriceByIdtpriceklient;
//    }
//
//    public void setStpriceByIdtpriceklient(StpriceEntity stpriceByIdtpriceklient) {
//        this.stpriceByIdtpriceklient = stpriceByIdtpriceklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDGRPKLIENT", referencedColumnName = "IDGRPKL")
//    public SgrpklEntity getSgrpklByIdgrpklient() {
//        return sgrpklByIdgrpklient;
//    }
//
//    public void setSgrpklByIdgrpklient(SgrpklEntity sgrpklByIdgrpklient) {
//        this.sgrpklByIdgrpklient = sgrpklByIdgrpklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDVIDKLIENT", referencedColumnName = "ID_SVIDKLIENT")
//    public SvidklientEntity getSvidklientByIdvidklient() {
//        return svidklientByIdvidklient;
//    }
//
//    public void setSvidklientByIdvidklient(SvidklientEntity svidklientByIdvidklient) {
//        this.svidklientByIdvidklient = svidklientByIdvidklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDCOUNTRYKLIENT", referencedColumnName = "ID_SCOUNTRY")
//    public ScountryEntity getScountryByIdcountryklient() {
//        return scountryByIdcountryklient;
//    }
//
//    public void setScountryByIdcountryklient(ScountryEntity scountryByIdcountryklient) {
//        this.scountryByIdcountryklient = scountryByIdcountryklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDGRPNOM_SKLIENT", referencedColumnName = "IDGN")
//    public SgrpnomEntity getSgrpnomByIdgrpnomSklient() {
//        return sgrpnomByIdgrpnomSklient;
//    }
//
//    public void setSgrpnomByIdgrpnomSklient(SgrpnomEntity sgrpnomByIdgrpnomSklient) {
//        this.sgrpnomByIdgrpnomSklient = sgrpnomByIdgrpnomSklient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDGRPHW_SKLIENT", referencedColumnName = "ID_REM_SGRP_HARDWARE")
//    public RemSgrpHardwareEntity getRemSgrpHardwareByIdgrphwSklient() {
//        return remSgrpHardwareByIdgrphwSklient;
//    }
//
//    public void setRemSgrpHardwareByIdgrphwSklient(RemSgrpHardwareEntity remSgrpHardwareByIdgrphwSklient) {
//        this.remSgrpHardwareByIdgrphwSklient = remSgrpHardwareByIdgrphwSklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSklientDopfisl")
//    public Collection<SklientDopfislEntity> getSklientDopfislsByIdklient() {
//        return sklientDopfislsByIdklient;
//    }
//
//    public void setSklientDopfislsByIdklient(Collection<SklientDopfislEntity> sklientDopfislsByIdklient) {
//        this.sklientDopfislsByIdklient = sklientDopfislsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSklientDopurl")
//    public Collection<SklientDopurlEntity> getSklientDopurlsByIdklient() {
//        return sklientDopurlsByIdklient;
//    }
//
//    public void setSklientDopurlsByIdklient(Collection<SklientDopurlEntity> sklientDopurlsByIdklient) {
//        this.sklientDopurlsByIdklient = sklientDopurlsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdsupplierSnom")
//    public Collection<SnomEntity> getSnomsByIdklient() {
//        return snomsByIdklient;
//    }
//
//    public void setSnomsByIdklient(Collection<SnomEntity> snomsByIdklient) {
//        this.snomsByIdklient = snomsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdproducerSnom")
//    public Collection<SnomEntity> getSnomsByIdklient_0() {
//        return snomsByIdklient_0;
//    }
//
//    public void setSnomsByIdklient_0(Collection<SnomEntity> snomsByIdklient_0) {
//        this.snomsByIdklient_0 = snomsByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientNumtel")
//    public Collection<SnumtelEntity> getSnumtelsByIdklient() {
//        return snumtelsByIdklient;
//    }
//
//    public void setSnumtelsByIdklient(Collection<SnumtelEntity> snumtelsByIdklient) {
//        this.snumtelsByIdklient = snumtelsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklpart")
//    public Collection<SpartEntity> getSpartsByIdklient() {
//        return spartsByIdklient;
//    }
//
//    public void setSpartsByIdklient(Collection<SpartEntity> spartsByIdklient) {
//        this.spartsByIdklient = spartsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSproducer")
//    public Collection<SproducerEntity> getSproducersByIdklient() {
//        return sproducersByIdklient;
//    }
//
//    public void setSproducersByIdklient(Collection<SproducerEntity> sproducersByIdklient) {
//        this.sproducersByIdklient = sproducersByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdpostZipSproducer")
//    public Collection<SproducerEntity> getSproducersByIdklient_0() {
//        return sproducersByIdklient_0;
//    }
//
//    public void setSproducersByIdklient_0(Collection<SproducerEntity> sproducersByIdklient_0) {
//        this.sproducersByIdklient_0 = sproducersByIdklient_0;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklrschet")
//    public Collection<SrschetEntity> getSrschetsByIdklient() {
//        return srschetsByIdklient;
//    }
//
//    public void setSrschetsByIdklient(Collection<SrschetEntity> srschetsByIdklient) {
//        this.srschetsByIdklient = srschetsByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientSseller")
//    public Collection<SsellerEntity> getSsellersByIdklient() {
//        return ssellersByIdklient;
//    }
//
//    public void setSsellersByIdklient(Collection<SsellerEntity> ssellersByIdklient) {
//        this.ssellersByIdklient = ssellersByIdklient;
//    }
//
//    @OneToMany(mappedBy = "sklientByIdklientZpGalldoc")
//    public Collection<ZpGalldocEntity> getZpGalldocsByIdklient() {
//        return zpGalldocsByIdklient;
//    }
//
//    public void setZpGalldocsByIdklient(Collection<ZpGalldocEntity> zpGalldocsByIdklient) {
//        this.zpGalldocsByIdklient = zpGalldocsByIdklient;
//    }
}
