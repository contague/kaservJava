package Model.Entity;

import java.util.ArrayList;

public class JournalEntity {
    protected ArrayList list;

    public JournalEntity(ArrayList list){
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
