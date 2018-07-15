package ControlFlow.challenge;

public class DoWhileChallenge {
    public static void main(String[] args) {
        int number = 4;
        int evenNumbersFound = 0;

        do {
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                evenNumbersFound++;
            }

            number++;

        } while (evenNumbersFound != 6);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
