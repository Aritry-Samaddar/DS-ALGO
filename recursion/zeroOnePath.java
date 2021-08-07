package recursion;

public class zeroOnePath {

	static String str = "DRUL";
    static int[] di = {1, 0, -1, 0};
    static int[] dj = {0, 1, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1, 0, 1},
				{1, 1, 0},
				{1, 1, 1}};
		boolean[][] vis = new boolean[matrix.length][matrix.length];
		maze(matrix, matrix.length, matrix.length, 0, 0, "", vis);
		System.out.println(mazeCount(matrix, matrix.length, matrix.length, 0, 0, "", vis));
		System.out.println(count(matrix, matrix.length, matrix.length, 0, 0, "", vis));
	}

	static void maze(int[][] matrix, int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true || matrix[i][j] == 0) return;
		if(i == m - 1 && j == n - 1) {
			System.out.println(s);
			return;
		}
		
		maze(matrix, m, n, i + 1, j, s + "D", vis);
		maze(matrix, m, n, i, j + 1, s + "R", vis);
	}
	
	static int mazeCount(int[][] matrix, int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true || matrix[i][j] == 0) return 0;
		if(i == m - 1 && j == n - 1) return 1;
		return mazeCount(matrix, m, n, i + 1, j, s + "D", vis) + mazeCount(matrix, m, n, i, j + 1, s + "R", vis);
	}
	
	static int count(int[][] matrix, int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true || matrix[i][j] == 0) return 0;
		if(i == m - 1 && j == n - 1) return 1;
		
		int cnt = 0;
        vis[i][j] = true;
		
		for(int x = 0; x < 4; x++) {
			cnt += count(matrix, m, n, i + di[x], j + dj[x], s + str.charAt(x), vis);
		}
		
		vis[i][j] = false;
		return cnt;
	}
}
