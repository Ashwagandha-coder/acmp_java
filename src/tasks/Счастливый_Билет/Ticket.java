package tasks.Счастливый_Билет;

import java.util.Scanner;

public class Ticket {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(new CompareTicket().compareHappyTicket(scanner.nextInt()));

    }
}
