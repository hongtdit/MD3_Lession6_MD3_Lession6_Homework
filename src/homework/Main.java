package homework;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle =new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("Circle's Area " + circle.getArea());
        circle = new Circle("Black",false, 4.0);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.0,4.0);
        System.out.println("Rectangle's perimeter " + rectangle.getPerimeter());
        rectangle = new Rectangle("Blue",true, 7.0, 3.0);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(4.0);
        System.out.println(square);
        square = new Square("Salmon", false, 6.0);
        System.out.println(square);

    }
}
