package gfg.recursion;

import java.util.Arrays;

public class shortestSafe {
	
	static int row = 12;
	static int col = 10;
	
	static int[] rowNum = {-1, 0, 0, 1};
	static int[] colNum = {0, -1, 1, 0};
	
	static int min_dist;
	
	static boolean isSafe(int[][] m, boolean[][] visited, int i, int j) {
		if(m[i][j] == 0 || visited[i][j]) return false;
		return true;
	}
	
	static boolean isValid(int x, int y) {
		if(x < row && y < col && x >= 0 && y >= 0) return true;
		return false;
	}
	
	static void makeUnsafeCells(int[][] m) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(m[i][j] == 0) {
					for(int k = 0; k < 4; k++) {
						if(isValid(i + rowNum[k], j + colNum[k])) {
							m[i + rowNum[k]][j + colNum[k]] = -1;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(m[i][j] == -1) {
					m[i][j] = 0;
				}
			}
		}
	}
	
	static void findShortestPathUtil(int[][] m, boolean[][] visited, int i, int j, int dist) {
		if(j == col - 1) {
			min_dist = Math.min(min_dist, dist);
			return;
		}
		
		if(dist > min_dist) return;
		
		visited[i][j] = true;
		for(int k = 0; k < 4; k++) {
			if(isValid(i + rowNum[k], j + colNum[k]) && isSafe(m, visited, i + rowNum[k], j + colNum[k])) {
				findShortestPathUtil(m, visited, i + rowNum[k], j + colNum[k], dist + 1);
			}
		}
		visited[i][j] = false;
	}
	
	static void findShortestPath(int[][] m) {
		min_dist = Integer.MAX_VALUE;
		
		boolean[][] visited = new boolean[row][col];
		
		makeUnsafeCells(m);
		
		for(int i = 0; i < row; i++) {
			if(m[i][0] == 1) {
				for(int k = 0; k < row; k++) {
					Arrays.fill(visited[k], false);
				}
				findShortestPathUtil(m, visited, i, 0, 0);
				if(min_dist == col - 1) break;
			}
		}
		
		if(min_dist != Integer.MAX_VALUE) {
			System.out.println("Length of shortest " + "safe route is " + min_dist);
		} else {
			System.out.println("Destination not " + "reachable from given source");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {{ 1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 1,  0,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  0,  1,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  1,  0,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  1,  1,  0,  1,  1,  1,  1 },
		{ 1,  0,  1,  1,  1,  1,  1,  1,  0,  1 },
		{ 1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 0,  1,  1,  1,  1,  0,  1,  1,  1,  1 },
		{ 1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
		{ 1,  1,  1,  0,  1,  1,  1,  1,  1,  1 }};
		
		findShortestPath(m);
	}

}
