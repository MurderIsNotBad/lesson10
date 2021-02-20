public class ClockThread extends Thread{

    @Override
    public void run() {
        while(!isInterrupted()){
            System.out.println("Tik");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}