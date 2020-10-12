package Controller;

import Model.Entity.StatusEntity;
import Model.MakingData.GetStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @PostMapping("status")
    public StatusEntity statusForOut(@RequestBody GetStatus getStatus){
        return getStatus.getStatusEntity();
    }
}