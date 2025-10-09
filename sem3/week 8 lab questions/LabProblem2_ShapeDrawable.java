abstract class Shape {
    protected double area;
    protected double perimeter;

    abstract void calculateArea();
    abstract void calculatePerimeter();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    void showDetails() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class LabProblem2_ShapeDrawable {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.draw();
        circle.showDetails();
    }
}
