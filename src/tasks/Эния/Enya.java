package tasks.Эния;

import java.util.Scanner;

public class Enya {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new PaymentEnya().paymentEnyaGr(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

    }
}

