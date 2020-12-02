package Model.SpringConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"Model", "Controller"})
public class SpringBootAppConf {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppConf.class, args);
    }
}
