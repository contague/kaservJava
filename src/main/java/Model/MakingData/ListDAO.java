package Model.MakingData;

import java.util.ArrayList;

public interface ListDAO {
    ArrayList getList(int id, String firstDate, String secondDate, String option, String login);
}
