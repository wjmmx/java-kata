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
        square.setBreadth(6);
        assertEquals(36, square.getArea());
    }

    @Test
    public void areaIs36for6asLength() {
        square.setLength(6);
        assertEquals(36,square.getArea());
    }

    @Test
    public void areaIs49for6asLength7asBreadth() {
        square.setLength(6);
        square.setBreadth(7);
        assertEquals(49,square.getArea());
    }

    @Test
    public void areaIs36for7asBreadth6asLength() {
        square.setBreadth(7);
        square.setLength(6);
        assertEquals(36,square.getArea());
    }
}