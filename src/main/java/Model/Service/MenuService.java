package Model.Service;

import Model.Entity.LoginSessionEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MenuService {

    public LoginSessionEntity createMenu(HttpSession session){
        LoginSessionEntity loginService = new LoginSessionEntity();
        if (session.getAttribute("login") != null){
            session.setAttribute("login", loginService);
            return loginService;
        }
        else
            return (LoginSessionEntity)session.getAttribute("login");
    }
}
