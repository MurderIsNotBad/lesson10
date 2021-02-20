public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new NewPrinter("my-printer");
        thread.start();


        Thread thread1 = new NewPrinter("my-printer");
        thread1.start();

        System.out.println("Started " + thread.getName());
        thread.join();
        System.out.println("Joined " + thread.getName());
        thread1.join();
        System.out.println("Joined " + thread1.getName());
        System.out.println("All threads are finished");
    }
}
