package tcs;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter testcases : ");
		int t = sc.nextInt();
		for(int k = 0; k < t; k++) {
			System.out.println("Enter the row and the column : ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("Enter the matrix contains 0's and 1's : ");
			int matrix[][] = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			int i = 0;
			int j = 0;
			int dir = 0;
			while(true) {
				dir = (dir + matrix[i][j]) % 4;
				if(dir == 0) {
					j++;
				} else if(dir == 1) {
					i++;
				} else if(dir == 2) {
					j--;
				} else if(dir == 3) {
					i--;
				}
				
				if(i < 0) {
					i++;
					break;
				} else if(j < 0) {
					j++;
					break;
				} else if(i == n) {
					i--;
					break;
				} else if(j == m) {
					j--;
					break;
				}
			}
			System.out.println(i + " " + j);
		}

	}

}
