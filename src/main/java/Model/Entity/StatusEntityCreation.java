package Model.Entity;

import java.util.HashMap;

public class StatusEntityCreation {

    public StatusEntity createEntity(HashMap map){
        String fullName = map.get("fullName") == null ? "" : map.get("fullName").toString();
        String modelName = map.get("modelName") == null ? "" : map.get("modelName").toString();
        String SN = map.get("SN") == null ? "" : map.get("SN").toString();
        String IMEI = map.get("IMEI") == null ? "" : map.get("IMEI").toString();
        String equipment = map.get("equipment") == null ? "" : map.get("equipment").toString();
        String issue = map.get("issue") == null ? "" : map.get("issue").toString();
        String cost = map.get("cost") == null ? "" : map.get("cost").toString();
        String location = map.get("location") == null ? "" : map.get("location").toString();
        String comment = map.get("comment") == null ? "" : map.get("comment").toString();
        String operation = map.get("operation") == null ? "" : map.get("operation").toString();
        String state = map.get("state") == null ? "" : map.get("state").toString();
        String repairBeginDate = map.get("repairBeginDate") == null ? "" : map.get("repairBeginDate").toString();
        String repairEndDate = map.get("repairEndDate") == null ? "" : map.get("repairEndDate").toString();
        String images = map.get("images") == null ? "" : map.get("images").toString();

        if (map.size() == 0){
            return null;
        }

        StatusEntity entity = new StatusEntity(fullName, modelName, SN, IMEI, equipment,issue, cost, location,
                comment, operation, state, repairBeginDate, repairEndDate, images);

        return entity;
    }
}
