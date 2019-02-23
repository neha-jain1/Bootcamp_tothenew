// Q8 Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Q8 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduled task executed  "+ new Date());
            }
        },1,SECONDS);
        System.out.println(new Date());
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(" Task implemented using scheduled at fixed rate of 1 second"+ new Date());
            }
        },1,5l,SECONDS);
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task implemented using schedule with fixed delay of 2 second "+ new Date());
            }
        },2,5l,SECONDS);
        Thread.sleep(15000);
        executorService.shutdown();
    }
}
