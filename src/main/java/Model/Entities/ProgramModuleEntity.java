package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "PROGRAM_MODULE", schema = "", catalog = "")
public class ProgramModuleEntity {
    private long idProgramModule;
    private String guidProgramModule;
    private String nameProgramModule;
    private String progidProgramModule;
    private String moduleProgramModule;
    private String descrProgramModule;
    private String patchProgramModule;
    private Long idbaseProgramModule;
    private Long idextDoutProgramModule;
    private Long idextBaseProgramModule;
    private Short typeTblProgramModule;
    private Integer typemodProgramModule;
    private Collection<InterfMainmenuEntity> interfMainmenusByIdProgramModule;
//    private Collection<InterfToolbarEntity> interfToolbarsByIdProgramModule;
//    private Collection<ProgramModuleParEntity> programModuleParsByIdProgramModule;

    @Id
    @Column(name = "ID_PROGRAM_MODULE", nullable = false)
    public long getIdProgramModule() {
        return idProgramModule;
    }

    public void setIdProgramModule(long idProgramModule) {
        this.idProgramModule = idProgramModule;
    }

    @Basic
    @Column(name = "GUID_PROGRAM_MODULE", nullable = true, length = 38)
    public String getGuidProgramModule() {
        return guidProgramModule;
    }

    public void setGuidProgramModule(String guidProgramModule) {
        this.guidProgramModule = guidProgramModule;
    }

    @Basic
    @Column(name = "NAME_PROGRAM_MODULE", nullable = true, length = 200)
    public String getNameProgramModule() {
        return nameProgramModule;
    }

    public void setNameProgramModule(String nameProgramModule) {
        this.nameProgramModule = nameProgramModule;
    }

    @Basic
    @Column(name = "PROGID_PROGRAM_MODULE", nullable = true, length = 38)
    public String getProgidProgramModule() {
        return progidProgramModule;
    }

    public void setProgidProgramModule(String progidProgramModule) {
        this.progidProgramModule = progidProgramModule;
    }

    @Basic
    @Column(name = "MODULE_PROGRAM_MODULE", nullable = true, length = 40)
    public String getModuleProgramModule() {
        return moduleProgramModule;
    }

    public void setModuleProgramModule(String moduleProgramModule) {
        this.moduleProgramModule = moduleProgramModule;
    }

    @Basic
    @Column(name = "DESCR_PROGRAM_MODULE", nullable = true, length = 150)
    public String getDescrProgramModule() {
        return descrProgramModule;
    }

    public void setDescrProgramModule(String descrProgramModule) {
        this.descrProgramModule = descrProgramModule;
    }

    @Basic
    @Column(name = "PATCH_PROGRAM_MODULE", nullable = true, length = 200)
    public String getPatchProgramModule() {
        return patchProgramModule;
    }

    public void setPatchProgramModule(String patchProgramModule) {
        this.patchProgramModule = patchProgramModule;
    }

    @Basic
    @Column(name = "IDBASE_PROGRAM_MODULE", nullable = true)
    public Long getIdbaseProgramModule() {
        return idbaseProgramModule;
    }

