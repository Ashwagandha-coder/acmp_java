package tasks.Игра;

import java.util.Scanner;

public class Game {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println(new PaymentValueGame(scanner.nextInt()).valueGame());

    }
}

