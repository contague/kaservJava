package Model.MakingData;

import Model.Connect.GetSession;

import Model.Entities.*;
import Model.Entity.StatusEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class GetJournal {

    private String firstDate;
    private String secondDate;
    private String option;
    private String login;

    public GetJournal() {
    }

    public GetJournal(String firstDate, String secondDate, String option, String login) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
        this.option = option;
        this.login = login;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = secondDate;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public ArrayList journalList() {
        System.out.println(firstDate + " " + secondDate + " " + option + " " + login + " в классе model");
        ArrayList<StatusEntity> list = new ArrayList();
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        Date date1 = new Date(Long.parseLong(firstDate));
        Date date2 = new Date(Long.parseLong(secondDate));
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateSecond = formatter.format(date1) + " 00:00:00";
        String dateFirst = formatter.format(date2) + " 00:00:00";
        String subCommand;


        if (option.equals("2")){
            subCommand = " and gotovoKVidacheRemZ = 1";
        }

        else if (option.equals("3")){
            subCommand = " and gotovoKVidacheRemZ = 0";
        }
        else {
            subCommand = "";
        }

        try {
            List<CustAccountEntity> entityList = session.createQuery("from CustAccountEntity where nameCustAccount = '" + login + "'").list();
            CustAccountEntity custAccountEntity = entityList.get(0);
            Collection<CustKlientEntity> custKlientEntities = custAccountEntity.getCustKlientsByIdCustAccount();
            Iterator<CustKlientEntity> iterator = custKlientEntities.iterator();
            CustKlientEntity custKlientEntity = iterator.next();
            Long idaccountCustKlient = custKlientEntity.getIdklientCustKlient();

            List<RemZEntity> remZEntityList = session.createQuery("from RemZEntity where  posRemZ between '" + dateFirst +
                    "' and '" + dateSecond + "' and iddilerRemZ = " + idaccountCustKlient + subCommand).list();

            for (int i = 0; i < remZEntityList.size(); i++){
                RemZEntity remZEntity = remZEntityList.get(i);

                StatusEntity statusEntity = new GetStatus(remZEntity.getNumRemZ() + "", remZEntity.getKlientNameRemZ()).getStatusEntity();
                RemStremontEntity remStremontEntity = remZEntity.getRemStremontByIdtyperemRemZ();
                RemSsostEntity remSsostEntity = remZEntity.getRemSsostByIdsostRemZ();

                statusEntity.setType(remStremontEntity.getNameStremont());
                statusEntity.setReady(remSsostEntity.getNameRemssost());
                statusEntity.setNumber(remZEntity.getNumRemZ() + "");

                list.add(statusEntity);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return list;
    }
}
