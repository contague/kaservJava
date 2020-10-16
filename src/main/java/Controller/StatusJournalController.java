package Controller;

import Model.Entity.JournalEntity;
import Model.Entity.LoginSessionEntity;
import Model.MakingData.GetJournal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class StatusJournalController {

    @Autowired
    HttpSession session;

    @PostMapping("statusJournal")
    public ArrayList statusJournal(@RequestBody GetJournal getJournal){
        LoginSessionEntity loginSessionEntity = (LoginSessionEntity)session.getAttribute("login");
        getJournal.setLogin(loginSessionEntity.getLogin());
        return getJournal.journalList();
    }
}
