package tasks.Орешки;

public class CheckNuts {

    public String checkNunsSquarel(int cone, int nuts, int count_in_winter) {

        String str1 = "YES";
        String str2 = "NO";

        if (cone * nuts >= count_in_winter)
            return str1;
        else
            return str2;


    }

}
