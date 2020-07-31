package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "REM_STREMONT", schema = "", catalog = "")
public class RemStremontEntity {
    private long idStremont;
    private String gidStremont;
    private String nameStremont;
    private Long idbaseRemStremont;
    private Long idextDoutRemStremont;
    private Long idextBaseRemStremont;
    private Short typeTblRemStremont;
//    private Collection<RemZEntity> remZSByIdStremont;
//    private Collection<RemZDvEntity> remZDvsByIdStremont;

    @Id
    @Column(name = "ID_STREMONT", nullable = false)
    public long getIdStremont() {
        return idStremont;
    }

    public void setIdStremont(long idStremont) {
        this.idStremont = idStremont;
    }

    @Basic
    @Column(name = "GID_STREMONT", nullable = true, length = 10)
    public String getGidStremont() {
        return gidStremont;
    }

    public void setGidStremont(String gidStremont) {
        this.gidStremont = gidStremont;
    }

    @Basic
    @Column(name = "NAME_STREMONT", nullable = true, length = 200)
    public String getNameStremont() {
        return nameStremont;
    }

    public void setNameStremont(String nameStremont) {
        this.nameStremont = nameStremont;
    }

    @Basic
    @Column(name = "IDBASE_REM_STREMONT", nullable = true)
    public Long getIdbaseRemStremont() {
        return idbaseRemStremont;
    }

    public void setIdbaseRemStremont(Long idbaseRemStremont) {
        this.idbaseRemStremont = idbaseRemStremont;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_REM_STREMONT", nullable = true)
    public Long getIdextDoutRemStremont() {
        return idextDoutRemStremont;
    }

    public void setIdextDoutRemStremont(Long idextDoutRemStremont) {
        this.idextDoutRemStremont = idextDoutRemStremont;
    }

    @Basic
    @Column(name = "IDEXT_BASE_REM_STREMONT", nullable = true)
    public Long getIdextBaseRemStremont() {
        return idextBaseRemStremont;
    }

    public void setIdextBaseRemStremont(Long idextBaseRemStremont) {
        this.idextBaseRemStremont = idextBaseRemStremont;
    }

    @Basic
    @Column(name = "TYPE_TBL_REM_STREMONT", nullable = true)
    public Short getTypeTblRemStremont() {
        return typeTblRemStremont;
    }

    public void setTypeTblRemStremont(Short typeTblRemStremont) {
        this.typeTblRemStremont = typeTblRemStremont;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemStremontEntity that = (RemStremontEntity) o;

        if (idStremont != that.idStremont) return false;
        if (gidStremont != null ? !gidStremont.equals(that.gidStremont) : that.gidStremont != null) return false;
        if (nameStremont != null ? !nameStremont.equals(that.nameStremont) : that.nameStremont != null) return false;
        if (idbaseRemStremont != null ? !idbaseRemStremont.equals(that.idbaseRemStremont) : that.idbaseRemStremont != null)
            return false;
        if (idextDoutRemStremont != null ? !idextDoutRemStremont.equals(that.idextDoutRemStremont) : that.idextDoutRemStremont != null)
            return false;
        if (idextBaseRemStremont != null ? !idextBaseRemStremont.equals(that.idextBaseRemStremont) : that.idextBaseRemStremont != null)
            return false;
        if (typeTblRemStremont != null ? !typeTblRemStremont.equals(that.typeTblRemStremont) : that.typeTblRemStremont != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idStremont ^ (idStremont >>> 32));
        result = 31 * result + (gidStremont != null ? gidStremont.hashCode() : 0);
        result = 31 * result + (nameStremont != null ? nameStremont.hashCode() : 0);
        result = 31 * result + (idbaseRemStremont != null ? idbaseRemStremont.hashCode() : 0);
        result = 31 * result + (idextDoutRemStremont != null ? idextDoutRemStremont.hashCode() : 0);
        result = 31 * result + (idextBaseRemStremont != null ? idextBaseRemStremont.hashCode() : 0);
        result = 31 * result + (typeTblRemStremont != null ? typeTblRemStremont.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "remStremontByIdtyperemRemZ")
//    public Collection<RemZEntity> getRemZSByIdStremont() {
//        return remZSByIdStremont;
//    }
//
//    public void setRemZSByIdStremont(Collection<RemZEntity> remZSByIdStremont) {
//        this.remZSByIdStremont = remZSByIdStremont;
//    }

//    @OneToMany(mappedBy = "remStremontByIdtremontRemZDv")
//    public Collection<RemZDvEntity> getRemZDvsByIdStremont() {
//        return remZDvsByIdStremont;
//    }
//
//    public void setRemZDvsByIdStremont(Collection<RemZDvEntity> remZDvsByIdStremont) {
//        this.remZDvsByIdStremont = remZDvsByIdStremont;
//    }
}