    public void setIdbaseProgramModule(Long idbaseProgramModule) {
        this.idbaseProgramModule = idbaseProgramModule;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_PROGRAM_MODULE", nullable = true)
    public Long getIdextDoutProgramModule() {
        return idextDoutProgramModule;
    }

    public void setIdextDoutProgramModule(Long idextDoutProgramModule) {
        this.idextDoutProgramModule = idextDoutProgramModule;
    }

    @Basic
    @Column(name = "IDEXT_BASE_PROGRAM_MODULE", nullable = true)
    public Long getIdextBaseProgramModule() {
        return idextBaseProgramModule;
    }

    public void setIdextBaseProgramModule(Long idextBaseProgramModule) {
        this.idextBaseProgramModule = idextBaseProgramModule;
    }

    @Basic
    @Column(name = "TYPE_TBL_PROGRAM_MODULE", nullable = true)
    public Short getTypeTblProgramModule() {
        return typeTblProgramModule;
    }

    public void setTypeTblProgramModule(Short typeTblProgramModule) {
        this.typeTblProgramModule = typeTblProgramModule;
    }

    @Basic
    @Column(name = "TYPEMOD_PROGRAM_MODULE", nullable = true)
    public Integer getTypemodProgramModule() {
        return typemodProgramModule;
    }

    public void setTypemodProgramModule(Integer typemodProgramModule) {
        this.typemodProgramModule = typemodProgramModule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgramModuleEntity that = (ProgramModuleEntity) o;

        if (idProgramModule != that.idProgramModule) return false;
        if (guidProgramModule != null ? !guidProgramModule.equals(that.guidProgramModule) : that.guidProgramModule != null)
            return false;
        if (nameProgramModule != null ? !nameProgramModule.equals(that.nameProgramModule) : that.nameProgramModule != null)
            return false;
        if (progidProgramModule != null ? !progidProgramModule.equals(that.progidProgramModule) : that.progidProgramModule != null)
            return false;
        if (moduleProgramModule != null ? !moduleProgramModule.equals(that.moduleProgramModule) : that.moduleProgramModule != null)
            return false;
        if (descrProgramModule != null ? !descrProgramModule.equals(that.descrProgramModule) : that.descrProgramModule != null)
            return false;
        if (patchProgramModule != null ? !patchProgramModule.equals(that.patchProgramModule) : that.patchProgramModule != null)
            return false;
        if (idbaseProgramModule != null ? !idbaseProgramModule.equals(that.idbaseProgramModule) : that.idbaseProgramModule != null)
            return false;
        if (idextDoutProgramModule != null ? !idextDoutProgramModule.equals(that.idextDoutProgramModule) : that.idextDoutProgramModule != null)
            return false;
        if (idextBaseProgramModule != null ? !idextBaseProgramModule.equals(that.idextBaseProgramModule) : that.idextBaseProgramModule != null)
            return false;
        if (typeTblProgramModule != null ? !typeTblProgramModule.equals(that.typeTblProgramModule) : that.typeTblProgramModule != null)
            return false;
        if (typemodProgramModule != null ? !typemodProgramModule.equals(that.typemodProgramModule) : that.typemodProgramModule != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idProgramModule ^ (idProgramModule >>> 32));
        result = 31 * result + (guidProgramModule != null ? guidProgramModule.hashCode() : 0);
        result = 31 * result + (nameProgramModule != null ? nameProgramModule.hashCode() : 0);
        result = 31 * result + (progidProgramModule != null ? progidProgramModule.hashCode() : 0);
        result = 31 * result + (moduleProgramModule != null ? moduleProgramModule.hashCode() : 0);
        result = 31 * result + (descrProgramModule != null ? descrProgramModule.hashCode() : 0);
        result = 31 * result + (patchProgramModule != null ? patchProgramModule.hashCode() : 0);
        result = 31 * result + (idbaseProgramModule != null ? idbaseProgramModule.hashCode() : 0);
        result = 31 * result + (idextDoutProgramModule != null ? idextDoutProgramModule.hashCode() : 0);
        result = 31 * result + (idextBaseProgramModule != null ? idextBaseProgramModule.hashCode() : 0);
        result = 31 * result + (typeTblProgramModule != null ? typeTblProgramModule.hashCode() : 0);
        result = 31 * result + (typemodProgramModule != null ? typemodProgramModule.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "programModuleByIdmodInterfMainmenu")
    public Collection<InterfMainmenuEntity> getInterfMainmenusByIdProgramModule() {
        return interfMainmenusByIdProgramModule;
    }

    public void setInterfMainmenusByIdProgramModule(Collection<InterfMainmenuEntity> interfMainmenusByIdProgramModule) {
        this.interfMainmenusByIdProgramModule = interfMainmenusByIdProgramModule;
    }

//    @OneToMany(mappedBy = "programModuleByIdmodInterfToolbar")
//    public Collection<InterfToolbarEntity> getInterfToolbarsByIdProgramModule() {
//        return interfToolbarsByIdProgramModule;
//    }
//
//    public void setInterfToolbarsByIdProgramModule(Collection<InterfToolbarEntity> interfToolbarsByIdProgramModule) {
//        this.interfToolbarsByIdProgramModule = interfToolbarsByIdProgramModule;
//    }
//
//    @OneToMany(mappedBy = "programModuleByIdprogmodProgramModulePar")
//    public Collection<ProgramModuleParEntity> getProgramModuleParsByIdProgramModule() {
//        return programModuleParsByIdProgramModule;
//    }
//
//    public void setProgramModuleParsByIdProgramModule(Collection<ProgramModuleParEntity> programModuleParsByIdProgramModule) {
//        this.programModuleParsByIdProgramModule = programModuleParsByIdProgramModule;
//    }
}
