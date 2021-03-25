package final450.array;

import java.util.*;

public class MergeIntervals {
	static class Interval {
		int start, end;
		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public static void merge(int[][] intervals) {
		int n = intervals.length;
		ArrayList<Interval> p = new ArrayList<>();
		
		
//		Arrays.sort(intervals, new Comparator<int[]>()  
//	    { 
//	        public int compare(int[] a, int[] b) 
//	        { 
//	            return a[0] - b[0]; 
//	        } 
//	    });
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		for(int i = 0; i < n; i++) {
			int S = intervals[i][0];
			int E = intervals[i][1];
			Interval q = new Interval(S, E);
			p.add(q);
		}

		
		int i = 0;
		while(i < p.size()) {
			if(i == p.size() - 1) break;
			Interval current = p.get(i);
			Interval next = p.get(i + 1);
			if(current.end < next.start) {
				if(i == p.size() - 2) break;
				i++;
			} else {
				current.start = Math.min(current.start, next.start);
				current.end = Math.max(current.end, next.end);
				p.remove(i + 1);
			}
		}

		
		for (int j = 0; j < p.size(); j++) 
        { 
            System.out.print("[" + p.get(j).start + ", " + p.get(j).end + "],");
        }
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] intervals = {{1, 3},{5, 10},{9, 12},{11, 15}, {18, 20}};
		int[][] intervals = {{1,3}, {2,4}, {5,7}, {6,8}};
		merge(intervals);

	}

}
