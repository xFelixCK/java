package MultiThread.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class future {
    private static final ExecutorService es = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        List<Integer> res  = new ArrayList<Integer>();
        for (int i = 1; i < 20; i++) {
            final int a = i;
            Future<Integer> future = es.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return a * a;
                }
            });
            try {
                if(future!=null){
                    int value = future.get();
                    res.add(value);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (Exception e){

            }
        }
        for(Integer dd : res) {
            System.out.println(dd);
        }
    }
}
