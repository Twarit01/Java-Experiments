import java.util.Scanner;
public class Max_Min{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Twarit, 24csu331");
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];

		//Input elements
		System.out.println("Enter " + n + " elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++){
        	if (arr[i] > max){
        		 max = arr[i];
        	}
        	if (arr[i] < min){
        		min = arr[i];
        	}
        }
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
	}
}