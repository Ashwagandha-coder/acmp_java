package tasks.День_Программиста;

import java.util.Scanner;

public class ProgrammerDay {

    private int year;

    public void scannerValue() {

        Scanner scanner = new Scanner(System.in);

        this.year = scanner.nextInt();

    }

    public String compareYear() {

        if (year % 400 == 0 || year % 4 == 0 && year % 100 > 0)
            return "12/09/" + year;
        else
            return "13/09/" + year;


    }

}