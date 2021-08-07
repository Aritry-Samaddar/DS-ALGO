package recursion;

import java.util.*;

public class subsets {

//	TIME COMPLEXITY : ( SUM / ARR[INDEX] )^N.......(exponential)
	static ArrayList<Integer> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4};
		System.out.println(count(arr, 0, arr.length, 4));
		rec(arr, 0, arr.length, 4);
	}

	static void rec(int[] arr, int index, int n, int sum) {
		if(index >= n) {
			if(sum == 0) {
				for(int e : al) {
				    System.out.print(e + " ");
			    }
			    System.out.println();
			}
			return;
		}
		
		if(sum - arr[index] >= 0) {
			al.add(arr[index]);
			sum -= arr[index];
			rec(arr, index, n, sum);
			sum += arr[index];
			al.remove(al.size() - 1);
		}
		rec(arr, index + 1, n, sum);
	}
	
	static int count(int[] arr, int index, int n, int sum) {
		if(index == n) {
			if(sum == 0) return 1;
			return 0;
		}
		
		int left = 0, right;
		if(arr[index] <= sum) {
			sum -= arr[index];
			left = count(arr, index, n, sum);
			sum += arr[index];
		}
		right = count(arr, index + 1, n, sum);
		return left + right;
	}
}
