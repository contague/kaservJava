package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "REM_SSOST", schema = "", catalog = "")
public class RemSsostEntity {
    private long idRemssost;
    private String gidRemssost;
    private String nameRemssost;
    private Long idbaseRemSsost;
    private Long idextDoutRemSsost;
    private Long idextBaseRemSsost;
    private Short typeTblRemSsost;
    private Collection<RemZEntity> remZSByIdRemssost;
//    private Collection<RemZDvEntity> remZDvsByIdRemssost;

    @Id
    @Column(name = "ID_REMSSOST", nullable = false)
    public long getIdRemssost() {
        return idRemssost;
    }

    public void setIdRemssost(long idRemssost) {
        this.idRemssost = idRemssost;
    }

    @Basic
    @Column(name = "GID_REMSSOST", nullable = true, length = 10)
    public String getGidRemssost() {
        return gidRemssost;
    }

    public void setGidRemssost(String gidRemssost) {
        this.gidRemssost = gidRemssost;
    }

    @Basic
    @Column(name = "NAME_REMSSOST", nullable = true, length = 200)
    public String getNameRemssost() {
        return nameRemssost;
    }

    public void setNameRemssost(String nameRemssost) {
        this.nameRemssost = nameRemssost;
    }

    @Basic
    @Column(name = "IDBASE_REM_SSOST", nullable = true)
    public Long getIdbaseRemSsost() {
        return idbaseRemSsost;
    }

    public void setIdbaseRemSsost(Long idbaseRemSsost) {
        this.idbaseRemSsost = idbaseRemSsost;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_SSOST", nullable = true)
    public Long getIdextDoutRemSsost() {
        return idextDoutRemSsost;
    }

    public void setIdextDoutRemSsost(Long idextDoutRemSsost) {
        this.idextDoutRemSsost = idextDoutRemSsost;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_SSOST", nullable = true)
    public Long getIdextBaseRemSsost() {
        return idextBaseRemSsost;
    }

    public void setIdextBaseRemSsost(Long idextBaseRemSsost) {
        this.idextBaseRemSsost = idextBaseRemSsost;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_SSOST", nullable = true)
    public Short getTypeTblRemSsost() {
        return typeTblRemSsost;
    }

    public void setTypeTblRemSsost(Short typeTblRemSsost) {
        this.typeTblRemSsost = typeTblRemSsost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemSsostEntity that = (RemSsostEntity) o;

        if (idRemssost != that.idRemssost) return false;
        if (gidRemssost != null ? !gidRemssost.equals(that.gidRemssost) : that.gidRemssost != null) return false;
        if (nameRemssost != null ? !nameRemssost.equals(that.nameRemssost) : that.nameRemssost != null) return false;
        if (idbaseRemSsost != null ? !idbaseRemSsost.equals(that.idbaseRemSsost) : that.idbaseRemSsost != null)
            return false;
        if (idextDoutRemSsost != null ? !idextDoutRemSsost.equals(that.idextDoutRemSsost) : that.idextDoutRemSsost != null)
            return false;
        if (idextBaseRemSsost != null ? !idextBaseRemSsost.equals(that.idextBaseRemSsost) : that.idextBaseRemSsost != null)
            return false;
        if (typeTblRemSsost != null ? !typeTblRemSsost.equals(that.typeTblRemSsost) : that.typeTblRemSsost != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRemssost ^ (idRemssost >>> 32));
        result = 31 * result + (gidRemssost != null ? gidRemssost.hashCode() : 0);
        result = 31 * result + (nameRemssost != null ? nameRemssost.hashCode() : 0);
        result = 31 * result + (idbaseRemSsost != null ? idbaseRemSsost.hashCode() : 0);
        result = 31 * result + (idextDoutRemSsost != null ? idextDoutRemSsost.hashCode() : 0);
        result = 31 * result + (idextBaseRemSsost != null ? idextBaseRemSsost.hashCode() : 0);
        result = 31 * result + (typeTblRemSsost != null ? typeTblRemSsost.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "remSsostByIdsostRemZ")
    public Collection<RemZEntity> getRemZSByIdRemssost() {
        return remZSByIdRemssost;
    }

    public void setRemZSByIdRemssost(Collection<RemZEntity> remZSByIdRemssost) {
        this.remZSByIdRemssost = remZSByIdRemssost;
    }

//    @OneToMany(mappedBy = "remSsostByIdsostRemZDv")
//    public Collection<RemZDvEntity> getRemZDvsByIdRemssost() {
//        return remZDvsByIdRemssost;
//    }
//
//    public void setRemZDvsByIdRemssost(Collection<RemZDvEntity> remZDvsByIdRemssost) {
//        this.remZDvsByIdRemssost = remZDvsByIdRemssost;
//    }
}
