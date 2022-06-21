package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Зарплата.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    private Payment payment;

    @BeforeEach
    public void init() {

        payment = new Payment();

    }

    @Test
    public void paymentMoney() {

        assertEquals(900,payment.paymentMoney(100,500,1000));
        assertEquals(25,payment.paymentMoney(36,11,20));

    }
}