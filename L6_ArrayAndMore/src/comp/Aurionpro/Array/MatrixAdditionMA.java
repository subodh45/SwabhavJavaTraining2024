package comp.Aurionpro.Array;

import java.util.*;

public class MatrixAdditionMA {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int matrix1[][] = {{2,3,4,5,6},{4,5,6,7,8}};
		int matrix2[][] = {{2,4,4,8,6},{4,7,2,7,9}};
		int addition[][]= new int[2][6];

		for (int i = 0; i < 2; i++) {
			for (int n = 0; n <5; n++) {
				int num1 =matrix1[i][n];
				int num2 =matrix2[i][n];
                int add = num1+num2;
                
                addition[i][n]=add;
			}
		}
		
		System.out.println("matrix1 is ");
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(matrix1[i][n] + " ");

			}

			System.out.println();
			
		}
		
		System.out.println("matrix2 is ");
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(matrix2[i][n] + " ");

			}

			System.out.println();
		}
		
		System.out.println("Addition matrix is ");
		for (int i = 0; i <2; i++) {
			for (int n = 0; n <5; n++) {
				System.out.print(addition[i][n] + " ");

			}

			System.out.println();
		}
	}
}
