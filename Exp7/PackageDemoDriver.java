import exercises.java.PackageDemo;

public class PackageDemoDriver {
    public static void main(String[] args) {
        System.out.println("Accessing PackageDemo from outside the package");
        PackageDemo obj = new PackageDemo();
        obj.display();
    }
}