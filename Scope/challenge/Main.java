package Scope.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
