package Lambda.Demo;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();

//        new Thread(() -> System.out.println("Printing from the runnable")).start();

        new Thread(() -> {
            System.out.println("Printing from the runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();
    }
}
