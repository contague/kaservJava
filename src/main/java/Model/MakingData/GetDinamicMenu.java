package Model.MakingData;

import Model.Connect.ConectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GetDinamicMenu {
    public ArrayList getTable(String role, String idAccount, String idGroupUser){
        Connection connection = null;
        ArrayList<String[]> list = new ArrayList<String[]>();
        String command = "";

        String idGroup1;
        String group1;
        String idGroup2;
        String group2;
        String idGroup3;
        String group3;
        String idModule;
        String module;

        try {
            connection = new ConectDB().getConnection();
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

            Statement statement = connection.createStatement();
            ResultSet resSet = statement.executeQuery(commandGuest);
            while (resSet.next()) {
                idGroup1 = resSet.getString("OUT_IDGRP_1");
                group1 = resSet.getString("OUT_NAMEGRP_1");
                idGroup2 = resSet.getString("OUT_IDGRP_2");
                group2 = resSet.getString("OUT_NAMEGRP_2");
                idGroup3 = resSet.getString("OUT_IDGRP");
                group3 = resSet.getString("NAME_INTERF_MAINMENU");
                idModule = resSet.getString("IDEL_INTERF_MAINMENU");
                module = resSet.getString("PATCH_PROGRAM_MODULE");
                list.add(new String[]{idGroup1, group1, idGroup2, group2, idGroup3, group3, idModule, module});
            }

            if (role.equals("diler")){
                Statement statementDiler = connection.createStatement();
                ResultSet resultSet = statementDiler.executeQuery(commandDiler);
                while (resultSet.next()) {
                    idGroup1 = resultSet.getString("OUT_IDGRP_1");
                    group1 = resultSet.getString("OUT_NAMEGRP_1");
                    idGroup2 = resultSet.getString("OUT_IDGRP_2");
                    group2 = resultSet.getString("OUT_NAMEGRP_2");
                    idGroup3 = resultSet.getString("OUT_IDGRP");
                    group3 = resultSet.getString("NAME_CUST_MAINMENU");
                    idModule = resultSet.getString("IDEL_CUST_MAINMENU");
                    module = resultSet.getString("PATCH_PROGRAM_MODULE");
                    list.add(new String[]{idGroup1, group1, idGroup2, group2, idGroup3, group3, idModule, module});
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}