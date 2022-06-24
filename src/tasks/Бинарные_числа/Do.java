package tasks.Бинарные_числа;

public class Do {

    public void doSome(int value) {

        if ((Math.log(value) / Math.log(2)) % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
