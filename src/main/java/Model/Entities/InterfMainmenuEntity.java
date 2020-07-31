package Model.Entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "INTERF_MAINMENU", schema = "", catalog = "")
public class InterfMainmenuEntity {
    private long idInterfMainmenu;
    private Long idbaseInterfMainmenu;
    private Long idextBaseInterfMainmenu;
    private Long idextDoutInterfMainmenu;
    private Long idgrpInterfMainmenu;
    private String nameInterfMainmenu;
    private Integer modulInterfMainmenu;
    private Long idgrpuserInterfMainmenu;
    private Integer applicationInterfMainmenu;
    private String shortcutInterfMainmenu;
    private Integer indexInterfMainmenu;
    private String guidInterfMainmenu;
    private Short typeTblInterfMainmenu;
    private Short flUpdFormInterfMainmenu;
    private Short flNewDocInterfMainmenu;
    private Long idelInterfMainmenu;
    private Short flOpenElInterfMainmenu;
    private String guidmodInterfMainmenu;
    private Integer typeIdelInterfMainmenu;
    private Long idmodInterfMainmenu;
//    private InterfMainmenuGrpEntity interfMainmenuGrpByIdgrpInterfMainmenu;
//    private SgrpuserEntity sgrpuserByIdgrpuserInterfMainmenu;
    private ProgramModuleEntity programModuleByIdmodInterfMainmenu;
//    private Collection<InterfMainmenuParEntity> interfMainmenuParsByIdInterfMainmenu;

    @Id
    @Column(name = "ID_INTERF_MAINMENU", nullable = false)
    public long getIdInterfMainmenu() {
        return idInterfMainmenu;
    }

    public void setIdInterfMainmenu(long idInterfMainmenu) {
        this.idInterfMainmenu = idInterfMainmenu;
    }

    @Basic
    @Column(name = "IDBASE_INTERF_MAINMENU", nullable = true)
    public Long getIdbaseInterfMainmenu() {
        return idbaseInterfMainmenu;
    }

    public void setIdbaseInterfMainmenu(Long idbaseInterfMainmenu) {
        this.idbaseInterfMainmenu = idbaseInterfMainmenu;
    }

    @Basic
    @Column(name = "IDEXT_BASE_INTERF_MAINMENU", nullable = true)
    public Long getIdextBaseInterfMainmenu() {
        return idextBaseInterfMainmenu;
    }

    public void setIdextBaseInterfMainmenu(Long idextBaseInterfMainmenu) {
        this.idextBaseInterfMainmenu = idextBaseInterfMainmenu;
    }

    @Basic
    @Column(name = "IDEXT_DOUT_INTERF_MAINMENU", nullable = true)
    public Long getIdextDoutInterfMainmenu() {
        return idextDoutInterfMainmenu;
    }

    public void setIdextDoutInterfMainmenu(Long idextDoutInterfMainmenu) {
        this.idextDoutInterfMainmenu = idextDoutInterfMainmenu;
    }

    @Basic
    @Column(name = "IDGRP_INTERF_MAINMENU", nullable = true)
    public Long getIdgrpInterfMainmenu() {
        return idgrpInterfMainmenu;
    }

    public void setIdgrpInterfMainmenu(Long idgrpInterfMainmenu) {
        this.idgrpInterfMainmenu = idgrpInterfMainmenu;
    }

    @Basic
    @Column(name = "NAME_INTERF_MAINMENU", nullable = true, length = 40)
    public String getNameInterfMainmenu() {
        return nameInterfMainmenu;
    }

    public void setNameInterfMainmenu(String nameInterfMainmenu) {
        this.nameInterfMainmenu = nameInterfMainmenu;
    }

    @Basic
    @Column(name = "MODUL_INTERF_MAINMENU", nullable = true)
    public Integer getModulInterfMainmenu() {
        return modulInterfMainmenu;
    }

    public void setModulInterfMainmenu(Integer modulInterfMainmenu) {
        this.modulInterfMainmenu = modulInterfMainmenu;
    }

    @Basic
    @Column(name = "IDGRPUSER_INTERF_MAINMENU", nullable = true)
    public Long getIdgrpuserInterfMainmenu() {
        return idgrpuserInterfMainmenu;
    }

