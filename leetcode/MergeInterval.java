package leetcode;
import java.util.*;
public class MergeInterval {
	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> merged = new LinkedList<>();
		for(int[] e : intervals) {
			if(merged.isEmpty() || merged.getLast()[1] < e[0]) {
				merged.add(e);
			} else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], e[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
//		for(int i = 0; i < merged.size(); i++) {
//			System.out.print("[" + merged.get(i)[0] + "," + merged.get(i)[1] + "]");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] ans = merge(intervals);
		for(int[] e : ans) {
			System.out.print("[" + e[0] + "," + e[1] + "]");
		}
		

	}

}
