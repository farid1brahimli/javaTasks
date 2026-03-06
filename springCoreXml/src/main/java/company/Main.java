package company;

import company.service.CardService;
import company.service.DatabaseConnectService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("context.xml");
        var bean = context.getBean(DatabaseConnectService.class);
        bean.connectDatabase();
    }
}