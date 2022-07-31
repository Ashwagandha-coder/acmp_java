package tasks.Ремонт;

import java.util.Scanner;

public class PaymentColor {

    private int lenght;
    private int weight;
    private int hight;

    public void initValue() {

        Scanner scanner = new Scanner(System.in);

        lenght = scanner.nextInt();
        weight = scanner.nextInt();
        hight = scanner.nextInt();

    }

    public void countBank() {


        System.out.println(lenght * weight / 16);

    }

}
