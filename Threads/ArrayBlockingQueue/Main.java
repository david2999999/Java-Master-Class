package Threads.ArrayBlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static Threads.ProducerConsumer.ThreadColor.*;

public class Main {
    private static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer, ANSI_BLUE);
        MyConsumer consumer1 = new MyConsumer(buffer, ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ANSI_GREEN + "Inside the Callable class");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("Thread running the task is interrupted");
        }

        executorService.shutdown();
    }
}
