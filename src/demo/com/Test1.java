package demo.com;

// Main class
public class Test1 {

    public static void main(String[] args) throws InterruptedException {

        // Create one shared Printer object
        Printer p = new Printer();

        // Create first thread and pass printer + share name
        Mythread mt1 = new Mythread(p, "TATAmoters");
        mt1.setName("mt1"); // Set thread name

        // Create second thread
        Mythread mt2 = new Mythread(p, "ZeRODA");
        mt2.setName("mt2"); // Set thread name

        // Start both threads
        mt1.start();
        mt2.start();
    }
}

// Custom Thread class
class Mythread extends Thread {

    Printer p;   // Shared Printer object
    String name; // Share name to print

    // Constructor to initialize Printer and name
    public Mythread(Printer p, String name) {
        super();
        this.p = p;
        this.name = name;
    }

    // run() method executed when thread starts
    public void run() {

        // Calling synchronized method of Printer
        p.printSharename(name);
    }
}

// Shared resource class
class Printer {

    // synchronized method → only ONE thread can execute at a time
    public synchronized void printSharename(String name) {

        // Loop to print share name multiple times
        for (int i = 0; i <= 10; i++) {

            // Print share name along with thread name
            System.out.println(
                "Share Name: " + name +
                " printed by Thread: " + Thread.currentThread().getName()
            );
        }
    }
}