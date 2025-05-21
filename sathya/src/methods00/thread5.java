package methods00;

public class thread5 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("This is a custom thread running...");
        });

        t1.setDaemon(true);  

        Thread currentThread = Thread.currentThread();

        System.out.println("Thread Name: " + currentThread.getName());
        System.out.println("Thread ID: " + currentThread.getId());
        System.out.println("Thread Priority: " + currentThread.getPriority());
        System.out.println("Thread State: " + currentThread.getState());
        System.out.println("Is Daemon Thread: " + currentThread.isDaemon());
        t1.start();
    }
}
