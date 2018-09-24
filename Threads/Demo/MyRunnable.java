package Threads.Demo;

import static Threads.Demo.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable's implementable of run()");
    }
}
