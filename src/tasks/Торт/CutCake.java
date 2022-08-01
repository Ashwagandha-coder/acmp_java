package tasks.Торт;

import java.util.Scanner;

public class CutCake {

    private int guest;

    public void init() {

        Scanner scanner = new Scanner(System.in);
        guest = scanner.nextInt();

    }

    public int payment() {

        if (guest == 1)
            return 1;
        else if (guest % 2 == 1)
            return guest;
        else
            return guest / 2;

    }


    public void setGuest(int guest) {
        this.guest = guest;
    }
}
