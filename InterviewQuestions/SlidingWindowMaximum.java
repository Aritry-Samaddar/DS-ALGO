package InterviewQuestions;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new Solution();
		int[] a = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
		int[] ans = solution.maxSlidingWindow(a, 4);
		
		for(int e : ans) {
			System.out.print(e + " ");
		}

	}
	
	static class Solution {
	    public int[] maxSlidingWindow(int[] a, int k) {
	    	int n = a.length;
	    	if(n <= 1) return a;
	    	int[] ans = new int[n - k + 1];
	        Deque<Integer> dq = new LinkedList<>();
	        int i = 0;
	        for(; i < k; i++) {
	        	while(!dq.isEmpty() && a[dq.getLast()] <= a[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        
	        for(; i < n; i++) {
	        	ans[i - k] = a[dq.getFirst()];
	        	if(!dq.isEmpty() && dq.getFirst() <= i - k) {
	        		dq.removeFirst();
	        	}
	        	while(!dq.isEmpty() && a[dq.getLast()] <= a[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        ans[i - k] = a[dq.getFirst()];
	        return ans;
	    }
	}

}
