package Threads.ProducerConsumer;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
                "Humpty Dumpty Sat on a wall",
                "Had a great fall",
                "Kings horse",
                "Can't put Humpty back again"
        };

        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }

            message.write("Finished");
        }
    }
}
