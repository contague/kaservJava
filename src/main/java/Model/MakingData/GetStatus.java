package Model.MakingData;
import Model.Connect.GetSession;
import Model.Entities.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

public class GetStatus {

    private String number;
    private String surname;

    public GetStatus(String number, String surname) {
        this.number = number;
        this.surname = surname;
    }

    public GetStatus() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap getMap(){
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        HashMap<String, String> map = new HashMap<String, String>();
        String operationsWithSplit = "";

        try {
            List<RemZEntity> entities = session.createQuery("from RemZEntity where numRemZ = " + number + " and klientNameRemZ like '" + surname + "%'").list();
            RemZEntity resEntity = entities.get(0);
            SskladEntity sskladEntity = resEntity.getSskladByIdtecsklRemZ();
            RemSsostEntity ssostEntity = resEntity.getRemSsostByIdsostRemZ();

            Collection<RemDremontEntity> remDremontEntities = resEntity.getRemDremontsByIdRemZ();
            Iterator<RemDremontEntity> iterator = remDremontEntities.iterator();
            while (iterator.hasNext()) {
                RemDremontEntity remDremontEntity = iterator.next();
                RemGalldocEntity remGalldocEntity = remDremontEntity.getRemGalldocByIddocRemDremont();
                Collection<RemDremonttEntity> remDremonttEntities = remGalldocEntity.getRemDremonttsByIdRemGalldoc();
                Iterator<RemDremonttEntity> remDremonttEntityIterator = remDremonttEntities.iterator();


                while (remDremonttEntityIterator.hasNext()) {
                    RemDremonttEntity remDremonttEntity = remDremonttEntityIterator.next();
                    SnomEntity snomEntity = remDremonttEntity.getSnomByIdnomRemDremontt();
                    operationsWithSplit = operationsWithSplit + snomEntity.getNamenom() + "$";
                }
            }


            String brand = checkForNull(resEntity.getModelRemZ()).split(" ")[0];
            String sn = checkForNull(resEntity.getSernumRemZ());
            String year = checkForNull(resEntity.getPosRemZ()).substring(0,4);
            String month = checkForNull(resEntity.getPosRemZ()).substring(5,7) + "_" + year;

            String[] images = new GetImages().getImg(sn, brand, month);
            String imagesWithSplit = "";
            if (images != null) {
                for (String img : images) {
                    imagesWithSplit += img + "$";
                }
            }

            map.put("fullName", checkForNull(resEntity.getKlientNameRemZ()));
            map.put("modelName", checkForNull(resEntity.getModelRemZ()));
            map.put("SN", checkForNull(resEntity.getSernumRemZ()));
            map.put("IMEI", checkForNull(resEntity.getSernum2RemZ()));
            map.put("equipment", checkForNull(resEntity.getKomplectRemZ()));
            map.put("issue", checkForNull(resEntity.getNeisprRemZ()));
            map.put("cost", checkForNull(resEntity.getSumRemZ()));
            map.put("location", sskladEntity.getAdrsklad());
            map.put("comment", resEntity.getComentsRemZ());
            map.put("operation", operationsWithSplit);
            map.put("state", ssostEntity.getNameRemssost());
            map.put("repairBeginDate", checkForNull(resEntity.getPosRemZ()));
            map.put("repairEndDate", checkForNull(resEntity.getPosremontRemZ()));
            map.put("images", imagesWithSplit);
            session.flush();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return map;
    }

    private String checkForNull(Object text){
        return text != null ? text.toString() : "";
    }
}