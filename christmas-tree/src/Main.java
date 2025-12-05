//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++) {
            for(int k = 6 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int t = 0; t < 1; t++) {
            System.out.print("     ");
            System.out.println("***");
        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//
//        String RED = "\u001B[31m";
//        String YELLOW = "\u001B[33m";
//        String GREEN = "\u001B[32m";
//        String RESET = "\u001B[0m";
//
//        int height = 20;
//
//        for (int i = 0; i < height; i++) { // 1) line
//            for (int k = height - i; k > 0; k--) // 2) spaces
//                System.out.print(" ");
//
//            for (int j = 0; j < 2 * i + 1; j++) { // 3) stars + lights
//
//                if (i == 0 && j == 0)
//                    System.out.print(YELLOW + "★" + RESET);
//                else if (j % 4 == 0)
//                    System.out.print(RED + "o" + RESET);      // qırmızı işıq
//                else if (j % 3 == 0)
//                    System.out.print(YELLOW + "+" + RESET);   // sarı işıq
//                else if (j % 5 == 0)
//                    System.out.print(GREEN + "•" + RESET);    // yaşıl işıq
//                else
//                    System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//}
