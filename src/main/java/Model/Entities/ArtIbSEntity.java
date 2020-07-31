package Model.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ART_IB_S", schema = "", catalog = "")
public class ArtIbSEntity {
    private long idArtIbS;
    private Long idbaseArtIbS;
    private Long idextBaseArtIbS;
    private Long idextDoutArtIbS;
    private Short typeTblArtIbS;
    private String guidArtIbS;
    private Timestamp posIsmArtIbS;
    private Long idibArtIbS;
    private Short typeArtIbS;
    private String textArtIbS;
    private Long idimgArtIbS;
    private Integer indexArtIbS;
    private Integer hAlignArtIbS;
    private Integer vAlignArtIbS;
    private Integer typeTextArtIbS;
    private Integer fontSizeArtIbS;
//    private ArtIbEntity artIbByIdibArtIbS;
    private ArtImgEntity artImgByIdimgArtIbS;

    @Id
    @Column(name = "ID_ART_IB_S", nullable = false)
    public long getIdArtIbS() {
        return idArtIbS;
    }

    public void setIdArtIbS(long idArtIbS) {
        this.idArtIbS = idArtIbS;
    }

    @Basic
    @Column(name = "IDBASE_ART_IB_S", nullable = true)
    public Long getIdbaseArtIbS() {
        return idbaseArtIbS;
    }

    public void setIdbaseArtIbS(Long idbaseArtIbS) {
        this.idbaseArtIbS = idbaseArtIbS;
    }

    @Basic
    @Column(name = "IDEXT_BASE_ART_IB_S", nullable = true)
    public Long getIdextBaseArtIbS() {
        return idextBaseArtIbS;
    }

