package Model.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "ART_IMG", schema = "", catalog = "")
public class ArtImgEntity {
    private long idArtImg;
    private Long idbaseArtImg;
    private Long idextBaseArtImg;
    private Long idextDoutArtImg;
    private Short typeTblArtImg;
    private String guidArtImg;
    private Timestamp posIsmArtImg;
    private Long idgrpArtImg;
    private String guidgrpArtImg;
    private String nameArtImg;
    private String textArtImg;
    private Integer heightArtImg;
    private Integer widthArtImg;
    private byte[] imageArtImg;
    private Integer indexArtImg;
    private Collection<ArtIbSEntity> artIbSByIdArtImg;
//    private ArtImgGrpEntity artImgGrpByIdgrpArtImg;

    @Id
    @Column(name = "ID_ART_IMG", nullable = false)
    public long getIdArtImg() {
        return idArtImg;
    }

    public void setIdArtImg(long idArtImg) {
        this.idArtImg = idArtImg;
    }

    @Basic
    @Column(name = "IDBASE_ART_IMG", nullable = true)
    public Long getIdbaseArtImg() {
        return idbaseArtImg;
    }

    public void setIdbaseArtImg(Long idbaseArtImg) {
        this.idbaseArtImg = idbaseArtImg;
    }

    @Basic
    @Column(name = "IDEXT_BASE_ART_IMG", nullable = true)
    public Long getIdextBaseArtImg() {
        return idextBaseArtImg;
    }

