package tasks.Ремонт;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentColorTest {

    private PaymentColor paymentColor;

    @BeforeEach
    public void setUp() {

        paymentColor = new PaymentColor();

    }

    public void case1() {

        paymentColor.setLenght(8);
        paymentColor.setWeight(8);
        paymentColor.setHight(2);

    }

    public void case2() {

        paymentColor.setLenght(1);
        paymentColor.setWeight(1);
        paymentColor.setHight(3);

    }

    @Test
    public void countBank() {

        case1();

        int actual = paymentColor.countBank();
        int expected = 4;

        assertEquals(expected,actual);

        case2();

        actual = paymentColor.countBank();
        expected = 1;

        assertEquals(expected,actual);




    }
}