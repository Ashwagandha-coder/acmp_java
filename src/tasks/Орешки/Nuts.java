package tasks.Орешки;

import java.util.Scanner;

public class Nuts {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new CheckNuts().checkNunsSquarel(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

    }
}

