package tasks.Мышки;

public class Other {

    private Check check = (a,b,c) -> {

        if (c * 2 <= a && c * 2 <= b) {

            return "YES";

        }
        else
            return "NO";


    };


    public Other(int with, int hight, int radius) {
        System.out.println(check.checkCarpet(with,hight,radius)); }

}
