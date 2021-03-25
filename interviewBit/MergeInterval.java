package interviewBit;

import java.util.*;

public class MergeInterval {
	static class Interval {
		int start, end;
		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
public static void fillArraylist(int[][] arr, int n) {
		ArrayList<Interval> intervals = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int Start = arr[i][0];
			int End = arr[i][1];
			Interval p = new Interval(Start, End);
			intervals.add(p);
			
		}
		Interval newInterval = new Interval(4, 9);
		insert(intervals, newInterval);
	}
	
public static void insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        if(intervals == null) {
            intervals = new ArrayList<Interval>();
            intervals.add(newInterval);
//            return intervals;
            for (int i = 0; i < intervals.size(); i++) 
            { 
                System.out.println("[" + intervals.get(i).start + ", " + intervals.get(i).end + "],"); 
            }
        } else if(intervals.size() == 0) {
            intervals.add(newInterval);
//            return intervals;
            for (int i = 0; i < intervals.size(); i++) 
            { 
                System.out.println("[" + intervals.get(i).start + ", " + intervals.get(i).end + "],"); 
            } 
        }
        
        Interval toInsert = newInterval;
        int i = 0;
        while(i < intervals.size()) {
            Interval current = intervals.get(i);
            if(toInsert.start > current.end) {
                i++;
            } else if(current.start > toInsert.end) {
                intervals.add(i, toInsert);
                break;
            } else {
                toInsert.start = Math.min(toInsert.start, current.start);
                toInsert.end = Math.max(toInsert.end, current.end);
                intervals.remove(i);
            }
        }
        
        if(i == intervals.size()) {
            intervals.add(toInsert);
        }
        
//        return intervals;
        for (int j = 0; j < intervals.size(); j++) 
        { 
            System.out.print("[" + intervals.get(j).start + ", " + intervals.get(j).end + "],");
        }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int newInterval[][] = {{4, 9}};
		int n = arr.length;
		fillArraylist(arr, n);

	}

}
