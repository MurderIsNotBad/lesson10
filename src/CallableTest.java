import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableImpl callable = new CallableImpl();
        FutureTask<String> futureTask = new FutureTask<>(callable);

        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
