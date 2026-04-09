package az.company.jpa_hibernate;

import az.company.jpa_hibernate.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateApplication.class, args);
    }
//
//    @Bean
//    public CommandLineRunner run(UserService userService) {
//        return args -> {
//
//            userService.createUser("Farid", "farid@gmail.com");
//
//            System.out.println("User database-ə yazıldı!");
//        };
}
