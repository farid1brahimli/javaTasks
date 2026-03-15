package az.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("context.xml");

        Car car = context.getBean("car", Car.class);
        car.getStart();
    }
}