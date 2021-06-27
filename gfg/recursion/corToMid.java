package gfg.recursion;

public class corToMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {{ 3, 5, 4, 4, 7, 3, 4, 6, 3 },
				{ 6, 7, 5, 6, 6, 2, 6, 6, 2 },
				{ 3, 3, 4, 3, 2, 5, 4, 7, 2 },
				{ 6, 5, 5, 1, 2, 3, 6, 5, 6 },
				{ 3, 3, 4, 3, 0, 1, 4, 3, 4 },
				{ 3, 5, 4, 3, 2, 2, 3, 3, 5 },
				{ 3, 5, 4, 3, 2, 6, 4, 4, 3 },
				{ 3, 5, 1, 3, 7, 5, 3, 6, 4 },
				{ 6, 2, 4, 3, 4, 5, 4, 5, 1 }};
//		fun(m, 0, 0, m[0][0], null);
		
		fun(m, 0, 0, "");
		
	}

//	static void fun(int[][] m, int i, int j, int n, String dir) {
//		if(m[i][j] == 0) {
//			System.out.println("( " + i + ", " + j + " )" + " -> ");
//			System.out.println("MID");
//			return;
//		}
//		if(i > m.length || j > m.length) return;
//		System.out.println("( " + i + ", " + j + " )" + " -> ");
//		if(i == 0 && j == 0) fun(m, i, j + n, m[i][j + n], "north");
//		if(i + n <= m.length && j <= m.length && dir == "east") fun(m, i + n, j, m[i + n][j], "south");
//		if(i - n <= m.length && j <= m.length && dir == "west") fun(m, i - n, j, m[i - n][j], "north");
//		if(i <= m.length && j + n <= m.length && dir == "north") fun(m, i, j + n, m[i][j + n], "east");
//		if(i <= m.length && j - n <= m.length && dir == "south") fun(m, i, j - n, m[i][j - n], "west");
//	}
	
	static void fun(int[][] m, int i, int j, String ans) {
		if(i == m.length / 2 && j == m.length / 2) {
			ans += ans + "(" + i + ", " + j + ")" + " -> " + "MID";
			System.out.println(ans);
			return;
		}
		if(i < 0 || j < 0) return;
		if(m[i][j] == 0) return;
		int k = m[i][j];
		m[i][j] = 0;
		if(j + k < m.length) fun(m, i, j + k, ans + "(" + i + ", " + j + ")" + " -> ");
		if(i + k < m.length) fun(m, i + k, j, ans + "(" + i + ", " + j + ")" + " -> ");
		if(j - k < m.length) fun(m, i, j - k, ans + "(" + i + ", " + j + ")" + " -> ");
		if(i - k < m.length) fun(m, i - k, j, ans + "(" + i + ", " + j + ")" + " -> ");
		m[i][j] = k;
	}
}
