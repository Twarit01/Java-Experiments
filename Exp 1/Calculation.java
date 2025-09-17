import java.util.Scanner;
class Calculation{
    public static void main(String[] args){
        int a,b;
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter First Number ");
        a = scan.nextInt();
        System.out.println("Enter Second Number ");
        b=scan.nextInt();
        int sum = a+b;
        int diff=a-b;
        int multiply=a*b;
        int div= a/b;
        int modulus = a%b;
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
        System.out.println("Multiplication is " + multiply);
        System.out.println("Division is " + div);
        System.out.println("Modulus is " + modulus);
    }
}
