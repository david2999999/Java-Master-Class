package Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");
        Thread anotherThread = new AnotherThread();

        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class thread");
            }
        }.start();

        System.out.println("Hello again from the main thread");
    }
}
