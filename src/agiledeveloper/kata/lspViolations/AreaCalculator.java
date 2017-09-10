package agiledeveloper.kata.lspViolations;

public class AreaCalculator {
    public static int CalculateArea(Rectangle r)
    {
        return r.getLength() * r.getBreadth();
    }

    public static int CalculateArea(Square s)
    {
        return s.getLength() * s.getBreadth();
    }
}
