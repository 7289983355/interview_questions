package keyWords;
public class Example7 {
    static int counter = 0;

    public static void incrementCounter() {
        counter++; // Thread-unsafe increment
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + counter); // What value will this print?
    }
}
