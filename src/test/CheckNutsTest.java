package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Орешки.CheckNuts;

import static org.junit.jupiter.api.Assertions.*;

class CheckNutsTest {

    private CheckNuts checkNuts;

    @BeforeEach
    public void test_CheckNuts() {

        checkNuts = new CheckNuts();

    }

    @Test
    void checkNunsSquarel() {

        String expected1 = "YES";
        String expected2 = "NO";

        assertEquals(expected1,checkNuts.checkNunsSquarel(4,5,20));
        assertEquals(expected2,checkNuts.checkNunsSquarel(4,5,21));

    }
}