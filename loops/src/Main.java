//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

        //Task2
//        int N = 4;
//        int sum = 0;
//        for (int i = 1; i <= N; i++) {
//            sum += i;
//        }
//        System.out.println("sum of numbers 1 to " + N + " is " + sum);
//
         //Task3
//        int sum = 0;
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            else  {
//                continue;
//            }
//        }
//        System.out.println(sum);

        //Task4
//        int i = 10;
//        while(i > 0){
//            System.out.println(i);
//            i--;
//        }

        //Task5
//        int a = 2;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(a + " x " + i + " = " + a*i);
//        }

        //Task6
//        int sumOfEvenNumbers = 0;
//        int sumOfOddNumbers = 0;
//        int N = 25;
//        for (int i = 1; i <= N; i++) {
//            if (i % 2 == 0) {
//                sumOfEvenNumbers += i;
//            } else {
//                sumOfOddNumbers += i;
//            }
//        }
//        System.out.println(sumOfEvenNumbers);
//        System.out.println(sumOfOddNumbers);
//
         //Task7
//        int N = 5;
//        int factorial = 1;
//        for (int i = 1; i <= N; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);
        //Task8
//        int number = 123;
//        int reversed = 0;
//        while (number != 0) {
//            int lastDigit = number % 10;
//            reversed = reversed*10 + lastDigit;
//            number = number / 10;
//        }
//        System.out.println(reversed);

        //Task9
//        int number = 123;
//        int sumDigit = 0;
//        while (number != 0) {
//            int lastDigit = number % 10;
//            sumDigit += lastDigit;
//            number = number / 10;
//        }
//        System.out.println(sumDigit);

        //Task10
//        int number = 12;
//        boolean isPrime = true;
//        if (number < 2) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= number / 2; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime)
//            System.out.println(number + " is a prime number.");
//        else
//            System.out.println(number + " is NOT a prime number.");

        //Task11
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}