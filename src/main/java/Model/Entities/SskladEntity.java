package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "SSKLAD", schema = "", catalog = "")
public class SskladEntity {
    private long idsklad;
    private String namesklad;
    private String molsklad;
    private String adrsklad;
    private Short tsklad;
    private String gidSsklad;
    private Long idbaseSsklad;
    private Long idextDoutSsklad;
    private Long idextBaseSsklad;
    private Short dbluchetallnomSsklad;
    private Short dbluchetSsklad;
    private Short typeTblSsklad;
    private String prefiksNumSsklad;
    private String phoneSsklad;
    private String emailSsklad;
    private String vkontakteSsklad;
    private String websiteSsklad;
    private String dopinfoSsklad;
    private String regimRabotiSsklad;

    @Id
    @Column(name = "IDSKLAD", nullable = false)
    public long getIdsklad() {
        return idsklad;
    }

    public void setIdsklad(long idsklad) {
        this.idsklad = idsklad;
    }

    @Basic
    @Column(name = "NAMESKLAD", nullable = true, length = 200)
    public String getNamesklad() {
        return namesklad;
    }

    public void setNamesklad(String namesklad) {
        this.namesklad = namesklad;
    }

    @Basic
    @Column(name = "MOLSKLAD", nullable = true, length = 20)
    public String getMolsklad() {
        return molsklad;
    }

    public void setMolsklad(String molsklad) {
        this.molsklad = molsklad;
    }

    @Basic
    @Column(name = "ADRSKLAD", nullable = true, length = 200)
    public String getAdrsklad() {
        return adrsklad;
    }

    public void setAdrsklad(String adrsklad) {
        this.adrsklad = adrsklad;
    }

    @Basic
    @Column(name = "TSKLAD", nullable = true)
    public Short getTsklad() {
        return tsklad;
    }

    public void setTsklad(Short tsklad) {
        this.tsklad = tsklad;
    }

    @Basic
    @Column(name = "GID_SSKLAD", nullable = true, length = 10)
    public String getGidSsklad() {
        return gidSsklad;
    }

    public void setGidSsklad(String gidSsklad) {
        this.gidSsklad = gidSsklad;
    }

    @Basic
    @Column(name = "IDBASE_SSKLAD", nullable = true)
    public Long getIdbaseSsklad() {
        return idbaseSsklad;
    }

