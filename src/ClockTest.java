public class ClockTest {

    public static void main(String[] args) throws InterruptedException {
        Thread clockThread = new ClockThread();
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }
}
