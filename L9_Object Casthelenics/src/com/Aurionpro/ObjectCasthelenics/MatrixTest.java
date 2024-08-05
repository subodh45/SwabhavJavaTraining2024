package com.Aurionpro.ObjectCasthelenics;

import java.util.Scanner;

public class MatrixTest {
   public static void main(String[] args) {
	
	   Scanner scanner =new Scanner(System.in);
	   
	   int matrix[][]=new int[3][3];
	   
	   System.out.println("enter matrix element");
	   
	   readRows(matrix,scanner);
	   
	   System.out.println("Matrix is ");
	   
	   getRows(matrix);
	   
}



private static void readRows(int[][] matrix, Scanner scanner) {
	 
	for(int rows=0;rows<3;rows++) {
	readRowsElement(matrix,scanner,rows);
	}
	
}

private static void readRowsElement(int[][] matrix, Scanner scanner, int rows) {
	
	for(int cols=0;cols<3;cols++)
	{   
		matrix[rows][cols]=scanner.nextInt();
	}
}


private static void getRowsElement(int[][] matrix,  int rows) {
	// TODO Auto-generated method stub
	
	for(int cols=0;cols<3;cols++)
	{
		System.out.print(matrix[rows][cols] +"\t");
	}
	
}

private static void getRows(int[][] matrix) {
	// TODO Auto-generated method stub
	
	for(int rows=0;rows<3;rows++)
	{
		getRowsElement(matrix,rows);
		System.out.println();
	}
	
}
}