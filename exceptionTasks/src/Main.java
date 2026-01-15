import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TASK11 - 12 - 13 -
        BankAccount account = new BankAccount(300,301);
        account.getDrawingPrice();
        //TASK10 - Throw and Throws -
//        try {
//            ThrowAndThrows.checkAge(17);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        //TASK9 - Exception Propagation -
//        ExceptionPropagation.method1();
//
        //TASK8 - Custom Exception -
//        int age = 17;
//        try {
//            if(age < 18) {
//                throw new InvalidAgeException("Age must be 18 or older");
//            } else{
//                System.out.println(age);
//            }
//        } catch (InvalidAgeException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }
        //TASK7 - throw -
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age ..");
//        int age = sc.nextInt();
//            if ((age <= 0) || (age > 120)) {
//                throw new IllegalArgumentException("Invalid age");
//            }
//        System.out.println("You entered " + age + " years old");

//        TASK6 - Finally block -
//        try {
//            int result = 5 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception");
//        } finally {
//            System.out.println("Finally block is always executed");
//        }

        //TASK5 - Multiple catch -
//        try {
//            int a = 5;
//            int b = 5;
//            int result = a / b;
//            String sum = null;
//            System.out.println("The sum is " + result);
//            System.out.println(sum.length());
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception");
//        } catch (NullPointerException e) {
//            System.out.println("NullPointer Exception");
//        }

        //TASK4 - Multiple exceptions -
//        try {
//            String s = "123a45";
//            int b = Integer.parseInt(s);
//            System.out.println(b);
//            int a = 5/0;
//            System.out.println(a);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        //TASK3 - NumberFormatException -
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        String input = sc.nextLine();
//        try {
//            int number = Integer.parseInt(input);
//            System.out.println("Number is: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid number format!");
//            throw new RuntimeException(e);
//        }
        //TASK2 - ArrayIndexOutOfBoundsException -
//        int[] numbers = {1,2,3,4,5};
//        try {
//            System.out.println(numbers[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }
        //TASK1 - ArithmeticException -
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int b = scanner.nextInt();
//        try {
//            int result = a / b;
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//
//        }
    }
}