import java.util.Scanner;
public class AreaApp {
    public static void main(String[] args) {
        System.out.println("Twarit, 24csu331");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        Area rect = new Area(l, b);
        System.out.println("Area of rectangle: " + rect.returnArea());
    }
}
