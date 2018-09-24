package Threads.MultiThreads;

import static Threads.MultiThreads.ThreadColor.ANSI_CYAN;
import static Threads.MultiThreads.ThreadColor.ANSI_GREEN;
import static Threads.MultiThreads.ThreadColor.ANSI_PURPLE;

public class CountDown {
    public void doCountDown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ANSI_CYAN;
                break;
            case "Thread 2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_GREEN;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(color + " " + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
