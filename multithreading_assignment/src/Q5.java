//Q5 Use isShutDown() and isTerminate() with ExecutorService
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Q5 {
    public static void main(String[] args) {
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
        }
        finally {
            System.out.println("Finally block in execution with shutdown function");
            executorService.shutdown();
        }
        System.out.println("output of isshutDown()"+ executorService.isShutdown());
        System.out.println("output of isTerminated()"+ executorService.isTerminated());
        System.out.println("All running thread ended");
    }
}

