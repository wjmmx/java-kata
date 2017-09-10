package agiledeveloper.kata.lspViolations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square();
    }

    @Test
    public void areaIs36for6asBreadth() {
        square.setSide(6);
        assertEquals(36, square.getArea());
    }

    @Test
    public void areaIs36for6asLength() {
        square.setSide(6);
        assertEquals(36,square.getArea());
    }

    @Test
    public void areaIs49for6asLength7asBreadth() {
        square.setSide(6);
        square.setSide(7);
        assertEquals(49,square.getArea());
    }

    @Test
    public void areaIs36for7asBreadth6asLength() {
        square.setSide(7);
        square.setSide(6);
        assertEquals(36,square.getArea());
    }
}