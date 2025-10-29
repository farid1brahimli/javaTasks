import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
//       printGreeting();
        //Task2
//        add(2, 3);
        //Task3
//        isEven(6);
        //Task4
//        printTable();
        //Task5
//        max(77,4);
        //Task6
//        isPrime(15);
        //Task7
//        fact(5);
        //Task8
//        int[] arr = {1,2,3,4,5};
//        sumArray(arr);
        //Task9
//        int[] arr = {1,2,3,4,5};
//        reverse(arr);
        //Task10
//        String text = "Hellooo World!";
//        System.out.println("Count of vowels: " + vowelsCounter(text));
        //Task11
//        String text = "atrrta";
//        isPolindrome(text);
        //Task12
//        area(4,2);
        //Task13
//        System.out.printf("%.2f", average(2, 4, 6, 8, 1, 1));
        //Task14
        double c = 25.0;
        double f = celsiusToFahrenheit(c);
        System.out.printf("%.2f°C = %.2f°F", c, f);
    }
    //Task14
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }
    //Task13
//    public static double average(int... numbers) {
//        if (numbers == null || numbers.length == 0) {
//            return 0;
//        }
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        return(double) sum / numbers.length;
//    }
    //Task12
//    public static void area(int side) {
//        System.out.println("Area of square: " + side * 4);
//    }
//    public static void area(int length,int width) {
//        System.out.println("Area of rectangle: " + (length + width) * 2);
//    }
    //Task11
//    public static void isPolindrome(String  s) {
//        boolean flag = true;
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
//                flag = false;
//            } else {
//                flag = true;
//            }
//        }
//        if (flag) {
//            System.out.println("This is polidrome!");
//        } else {
//            System.out.println("This is not polindrome!");
//        }
//    }
    //Task10
//    public static int vowelsCounter(String arr) {
//        int counter = 0;
//        String vowels = "aeiouAEIOU";
//
//        for (int i = 0; i < arr.length(); i++) {
//            char mark = arr.charAt(i);
//            if (vowels.indexOf(mark) != -1){
//                counter++;
//        }
//    }
//        return counter;
//    }
    //Task9
//    public  static void reverse(int[] arr){
//        for(int i=0;i<arr.length/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    //Task8
//    public static void sumArray(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//    }
    //Task7
//    public static void fact(int n){
//        int fact = 1;
//        if (n <= 0){
//            System.out.println("0");
//        } else{
//            for (int i = 1; i <= n; i++){
//                fact *= i;
//            }
//            System.out.println(fact);
//        }
//    }
    //Task6
//    public static void isPrime(int n){
//        boolean isPrime = true;
//       if(n < 2){
//           isPrime = false;
//       } else{
//           for( int i = 2; i <= n / 2; i++){
//               if(n % i == 0){
//                   isPrime = false;
//                   break;
//               }
//           }
//       }
//        if (isPrime){
//            System.out.println("is prime!");
//        } else  {
//            System.out.println("is not prime!");
//        }
//    }
    //Taks5
//    public  static void max(int a, int b){
//        if(a>b){
//            System.out.println(a + " is max!");
//        } else{
//            System.out.println(b + " is max!");
//        }
//    }
    //Task4
//    public static void printTable(){
//        Scanner input = new Scanner(System.in);
//        int rows = input.nextInt();
//        for(int i = 1; i <= 10; i++){
//            int j = rows * i;
//            System.out.printf("%d x %d = %d \n",rows, i, j);
//        }
//    }
    //Task3
//    public  static void isEven(int a){
//        if(a%2==0){
//            System.out.println("Even");
//        } else{
//            System.out.println("Odd");
//        }
//    }
    //Task2
//    public static void add(int a,int b){
//        int sum = a+b;
//        System.out.println(sum);
//    }
    //Task1
//    public static void printGreeting(){
//        System.out.println("Hello World");
//    }
}