// Main class to run threads
public class Test {

    public static void main(String[] args) {

        // Creating two thread objects
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        // Starting threads (this will call run() internally)
        mt1.start();
        mt2.start();
    }
}

// Custom Thread class extending Thread
class MyThread extends Thread {

    // Overriding run() method (thread execution logic)
    @Override
    public void run() {

        // Printing current thread name
        System.out.println(Thread.currentThread().getName());
    }
}