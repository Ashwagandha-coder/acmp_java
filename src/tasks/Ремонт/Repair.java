package tasks.Ремонт;

public class Repair {

    public static void main(String[] args) {

       PaymentColor paymentColor = new PaymentColor();

       paymentColor.initValue();
        System.out.println(paymentColor.countBank());
    }
}

