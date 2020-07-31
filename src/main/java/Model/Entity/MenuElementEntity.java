package Model.Entity;

public class MenuElementEntity {
    private String idGroup1;
    private String group1;
    private String idGroup2;
    private String group2;
    private String idGroup3;
    private String group3;
    private String idModule;
    private String module;

    public MenuElementEntity(String idGroup1, String group1, String idGroup2,
                             String group2, String idGroup3, String group3, String idModule, String module){
        this.idGroup1 = idGroup1;
        this.group1 = group1;
        this.idGroup2 = idGroup2;
        this.group2 = group2;
        this.idGroup3 = idGroup3;
        this.group3 = group3;
        this.idModule = idModule;
        this.module = module;
    }

    public String getGroup1() {
        return group1;
    }

    public String getGroup2() {
        return group2;
    }

    public String getGroup3() {
        return group3;
    }

    public String getIdGroup1() {
        return idGroup1;
    }

    public String getIdGroup2() {
        return idGroup2;
    }

    public String getIdGroup3() {
        return idGroup3;
    }

    public String getIdModule() {
        return idModule;
    }

    public String getModule() {
        return module;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
    }

    public void setGroup3(String group3) {
        this.group3 = group3;
    }

    public void setIdGroup1(String idGroup1) {
        this.idGroup1 = idGroup1;
    }

    public void setIdGroup2(String idGroup2) {
        this.idGroup2 = idGroup2;
    }

    public void setIdGroup3(String idGroup3) {
        this.idGroup3 = idGroup3;
    }

    public void setIdModule(String idModule) {
        this.idModule = idModule;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
