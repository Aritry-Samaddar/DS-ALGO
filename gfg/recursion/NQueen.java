package gfg.recursion;

import java.util.*;

public class NQueen {

	static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		int[][] m = new int[n][n];
		fun(m, 0, n);
		System.out.println(al);
		System.out.println(al.size());
	    
	}
	
	static boolean isValid(int[][] m, int i, int j, int n) {
		for(int r = i, c = j; r < n && c < n && r >= 0; r--) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n; r++) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n && c >= 0; c--) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n; c++) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n && r >= 0 && c >= 0; r--, c--) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n && r >= 0; r--, c++) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n && c >= 0; r++, c--) {
			if(m[r][c] == 1) return false;
		}
		for(int r = i, c = j; r < n && c < n; r++, c++) {
			if(m[r][c] == 1) return false;
		}
		return true;
	}

//	static boolean fun(int[][] m, int rows, int n) {
//		if(rows >= n) {
//			ArrayList<Integer> a = new ArrayList<>();
//			for(int k = 0; k < n; k++) {
//				for(int l = 0; l < n; l++) {
//					if(m[k][l] == 1) a.add(l + 1);
//				}
//			}
//			al.add(a);
//			return true;
//		}
//		for(int j = 0; j < n; j++) {
//			if(isValid(m, rows, j, n)) {
//				m[rows][j] = 1;
//				if(fun(m, rows + 1, n)) return true;
//				m[rows][j] = 0;
//			}
//		}
//		return false;
//	}
	
	static void fun(int[][] m, int rows, int n) {
		if(rows >= n) {
			ArrayList<Integer> a = new ArrayList<>();
			for(int k = 0; k < n; k++) {
				for(int l = 0; l < n; l++) {
					if(m[k][l] == 1) a.add(l + 1);
				}
			}
			al.add(a);
			return;
		}
		for(int j = 0; j < n; j++) {
			if(isValid(m, rows, j, n)) {
				m[rows][j] = 1;
				fun(m, rows + 1, n);
				m[rows][j] = 0;
			}
		}
	}
}
