import java.util.concurrent.Callable;

public class MyCallable<I extends Number> implements Callable<Integer> {
    final static int COUNT = 5;
    private int taskId;

    public MyCallable(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public Integer call() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            Thread.sleep(2500);
            System.out.println("Задача " + taskId +"Выполнена потоком " + Thread.currentThread().getName() +   " Всем привет");



        }
        return COUNT ;


    }
}
