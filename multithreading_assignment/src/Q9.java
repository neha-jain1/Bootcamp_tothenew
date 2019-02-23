// Q9 Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.lang.Thread.sleep;
import java.util.*;
class Process implements Runnable{
    @Override
    public void run() {
        System.out.printf("Thread name:: %s Start %s%n", Thread.currentThread().getName(), new Date());
        System.out.println("Thread name::"+Thread.currentThread().getName()+" End " + new Date());
    }
}
public class Q9 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        //ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i <3; i++) {
            executorService.submit(new Process());
        }
        executorService.shutdown();
    }
}
