package Controller;

import Model.Entity.StatusEntity;
import Model.Service.StatusService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @PostMapping("status")
    public StatusEntity statusForOut(StatusService statusService){
        System.out.println("into the rest controller");
        return statusService.getEntity();
    }
}
