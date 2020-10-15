package Controller;

import Model.Entity.LoginEntity;
import Model.Entity.LoginSessionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginCheckController {

    @Autowired
    HttpSession session;

    @GetMapping("checkLogin")
    public LoginEntity checkLoginRole(){
        LoginSessionEntity loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        return new LoginEntity(loginSessionEntity.getRole());
    }
}
