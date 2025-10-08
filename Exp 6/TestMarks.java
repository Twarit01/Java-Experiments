abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    private double sub1, sub2, sub3;
    A(double s1, double s2, double s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3.0;
    }
}
class B extends Marks {
    private double sub1, sub2, sub3, sub4;
    B(double s1, double s2, double s3, double s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }
    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4.0;
    }
}
public class TestMarks {
    public static void main(String[] args) {
        System.out.println("Twarit,24csu331");
        A studentA = new A(85, 90, 80);         
        B studentB = new B(75, 80, 70, 90);     

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