    public void setIdextBaseArtImg(Long idextBaseArtImg) {
        this.idextBaseArtImg = idextBaseArtImg;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_ART_IMG", nullable = true)
    public Long getIdextDoutArtImg() {
        return idextDoutArtImg;
    }

    public void setIdextDoutArtImg(Long idextDoutArtImg) {
        this.idextDoutArtImg = idextDoutArtImg;
    }

    @Basic
    @Column(name = "TYPE_TBL_ART_IMG", nullable = true)
    public Short getTypeTblArtImg() {
        return typeTblArtImg;
    }

    public void setTypeTblArtImg(Short typeTblArtImg) {
        this.typeTblArtImg = typeTblArtImg;
    }

    @Basic
    @Column(name = "GUID_ART_IMG", nullable = true, length = 38)
    public String getGuidArtImg() {
        return guidArtImg;
    }

    public void setGuidArtImg(String guidArtImg) {
        this.guidArtImg = guidArtImg;
    }

    @Basic
    @Column(name = "POS_ISM_ART_IMG", nullable = true)
    public Timestamp getPosIsmArtImg() {
        return posIsmArtImg;
    }

    public void setPosIsmArtImg(Timestamp posIsmArtImg) {
        this.posIsmArtImg = posIsmArtImg;
    }

    @Basic
    @Column(name = "IDGRP_ART_IMG", nullable = true)
    public Long getIdgrpArtImg() {
        return idgrpArtImg;
    }

    public void setIdgrpArtImg(Long idgrpArtImg) {
        this.idgrpArtImg = idgrpArtImg;
    }

    @Basic
    @Column(name = "GUIDGRP_ART_IMG", nullable = true, length = 38)
    public String getGuidgrpArtImg() {
        return guidgrpArtImg;
    }

    public void setGuidgrpArtImg(String guidgrpArtImg) {
        this.guidgrpArtImg = guidgrpArtImg;
    }

    @Basic
    @Column(name = "NAME_ART_IMG", nullable = true, length = 200)
    public String getNameArtImg() {
        return nameArtImg;
    }

    public void setNameArtImg(String nameArtImg) {
        this.nameArtImg = nameArtImg;
    }

    @Basic
    @Column(name = "TEXT_ART_IMG", nullable = true, length = 200)
    public String getTextArtImg() {
        return textArtImg;
    }

    public void setTextArtImg(String textArtImg) {
        this.textArtImg = textArtImg;
    }

    @Basic
    @Column(name = "HEIGHT_ART_IMG", nullable = true)
    public Integer getHeightArtImg() {
        return heightArtImg;
    }

    public void setHeightArtImg(Integer heightArtImg) {
        this.heightArtImg = heightArtImg;
    }

    @Basic
    @Column(name = "WIDTH_ART_IMG", nullable = true)
    public Integer getWidthArtImg() {
        return widthArtImg;
    }

    public void setWidthArtImg(Integer widthArtImg) {
        this.widthArtImg = widthArtImg;
    }

    @Basic
    @Column(name = "IMAGE_ART_IMG", nullable = true)
    public byte[] getImageArtImg() {
        return imageArtImg;
    }

    public void setImageArtImg(byte[] imageArtImg) {
        this.imageArtImg = imageArtImg;
    }

    @Basic
    @Column(name = "INDEX_ART_IMG", nullable = true)
    public Integer getIndexArtImg() {
        return indexArtImg;
    }

    public void setIndexArtImg(Integer indexArtImg) {
        this.indexArtImg = indexArtImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtImgEntity that = (ArtImgEntity) o;

        if (idArtImg != that.idArtImg) return false;
        if (idbaseArtImg != null ? !idbaseArtImg.equals(that.idbaseArtImg) : that.idbaseArtImg != null) return false;
        if (idextBaseArtImg != null ? !idextBaseArtImg.equals(that.idextBaseArtImg) : that.idextBaseArtImg != null)
            return false;
        if (idextDoutArtImg != null ? !idextDoutArtImg.equals(that.idextDoutArtImg) : that.idextDoutArtImg != null)
            return false;
        if (typeTblArtImg != null ? !typeTblArtImg.equals(that.typeTblArtImg) : that.typeTblArtImg != null)
            return false;
        if (guidArtImg != null ? !guidArtImg.equals(that.guidArtImg) : that.guidArtImg != null) return false;
        if (posIsmArtImg != null ? !posIsmArtImg.equals(that.posIsmArtImg) : that.posIsmArtImg != null) return false;
        if (idgrpArtImg != null ? !idgrpArtImg.equals(that.idgrpArtImg) : that.idgrpArtImg != null) return false;
        if (guidgrpArtImg != null ? !guidgrpArtImg.equals(that.guidgrpArtImg) : that.guidgrpArtImg != null)
            return false;
        if (nameArtImg != null ? !nameArtImg.equals(that.nameArtImg) : that.nameArtImg != null) return false;
        if (textArtImg != null ? !textArtImg.equals(that.textArtImg) : that.textArtImg != null) return false;
        if (heightArtImg != null ? !heightArtImg.equals(that.heightArtImg) : that.heightArtImg != null) return false;
        if (widthArtImg != null ? !widthArtImg.equals(that.widthArtImg) : that.widthArtImg != null) return false;
        if (!Arrays.equals(imageArtImg, that.imageArtImg)) return false;
        if (indexArtImg != null ? !indexArtImg.equals(that.indexArtImg) : that.indexArtImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idArtImg ^ (idArtImg >>> 32));
        result = 31 * result + (idbaseArtImg != null ? idbaseArtImg.hashCode() : 0);
        result = 31 * result + (idextBaseArtImg != null ? idextBaseArtImg.hashCode() : 0);
        result = 31 * result + (idextDoutArtImg != null ? idextDoutArtImg.hashCode() : 0);
        result = 31 * result + (typeTblArtImg != null ? typeTblArtImg.hashCode() : 0);
        result = 31 * result + (guidArtImg != null ? guidArtImg.hashCode() : 0);
        result = 31 * result + (posIsmArtImg != null ? posIsmArtImg.hashCode() : 0);
        result = 31 * result + (idgrpArtImg != null ? idgrpArtImg.hashCode() : 0);
        result = 31 * result + (guidgrpArtImg != null ? guidgrpArtImg.hashCode() : 0);
        result = 31 * result + (nameArtImg != null ? nameArtImg.hashCode() : 0);
        result = 31 * result + (textArtImg != null ? textArtImg.hashCode() : 0);
        result = 31 * result + (heightArtImg != null ? heightArtImg.hashCode() : 0);
        result = 31 * result + (widthArtImg != null ? widthArtImg.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imageArtImg);
        result = 31 * result + (indexArtImg != null ? indexArtImg.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "artImgByIdimgArtIbS")
    public Collection<ArtIbSEntity> getArtIbSByIdArtImg() {
        return artIbSByIdArtImg;
    }

    public void setArtIbSByIdArtImg(Collection<ArtIbSEntity> artIbSByIdArtImg) {
        this.artIbSByIdArtImg = artIbSByIdArtImg;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDGRP_ART_IMG", referencedColumnName = "ID_ART_IMG_GRP")
//    public ArtImgGrpEntity getArtImgGrpByIdgrpArtImg() {
//        return artImgGrpByIdgrpArtImg;
//    }
//
//    public void setArtImgGrpByIdgrpArtImg(ArtImgGrpEntity artImgGrpByIdgrpArtImg) {
//        this.artImgGrpByIdgrpArtImg = artImgGrpByIdgrpArtImg;
//    }
}
