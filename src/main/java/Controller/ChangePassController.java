package Controller;

import Model.Entity.LoginSessionEntity;
import Model.Entity.ResultChangePassEntity;
import Model.MakingData.ChangePass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ChangePassController {

    @Autowired
    HttpSession session;

    @PostMapping("changePass")
    public ResultChangePassEntity changePass(@RequestBody ChangePass changePass){
        LoginSessionEntity loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        changePass.setIdCustUser(loginSessionEntity.getIdCustUser());
        return changePass.changePassword();
    }
}
