public class NameSwapperTest {

    public static NameSwapper SWAPPER = new NameSwapper();

    public static void main(String[] args) {
        SWAPPER.printNames();
        
        Thread thread = new SwapperThread();
        thread.start();

        Thread thread2 = new SwapperThread();
        thread2.start();

        SWAPPER.printNames();
    }
}

class SwapperThread extends Thread{
    @Override
    public void run() {
        NameSwapperTest.SWAPPER.swap();
    }
}