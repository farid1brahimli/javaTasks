//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(5,6);

        System.out.println("Circle area is " + s1.area());
        System.out.println("Rectangle area is " + s2.area());
    }
}