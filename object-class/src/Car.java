public class Car {
    //TASK1
//    public String brand;
//    public String model;
//    public int year;

    //TASK5
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public static void startCar(){
    System.out.println("Mashin xoddanir");
    Engine.startEngine();
    }
}