    public void setIdbaseSsklad(Long idbaseSsklad) {
        this.idbaseSsklad = idbaseSsklad;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_SSKLAD", nullable = true)
    public Long getIdextDoutSsklad() {
        return idextDoutSsklad;
    }

    public void setIdextDoutSsklad(Long idextDoutSsklad) {
        this.idextDoutSsklad = idextDoutSsklad;
    }

    @Basic
    @Column(name = "IDEXT_BASE_SSKLAD", nullable = true)
    public Long getIdextBaseSsklad() {
        return idextBaseSsklad;
    }

    public void setIdextBaseSsklad(Long idextBaseSsklad) {
        this.idextBaseSsklad = idextBaseSsklad;
    }

    @Basic
    @Column(name = "DBLUCHETALLNOM_SSKLAD", nullable = true)
    public Short getDbluchetallnomSsklad() {
        return dbluchetallnomSsklad;
    }

    public void setDbluchetallnomSsklad(Short dbluchetallnomSsklad) {
        this.dbluchetallnomSsklad = dbluchetallnomSsklad;
    }

    @Basic
    @Column(name = "DBLUCHET_SSKLAD", nullable = true)
    public Short getDbluchetSsklad() {
        return dbluchetSsklad;
    }

    public void setDbluchetSsklad(Short dbluchetSsklad) {
        this.dbluchetSsklad = dbluchetSsklad;
    }

    @Basic
    @Column(name = "TYPE_TBL_SSKLAD", nullable = true)
    public Short getTypeTblSsklad() {
        return typeTblSsklad;
    }

    public void setTypeTblSsklad(Short typeTblSsklad) {
        this.typeTblSsklad = typeTblSsklad;
    }

    @Basic
    @Column(name = "PREFIKS_NUM_SSKLAD", nullable = true, length = 3)
    public String getPrefiksNumSsklad() {
        return prefiksNumSsklad;
    }

    public void setPrefiksNumSsklad(String prefiksNumSsklad) {
        this.prefiksNumSsklad = prefiksNumSsklad;
    }

    @Basic
    @Column(name = "PHONE_SSKLAD", nullable = true, length = 200)
    public String getPhoneSsklad() {
        return phoneSsklad;
    }

    public void setPhoneSsklad(String phoneSsklad) {
        this.phoneSsklad = phoneSsklad;
    }

    @Basic
    @Column(name = "EMAIL_SSKLAD", nullable = true, length = 200)
    public String getEmailSsklad() {
        return emailSsklad;
    }

    public void setEmailSsklad(String emailSsklad) {
        this.emailSsklad = emailSsklad;
    }

    @Basic
    @Column(name = "VKONTAKTE_SSKLAD", nullable = true, length = 50)
    public String getVkontakteSsklad() {
        return vkontakteSsklad;
    }

    public void setVkontakteSsklad(String vkontakteSsklad) {
        this.vkontakteSsklad = vkontakteSsklad;
    }

    @Basic
    @Column(name = "WEBSITE_SSKLAD", nullable = true, length = 50)
    public String getWebsiteSsklad() {
        return websiteSsklad;
    }

    public void setWebsiteSsklad(String websiteSsklad) {
        this.websiteSsklad = websiteSsklad;
    }

    @Basic
    @Column(name = "DOPINFO_SSKLAD", nullable = true, length = 250)
    public String getDopinfoSsklad() {
        return dopinfoSsklad;
    }

    public void setDopinfoSsklad(String dopinfoSsklad) {
        this.dopinfoSsklad = dopinfoSsklad;
    }

    @Basic
    @Column(name = "REGIM_RABOTI_SSKLAD", nullable = true, length = 250)
    public String getRegimRabotiSsklad() {
        return regimRabotiSsklad;
    }

    public void setRegimRabotiSsklad(String regimRabotiSsklad) {
        this.regimRabotiSsklad = regimRabotiSsklad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SskladEntity entity = (SskladEntity) o;

        if (idsklad != entity.idsklad) return false;
        if (namesklad != null ? !namesklad.equals(entity.namesklad) : entity.namesklad != null) return false;
        if (molsklad != null ? !molsklad.equals(entity.molsklad) : entity.molsklad != null) return false;
        if (adrsklad != null ? !adrsklad.equals(entity.adrsklad) : entity.adrsklad != null) return false;
        if (tsklad != null ? !tsklad.equals(entity.tsklad) : entity.tsklad != null) return false;
        if (gidSsklad != null ? !gidSsklad.equals(entity.gidSsklad) : entity.gidSsklad != null) return false;
        if (idbaseSsklad != null ? !idbaseSsklad.equals(entity.idbaseSsklad) : entity.idbaseSsklad != null)
            return false;
        if (idextDoutSsklad != null ? !idextDoutSsklad.equals(entity.idextDoutSsklad) : entity.idextDoutSsklad != null)
            return false;
        if (idextBaseSsklad != null ? !idextBaseSsklad.equals(entity.idextBaseSsklad) : entity.idextBaseSsklad != null)
            return false;
        if (dbluchetallnomSsklad != null ? !dbluchetallnomSsklad.equals(entity.dbluchetallnomSsklad) : entity.dbluchetallnomSsklad != null)
            return false;
        if (dbluchetSsklad != null ? !dbluchetSsklad.equals(entity.dbluchetSsklad) : entity.dbluchetSsklad != null)
            return false;
        if (typeTblSsklad != null ? !typeTblSsklad.equals(entity.typeTblSsklad) : entity.typeTblSsklad != null)
            return false;
        if (prefiksNumSsklad != null ? !prefiksNumSsklad.equals(entity.prefiksNumSsklad) : entity.prefiksNumSsklad != null)
            return false;
        if (phoneSsklad != null ? !phoneSsklad.equals(entity.phoneSsklad) : entity.phoneSsklad != null) return false;
        if (emailSsklad != null ? !emailSsklad.equals(entity.emailSsklad) : entity.emailSsklad != null) return false;
        if (vkontakteSsklad != null ? !vkontakteSsklad.equals(entity.vkontakteSsklad) : entity.vkontakteSsklad != null)
            return false;
        if (websiteSsklad != null ? !websiteSsklad.equals(entity.websiteSsklad) : entity.websiteSsklad != null)
            return false;
        if (dopinfoSsklad != null ? !dopinfoSsklad.equals(entity.dopinfoSsklad) : entity.dopinfoSsklad != null)
            return false;
        if (regimRabotiSsklad != null ? !regimRabotiSsklad.equals(entity.regimRabotiSsklad) : entity.regimRabotiSsklad != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idsklad ^ (idsklad >>> 32));
        result = 31 * result + (namesklad != null ? namesklad.hashCode() : 0);
        result = 31 * result + (molsklad != null ? molsklad.hashCode() : 0);
        result = 31 * result + (adrsklad != null ? adrsklad.hashCode() : 0);
        result = 31 * result + (tsklad != null ? tsklad.hashCode() : 0);
        result = 31 * result + (gidSsklad != null ? gidSsklad.hashCode() : 0);
        result = 31 * result + (idbaseSsklad != null ? idbaseSsklad.hashCode() : 0);
        result = 31 * result + (idextDoutSsklad != null ? idextDoutSsklad.hashCode() : 0);
        result = 31 * result + (idextBaseSsklad != null ? idextBaseSsklad.hashCode() : 0);
        result = 31 * result + (dbluchetallnomSsklad != null ? dbluchetallnomSsklad.hashCode() : 0);
        result = 31 * result + (dbluchetSsklad != null ? dbluchetSsklad.hashCode() : 0);
        result = 31 * result + (typeTblSsklad != null ? typeTblSsklad.hashCode() : 0);
        result = 31 * result + (prefiksNumSsklad != null ? prefiksNumSsklad.hashCode() : 0);
        result = 31 * result + (phoneSsklad != null ? phoneSsklad.hashCode() : 0);
        result = 31 * result + (emailSsklad != null ? emailSsklad.hashCode() : 0);
        result = 31 * result + (vkontakteSsklad != null ? vkontakteSsklad.hashCode() : 0);
        result = 31 * result + (websiteSsklad != null ? websiteSsklad.hashCode() : 0);
        result = 31 * result + (dopinfoSsklad != null ? dopinfoSsklad.hashCode() : 0);
        result = 31 * result + (regimRabotiSsklad != null ? regimRabotiSsklad.hashCode() : 0);
        return result;
    }

//    private Collection<entety.DperEntity> dpersByIdsklad;
//
//    public Collection<entety.DperEntity> getDpersByIdsklad() {
//        return dpersByIdsklad;
//    }
//
//    public void setDpersByIdsklad(Collection<entety.DperEntity> dpersByIdsklad) {
//        this.dpersByIdsklad = dpersByIdsklad;
//    }
//
//    private Collection<entety.DrgGoodstEntity> drgGoodstsByIdsklad;
//
//    public Collection<entety.DrgGoodstEntity> getDrgGoodstsByIdsklad() {
//        return drgGoodstsByIdsklad;
//    }
//
//    public void setDrgGoodstsByIdsklad(Collection<entety.DrgGoodstEntity> drgGoodstsByIdsklad) {
//        this.drgGoodstsByIdsklad = drgGoodstsByIdsklad;
//    }
//
//    private Collection<entety.DrgOstnomtEntity> drgOstnomtsByIdsklad;
//
//    public Collection<entety.DrgOstnomtEntity> getDrgOstnomtsByIdsklad() {
//        return drgOstnomtsByIdsklad;
//    }
//
//    public void setDrgOstnomtsByIdsklad(Collection<entety.DrgOstnomtEntity> drgOstnomtsByIdsklad) {
//        this.drgOstnomtsByIdsklad = drgOstnomtsByIdsklad;
//    }
//
//    private Collection<entety.DrgOtchposttEntity> drgOtchposttsByIdsklad;
//
//    public Collection<entety.DrgOtchposttEntity> getDrgOtchposttsByIdsklad() {
//        return drgOtchposttsByIdsklad;
//    }
//
//    public void setDrgOtchposttsByIdsklad(Collection<entety.DrgOtchposttEntity> drgOtchposttsByIdsklad) {
//        this.drgOtchposttsByIdsklad = drgOtchposttsByIdsklad;
//    }
//
//    private Collection<entety.GalldocEntity> galldocsByIdsklad;
//
//    public Collection<entety.GalldocEntity> getGalldocsByIdsklad() {
//        return galldocsByIdsklad;
//    }
//
//    public void setGalldocsByIdsklad(Collection<entety.GalldocEntity> galldocsByIdsklad) {
//        this.galldocsByIdsklad = galldocsByIdsklad;
//    }
//
//    private Collection<entety.GuroperDcardEntity> guroperDcardsByIdsklad;
//
//    public Collection<entety.GuroperDcardEntity> getGuroperDcardsByIdsklad() {
//        return guroperDcardsByIdsklad;
//    }
//
//    public void setGuroperDcardsByIdsklad(Collection<entety.GuroperDcardEntity> guroperDcardsByIdsklad) {
//        this.guroperDcardsByIdsklad = guroperDcardsByIdsklad;
//    }
//
//    private Collection<entety.HotGalldocEntity> hotGalldocsByIdsklad;
//
//    public Collection<entety.HotGalldocEntity> getHotGalldocsByIdsklad() {
//        return hotGalldocsByIdsklad;
//    }
//
//    public void setHotGalldocsByIdsklad(Collection<entety.HotGalldocEntity> hotGalldocsByIdsklad) {
//        this.hotGalldocsByIdsklad = hotGalldocsByIdsklad;
//    }
//
//    private Collection<entety.HotSobjectEntity> hotSobjectsByIdsklad;
//
//    public Collection<entety.HotSobjectEntity> getHotSobjectsByIdsklad() {
//        return hotSobjectsByIdsklad;
//    }
//
//    public void setHotSobjectsByIdsklad(Collection<entety.HotSobjectEntity> hotSobjectsByIdsklad) {
//        this.hotSobjectsByIdsklad = hotSobjectsByIdsklad;
//    }
//
//    private Collection<entety.RemCqueryEntity> remCqueriesByIdsklad;
//
//    public Collection<entety.RemCqueryEntity> getRemCqueriesByIdsklad() {
//        return remCqueriesByIdsklad;
//    }
//
//    public void setRemCqueriesByIdsklad(Collection<entety.RemCqueryEntity> remCqueriesByIdsklad) {
//        this.remCqueriesByIdsklad = remCqueriesByIdsklad;
//    }
//
//    private Collection<entety.RemDperEntity> remDpersByIdsklad;
//
//    public Collection<entety.RemDperEntity> getRemDpersByIdsklad() {
//        return remDpersByIdsklad;
//    }
//
//    public void setRemDpersByIdsklad(Collection<entety.RemDperEntity> remDpersByIdsklad) {
//        this.remDpersByIdsklad = remDpersByIdsklad;
//    }
//
//    private Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdsklad;
//
//    public Collection<entety.RemDrgOtchposttEntity> getRemDrgOtchposttsByIdsklad() {
//        return remDrgOtchposttsByIdsklad;
//    }
//
//    public void setRemDrgOtchposttsByIdsklad(Collection<entety.RemDrgOtchposttEntity> remDrgOtchposttsByIdsklad) {
//        this.remDrgOtchposttsByIdsklad = remDrgOtchposttsByIdsklad;
//    }
//
//    private Collection<entety.RemDvzperEntity> remDvzpersByIdsklad;
//
//    public Collection<entety.RemDvzperEntity> getRemDvzpersByIdsklad() {
//        return remDvzpersByIdsklad;
//    }
//
//    public void setRemDvzpersByIdsklad(Collection<entety.RemDvzperEntity> remDvzpersByIdsklad) {
//        this.remDvzpersByIdsklad = remDvzpersByIdsklad;
//    }
//
//    private Collection<entety.RemDzperEntity> remDzpersByIdsklad;
//
//    public Collection<entety.RemDzperEntity> getRemDzpersByIdsklad() {
//        return remDzpersByIdsklad;
//    }
//
//    public void setRemDzpersByIdsklad(Collection<entety.RemDzperEntity> remDzpersByIdsklad) {
//        this.remDzpersByIdsklad = remDzpersByIdsklad;
//    }
//
//    private Collection<entety.RemGalldocEntity> remGalldocsByIdsklad;
//
//    public Collection<entety.RemGalldocEntity> getRemGalldocsByIdsklad() {
//        return remGalldocsByIdsklad;
//    }
//
//    public void setRemGalldocsByIdsklad(Collection<entety.RemGalldocEntity> remGalldocsByIdsklad) {
//        this.remGalldocsByIdsklad = remGalldocsByIdsklad;
//    }
//
//    private Collection<entety.RemRggoodsEntity> remRggoodsByIdsklad;
//
//    public Collection<entety.RemRggoodsEntity> getRemRggoodsByIdsklad() {
//        return remRggoodsByIdsklad;
//    }
//
//    public void setRemRggoodsByIdsklad(Collection<entety.RemRggoodsEntity> remRggoodsByIdsklad) {
//        this.remRggoodsByIdsklad = remRggoodsByIdsklad;
//    }
//
//    private Collection<entety.RemRggoodsDvEntity> remRggoodsDvsByIdsklad;
//
//    public Collection<entety.RemRggoodsDvEntity> getRemRggoodsDvsByIdsklad() {
//        return remRggoodsDvsByIdsklad;
//    }
//
//    public void setRemRggoodsDvsByIdsklad(Collection<entety.RemRggoodsDvEntity> remRggoodsDvsByIdsklad) {
//        this.remRggoodsDvsByIdsklad = remRggoodsDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgosthwEntity> remRgosthwsByIdsklad;
//
//    public Collection<entety.RemRgosthwEntity> getRemRgosthwsByIdsklad() {
//        return remRgosthwsByIdsklad;
//    }
//
//    public void setRemRgosthwsByIdsklad(Collection<entety.RemRgosthwEntity> remRgosthwsByIdsklad) {
//        this.remRgosthwsByIdsklad = remRgosthwsByIdsklad;
//    }
//
//    private Collection<entety.RemRgosthwDvEntity> remRgosthwDvsByIdsklad;
//
//    public Collection<entety.RemRgosthwDvEntity> getRemRgosthwDvsByIdsklad() {
//        return remRgosthwDvsByIdsklad;
//    }
//
//    public void setRemRgosthwDvsByIdsklad(Collection<entety.RemRgosthwDvEntity> remRgosthwDvsByIdsklad) {
//        this.remRgosthwDvsByIdsklad = remRgosthwDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgostzEntity> remRgostzsByIdsklad;
//
//    public Collection<entety.RemRgostzEntity> getRemRgostzsByIdsklad() {
//        return remRgostzsByIdsklad;
//    }
//
//    public void setRemRgostzsByIdsklad(Collection<entety.RemRgostzEntity> remRgostzsByIdsklad) {
//        this.remRgostzsByIdsklad = remRgostzsByIdsklad;
//    }
//
//    private Collection<entety.RemRgostzDvEntity> remRgostzDvsByIdsklad;
//
//    public Collection<entety.RemRgostzDvEntity> getRemRgostzDvsByIdsklad() {
//        return remRgostzDvsByIdsklad;
//    }
//
//    public void setRemRgostzDvsByIdsklad(Collection<entety.RemRgostzDvEntity> remRgostzDvsByIdsklad) {
//        this.remRgostzDvsByIdsklad = remRgostzDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgotchpostEntity> remRgotchpostsByIdsklad;
//
//    public Collection<entety.RemRgotchpostEntity> getRemRgotchpostsByIdsklad() {
//        return remRgotchpostsByIdsklad;
//    }
//
//    public void setRemRgotchpostsByIdsklad(Collection<entety.RemRgotchpostEntity> remRgotchpostsByIdsklad) {
//        this.remRgotchpostsByIdsklad = remRgotchpostsByIdsklad;
//    }
//
//    private Collection<entety.RemRgotchpostDvEntity> remRgotchpostDvsByIdsklad;
//
//    public Collection<entety.RemRgotchpostDvEntity> getRemRgotchpostDvsByIdsklad() {
//        return remRgotchpostDvsByIdsklad;
//    }
//
//    public void setRemRgotchpostDvsByIdsklad(Collection<entety.RemRgotchpostDvEntity> remRgotchpostDvsByIdsklad) {
//        this.remRgotchpostDvsByIdsklad = remRgotchpostDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgotprzEntity> remRgotprzsByIdsklad;
//
//    public Collection<entety.RemRgotprzEntity> getRemRgotprzsByIdsklad() {
//        return remRgotprzsByIdsklad;
//    }
//
//    public void setRemRgotprzsByIdsklad(Collection<entety.RemRgotprzEntity> remRgotprzsByIdsklad) {
//        this.remRgotprzsByIdsklad = remRgotprzsByIdsklad;
//    }
//
//    private Collection<entety.RemRgotprzEntity> remRgotprzsByIdsklad_0;
//
//    public Collection<entety.RemRgotprzEntity> getRemRgotprzsByIdsklad_0() {
//        return remRgotprzsByIdsklad_0;
//    }
//
//    public void setRemRgotprzsByIdsklad_0(Collection<entety.RemRgotprzEntity> remRgotprzsByIdsklad_0) {
//        this.remRgotprzsByIdsklad_0 = remRgotprzsByIdsklad_0;
//    }
//
//    private Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdsklad;
//
//    public Collection<entety.RemRgotprzDvEntity> getRemRgotprzDvsByIdsklad() {
//        return remRgotprzDvsByIdsklad;
//    }
//
//    public void setRemRgotprzDvsByIdsklad(Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdsklad) {
//        this.remRgotprzDvsByIdsklad = remRgotprzDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdsklad_0;
//
//    public Collection<entety.RemRgotprzDvEntity> getRemRgotprzDvsByIdsklad_0() {
//        return remRgotprzDvsByIdsklad_0;
//    }
//
//    public void setRemRgotprzDvsByIdsklad_0(Collection<entety.RemRgotprzDvEntity> remRgotprzDvsByIdsklad_0) {
//        this.remRgotprzDvsByIdsklad_0 = remRgotprzDvsByIdsklad_0;
//    }
//
//    private Collection<entety.RemRgsosthwEntity> remRgsosthwsByIdsklad;
//
//    public Collection<entety.RemRgsosthwEntity> getRemRgsosthwsByIdsklad() {
//        return remRgsosthwsByIdsklad;
//    }
//
//    public void setRemRgsosthwsByIdsklad(Collection<entety.RemRgsosthwEntity> remRgsosthwsByIdsklad) {
//        this.remRgsosthwsByIdsklad = remRgsosthwsByIdsklad;
//    }
//
//    private Collection<entety.RemRgsosthwDvEntity> remRgsosthwDvsByIdsklad;
//
//    public Collection<entety.RemRgsosthwDvEntity> getRemRgsosthwDvsByIdsklad() {
//        return remRgsosthwDvsByIdsklad;
//    }
//
//    public void setRemRgsosthwDvsByIdsklad(Collection<entety.RemRgsosthwDvEntity> remRgsosthwDvsByIdsklad) {
//        this.remRgsosthwDvsByIdsklad = remRgsosthwDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgvzostEntity> remRgvzostsByIdsklad;
//
//    public Collection<entety.RemRgvzostEntity> getRemRgvzostsByIdsklad() {
//        return remRgvzostsByIdsklad;
//    }
//
//    public void setRemRgvzostsByIdsklad(Collection<entety.RemRgvzostEntity> remRgvzostsByIdsklad) {
//        this.remRgvzostsByIdsklad = remRgvzostsByIdsklad;
//    }
//
//    private Collection<entety.RemRgvzostDvEntity> remRgvzostDvsByIdsklad;
//
//    public Collection<entety.RemRgvzostDvEntity> getRemRgvzostDvsByIdsklad() {
//        return remRgvzostDvsByIdsklad;
//    }
//
//    public void setRemRgvzostDvsByIdsklad(Collection<entety.RemRgvzostDvEntity> remRgvzostDvsByIdsklad) {
//        this.remRgvzostDvsByIdsklad = remRgvzostDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgvzvputiEntity> remRgvzvputisByIdsklad;
//
//    public Collection<entety.RemRgvzvputiEntity> getRemRgvzvputisByIdsklad() {
//        return remRgvzvputisByIdsklad;
//    }
//
//    public void setRemRgvzvputisByIdsklad(Collection<entety.RemRgvzvputiEntity> remRgvzvputisByIdsklad) {
//        this.remRgvzvputisByIdsklad = remRgvzvputisByIdsklad;
//    }
//
//    private Collection<entety.RemRgvzvputiEntity> remRgvzvputisByIdsklad_0;
//
//    public Collection<entety.RemRgvzvputiEntity> getRemRgvzvputisByIdsklad_0() {
//        return remRgvzvputisByIdsklad_0;
//    }
//
//    public void setRemRgvzvputisByIdsklad_0(Collection<entety.RemRgvzvputiEntity> remRgvzvputisByIdsklad_0) {
//        this.remRgvzvputisByIdsklad_0 = remRgvzvputisByIdsklad_0;
//    }
//
//    private Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdsklad;
//
//    public Collection<entety.RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdsklad() {
//        return remRgvzvputiDvsByIdsklad;
//    }
//
//    public void setRemRgvzvputiDvsByIdsklad(Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdsklad) {
//        this.remRgvzvputiDvsByIdsklad = remRgvzvputiDvsByIdsklad;
//    }
//
//    private Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdsklad_0;
//
//    public Collection<entety.RemRgvzvputiDvEntity> getRemRgvzvputiDvsByIdsklad_0() {
//        return remRgvzvputiDvsByIdsklad_0;
//    }
//
//    public void setRemRgvzvputiDvsByIdsklad_0(Collection<entety.RemRgvzvputiDvEntity> remRgvzvputiDvsByIdsklad_0) {
//        this.remRgvzvputiDvsByIdsklad_0 = remRgvzvputiDvsByIdsklad_0;
//    }
//
//    private Collection<entety.RemZEntity> remZSByIdsklad;
//
//    public Collection<entety.RemZEntity> getRemZSByIdsklad() {
//        return remZSByIdsklad;
//    }
//
//    public void setRemZSByIdsklad(Collection<entety.RemZEntity> remZSByIdsklad) {
//        this.remZSByIdsklad = remZSByIdsklad;
//    }
//
//    private Collection<entety.RemZEntity> remZSByIdsklad_0;
//
//    public Collection<entety.RemZEntity> getRemZSByIdsklad_0() {
//        return remZSByIdsklad_0;
//    }
//
//    public void setRemZSByIdsklad_0(Collection<entety.RemZEntity> remZSByIdsklad_0) {
//        this.remZSByIdsklad_0 = remZSByIdsklad_0;
//    }
//
//    private Collection<entety.RemZDvEntity> remZDvsByIdsklad;
//
//    public Collection<entety.RemZDvEntity> getRemZDvsByIdsklad() {
//        return remZDvsByIdsklad;
//    }
//
//    public void setRemZDvsByIdsklad(Collection<entety.RemZDvEntity> remZDvsByIdsklad) {
//        this.remZDvsByIdsklad = remZDvsByIdsklad;
//    }
//
//    private Collection<entety.RggoodsEntity> rggoodsByIdsklad;
//
//    public Collection<entety.RggoodsEntity> getRggoodsByIdsklad() {
//        return rggoodsByIdsklad;
//    }
//
//    public void setRggoodsByIdsklad(Collection<entety.RggoodsEntity> rggoodsByIdsklad) {
//        this.rggoodsByIdsklad = rggoodsByIdsklad;
//    }
//
//    private Collection<entety.RggoodsDvEntity> rggoodsDvsByIdsklad;
//
//    public Collection<entety.RggoodsDvEntity> getRggoodsDvsByIdsklad() {
//        return rggoodsDvsByIdsklad;
//    }
//
//    public void setRggoodsDvsByIdsklad(Collection<entety.RggoodsDvEntity> rggoodsDvsByIdsklad) {
//        this.rggoodsDvsByIdsklad = rggoodsDvsByIdsklad;
//    }
//
//    private Collection<entety.RgostnomEntity> rgostnomsByIdsklad;
//
//    public Collection<entety.RgostnomEntity> getRgostnomsByIdsklad() {
//        return rgostnomsByIdsklad;
//    }
//
//    public void setRgostnomsByIdsklad(Collection<entety.RgostnomEntity> rgostnomsByIdsklad) {
//        this.rgostnomsByIdsklad = rgostnomsByIdsklad;
//    }
//
//    private Collection<entety.RgostnomDvEntity> rgostnomDvsByIdsklad;
//
//    public Collection<entety.RgostnomDvEntity> getRgostnomDvsByIdsklad() {
//        return rgostnomDvsByIdsklad;
//    }
//
//    public void setRgostnomDvsByIdsklad(Collection<entety.RgostnomDvEntity> rgostnomDvsByIdsklad) {
//        this.rgostnomDvsByIdsklad = rgostnomDvsByIdsklad;
//    }
//
//    private Collection<entety.RgotchpostEntity> rgotchpostsByIdsklad;
//
//    public Collection<entety.RgotchpostEntity> getRgotchpostsByIdsklad() {
//        return rgotchpostsByIdsklad;
//    }
//
//    public void setRgotchpostsByIdsklad(Collection<entety.RgotchpostEntity> rgotchpostsByIdsklad) {
//        this.rgotchpostsByIdsklad = rgotchpostsByIdsklad;
//    }
//
//    private Collection<entety.RgotchpostDvEntity> rgotchpostDvsByIdsklad;
//
//    public Collection<entety.RgotchpostDvEntity> getRgotchpostDvsByIdsklad() {
//        return rgotchpostDvsByIdsklad;
//    }
//
//    public void setRgotchpostDvsByIdsklad(Collection<entety.RgotchpostDvEntity> rgotchpostDvsByIdsklad) {
//        this.rgotchpostDvsByIdsklad = rgotchpostDvsByIdsklad;
//    }
//
//    private Collection<entety.RgotprpostEntity> rgotprpostsByIdsklad;
//
//    public Collection<entety.RgotprpostEntity> getRgotprpostsByIdsklad() {
//        return rgotprpostsByIdsklad;
//    }
//
//    public void setRgotprpostsByIdsklad(Collection<entety.RgotprpostEntity> rgotprpostsByIdsklad) {
//        this.rgotprpostsByIdsklad = rgotprpostsByIdsklad;
//    }
//
//    private Collection<entety.RgotprpostDvEntity> rgotprpostDvsByIdsklad;
//
//    public Collection<entety.RgotprpostDvEntity> getRgotprpostDvsByIdsklad() {
//        return rgotprpostDvsByIdsklad;
//    }
//
//    public void setRgotprpostDvsByIdsklad(Collection<entety.RgotprpostDvEntity> rgotprpostDvsByIdsklad) {
//        this.rgotprpostDvsByIdsklad = rgotprpostDvsByIdsklad;
//    }
//
//    private Collection<entety.RgotrspisDvEntity> rgotrspisDvsByIdsklad;
//
//    public Collection<entety.RgotrspisDvEntity> getRgotrspisDvsByIdsklad() {
//        return rgotrspisDvsByIdsklad;
//    }
//
//    public void setRgotrspisDvsByIdsklad(Collection<entety.RgotrspisDvEntity> rgotrspisDvsByIdsklad) {
//        this.rgotrspisDvsByIdsklad = rgotrspisDvsByIdsklad;
//    }
//
//    private Collection<entety.RgrealDvEntity> rgrealDvsByIdsklad;
//
//    public Collection<entety.RgrealDvEntity> getRgrealDvsByIdsklad() {
//        return rgrealDvsByIdsklad;
//    }
//
//    public void setRgrealDvsByIdsklad(Collection<entety.RgrealDvEntity> rgrealDvsByIdsklad) {
//        this.rgrealDvsByIdsklad = rgrealDvsByIdsklad;
//    }
//
//    private Collection<entety.RgsebprodDvEntity> rgsebprodDvsByIdsklad;
//
//    public Collection<entety.RgsebprodDvEntity> getRgsebprodDvsByIdsklad() {
//        return rgsebprodDvsByIdsklad;
//    }
//
//    public void setRgsebprodDvsByIdsklad(Collection<entety.RgsebprodDvEntity> rgsebprodDvsByIdsklad) {
//        this.rgsebprodDvsByIdsklad = rgsebprodDvsByIdsklad;
//    }
//
//    private Collection<entety.RgtrebnomEntity> rgtrebnomsByIdsklad;
//
//    public Collection<entety.RgtrebnomEntity> getRgtrebnomsByIdsklad() {
//        return rgtrebnomsByIdsklad;
//    }
//
//    public void setRgtrebnomsByIdsklad(Collection<entety.RgtrebnomEntity> rgtrebnomsByIdsklad) {
//        this.rgtrebnomsByIdsklad = rgtrebnomsByIdsklad;
//    }
//
//    private Collection<entety.RgtrebnomDvEntity> rgtrebnomDvsByIdsklad;
//
//    public Collection<entety.RgtrebnomDvEntity> getRgtrebnomDvsByIdsklad() {
//        return rgtrebnomDvsByIdsklad;
//    }
//
//    public void setRgtrebnomDvsByIdsklad(Collection<entety.RgtrebnomDvEntity> rgtrebnomDvsByIdsklad) {
//        this.rgtrebnomDvsByIdsklad = rgtrebnomDvsByIdsklad;
//    }
//
//    private Collection<entety.RgtrebznomEntity> rgtrebznomsByIdsklad;
//
//    public Collection<entety.RgtrebznomEntity> getRgtrebznomsByIdsklad() {
//        return rgtrebznomsByIdsklad;
//    }
//
//    public void setRgtrebznomsByIdsklad(Collection<entety.RgtrebznomEntity> rgtrebznomsByIdsklad) {
//        this.rgtrebznomsByIdsklad = rgtrebznomsByIdsklad;
//    }
//
//    private Collection<entety.RgtrebznomDvEntity> rgtrebznomDvsByIdsklad;
//
//    public Collection<entety.RgtrebznomDvEntity> getRgtrebznomDvsByIdsklad() {
//        return rgtrebznomDvsByIdsklad;
//    }
//
//    public void setRgtrebznomDvsByIdsklad(Collection<entety.RgtrebznomDvEntity> rgtrebznomDvsByIdsklad) {
//        this.rgtrebznomDvsByIdsklad = rgtrebznomDvsByIdsklad;
//    }
//
//    private Collection<entety.RgvipprodDvEntity> rgvipprodDvsByIdsklad;
//
//    public Collection<entety.RgvipprodDvEntity> getRgvipprodDvsByIdsklad() {
//        return rgvipprodDvsByIdsklad;
//    }
//
//    public void setRgvipprodDvsByIdsklad(Collection<entety.RgvipprodDvEntity> rgvipprodDvsByIdsklad) {
//        this.rgvipprodDvsByIdsklad = rgvipprodDvsByIdsklad;
//    }
//
//    private Collection<entety.RgzakpostEntity> rgzakpostsByIdsklad;
//
//    public Collection<entety.RgzakpostEntity> getRgzakpostsByIdsklad() {
//        return rgzakpostsByIdsklad;
//    }
//
//    public void setRgzakpostsByIdsklad(Collection<entety.RgzakpostEntity> rgzakpostsByIdsklad) {
//        this.rgzakpostsByIdsklad = rgzakpostsByIdsklad;
//    }
//
//    private Collection<entety.RgzakpostDvEntity> rgzakpostDvsByIdsklad;
//
//    public Collection<entety.RgzakpostDvEntity> getRgzakpostDvsByIdsklad() {
//        return rgzakpostDvsByIdsklad;
//    }
//
//    public void setRgzakpostDvsByIdsklad(Collection<entety.RgzakpostDvEntity> rgzakpostDvsByIdsklad) {
//        this.rgzakpostDvsByIdsklad = rgzakpostDvsByIdsklad;
//    }
//
//    private Collection<entety.SarmEntity> sarmsByIdsklad;
//
//    public Collection<entety.SarmEntity> getSarmsByIdsklad() {
//        return sarmsByIdsklad;
//    }
//
//    public void setSarmsByIdsklad(Collection<entety.SarmEntity> sarmsByIdsklad) {
//        this.sarmsByIdsklad = sarmsByIdsklad;
//    }
//
//    private Collection<entety.SdiscountAutoEntity> sdiscountAutosByIdsklad;
//
//    public Collection<entety.SdiscountAutoEntity> getSdiscountAutosByIdsklad() {
//        return sdiscountAutosByIdsklad;
//    }
//
//    public void setSdiscountAutosByIdsklad(Collection<entety.SdiscountAutoEntity> sdiscountAutosByIdsklad) {
//        this.sdiscountAutosByIdsklad = sdiscountAutosByIdsklad;
//    }
//
//    private Collection<entety.SinetcatalogSklEntity> sinetcatalogSklsByIdsklad;
//
//    public Collection<entety.SinetcatalogSklEntity> getSinetcatalogSklsByIdsklad() {
//        return sinetcatalogSklsByIdsklad;
//    }
//
//    public void setSinetcatalogSklsByIdsklad(Collection<entety.SinetcatalogSklEntity> sinetcatalogSklsByIdsklad) {
//        this.sinetcatalogSklsByIdsklad = sinetcatalogSklsByIdsklad;
//    }
//
//    private Collection<entety.SmhranEntity> smhransByIdsklad;
//
//    public Collection<entety.SmhranEntity> getSmhransByIdsklad() {
//        return smhransByIdsklad;
//    }
//
//    public void setSmhransByIdsklad(Collection<entety.SmhranEntity> smhransByIdsklad) {
//        this.smhransByIdsklad = smhransByIdsklad;
//    }
//
//    private Collection<entety.SmhranGrpEntity> smhranGrpsByIdsklad;
//
//    public Collection<entety.SmhranGrpEntity> getSmhranGrpsByIdsklad() {
//        return smhranGrpsByIdsklad;
//    }
//
//    public void setSmhranGrpsByIdsklad(Collection<entety.SmhranGrpEntity> smhranGrpsByIdsklad) {
//        this.smhranGrpsByIdsklad = smhranGrpsByIdsklad;
//    }
//
//    private Collection<entety.SmprigEntity> smprigsByIdsklad;
//
//    public Collection<entety.SmprigEntity> getSmprigsByIdsklad() {
//        return smprigsByIdsklad;
//    }
//
//    public void setSmprigsByIdsklad(Collection<entety.SmprigEntity> smprigsByIdsklad) {
//        this.smprigsByIdsklad = smprigsByIdsklad;
//    }
//
//    private Collection<entety.SnakSkidokEntity> snakSkidoksByIdsklad;
//
//    public Collection<entety.SnakSkidokEntity> getSnakSkidoksByIdsklad() {
//        return snakSkidoksByIdsklad;
//    }
//
//    public void setSnakSkidoksByIdsklad(Collection<entety.SnakSkidokEntity> snakSkidoksByIdsklad) {
//        this.snakSkidoksByIdsklad = snakSkidoksByIdsklad;
//    }
//
//    private Collection<entety.SobjectEntity> sobjectsByIdsklad;
//
//    public Collection<entety.SobjectEntity> getSobjectsByIdsklad() {
//        return sobjectsByIdsklad;
//    }
//
//    public void setSobjectsByIdsklad(Collection<entety.SobjectEntity> sobjectsByIdsklad) {
//        this.sobjectsByIdsklad = sobjectsByIdsklad;
//    }
//
//    private Collection<entety.SskladObmenEntity> sskladObmenByIdsklad;
//
//    public Collection<entety.SskladObmenEntity> getSskladObmenByIdsklad() {
//        return sskladObmenByIdsklad;
//    }
//
//    public void setSskladObmenByIdsklad(Collection<entety.SskladObmenEntity> sskladObmenByIdsklad) {
//        this.sskladObmenByIdsklad = sskladObmenByIdsklad;
//    }
//
//    private Collection<entety.SuserEntity> susersByIdsklad;
//
//    public Collection<entety.SuserEntity> getSusersByIdsklad() {
//        return susersByIdsklad;
//    }
//
//    public void setSusersByIdsklad(Collection<entety.SuserEntity> susersByIdsklad) {
//        this.susersByIdsklad = susersByIdsklad;
//    }
//
//    private Collection<entety.ZpGalldocEntity> zpGalldocsByIdsklad;
//
//    public Collection<entety.ZpGalldocEntity> getZpGalldocsByIdsklad() {
//        return zpGalldocsByIdsklad;
//    }
//
//    public void setZpGalldocsByIdsklad(Collection<entety.ZpGalldocEntity> zpGalldocsByIdsklad) {
//        this.zpGalldocsByIdsklad = zpGalldocsByIdsklad;
//    }
}
