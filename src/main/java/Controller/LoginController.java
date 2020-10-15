package Controller;

import Model.Entity.LoginEntity;
import Model.Entity.LoginSessionEntity;
import Model.MakingData.GetLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    HttpSession session;

    @PostMapping("login")
    public LoginEntity login(@RequestBody GetLogin getLogin){
        LoginSessionEntity loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        loginSessionEntity = getLogin.getLogin(loginSessionEntity);
        session.setAttribute("login", loginSessionEntity);
        return new LoginEntity(loginSessionEntity.getRole());
    }
}
