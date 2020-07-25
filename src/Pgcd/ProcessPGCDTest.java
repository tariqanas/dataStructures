package Pgcd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProcessPGCDTest {

    static ProcessPGCD pgdc;

    @BeforeAll
    public static void init() {
        pgdc = new ProcessPGCD();
    }

    @AfterAll
    public static void finish() {
        System.out.println("Done Testing");
    }

    @Test
    public void shouldReturnCorrectPGDC() {
        assertEquals(2, pgdc.thePgcd(2, 4), "Calculates the PGDC");
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, pgdc.thePgcd(2, 0), "Calculates the PGDC & returns 0 in this case");
    }
}