//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator multiply = new Multiplication();

        System.out.println(add.operator(2, 3));
        System.out.println(multiply.operator(2, 3));
    }
}