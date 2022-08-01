package tasks.Торт;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutCakeTest {

    private CutCake cutCake;

    @BeforeEach
    public void setUp() {

        cutCake = new CutCake();

    }

    public void case1() { cutCake.setGuest(2); }

    public void case2() { cutCake.setGuest(3); }


    @Test
    public void payment1() {

        case1();

        int actual = cutCake.payment();
        int expected = 1;

        assertEquals(expected,actual);


    }

    @Test
    public void payment2() {

        case2();

        int actual = cutCake.payment();
        int expected = 3;

        assertEquals(expected,actual);


    }

}