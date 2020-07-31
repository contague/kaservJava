package Model.Entity;

public class InfoBlockElementEntity {
    private String type;
    private String data;
    private String img;

    public InfoBlockElementEntity(String type, String data, String idImg){
        this.type = type;
        this.data = data;
        this.img =  idImg;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getImg() {
        return img;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setImg(String idImg) {
        this.img = idImg;
    }
}
