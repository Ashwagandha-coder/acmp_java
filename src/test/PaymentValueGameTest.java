package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Игра.PaymentValueGame;

import static org.junit.jupiter.api.Assertions.*;

class PaymentValueGameTest {

    private PaymentValueGame paymentValueGame;
    private PaymentValueGame paymentValueGame2;


    @Test
    public void valueGame() {

        paymentValueGame = new PaymentValueGame(5);
        paymentValueGame2 = new PaymentValueGame(2);


        assertEquals(594,paymentValueGame.valueGame());
        assertEquals(297,paymentValueGame2.valueGame());


    }
}