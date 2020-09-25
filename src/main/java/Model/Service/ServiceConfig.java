package Model.Service;

import Model.Entity.StatusEntityCreation;
import Model.MakingData.GetStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public GetStatus getStatus(){
        return new GetStatus();
    }

    @Bean
    public StatusEntityCreation statusEntityCreation(){
        return new StatusEntityCreation(getStatus());
    }
}
