package ControlFlow.challenge;

public class WhileChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishedNumber = 20;

        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