    public void setIdgrpuserInterfMainmenu(Long idgrpuserInterfMainmenu) {
        this.idgrpuserInterfMainmenu = idgrpuserInterfMainmenu;
    }

    @Basic
    @Column(name = "APPLICATION_INTERF_MAINMENU", nullable = true)
    public Integer getApplicationInterfMainmenu() {
        return applicationInterfMainmenu;
    }

    public void setApplicationInterfMainmenu(Integer applicationInterfMainmenu) {
        this.applicationInterfMainmenu = applicationInterfMainmenu;
    }

    @Basic
    @Column(name = "SHORTCUT_INTERF_MAINMENU", nullable = true, length = 10)
    public String getShortcutInterfMainmenu() {
        return shortcutInterfMainmenu;
    }

    public void setShortcutInterfMainmenu(String shortcutInterfMainmenu) {
        this.shortcutInterfMainmenu = shortcutInterfMainmenu;
    }

    @Basic
    @Column(name = "INDEX_INTERF_MAINMENU", nullable = true)
    public Integer getIndexInterfMainmenu() {
        return indexInterfMainmenu;
    }

    public void setIndexInterfMainmenu(Integer indexInterfMainmenu) {
        this.indexInterfMainmenu = indexInterfMainmenu;
    }

    @Basic
    @Column(name = "GUID_INTERF_MAINMENU", nullable = true, length = 38)
    public String getGuidInterfMainmenu() {
        return guidInterfMainmenu;
    }

    public void setGuidInterfMainmenu(String guidInterfMainmenu) {
        this.guidInterfMainmenu = guidInterfMainmenu;
    }

    @Basic
    @Column(name = "TYPE_TBL_INTERF_MAINMENU", nullable = true)
    public Short getTypeTblInterfMainmenu() {
        return typeTblInterfMainmenu;
    }

    public void setTypeTblInterfMainmenu(Short typeTblInterfMainmenu) {
        this.typeTblInterfMainmenu = typeTblInterfMainmenu;
    }

    @Basic
    @Column(name = "FL_UPD_FORM_INTERF_MAINMENU", nullable = true)
    public Short getFlUpdFormInterfMainmenu() {
        return flUpdFormInterfMainmenu;
    }

    public void setFlUpdFormInterfMainmenu(Short flUpdFormInterfMainmenu) {
        this.flUpdFormInterfMainmenu = flUpdFormInterfMainmenu;
    }

    @Basic
    @Column(name = "FL_NEW_DOC_INTERF_MAINMENU", nullable = true)
    public Short getFlNewDocInterfMainmenu() {
        return flNewDocInterfMainmenu;
    }

    public void setFlNewDocInterfMainmenu(Short flNewDocInterfMainmenu) {
        this.flNewDocInterfMainmenu = flNewDocInterfMainmenu;
    }

    @Basic
    @Column(name = "IDEL_INTERF_MAINMENU", nullable = true)
    public Long getIdelInterfMainmenu() {
        return idelInterfMainmenu;
    }

    public void setIdelInterfMainmenu(Long idelInterfMainmenu) {
        this.idelInterfMainmenu = idelInterfMainmenu;
    }

    @Basic
    @Column(name = "FL_OPEN_EL_INTERF_MAINMENU", nullable = true)
    public Short getFlOpenElInterfMainmenu() {
        return flOpenElInterfMainmenu;
    }

    public void setFlOpenElInterfMainmenu(Short flOpenElInterfMainmenu) {
        this.flOpenElInterfMainmenu = flOpenElInterfMainmenu;
    }

    @Basic
    @Column(name = "GUIDMOD_INTERF_MAINMENU", nullable = true, length = 38)
    public String getGuidmodInterfMainmenu() {
        return guidmodInterfMainmenu;
    }

    public void setGuidmodInterfMainmenu(String guidmodInterfMainmenu) {
        this.guidmodInterfMainmenu = guidmodInterfMainmenu;
    }

    @Basic
    @Column(name = "TYPE_IDEL_INTERF_MAINMENU", nullable = true)
    public Integer getTypeIdelInterfMainmenu() {
        return typeIdelInterfMainmenu;
    }

    public void setTypeIdelInterfMainmenu(Integer typeIdelInterfMainmenu) {
        this.typeIdelInterfMainmenu = typeIdelInterfMainmenu;
    }

