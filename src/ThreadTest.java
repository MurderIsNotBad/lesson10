public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new NewPrinter("my-printer");
        thread.start();

        System.out.println(thread.getName() + " started");

        Thread thread2 = new NewPrinter("my-printer2");
        thread2.start();

        System.out.println(thread2.getName() + " started");
    }
}

class NewPrinter1 extends Thread{

    public NewPrinter1(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("running " + getName());
        System.out.println("finished " + getName());
    }
}