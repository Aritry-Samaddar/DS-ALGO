package codechef;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int q[] = new int[n];
			for(int j = 0; j < n; j++) {
				q[j] = sc.nextInt();
			}
			long count = 0;
			long leftOver = 0;
			long ans = 0;
			for(int j = 0; j < n; j++) {
				count = q[j] + leftOver;
				leftOver = count - k;
				if(count < k) {
					ans = j + 1;
					break;
				}
			}
			if(leftOver > 0) {
				ans = n + (leftOver / k) + 1;
			}
			System.out.println(ans);
		}

	}

}
