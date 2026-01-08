import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int result = MathUtils.divide(10,0);
            System.out.println(result);
        } catch (DivisionByZeroException e) {
            System.out.println("Xeta bash verdi: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}