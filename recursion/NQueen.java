package recursion;

import java.util.*;

public class NQueen {

	static ArrayList<Integer> al = new ArrayList<>();
	public static void main(String[] args) {

		int n = 4;
		int[][] matrix = new int[n][n];
		int[] colHash = new int[n];
		int[] rightHash = new int[2*n - 1];
		int[] leftHash = new int[2*n - 1];
		queens(matrix, 0, matrix.length, colHash, rightHash, leftHash);
	}

//	FOR THIS METHOD TIME COMPLEXITY IS : O(N)
	static boolean isSafe(int[][] matrix, int i, int j, int n) {
		for(int r = i, c = j; r >= 0; r--) {
			if(matrix[r][c] == 1) return false;
		}
		for(int r = i, c = j; r >= 0 && c >= 0; r--, c--) {
			if(matrix[r][c] == 1) return false;
		}
		for(int r = i, c = j; c < n && r >= 0; r--, c++) {
			if(matrix[r][c] == 1) return false;
		}
		return true;
	}
	
//	TIME COMPLEXITY OF THIS METHOD REDUCED TO O(1) FROM THE PREVIOUS ONE(isSafe)...
	static boolean isSafe2(int[][] matrix, int row, int col, int n, int[] colHash, int[] rightHash, int[] leftHash) {
		if(colHash[col] == 1 || rightHash[row + col] == 1 || leftHash[(n - 1) + (row - col)] == 1) return false;
		return true;
	}
	
//	FOR THIS METHOD TIME COMPLEXITY IS : O(N^N).....BUT IN CASE OF "ONE ANS ONLY" IT WOULD NEVER BE EXACTLY O(N^N) BECAUSE METHOD WILL RETURN TRUE
//	ONCE IT REACHES DESTINY AND A LOT OF RECURSION CALLS(BRANCHES) WILL BE CUT OFF.
	static void queens(int[][] matrix, int rows, int n, int[] colHash, int[] rightHash, int[] leftHash) {
		if(rows == n) {
			for(int e : al) {
				System.out.print(e + " ");
			}
			System.out.println();
			return;
		}
		for(int cols = 0; cols < n; cols++) {
			if(isSafe2(matrix, rows, cols, n, colHash, rightHash, leftHash)) {
				matrix[rows][cols] = 1;
				al.add(cols + 1);
				colHash[cols] = 1;
				rightHash[rows + cols] = 1;
				leftHash[(n - 1) + (rows - cols)] = 1;
				queens(matrix, rows + 1, n, colHash, rightHash, leftHash);
				colHash[cols] = 0;
				rightHash[rows + cols] = 0;
				leftHash[(n - 1) + (rows - cols)] = 0;
				al.remove(al.size() - 1);
				matrix[rows][cols] = 0;
			}
		}
	}
}
