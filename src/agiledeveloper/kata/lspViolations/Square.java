package agiledeveloper.kata.lspViolations;

public class Square extends Shape{


    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return this.side * this.side;
    }
}
