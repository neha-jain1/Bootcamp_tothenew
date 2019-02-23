//Q3 Use a singleThreadExecutor to submit multiple threads.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Q3 {
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
        System.out.println("All running thread ended");
    }
}
