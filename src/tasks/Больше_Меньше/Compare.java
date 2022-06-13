package tasks.Больше_Меньше;

import java.util.Scanner;

public class Compare {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new CompareValue().compareNumbers(scanner.nextInt(), scanner.nextInt()));

    }
}

