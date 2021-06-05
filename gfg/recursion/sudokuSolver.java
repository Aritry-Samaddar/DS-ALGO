package gfg.recursion;

public class sudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		int[][] m = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		fun(m, n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean isValid(int[][] m, int i, int j, int n, int num) {
		for(int r = i, c = j; r < n && c < n && r >= 0; r--) {
			if(m[r][c] == num) return false;
		}
		for(int r = i, c = j; r < n && c < n; r++) {
			if(m[r][c] == num) return false;
		}
		for(int r = i, c = j; r < n && c < n && c >= 0; c--) {
			if(m[r][c] == num) return false;
		}
		for(int r = i, c = j; r < n && c < n; c++) {
			if(m[r][c] == num) return false;
		}
		if(i >= 0 && i <= 2) {
			if(j >= 0 && j <= 2) {
				for(int r = 0; r < 3; r++) {
					for(int c = 0; c < 3; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 0; r < 3; r++) {
					for(int c = 3; c < 6; c++) {
						if(m[r][c] == num) return false;
					}
				}
			} else {
				for(int r = 0; r < 3; r++) {
					for(int c = 6; c < 9; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}
		} else if(i >= 3 && i <= 5) {
			if(j >= 0 && j <= 2) {
				for(int r = 3; r < 6; r++) {
					for(int c = 0; c < 3; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 3; r < 6; r++) {
					for(int c = 3; c < 6; c++) {
						if(m[r][c] == num) return false;
					}
				}
			} else {
				for(int r = 3; r < 6; r++) {
					for(int c = 6; c < 9; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}
		} else {
			if(j >= 0 && j <= 2) {
				for(int r = 6; r < 9; r++) {
					for(int c = 0; c < 3; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 6; r < 9; r++) {
					for(int c = 3; c < 6; c++) {
						if(m[r][c] == num) return false;
					}
				}
			} else {
				for(int r = 6; r < 9; r++) {
					for(int c = 6; c < 9; c++) {
						if(m[r][c] == num) return false;
					}
				}
			}
		}
		return true;
	}
	
	static boolean fun(int[][] m, int n) {
		int rows = -1;
		int cols = -1;
		boolean isEmpty = true;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(m[i][j] == 0) {
					rows = i;
					cols = j;
					isEmpty = false;
					break;
				}
			}
			if(!isEmpty) break;
		}
		if(isEmpty) return true;
		for(int num = 1; num < 10; num++) {
			if(isValid(m, rows, cols, n, num)) {
				m[rows][cols] = num;
				if(fun(m, n)) return true;
				m[rows][cols] = 0;
			}
		}
		return false;
	}
}
