package Controller;

import Model.MakingData.GetInfoBlock;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class InfoBlockController {

    @PostMapping("infoBlock")
    public ArrayList infoBlockForOut(@RequestBody GetInfoBlock getInfoBlock){
        return getInfoBlock.getList();
    }
}
