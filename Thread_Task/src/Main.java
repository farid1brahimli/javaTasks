public class Main {
    public static void main(String[] args) {
        Runnable firstTaks = () -> {
            System.out.println("First Taks" + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(firstTaks);
        Thread t2 = new Thread(firstTaks);
        t1.start();
        t2.start();
    }
}