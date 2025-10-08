interface GeometricObject {
    double getPerimeter();
    double getArea();
}
interface Resizable {
    void resize(int percent);
}
class Circle implements GeometricObject {
    protected double radius = 1.0;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius); 
    }
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class  GeometricTest {
    public static void main(String[] args) {
        System.out.println("Twarit,24csu331");
        System.out.println("=== Circle ===");
        Circle c = new Circle(5.0);
        System.out.println("Radius: " + c.radius);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
        System.out.println("=== ResizableCircle ===");
        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Original Radius: " + rc.radius);
        System.out.println("Original Area: " + rc.getArea());
        rc.resize(50); 
        System.out.println("\nAfter resizing by 50%");
        System.out.println("New Radius: " + rc.radius);
        System.out.println("New Perimeter: " + rc.getPerimeter());
        System.out.println("New Area: " + rc.getArea());
    }
}