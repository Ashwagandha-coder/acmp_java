package tasks.Sum;

import java.util.Scanner;

public class Sum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new SumValue().sum(scanner.nextInt(), scanner.nextInt()));

    }
}

