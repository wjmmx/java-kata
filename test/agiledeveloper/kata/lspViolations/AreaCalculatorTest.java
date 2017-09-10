package agiledeveloper.kata.lspViolations;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    @Test
    public void areaIs36forRectangle4asLength9asBreadth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setBreadth(9);
        assertEquals(36, rectangle.getArea());
    }

    @Test
    public void areaIs36forSquare4asLength9asBreadth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setBreadth(9);
        assertEquals(36, rectangle.getArea());
    }

}