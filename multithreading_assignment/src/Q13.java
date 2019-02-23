// Q13 Coordinate 2 threads using wait() and notify()
public class Q13 {
    public void worker1(){
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }
    public void worker2(){
        synchronized (this) {
            System.out.println("Worker2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker2 Done");
        }
    }
    public void worker3(){
        synchronized (this) {
            System.out.println("Worker3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker3 Done");
        }
    }
    public void worker4(){
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            notify();
        }
    }
    public static void main(String[] args) {
        Q13 thread = new Q13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker4();
            }
        }).start();
    }
}
