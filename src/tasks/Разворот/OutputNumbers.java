package tasks.Разворот;

import java.util.Scanner;

public class OutputNumbers {

    private int[] massive;
    private int lenght;


    public void init() {

        Scanner scanner = new Scanner(System.in);

        lenght = scanner.nextInt();

        massive = new int[lenght];

        for (int i = 0; i <= lenght - 1; i++) {

            massive[i] = scanner.nextInt();

        }


    }

    public void outputPrint() {

        for (int i = lenght - 1; i >= 0; i--) {

            System.out.print(massive[i] + " ");

        }


    }



}
