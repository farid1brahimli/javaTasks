//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        divide(3, 0);

    }
    public static void divide( int a, int b ) {
        try {
            int c = a / b;
        } catch ( ArithmeticException e ) {
            System.out.println("Dont allow division by zero!");
        }
    }
}