package comp.Aurionpro.fileinputstreamtest;

import java.util.*;

public class MatrixMultiplicationMultidimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matrix1[][] = { { 2, 3 }, { 4, 5 } };
		int matrix2[][] = { { 2, 4 }, { 4, 7 } };
		int multiplication[][] = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				multiplication[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		System.out.println("matrix1 is ");
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 2; n++) {
				System.out.print(matrix1[i][n] + " ");
			}
			System.out.println();
		}

		System.out.println("matrix2 is ");
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 2; n++) {
				System.out.print(matrix2[i][n] + " ");
			}
			System.out.println();
		}

		System.out.println("Multiplication matrix is ");
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 2; n++) {
				System.out.print(multiplication[i][n] + " ");
			}
			System.out.println();
		}
	}
}