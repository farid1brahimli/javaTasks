import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Task1. Sum of Elements
//                - Input: {10, 20, 30, 40}
//        - Output: 100


//        int[] arr = {10, 20, 30, 40};
//        int sum = 0;
//        for ( int currentElement : arr){
//            sum += currentElement;
//        }
//        System.out.println(sum);

//        Taks2. Find Maximum and Minimum
//        - Input: {5, 2, 9, 1, 7}
//        - Output: Max = 9, Min = 1


//        int[] arr = {5, 2, 9, 1, 7};
//        int max = arr[0];
//        int min = arr[0];
//
//        for ( int currentElement : arr ) {
//            if ( currentElement < min ) {
//                min = currentElement;
//            }
//            if ( currentElement > max ) {
//                max = currentElement;
//            }
//        }
//        System.out.printf("Min:%d ", min);
//        System.out.printf(" Max:%d ", max);

//        Task3. Count Even and Odd Numbers
//                - Input: {3, 4, 6, 7, 9, 12}
//        - Output: Even = 3, Odd = 3


//        int[] arr = {3, 4, 6, 7, 9, 12, 2};
//        int countOfEven = 0;
//        int countOfOdd = 0;
//        for(int currentElement : arr){
//            if(currentElement % 2 == 0){
//                countOfEven++;
//            } else{
//                countOfOdd++;
//            }
//        }
//        System.out.printf("Count of Even Numbers: %d\n ", countOfEven);
//        System.out.printf("Count of Odd Numbers: %d ", countOfOdd);

//        Task4. Reverse an Array
//                - Input: {1, 2, 3, 4, 5}
//        - Output: {5, 4, 3, 2, 1}


//        int[] arr = {1, 2, 3, 4, 5};
//        int[] reverseArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            reverseArr[i] = arr[arr.length - 1 -i];
//        }
//        System.out.println(Arrays.toString(reverseArr));

//        Task5. Search Element
//        - Task: Ask the user for a number and check if it exists in the array.


//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int[] arr = {1, 2, 3, 4, 5};
//        boolean flag = true;
//        for (int currentElem : arr){
//            if(currentElem == number){
//                flag = true;
//                break;
//            } else{
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("This number is into array!");
//        } else{
//            System.out.println("This number is not into array!");
//
//        }

//        Task6. Copy Array
//        - Task: Copy all elements from one array to another.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));



    }
}