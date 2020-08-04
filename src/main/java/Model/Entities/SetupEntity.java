package Model.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "SETUP", schema = "", catalog = "")
public class SetupEntity {
    private long idSetup;
    private String descriptionSetup;
    private String valueSetup;
    private String gidSetup;
    private Long idbaseSetup;
    private Timestamp valueTimestampSetup;
    private Short typeValueSetup;
    private Long idextDoutSetup;
    private Long idextBaseSetup;
    private Short typeTblSetup;

    @Id
    @Column(name = "ID_SETUP", nullable = false)
    public long getIdSetup() {
        return idSetup;
    }

    public void setIdSetup(long idSetup) {
        this.idSetup = idSetup;
    }

    @Basic
    @Column(name = "DESCRIPTION_SETUP", nullable = true, length = 200)
    public String getDescriptionSetup() {
        return descriptionSetup;
    }

    public void setDescriptionSetup(String descriptionSetup) {
        this.descriptionSetup = descriptionSetup;
    }

    @Basic
    @Column(name = "VALUE_SETUP", nullable = true, length = 200)
    public String getValueSetup() {
        return valueSetup;
    }

    public void setValueSetup(String valueSetup) {
        this.valueSetup = valueSetup;
    }

    @Basic
    @Column(name = "GID_SETUP", nullable = true, length = 10)
    public String getGidSetup() {
        return gidSetup;
    }

    public void setGidSetup(String gidSetup) {
        this.gidSetup = gidSetup;
    }

    @Basic
    @Column(name = "IDBASE_SETUP", nullable = true)
    public Long getIdbaseSetup() {
        return idbaseSetup;
    }

    public void setIdbaseSetup(Long idbaseSetup) {
        this.idbaseSetup = idbaseSetup;
    }

    @Basic
    @Column(name = "VALUE_TIMESTAMP_SETUP", nullable = true)
    public Timestamp getValueTimestampSetup() {
        return valueTimestampSetup;
    }

    public void setValueTimestampSetup(Timestamp valueTimestampSetup) {
        this.valueTimestampSetup = valueTimestampSetup;
    }

    @Basic
    @Column(name = "TYPE_VALUE_SETUP", nullable = true)
    public Short getTypeValueSetup() {
        return typeValueSetup;
    }

    public void setTypeValueSetup(Short typeValueSetup) {
        this.typeValueSetup = typeValueSetup;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_SETUP", nullable = true)
    public Long getIdextDoutSetup() {
        return idextDoutSetup;
    }

    public void setIdextDoutSetup(Long idextDoutSetup) {
        this.idextDoutSetup = idextDoutSetup;
    }

    @Basic
    @Column(name = "IDEXT_BASE_SETUP", nullable = true)
    public Long getIdextBaseSetup() {
        return idextBaseSetup;
    }

    public void setIdextBaseSetup(Long idextBaseSetup) {
        this.idextBaseSetup = idextBaseSetup;
    }

    @Basic
    @Column(name = "TYPE_TBL_SETUP", nullable = true)
    public Short getTypeTblSetup() {
        return typeTblSetup;
    }

    public void setTypeTblSetup(Short typeTblSetup) {
        this.typeTblSetup = typeTblSetup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetupEntity that = (SetupEntity) o;

        if (idSetup != that.idSetup) return false;
        if (descriptionSetup != null ? !descriptionSetup.equals(that.descriptionSetup) : that.descriptionSetup != null)
            return false;
        if (valueSetup != null ? !valueSetup.equals(that.valueSetup) : that.valueSetup != null) return false;
        if (gidSetup != null ? !gidSetup.equals(that.gidSetup) : that.gidSetup != null) return false;
        if (idbaseSetup != null ? !idbaseSetup.equals(that.idbaseSetup) : that.idbaseSetup != null) return false;
        if (valueTimestampSetup != null ? !valueTimestampSetup.equals(that.valueTimestampSetup) : that.valueTimestampSetup != null)
            return false;
        if (typeValueSetup != null ? !typeValueSetup.equals(that.typeValueSetup) : that.typeValueSetup != null)
            return false;
        if (idextDoutSetup != null ? !idextDoutSetup.equals(that.idextDoutSetup) : that.idextDoutSetup != null)
            return false;
        if (idextBaseSetup != null ? !idextBaseSetup.equals(that.idextBaseSetup) : that.idextBaseSetup != null)
            return false;
        if (typeTblSetup != null ? !typeTblSetup.equals(that.typeTblSetup) : that.typeTblSetup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idSetup ^ (idSetup >>> 32));
        result = 31 * result + (descriptionSetup != null ? descriptionSetup.hashCode() : 0);
        result = 31 * result + (valueSetup != null ? valueSetup.hashCode() : 0);
        result = 31 * result + (gidSetup != null ? gidSetup.hashCode() : 0);
        result = 31 * result + (idbaseSetup != null ? idbaseSetup.hashCode() : 0);
        result = 31 * result + (valueTimestampSetup != null ? valueTimestampSetup.hashCode() : 0);
        result = 31 * result + (typeValueSetup != null ? typeValueSetup.hashCode() : 0);
        result = 31 * result + (idextDoutSetup != null ? idextDoutSetup.hashCode() : 0);
        result = 31 * result + (idextBaseSetup != null ? idextBaseSetup.hashCode() : 0);
        result = 31 * result + (typeTblSetup != null ? typeTblSetup.hashCode() : 0);
        return result;
    }
}
