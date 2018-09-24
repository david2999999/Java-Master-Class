package Threads.MultiThreads;

public class CountDownThread extends Thread {
    private CountDown threadCountdown;

    public CountDownThread(CountDown countDown) {
        this.threadCountdown = countDown;
    }

    @Override
    public void run() {
        threadCountdown.doCountDown();
    }
}
