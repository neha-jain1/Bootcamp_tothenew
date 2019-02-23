// Q12 Use Atomic Classes instead of Synchronize method and blocks.
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
public class Q12 {
    AtomicInteger count= new AtomicInteger();
    public void incrementCount() {
        synchronized (this) {
            count.incrementAndGet();
        }
    }
    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }
    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Q12 thread_run = new Q12();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread_run.count);
    }

}
