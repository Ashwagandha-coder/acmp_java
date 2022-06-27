package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.Счастливый_Билет.CompareTicket;

import static org.junit.jupiter.api.Assertions.*;

class CompareTicketTest {

    private CompareTicket compareTicket;

    @BeforeEach
    public void init() {

        compareTicket = new CompareTicket();

    }

    @Test
    public void compareHappyTicket() {

        String str1 = "YES";
        String str2 = "NO";

        assertEquals(str1, compareTicket.compareHappyTicket(385916));
        assertEquals(str2,compareTicket.compareHappyTicket(452931));
    }
}