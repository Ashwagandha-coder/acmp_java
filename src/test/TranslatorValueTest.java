package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Unix.TranslatorValue;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorValueTest {

    private TranslatorValue translatorValue;
    private TranslatorValue translatorValue2;

    @BeforeEach
    public void init() {

        translatorValue = new TranslatorValue();
        translatorValue2 = new TranslatorValue();

    }


    @Test
    public void translatorSystemValue() {

        translatorValue.initValue(20,102);
        translatorValue2.initValue(1,1);

        assertEquals(17,translatorValue.translatorSystemValue());
        assertEquals(2,translatorValue2.translatorSystemValue());

    }
}