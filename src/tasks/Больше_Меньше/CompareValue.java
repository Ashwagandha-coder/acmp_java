package tasks.Больше_Меньше;

public class CompareValue {

    public String compareNumbers(int A, int B) {

        String str1 = ">";
        String str2 = "<";
        String str3 = "=";

        if (A > B)
            return str1;
        else if (A < B)
            return str2;
        else
            return str3;


    }


}
