class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(2000); // Simulating some work in the thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is finished.");
    }
}

class IsAliveExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // Check if the thread is alive
        System.out.println("Thread is alive: " + myThread.isAlive());
        try {
            myThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Check again after the thread has finished
        System.out.println("Thread is alive: " + myThread.isAlive());
    }
}

/*
 * Thread is running.
 * Thread is alive: true
 * Thread is finished.
 * Thread is alive: false
 */