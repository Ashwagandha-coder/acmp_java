package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Эния.PaymentEnya;

import static org.junit.jupiter.api.Assertions.*;

class PaymentEnyaTest {

    private PaymentEnya paymentEnya;

    @BeforeEach
    public void test_PaymentEnya() {

        paymentEnya = new PaymentEnya();

    }

    @Test
    public void paymentEnyaGr() {

        assertEquals(60,paymentEnya.paymentEnyaGr(5,2,3));
        assertEquals(3220,paymentEnya.paymentEnyaGr(14,23,5));


    }
}