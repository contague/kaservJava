package Model.MakingData;

import Model.Connect.GetSession;

import Model.Entities.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class GetJournal implements ListDAO {

    public ArrayList getList(int id, String firstDate, String secondDate, String option, String login) {
        System.out.println(firstDate + " " + secondDate + " " + option + " " + login + " в классе model");
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
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

                HashMap map = new GetStatus(remZEntity.getNumRemZ() + "", remZEntity.getKlientNameRemZ()).getMap();
                RemStremontEntity remStremontEntity = remZEntity.getRemStremontByIdtyperemRemZ();
                RemSsostEntity remSsostEntity = remZEntity.getRemSsostByIdsostRemZ();
                map.put("type", remStremontEntity.getNameStremont());
                map.put("ready", remSsostEntity.getNameRemssost());
                map.put("number", remZEntity.getNumRemZ() + "");
                list.add(map);
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
