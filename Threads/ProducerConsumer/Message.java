package Threads.ProducerConsumer;

public class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {

        }

        empty = true;
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {

        }

        empty = false;
        this.message = message;
    }
}
