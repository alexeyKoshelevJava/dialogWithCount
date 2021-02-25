
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final int Number = 3;
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


        for (int i = 0; i < Number; i++) {
            System.out.println(threadPool.submit(new MyCallable<>(i)).get());


        }

        List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        tasks.add(new MyCallable<>(1));
        tasks.add(new MyCallable<>(2));
        tasks.add(new MyCallable<>(3));

        System.out.println(threadPool.invokeAny(tasks));


        threadPool.shutdown();


    }
}
