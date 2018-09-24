package Threads;

import static Threads.ThreadColor.ANSI_GREEN;
import static Threads.ThreadColor.ANSI_PURPLE;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();

        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN +  "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");
    }
}
