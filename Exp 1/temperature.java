//convert fahrenheit to celsius
import java.util.Scanner;
class temperature{
	public static void main(String args[]){
		int fahrenheit;
		float celsius;
		Scanner scan = new Scanner(System.in);
		System.out.println("Twarit, 24csu331");
		System.out.println("Enter the temperature in fahrenheit");
		fahrenheit=scan.nextInt();
		celsius=(fahrenheit-32)*5/9;
		System.out.println("temperature in celsius:  "+celsius);
	}
}