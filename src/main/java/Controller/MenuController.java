package Controller;

import Model.Entity.LoginSessionEntity;
import Model.Entity.MenuElementEntity;
import Model.MakingData.GetDinamicMenu;
import Model.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class MenuController {

    @Autowired
    HttpSession session;

    @Autowired
    MenuService service;

    int i =0;

    @GetMapping("menu")
    public ArrayList<MenuElementEntity> menu(){
        System.out.println("test");


        LoginSessionEntity loginSessionEntity;
        if (session.getAttribute("login") == null){
            loginSessionEntity = new LoginSessionEntity();
            session.setAttribute("login", loginSessionEntity);
        }
        else
            loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        String role = loginSessionEntity.getRole();
        String idAccount = loginSessionEntity.getIdAccount();
        String idGroupUser = loginSessionEntity.getIdGroupUser();
        GetDinamicMenu getDinamicMenu = new GetDinamicMenu();
        ArrayList<MenuElementEntity> list = getDinamicMenu.getMenu(role, idAccount, idGroupUser);
        System.out.println(i);
        System.out.println(i +  6);
        return list;
    }
}
