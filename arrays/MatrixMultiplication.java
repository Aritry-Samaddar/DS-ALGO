package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows and columns of array a:");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.println("enter columns of array b:");
		int cols2 = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[cols][cols2];
		int c[][] = new int[rows][cols2];
		
		System.out.println("enter array a:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter array b:");
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < cols2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
	    
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols2; j++) {
				int d[][] = new int[1][1];
				d[0][0] = 0;
				for(int k = 0; k < cols; k++) {
					c[i][j] = a[i][k] * b[k][j];
					d[0][0] += c[i][j];
				}
				c[i][j] = d[0][0];
			}
		}
		System.out.println("the multiplication result is:");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols2; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
