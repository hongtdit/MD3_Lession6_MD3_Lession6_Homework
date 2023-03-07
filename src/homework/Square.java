package homework;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide () {
        return getWidth();
    }
    public void setSide (double side) {
        setWidth(side);
        setHeight(side);
    };

    @Override
    public void setWidth(double witdh) {
        setSide(witdh);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ". " + super.toString();
    }
}
