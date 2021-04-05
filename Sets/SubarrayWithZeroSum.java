package Sets;

import java.util.*;

/*
 * Given an array, find if there exists a subarray with sum equals to zero. *
 * n < 10^5 *
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, -3, -1, 9};
		int k = 6;
		boolean found = false;
		
//		for(int i = 0; i < arr.length; i++) {
//			int sum = 0;
//			for(int j = i; j < arr.length; j++) {
//				sum += arr[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			set.add(sum);
//			sum += arr[i];
//			if(set.contains(sum)) {
//				found = true;
//				break;
//			}
//		}
		for(int element : arr) {
			set.add(sum);
			sum += element;
			if(set.contains(sum - k)) {           // Y - K = X;
				found = true;
				break;
			}
		}
		System.out.println("found " + found);

	}

}
