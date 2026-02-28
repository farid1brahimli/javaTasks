public class Main {
    public static void main(String[] args) {
        Runnable firstTaks = () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First Taks" + Thread.currentThread().getName());
        };

        Runnable secondTask = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second Taks" + Thread.currentThread().getName());
        };

        Thread firstThread = new Thread(firstTaks);
        firstThread.setDaemon(true);
        firstThread.start();

        Thread secondThread = new Thread(secondTask);
        secondThread.start();

        System.out.println("Main Taks" + Thread.currentThread().getName());
    }
}