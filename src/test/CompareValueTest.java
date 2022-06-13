package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Больше_Меньше.CompareValue;

import static org.junit.jupiter.api.Assertions.*;

class CompareValueTest {

    private CompareValue compareValue;

    @BeforeEach
    public void test_CompareValue() {

        compareValue = new CompareValue();

    }

    @Test
    void test_compareNumbers() {

        assertEquals("=",compareValue.compareNumbers(2,2));

    }
}