package Model.Entity;

public class StatusEntity {
    private String fullName;
    private String modelName;
    private String SN;
    private String IMEI;
    private String equipment;
    private String issue;
    private String cost;
    private String location;
    private String comment;
    private String operation;
    private String state;
    private String repairBeginDate;
    private String repairEndDate;
    private String images;

    public StatusEntity(String fullName, String modelName, String SN, String IMEI, String equipment,
                        String issue, String cost, String location, String comment, String operation,
                        String state, String repairBeginDate, String repairEndDate, String images){
        this.fullName = fullName;
        this.modelName = modelName;
        this.SN = SN;
        this.IMEI = IMEI;
        this.equipment = equipment;
        this.issue = issue;
        this.cost = cost;
        this.location = location;
        this.comment = comment;
        this.operation = operation;
        this.state = state;
        this.repairBeginDate = repairBeginDate;
        this.repairEndDate = repairEndDate;
        this.images = images;
    }

    public String getFullName() {
        return fullName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getSN() {
        return SN;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getIssue() {
        return issue;
    }

    public String getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }

    public String getComment() {
        return comment;
    }

    public String getOperation() {
        return operation;
    }

    public String getState() {
        return state;
    }

    public String getRepairBeginDate() {
        return repairBeginDate;
    }

    public String getRepairEndDate() {
        return repairEndDate;
    }

    public String getImages() {
        return images;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRepairBeginDate(String repairBeginDate) {
        this.repairBeginDate = repairBeginDate;
    }

    public void setRepairEndDate(String repairEndDate) {
        this.repairEndDate = repairEndDate;
    }

    public void setImages(String images) {
        this.images = images;
    }
}

