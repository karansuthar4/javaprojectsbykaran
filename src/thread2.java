public class thread2 {
    synchronized
    public static void main(String[] args) {
        // Create two threads for printing odd and even numbers
        Thread t1 = new Thread(new PrintOdd());
        Thread t2 = new Thread(new PrintEven());
       


        // Start the threads
        t1.start();
        t2.start();

        // Wait for the threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Define a class for printing odd numbers
class PrintOdd implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

// Define a class for printing even numbers
class PrintEven implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
