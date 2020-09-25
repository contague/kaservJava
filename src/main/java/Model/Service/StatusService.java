package Model.Service;

import Model.Entity.StatusEntity;
import Model.Entity.StatusEntityCreation;
import Model.MakingData.GetStatus;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StatusService {
    private String surname;
    private String number;

    public StatusService(String surname, String number) {
        this.surname = surname;
        this.number = number;
    }

    public StatusService() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public StatusEntity getEntity(){
        StatusEntity statusEntity = null;
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
            GetStatus getStatus = context.getBean("getStatus", GetStatus.class);
            getStatus.setNumber(number);
            getStatus.setSurname(surname);
            StatusEntityCreation statusEntityCreation = context.getBean("statusEntityCreation", StatusEntityCreation.class);
            statusEntity = statusEntityCreation.createEntity();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return statusEntity;
    }
}