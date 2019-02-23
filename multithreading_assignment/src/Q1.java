//Create and Run a Thread using Runnable Interface and Thread class.


class run_thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread using runnable interface");
    }
}
class thread_run extends Thread{
    @Override
    public void run(){
        System.out.println("Running Thread using thread class");
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Q1 ");

        new Thread(new run_thread())
                .start();

        new thread_run().start();
    }
}


