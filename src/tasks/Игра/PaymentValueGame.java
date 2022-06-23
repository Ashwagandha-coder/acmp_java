package tasks.Игра;

public class PaymentValueGame {

    private final int CHISLO;

    public PaymentValueGame(int CHISLO) {
        this.CHISLO = CHISLO;
    }


    public int valueGame() { return CHISLO * 100 + 9 * 10 + (9 - CHISLO); }
}