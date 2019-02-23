// Q15 Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Q15 {
    Lock lock = new ReentrantLock(true);
    int count;
    void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }
    public void worker1(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }
    public void worker2(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Q15 thread_run = new Q15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker1();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
