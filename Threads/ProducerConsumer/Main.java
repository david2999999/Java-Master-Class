package Threads.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

import static Threads.ProducerConsumer.ThreadColor.ANSI_BLUE;
import static Threads.ProducerConsumer.ThreadColor.ANSI_CYAN;
import static Threads.ProducerConsumer.ThreadColor.ANSI_PURPLE;

public class Main {
    private static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        MyProducer producer = new MyProducer(buffer, ANSI_BLUE);
        MyConsumer consumer1 = new MyConsumer(buffer, ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
