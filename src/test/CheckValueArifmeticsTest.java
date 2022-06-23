package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Арифметика.CheckValueArifmetics;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckValueArifmeticsTest {

    private CheckValueArifmetics checkValueArifmetics;

    @BeforeEach
    public void init() {

        checkValueArifmetics = new CheckValueArifmetics();

    }

    @Test
    public void checkValue() {

        assertEquals("NO",checkValueArifmetics.checkValue(9,54,432));
        assertEquals("YES",checkValueArifmetics.checkValue(8,54,432));

    }
}