    public void setIdextBaseArtIbS(Long idextBaseArtIbS) {
        this.idextBaseArtIbS = idextBaseArtIbS;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_ART_IB_S", nullable = true)
    public Long getIdextDoutArtIbS() {
        return idextDoutArtIbS;
    }

    public void setIdextDoutArtIbS(Long idextDoutArtIbS) {
        this.idextDoutArtIbS = idextDoutArtIbS;
    }

    @Basic
    @Column(name = "TYPE_TBL_ART_IB_S", nullable = true)
    public Short getTypeTblArtIbS() {
        return typeTblArtIbS;
    }

    public void setTypeTblArtIbS(Short typeTblArtIbS) {
        this.typeTblArtIbS = typeTblArtIbS;
    }

    @Basic
    @Column(name = "GUID_ART_IB_S", nullable = true, length = 38)
    public String getGuidArtIbS() {
        return guidArtIbS;
    }

    public void setGuidArtIbS(String guidArtIbS) {
        this.guidArtIbS = guidArtIbS;
    }

    @Basic
    @Column(name = "POS_ISM_ART_IB_S", nullable = true)
    public Timestamp getPosIsmArtIbS() {
        return posIsmArtIbS;
    }

    public void setPosIsmArtIbS(Timestamp posIsmArtIbS) {
        this.posIsmArtIbS = posIsmArtIbS;
    }

    @Basic
    @Column(name = "IDIB_ART_IB_S", nullable = true)
    public Long getIdibArtIbS() {
        return idibArtIbS;
    }

    public void setIdibArtIbS(Long idibArtIbS) {
        this.idibArtIbS = idibArtIbS;
    }

    @Basic
    @Column(name = "TYPE_ART_IB_S", nullable = true)
    public Short getTypeArtIbS() {
        return typeArtIbS;
    }

    public void setTypeArtIbS(Short typeArtIbS) {
        this.typeArtIbS = typeArtIbS;
    }

    @Basic
    @Column(name = "TEXT_ART_IB_S", nullable = true, length = 1500)
    public String getTextArtIbS() {
        return textArtIbS;
    }

    public void setTextArtIbS(String textArtIbS) {
        this.textArtIbS = textArtIbS;
    }

    @Basic
    @Column(name = "IDIMG_ART_IB_S", nullable = true)
    public Long getIdimgArtIbS() {
        return idimgArtIbS;
    }

    public void setIdimgArtIbS(Long idimgArtIbS) {
        this.idimgArtIbS = idimgArtIbS;
    }

    @Basic
    @Column(name = "INDEX_ART_IB_S", nullable = true)
    public Integer getIndexArtIbS() {
        return indexArtIbS;
    }

    public void setIndexArtIbS(Integer indexArtIbS) {
        this.indexArtIbS = indexArtIbS;
    }

    @Basic
    @Column(name = "H_ALIGN_ART_IB_S", nullable = true)
    public Integer gethAlignArtIbS() {
        return hAlignArtIbS;
    }

    public void sethAlignArtIbS(Integer hAlignArtIbS) {
        this.hAlignArtIbS = hAlignArtIbS;
    }

    @Basic
    @Column(name = "V_ALIGN_ART_IB_S", nullable = true)
    public Integer getvAlignArtIbS() {
        return vAlignArtIbS;
    }

    public void setvAlignArtIbS(Integer vAlignArtIbS) {
        this.vAlignArtIbS = vAlignArtIbS;
    }

    @Basic
    @Column(name = "TYPE_TEXT_ART_IB_S", nullable = true)
    public Integer getTypeTextArtIbS() {
        return typeTextArtIbS;
    }

    public void setTypeTextArtIbS(Integer typeTextArtIbS) {
        this.typeTextArtIbS = typeTextArtIbS;
    }

    @Basic
    @Column(name = "FONT_SIZE_ART_IB_S", nullable = true)
    public Integer getFontSizeArtIbS() {
        return fontSizeArtIbS;
    }

    public void setFontSizeArtIbS(Integer fontSizeArtIbS) {
        this.fontSizeArtIbS = fontSizeArtIbS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtIbSEntity that = (ArtIbSEntity) o;

        if (idArtIbS != that.idArtIbS) return false;
        if (idbaseArtIbS != null ? !idbaseArtIbS.equals(that.idbaseArtIbS) : that.idbaseArtIbS != null) return false;
        if (idextBaseArtIbS != null ? !idextBaseArtIbS.equals(that.idextBaseArtIbS) : that.idextBaseArtIbS != null)
            return false;
        if (idextDoutArtIbS != null ? !idextDoutArtIbS.equals(that.idextDoutArtIbS) : that.idextDoutArtIbS != null)
            return false;
        if (typeTblArtIbS != null ? !typeTblArtIbS.equals(that.typeTblArtIbS) : that.typeTblArtIbS != null)
            return false;
        if (guidArtIbS != null ? !guidArtIbS.equals(that.guidArtIbS) : that.guidArtIbS != null) return false;
        if (posIsmArtIbS != null ? !posIsmArtIbS.equals(that.posIsmArtIbS) : that.posIsmArtIbS != null) return false;
        if (idibArtIbS != null ? !idibArtIbS.equals(that.idibArtIbS) : that.idibArtIbS != null) return false;
        if (typeArtIbS != null ? !typeArtIbS.equals(that.typeArtIbS) : that.typeArtIbS != null) return false;
        if (textArtIbS != null ? !textArtIbS.equals(that.textArtIbS) : that.textArtIbS != null) return false;
        if (idimgArtIbS != null ? !idimgArtIbS.equals(that.idimgArtIbS) : that.idimgArtIbS != null) return false;
        if (indexArtIbS != null ? !indexArtIbS.equals(that.indexArtIbS) : that.indexArtIbS != null) return false;
        if (hAlignArtIbS != null ? !hAlignArtIbS.equals(that.hAlignArtIbS) : that.hAlignArtIbS != null) return false;
        if (vAlignArtIbS != null ? !vAlignArtIbS.equals(that.vAlignArtIbS) : that.vAlignArtIbS != null) return false;
        if (typeTextArtIbS != null ? !typeTextArtIbS.equals(that.typeTextArtIbS) : that.typeTextArtIbS != null)
            return false;
        if (fontSizeArtIbS != null ? !fontSizeArtIbS.equals(that.fontSizeArtIbS) : that.fontSizeArtIbS != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idArtIbS ^ (idArtIbS >>> 32));
        result = 31 * result + (idbaseArtIbS != null ? idbaseArtIbS.hashCode() : 0);
        result = 31 * result + (idextBaseArtIbS != null ? idextBaseArtIbS.hashCode() : 0);
        result = 31 * result + (idextDoutArtIbS != null ? idextDoutArtIbS.hashCode() : 0);
        result = 31 * result + (typeTblArtIbS != null ? typeTblArtIbS.hashCode() : 0);
        result = 31 * result + (guidArtIbS != null ? guidArtIbS.hashCode() : 0);
        result = 31 * result + (posIsmArtIbS != null ? posIsmArtIbS.hashCode() : 0);
        result = 31 * result + (idibArtIbS != null ? idibArtIbS.hashCode() : 0);
        result = 31 * result + (typeArtIbS != null ? typeArtIbS.hashCode() : 0);
        result = 31 * result + (textArtIbS != null ? textArtIbS.hashCode() : 0);
        result = 31 * result + (idimgArtIbS != null ? idimgArtIbS.hashCode() : 0);
        result = 31 * result + (indexArtIbS != null ? indexArtIbS.hashCode() : 0);
        result = 31 * result + (hAlignArtIbS != null ? hAlignArtIbS.hashCode() : 0);
        result = 31 * result + (vAlignArtIbS != null ? vAlignArtIbS.hashCode() : 0);
        result = 31 * result + (typeTextArtIbS != null ? typeTextArtIbS.hashCode() : 0);
        result = 31 * result + (fontSizeArtIbS != null ? fontSizeArtIbS.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDIB_ART_IB_S", referencedColumnName = "ID_ART_IB")
//    public ArtIbEntity getArtIbByIdibArtIbS() {
//        return artIbByIdibArtIbS;
//    }
//
//    public void setArtIbByIdibArtIbS(ArtIbEntity artIbByIdibArtIbS) {
//        this.artIbByIdibArtIbS = artIbByIdibArtIbS;
//    }

    @ManyToOne
    @JoinColumn(name = "IDIMG_ART_IB_S", referencedColumnName = "ID_ART_IMG")
    public ArtImgEntity getArtImgByIdimgArtIbS() {
        return artImgByIdimgArtIbS;
    }

    public void setArtImgByIdimgArtIbS(ArtImgEntity artImgByIdimgArtIbS) {
        this.artImgByIdimgArtIbS = artImgByIdimgArtIbS;
    }

}
