import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Scanner input = new Scanner(System.in);
//      int age = input.nextInt();
//      if ( age < 18 && age >0) {
//          System.out.println("Access denied, filankes!");
//      } else if(age >= 18){
//          System.out.println("Welcome, filankes!");
//      } else{
//          System.out.println("Sen dogulmaybsan hele!");
//      }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sumToN(n);

    }
    public static int sumToN(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = n; i >= 0; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;

    }

}