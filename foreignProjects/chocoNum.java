package foreignProjects;

import java.util.*;

public class chocoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 0; ;i++) {
			if(sum == n) break;
			if(i % a == 0) {
				pq.add(i);
				if(pq.size() > n) pq.remove();
				sum++;
			} else if(i % b == 0) {
				pq.add(i);
				if(pq.size() > n) pq.remove();
				sum++;
			}
		}
		
		System.out.println(pq.remove());
	}

}
