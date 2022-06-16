package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Гулливер.Matrass;

import static org.junit.jupiter.api.Assertions.*;

class MatrassTest {

    private Matrass matrass;

    @BeforeEach
    public void init() {

        matrass = new Matrass();

    }

    @Test
    public void paymentMatrass() {

        assertEquals(8,matrass.paymentMatrass(2,2));
        assertEquals(576,matrass.paymentMatrass(12,4));

    }
}