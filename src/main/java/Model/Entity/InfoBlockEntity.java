package Model.Entity;

import java.util.ArrayList;

public class InfoBlockEntity {
    private ArrayList list;
    public InfoBlockEntity(ArrayList list){
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
