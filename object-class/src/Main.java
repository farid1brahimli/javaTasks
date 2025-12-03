//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TASK1
//        Car car = new Car();
//        car.brand = "Mercedes";
//        car.model = "W211";
//        car.year = 2003;
//        System.out.println(car.brand);
//        System.out.println(car.model);
//        System.out.println(car.year);

        //TASK2
//        Student s1 = new Student("Farid", 22);
//        Student s2 = new Student("Elmar", 21)
//        Student s3 = new Student("Ramin", 21);
//        Student s4 = new Student("Ilvin", 21);
//
//        s1.displayInfo();
//        s2.displayInfo();
//        s3.displayInfo();
//        s4.displayInfo();

        //TASK4
//        Book book1 =  new Book("Sefiller", "Viktor Huqo", 25);
//        Book book2 =  new Book("Sefiller", "Viktor Huqo");
//        Book book3 =  new Book();
//
//        System.out.println(book3.price);

        //TASK4
//        Person person = new Person("Farid", 94);
//        System.out.println(person.getName());
//        person.setName("Rauf");
//        System.out.println(person.getName());
//
//        person.getInfo();


        //Task5
//        Engine engine = new Engine(250);
//        Car car = new Car(engine);
//
//        car.startCar();


        //Task6
//        Reactangle s1 = new Reactangle(2,3);
//        System.out.println("Reactangle of Area is: " + s1.getArea());
//        System.out.println( "Reactangle of Perimeter is: " + s1.getPerimeter());


        //TASK7
        Address a1 = new Address("Baki", "Yasamal", "14j");
        Address a2 = new Address("Baki", "Nerimanov", "19b");
        Address a3 = new Address("Baki", "Sebail", "199a-1");

        Employe e1 = new Employe("Farid", 2000, a1);
        Employe e2 = new Employe("Ramin", 1500, a2);
        Employe e3 = new Employe("Elmar", 4500, a3);

        e1.showEmployeeDetails();
        e2.showEmployeeDetails();
        e3.showEmployeeDetails();
    }
}