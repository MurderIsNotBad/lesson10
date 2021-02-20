import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<String>> futures = new ArrayList<>();


        for(int i = 0; i < 10;i++){
        CallableImpl callable = new CallableImpl();
        Future<String> future = executorService.submit(callable);
        futures.add(future);
        }
        futures.get(3).cancel(true);

        System.out.println(futures.get(8).get());

    }

}
