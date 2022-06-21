package tasks.Зарплата;

import java.util.Scanner;

public class MoneyWork {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int result = new Payment().paymentMoney(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println(result);
    }

}