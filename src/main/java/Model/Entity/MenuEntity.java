package Model.Entity;

import java.util.ArrayList;

public class MenuEntity {
    private ArrayList list;

    public MenuEntity(ArrayList list){
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
