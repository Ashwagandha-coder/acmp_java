package tasks;

import java.util.Scanner;

public class Phone {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new SoutValue().printValue(scanner.nextInt());

    }
}

class SoutValue {

    public void printValue(int chislo) { System.out.println(chislo); }

}
