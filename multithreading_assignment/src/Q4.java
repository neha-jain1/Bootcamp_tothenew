// Q4 Try shutdown() and shutdownNow() and observe the difference.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Q4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1 Running");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2 Running");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3 Running");
                }
            });

        } finally {
            System.out.println("finally block in execution with shutdownNow function");
            executorService.shutdownNow();
        }
        System.out.println("All running threads Ended.....");
    }
}
