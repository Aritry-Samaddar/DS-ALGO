package gfg.queue;

import java.util.*;

public class NegIntWindow {
	
	public static Queue<Integer> queue(int[] arr, int k) {
		Queue<Integer> q = new LinkedList<>();
		Deque<Integer> dq = new LinkedList<>();
		int n = arr.length;
		int i = 0;
		for(; i < k; i++) {
			if(arr[i] < 0) {
				dq.addLast(i);
			}
		}
		for(; i < n; i++) {
		    if(!dq.isEmpty())
			    q.add(arr[dq.peekFirst()]);
			else
			    q.add(0);
			if(!dq.isEmpty() && dq.peekFirst() <= i - k) {
				dq.removeFirst();
			}
			if(arr[i] < 0) {
				dq.addLast(i);
			}
		}
		if(dq.isEmpty()) {
			q.add(0);
		} else {
			q.add(arr[dq.peekFirst()]);
		}
		return q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
//		int k = 3;
//		Queue<Integer> q = queue(arr, k);
//		System.out.println(q);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j = 0; j < n; j++) {
		        arr[j] = sc.nextInt();
		    }
		    int k = sc.nextInt();
		    Queue<Integer> q = queue(arr, k);
		    while(!q.isEmpty()) {
		        System.out.print(q.remove() + " ");
		    }
		    System.out.println();
		}

	}

}
