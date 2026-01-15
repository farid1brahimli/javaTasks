public class ExceptionPropagation {
    public static void method3 () throws Exception {
        throw new Exception("Error ocurred in method3");
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception handled in method1: " + e.getMessage());
        }
    }
}
