import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Q15 {
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();
    public void worker1() {
        try {
            lock.lock();
            System.out.println("worker 1 Started");
            condition.await();
            System.out.println("worker 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void worker2() {
        try{
            lock.lock();
            System.out.println("worker 2 Started");
            System.out.println("worker 2 Finished");
            //condition.signal();
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void worker3() {
        try {
            lock.lock();
            System.out.println("worker 3 Started");
            condition.await();
            System.out.println("worker 3 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public static void main(String[] args) throws InterruptedException {
        Q15 thread_run= new Q15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run()
            {thread_run.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker2();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread_run.worker3();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
