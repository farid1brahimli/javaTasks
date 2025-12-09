import task2.Employee;
import task3.Circle;
import task3.Shape;
import task3.Square;
import task4.Car;
import task4.ElectricCar;
import task4.Vehicle;
import task5.Developer;
import task5.Employeee;
import task5.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TASK1
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        animal.sound();
//        dog.sound();
//        cat.sound();

        //TASK3
//        Shape shape = new Shape();
//        shape.area();
//        Circle circle = new Circle();
//        circle.area();
//        Square square = new Square();
//        square.area();
        //TASK4
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.setCategory();
//        electricCar.playEngine();
//        electricCar.chargeBattery();
//        Employeee staff1 = new Employeee("Jane", 200);
//        staff1.getSalary();
        Manager manager1 = new Manager("Jane",200);
        manager1.getSalary();
        Developer developer1 = new Developer("Farid", 300);
        developer1.getSalary();
    }
}