package Controller;

import Model.Entity.LoginEntity;
import Model.Entity.LoginSessionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LogOutController {

    @Autowired
    HttpSession session;

    @GetMapping("logOut")
    public LoginEntity logOut(){
        LoginSessionEntity loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        loginSessionEntity.setRole("guest");
        return new LoginEntity(loginSessionEntity.getRole());
    }
}
