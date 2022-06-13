package test;


import org.junit.jupiter.api.BeforeEach;
import tasks.Sum.SumValue;


import static org.junit.jupiter.api.Assertions.*;

class SumValueTest {

    private SumValue sumValue;

    @BeforeEach
    public void test_SumValue() {

        sumValue = new SumValue();

    }

    @org.junit.jupiter.api.Test
    void test_sum() {

        SumValue sumValue = new SumValue();

        assertEquals(4, sumValue.sum(2,2));

    }
}