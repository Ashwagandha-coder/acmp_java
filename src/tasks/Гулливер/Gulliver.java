package tasks.Гулливер;

import java.util.Scanner;

public class Gulliver {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new Matrass().paymentMatrass(scanner.nextInt(), scanner.nextInt()));

    }
}

