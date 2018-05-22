package MultiThread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class poolTest {
    private final static ExecutorService pool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            final int a = i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format("i= %s", a));
                }
            });
        }
    }
}
