package gfg.recursion;

import java.util.*;

public class ratInAMaze {

	static ArrayList<String> al;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] m = { { 1, 1, 1, 1, 1 },
//            { 1, 1, 1, 1, 1 },
//            { 1, 1, 1, 1, 1 },
//            { 1, 1, 1, 1, 1 },
//            { 1, 1, 1, 1, 1 } };
		int m[][] = { { 1, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1 } };
		int n = m.length;
		System.out.println(findPath(m, n));
	}
	
	static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        al = new ArrayList<>();
        bool(m, 0, 0, n - 1, n - 1);
        return al;
    }
    
    static void bool(int[][] m, int i, int j, int x, int y) {
        int rows = m.length;
        int cols = m[0].length;
        boolean[][] vis = new boolean[rows][cols];
        fun(m, i, j, x, y, "", vis);
    }
    
    static boolean isValid(int[][] m, int i, int j, boolean[][] vis) {
        int rows = m.length;
        int cols = m[0].length;
        return i >= 0 && i < rows && j >= 0 && j < cols && m[i][j] == 1 && !vis[i][j];
    }
    
    static void fun(int[][] m, int i, int j, int x, int y, String s, boolean[][] vis) {
        if(m[x][y] == 0) {
            al.add("-1");
            return;
        }
        if(!isValid(m, i, j, vis)) return;
        if(i == x && j == y) {
            al.add(s);
            return;
        }
        vis[i][j] = true;
        fun(m, i + 1, j, x, y, s + "D", vis);
        fun(m, i, j - 1, x, y, s + "L", vis);
        fun(m, i, j + 1, x, y, s + "R", vis);
        fun(m, i - 1, j, x, y, s + "U", vis);
        vis[i][j] = false;
    }

}