    @Basic
    @Column(name = "IDMOD_INTERF_MAINMENU", nullable = true)
    public Long getIdmodInterfMainmenu() {
        return idmodInterfMainmenu;
    }

    public void setIdmodInterfMainmenu(Long idmodInterfMainmenu) {
        this.idmodInterfMainmenu = idmodInterfMainmenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterfMainmenuEntity that = (InterfMainmenuEntity) o;

        if (idInterfMainmenu != that.idInterfMainmenu) return false;
        if (idbaseInterfMainmenu != null ? !idbaseInterfMainmenu.equals(that.idbaseInterfMainmenu) : that.idbaseInterfMainmenu != null)
            return false;
        if (idextBaseInterfMainmenu != null ? !idextBaseInterfMainmenu.equals(that.idextBaseInterfMainmenu) : that.idextBaseInterfMainmenu != null)
            return false;
        if (idextDoutInterfMainmenu != null ? !idextDoutInterfMainmenu.equals(that.idextDoutInterfMainmenu) : that.idextDoutInterfMainmenu != null)
            return false;
        if (idgrpInterfMainmenu != null ? !idgrpInterfMainmenu.equals(that.idgrpInterfMainmenu) : that.idgrpInterfMainmenu != null)
            return false;
        if (nameInterfMainmenu != null ? !nameInterfMainmenu.equals(that.nameInterfMainmenu) : that.nameInterfMainmenu != null)
            return false;
        if (modulInterfMainmenu != null ? !modulInterfMainmenu.equals(that.modulInterfMainmenu) : that.modulInterfMainmenu != null)
            return false;
        if (idgrpuserInterfMainmenu != null ? !idgrpuserInterfMainmenu.equals(that.idgrpuserInterfMainmenu) : that.idgrpuserInterfMainmenu != null)
            return false;
        if (applicationInterfMainmenu != null ? !applicationInterfMainmenu.equals(that.applicationInterfMainmenu) : that.applicationInterfMainmenu != null)
            return false;
        if (shortcutInterfMainmenu != null ? !shortcutInterfMainmenu.equals(that.shortcutInterfMainmenu) : that.shortcutInterfMainmenu != null)
            return false;
        if (indexInterfMainmenu != null ? !indexInterfMainmenu.equals(that.indexInterfMainmenu) : that.indexInterfMainmenu != null)
            return false;
        if (guidInterfMainmenu != null ? !guidInterfMainmenu.equals(that.guidInterfMainmenu) : that.guidInterfMainmenu != null)
            return false;
        if (typeTblInterfMainmenu != null ? !typeTblInterfMainmenu.equals(that.typeTblInterfMainmenu) : that.typeTblInterfMainmenu != null)
            return false;
        if (flUpdFormInterfMainmenu != null ? !flUpdFormInterfMainmenu.equals(that.flUpdFormInterfMainmenu) : that.flUpdFormInterfMainmenu != null)
            return false;
        if (flNewDocInterfMainmenu != null ? !flNewDocInterfMainmenu.equals(that.flNewDocInterfMainmenu) : that.flNewDocInterfMainmenu != null)
            return false;
        if (idelInterfMainmenu != null ? !idelInterfMainmenu.equals(that.idelInterfMainmenu) : that.idelInterfMainmenu != null)
            return false;
        if (flOpenElInterfMainmenu != null ? !flOpenElInterfMainmenu.equals(that.flOpenElInterfMainmenu) : that.flOpenElInterfMainmenu != null)
            return false;
        if (guidmodInterfMainmenu != null ? !guidmodInterfMainmenu.equals(that.guidmodInterfMainmenu) : that.guidmodInterfMainmenu != null)
            return false;
        if (typeIdelInterfMainmenu != null ? !typeIdelInterfMainmenu.equals(that.typeIdelInterfMainmenu) : that.typeIdelInterfMainmenu != null)
            return false;
        if (idmodInterfMainmenu != null ? !idmodInterfMainmenu.equals(that.idmodInterfMainmenu) : that.idmodInterfMainmenu != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idInterfMainmenu ^ (idInterfMainmenu >>> 32));
        result = 31 * result + (idbaseInterfMainmenu != null ? idbaseInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idextBaseInterfMainmenu != null ? idextBaseInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idextDoutInterfMainmenu != null ? idextDoutInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idgrpInterfMainmenu != null ? idgrpInterfMainmenu.hashCode() : 0);
        result = 31 * result + (nameInterfMainmenu != null ? nameInterfMainmenu.hashCode() : 0);
        result = 31 * result + (modulInterfMainmenu != null ? modulInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idgrpuserInterfMainmenu != null ? idgrpuserInterfMainmenu.hashCode() : 0);
        result = 31 * result + (applicationInterfMainmenu != null ? applicationInterfMainmenu.hashCode() : 0);
        result = 31 * result + (shortcutInterfMainmenu != null ? shortcutInterfMainmenu.hashCode() : 0);
        result = 31 * result + (indexInterfMainmenu != null ? indexInterfMainmenu.hashCode() : 0);
        result = 31 * result + (guidInterfMainmenu != null ? guidInterfMainmenu.hashCode() : 0);
        result = 31 * result + (typeTblInterfMainmenu != null ? typeTblInterfMainmenu.hashCode() : 0);
        result = 31 * result + (flUpdFormInterfMainmenu != null ? flUpdFormInterfMainmenu.hashCode() : 0);
        result = 31 * result + (flNewDocInterfMainmenu != null ? flNewDocInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idelInterfMainmenu != null ? idelInterfMainmenu.hashCode() : 0);
        result = 31 * result + (flOpenElInterfMainmenu != null ? flOpenElInterfMainmenu.hashCode() : 0);
        result = 31 * result + (guidmodInterfMainmenu != null ? guidmodInterfMainmenu.hashCode() : 0);
        result = 31 * result + (typeIdelInterfMainmenu != null ? typeIdelInterfMainmenu.hashCode() : 0);
        result = 31 * result + (idmodInterfMainmenu != null ? idmodInterfMainmenu.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDGRP_INTERF_MAINMENU", referencedColumnName = "ID_INTERF_MAINMENU_GRP")
//    public InterfMainmenuGrpEntity getInterfMainmenuGrpByIdgrpInterfMainmenu() {
//        return interfMainmenuGrpByIdgrpInterfMainmenu;
//    }
//
//    public void setInterfMainmenuGrpByIdgrpInterfMainmenu(InterfMainmenuGrpEntity interfMainmenuGrpByIdgrpInterfMainmenu) {
//        this.interfMainmenuGrpByIdgrpInterfMainmenu = interfMainmenuGrpByIdgrpInterfMainmenu;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDGRPUSER_INTERF_MAINMENU", referencedColumnName = "ID_SGRPUSER")
//    public SgrpuserEntity getSgrpuserByIdgrpuserInterfMainmenu() {
//        return sgrpuserByIdgrpuserInterfMainmenu;
//    }
//
//    public void setSgrpuserByIdgrpuserInterfMainmenu(SgrpuserEntity sgrpuserByIdgrpuserInterfMainmenu) {
//        this.sgrpuserByIdgrpuserInterfMainmenu = sgrpuserByIdgrpuserInterfMainmenu;
//    }

    @ManyToOne
    @JoinColumn(name = "IDMOD_INTERF_MAINMENU", referencedColumnName = "ID_PROGRAM_MODULE")
    public ProgramModuleEntity getProgramModuleByIdmodInterfMainmenu() {
        return programModuleByIdmodInterfMainmenu;
    }

    public void setProgramModuleByIdmodInterfMainmenu(ProgramModuleEntity programModuleByIdmodInterfMainmenu) {
        this.programModuleByIdmodInterfMainmenu = programModuleByIdmodInterfMainmenu;
    }

//    @OneToMany(mappedBy = "interfMainmenuByIdmainmenuInterfMainmenuPar")
//    public Collection<InterfMainmenuParEntity> getInterfMainmenuParsByIdInterfMainmenu() {
//        return interfMainmenuParsByIdInterfMainmenu;
//    }
//
//    public void setInterfMainmenuParsByIdInterfMainmenu(Collection<InterfMainmenuParEntity> interfMainmenuParsByIdInterfMainmenu) {
//        this.interfMainmenuParsByIdInterfMainmenu = interfMainmenuParsByIdInterfMainmenu;
//    }
}
