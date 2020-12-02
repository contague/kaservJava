package Model.MakingData;

import Model.Connect.GetSession;
import Model.Entity.MenuElementEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class GetDinamicMenu {

    private String idGroup1;
    private String group1;
    private String idGroup2;
    private String group2;
    private String idGroup3;
    private String group3;
    private String idModule;
    private String module;

    public GetDinamicMenu(String idGroup1, String group1, String idGroup2, String group2, String idGroup3, String group3, String idModule, String module) {
        this.idGroup1 = idGroup1;
        this.group1 = group1;
        this.idGroup2 = idGroup2;
        this.group2 = group2;
        this.idGroup3 = idGroup3;
        this.group3 = group3;
        this.idModule = idModule;
        this.module = module;
    }

    public GetDinamicMenu() {
    }

    public String getIdGroup1() {
        return idGroup1;
    }

    public void setIdGroup1(String idGroup1) {
        this.idGroup1 = idGroup1;
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public String getIdGroup2() {
        return idGroup2;
    }

    public void setIdGroup2(String idGroup2) {
        this.idGroup2 = idGroup2;
    }

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
    }

    public String getIdGroup3() {
        return idGroup3;
    }

    public void setIdGroup3(String idGroup3) {
        this.idGroup3 = idGroup3;
    }

    public String getGroup3() {
        return group3;
    }

    public void setGroup3(String group3) {
        this.group3 = group3;
    }

    public String getIdModule() {
        return idModule;
    }

    public void setIdModule(String idModule) {
        this.idModule = idModule;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public ArrayList getMenu(String role, String idAccount, String idGroupUser){
        Session session = GetSession.getSession();
        Transaction transaction = session.beginTransaction();
        List<Object[]> list;
        ArrayList<MenuElementEntity> menuList = new ArrayList();

        String commandGuest =
                "select interf_get_table_mainmenu.*, "
                        + " interf_mainmenu.name_interf_mainmenu, "
                        + " interf_mainmenu.fl_open_el_interf_mainmenu, "
                        + " interf_mainmenu.idel_interf_mainmenu, "
                        + " program_module.patch_program_module "

                        + "          from interf_get_table_mainmenu(4,11,0,0,'',0,'',0,'',1), interf_mainmenu "
                        + "          left outer join program_module on  interf_mainmenu.idmod_interf_mainmenu=program_module.id_program_module "
                        + "          where interf_get_table_mainmenu.out_idgrp=interf_mainmenu.idgrp_interf_mainmenu "
                        + "          order by interf_get_table_mainmenu.out_idgrp_1, "
                        + "                  interf_get_table_mainmenu.out_idgrp_2, "
                        + "                  interf_get_table_mainmenu.out_idgrp_3";

        String commandDiler =
                "select cust_get_table_mainmenu.*, "
                        +"    cust_mainmenu.name_cust_mainmenu,"
                        +"  cust_mainmenu.fl_open_el_cust_mainmenu,"
                        +"  cust_mainmenu.idel_cust_mainmenu,"
                        +"  program_module.patch_program_module "
                        +"           from cust_get_table_mainmenu(" + idAccount +"," + idGroupUser + ",0,0,'',0,'',0,'',1), cust_mainmenu "
                        +"           left outer join program_module on  cust_mainmenu.idmod_cust_mainmenu=program_module.id_program_module "
                        +"           where cust_get_table_mainmenu.out_idgrp=cust_mainmenu.idgrp_cust_mainmenu "
                        +"          order by cust_get_table_mainmenu.out_idgrp_1, "
                        + "                    cust_get_table_mainmenu.out_idgrp_2, "
                        +"                   cust_get_table_mainmenu.out_idgrp_3 ";

        String finalCommand = "";
        try{
            list = session.createSQLQuery(commandGuest).list();
            menuList = createMenuList(menuList, list);

            if (role.equals("diler")) {
                list = session.createSQLQuery(commandDiler).list();
                menuList = createMenuList(menuList, list);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            transaction.commit();
        }
        return menuList;
    }

    private ArrayList<MenuElementEntity> createMenuList(ArrayList<MenuElementEntity> menuList, List<Object[]> list){
        for (Object[] entity : list) {
            idGroup1 = turnToString(entity[0]);
            group1 = turnToString(entity[1]);
            idGroup2 = turnToString(entity[2]);
            group2 = turnToString(entity[3]);
            idGroup3 = turnToString(entity[6]);
            group3 = turnToString(entity[7]);
            idModule = turnToString(entity[9]);
            module = turnToString(entity[10]);
            menuList.add(new MenuElementEntity(idGroup1, group1, idGroup2, group2, idGroup3, group3, idModule, module));
        }
        return menuList;
    }

    private String turnToString(Object o){
        if (o == null)
            return "";
        else return o.toString();
    }
}