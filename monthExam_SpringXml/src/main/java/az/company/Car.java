package az.company;

public class Car {
    private final Enginee enginee;

    public Car(Enginee enginee) {
        this.enginee = enginee;
    }

    public void getStart(){
        System.out.println("Starting Car");
        enginee.start();
    }
}
