import java.util.Scanner;
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class CommandLineSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Twarit, 24csu331");

        try {
            System.out.print("Enter how many numbers you want to input: ");
            int n = sc.nextInt();
            if (n < 5) {
                throw new CheckArgumentException("Less than 5 numbers entered!");
            }
            int sum = 0;
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Sum of entered numbers = " + sum);
        } 
        catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter only integers.");
        }
    }
}



