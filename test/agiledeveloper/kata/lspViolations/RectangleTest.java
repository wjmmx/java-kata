package agiledeveloper.kata.lspViolations;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void areaIs60for10x6() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(10);
        rectangle.setLength(6);
        assertEquals(60, rectangle.getArea());
    }

    @Test
    public void areaIs36for6x6() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(6);
        rectangle.setLength(6);
        assertEquals(36, rectangle.getArea());
    }
}