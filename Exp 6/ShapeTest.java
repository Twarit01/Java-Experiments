abstract class Shape{
	abstract void RectangleArea(int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}
class Area extends Shape{
	void RectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    void SquareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
     void CircleArea(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
 public class ShapeTest{
	public static void main(String args[]){
	System.out.println("Twarit,24csu331");
	Area a= new Area();
	a.RectangleArea(5,4);
	a.SquareArea(6);
	a.CircleArea(3);
	}
}