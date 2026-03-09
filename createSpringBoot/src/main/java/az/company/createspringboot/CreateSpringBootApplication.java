package az.company.createspringboot;

import az.company.createspringboot.controller.CardController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CreateSpringBootApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext run = SpringApplication.run(CreateSpringBootApplication.class, args);
       System.out.println(run);
    }

}
