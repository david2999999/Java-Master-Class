package Threads.Demo;

import static Threads.Demo.ThreadColor.ANSI_GREEN;
import static Threads.Demo.ThreadColor.ANSI_PURPLE;
import static Threads.Demo.ThreadColor.ANSI_RED;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN +  "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");

                try {
                    anotherThread.join(2000);
                    System.out.println("Another thread terminated or timed out, so myRunnable thread is running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnable.start();

        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");
    }
}
