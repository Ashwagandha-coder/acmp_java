package tasks.Счастливый_Билет;

import java.util.ArrayList;

public class CompareTicket {

    public String compareHappyTicket(int ticket) {

        //ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;

        int[] masive = new int[6];

        while (ticket > 0) {

            masive[count] = ticket % 10;
            ticket = ticket / 10;
            count++;

        }
       // arrayList.trimToSize();

        if (masive[0] + masive[1] + masive[2] == masive[3] + masive[4] + masive[5])
            return "YES";
        else
            return "NO";

    }

}
