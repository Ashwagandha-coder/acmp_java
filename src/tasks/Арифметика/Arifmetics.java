package tasks.Арифметика;

import java.util.Scanner;

public class Arifmetics {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new CheckValueArifmetics().checkValue(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

    }
}

