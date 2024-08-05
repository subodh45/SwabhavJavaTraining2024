package comp.Aurionpro.fileinputstreamtest;
import java.util.Scanner;

public class SumofRowInMultidimensionalArray  {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns ");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];

		System.out.println("enter matrix element ");
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < columns; n++) {
				System.out.println("enter " + n + " element of " + i + " array");
				matrix[i][n] = sc.nextInt();
			}
		}
		
		System.out.println("Your Array: ");
		
		for(int i=0;i<rows;i++)
		{
			for(int n=0;n<columns;n++)
			{
				int ele=matrix[i][n];
				System.out.print(ele+ " ");
			}
			System.out.println();
		}

		
		int sum=0;
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < columns; n++) {
				int num = matrix[i][n];
				
				sum=sum+num;
			}
			System.out.println("Sum of "+ i +" row is "+sum);
			sum=0;
		}
		
		
	}
}