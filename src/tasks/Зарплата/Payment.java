package tasks.Зарплата;

public class Payment {

    public int paymentMoney(int one, int two, int three) {

        int min_value = Math.min(Math.min(one,two),three);
        int max_value = Math.max(Math.max(one,two),three);

        return max_value - min_value;

    }

}
