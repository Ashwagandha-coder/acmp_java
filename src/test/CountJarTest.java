package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Два_Бандита.CountJar;
import tasks.Два_Бандита.Gangsters;

import static org.junit.jupiter.api.Assertions.*;

class CountJarTest {


    private CountJar countJar;


    @BeforeEach
    public void init() {

        countJar = new CountJar();

    }

    @Test
    public void countJarGangster() {

        int[] expected = new int[2];
        expected[0] = 6;
        expected[1] = 3;

        int[] actual = countJar.countJarGangster(4,7);

        assertArrayEquals(expected,actual);

    }
}