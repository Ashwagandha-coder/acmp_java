package tasks.Ремонт;

import java.util.Scanner;

public class PaymentColor {

    private int lenght;
    private int weight;
    private int hight;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void initValue() {

        Scanner scanner = new Scanner(System.in);

        lenght = scanner.nextInt();
        weight = scanner.nextInt();
        hight = scanner.nextInt();

    }

    public int countBank() {


        if((lenght * weight % 16) > 0)
            return 1;
        else
            return lenght * weight / 16;

    }

}
