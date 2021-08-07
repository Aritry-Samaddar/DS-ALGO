package recursion;

public class MatrixPaths {

//	lexicographic order
	static String str3 = "DLRU";
    static int[] di3 = {1, 0, 0, -1};
    static int[] dj3 = {0, -1, 1, 0};
	
    static String str = "DRUL";
    static int[] di = {1, 0, -1, 0};
    static int[] dj = {0, 1, 0, -1};
    
    static String[] str2 = {"D->", "R->", "U->", "L->", "TLD->", "TRD->", "BLD->", "BRD->"};
    static int[] di2 = {1, 0, -1, 0, -1, -1, 1, 1};
    static int[] dj2 = {0, 1, 0, -1, -1, 1, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		path(2, 1, 0, 0, "");
		int m = 3;
		int n = 2;
		boolean[][] vis = new boolean[m][n];
		paths(m, n, 0, 0, "", vis);
		System.out.println();
		maze(m, n, 0, 0, "", vis);
		System.out.println();
		mazes(m, n, 0, 0, "", vis);
		System.out.println();
		leximaze(m, n, 0, 0, "", vis);
	}

//	TIME COMPLEXITY : O((2)^(N*M)).........exponential
	static void path(int m, int n, int i, int j, String s) {
		if(i == m && j == n) {
			System.out.println(s);
			return;
		} else if(i > m || j > n) return;
		
		path(m, n, i, j + 1, s + "R");
		path(m, n, i + 1, j, s + "D");
	}
	
	static void paths(int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true) return;
		if(i == m - 1 && j == n - 1) {
			System.out.println(s);
			return;
		}
		
		vis[i][j] = true;
		
		paths(m, n, i, j + 1, s + "R", vis);
		paths(m, n, i + 1, j, s + "D", vis);
		paths(m, n, i - 1, j, s + "U", vis);
		paths(m, n, i, j - 1, s + "L", vis);
		
		vis[i][j] = false;
	}
	
	static void maze(int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true) return;
		if(i == m - 1 && j == n - 1) {
			System.out.println(s);
			return;
		}
		
		vis[i][j] = true;
		
		for(int x = 0; x < 4; x++) {
			maze(m, n, i + di[x], j + dj[x], s + str.charAt(x), vis);
		}
		
		vis[i][j] = false;
	}
	
	static void mazes(int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true) return;
		if(i == m - 1 && j == n - 1) {
			System.out.println(s);
			return;
		}
		
		vis[i][j] = true;
		
		for(int x = 0; x < 8; x++) {
			mazes(m, n, i + di2[x], j + dj2[x], s + str2[x], vis);
		}
		
		vis[i][j] = false;
	}
	
//	LEXICOGRAPHIC ORDER OF MAZES
	static void leximaze(int m, int n, int i, int j, String s, boolean[][] vis) {
		if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == true) return;
		if(i == m - 1 && j == n - 1) {
			System.out.println(s);
			return;
		}
		
		vis[i][j] = true;
		
		for(int x = 0; x < 4; x++) {
			maze(m, n, i + di3[x], j + dj3[x], s + str3.charAt(x), vis);
		}
		
		vis[i][j] = false;
	}
}
