package Basics;

public class ParseString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);

        String doubleAsString = "2018.1235";
        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println(doubleNumber);
    }
}
