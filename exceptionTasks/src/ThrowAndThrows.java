public class ThrowAndThrows {
    public static void checkAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("Age must be 18 or older");
        }
        System.out.println(age + " age is valid");
    }
}
