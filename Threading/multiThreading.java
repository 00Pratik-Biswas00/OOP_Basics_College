
class MyThread extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Hi!");
        }
    }
}

class MultithreadingExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        thread1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

/*
 * Hello
 * Hello
 * Hi!
 * Hi!
 * Hi!
 * Hi!
 * Hi!
 * Hello
 * Hello
 * Hello
 */
