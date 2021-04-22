package backtracking;

import java.util.ArrayList;

public class partitionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 1, 2, 3, 4, 8};
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		ArrayList<Integer> ans = new ArrayList<>();
		boolean isPossible = (sum&1) == 0      // sum % 2 == 0
				&& partition(a, sum/2, 0, ans);          // if sum is even and partition possible then true
		if(isPossible) {
			for(int e : ans) {
				System.out.print(e + " ");
			}
		} else {
			System.out.println("partition not possible");
		}

	}
	
	static boolean partition(int[] a, int sum, int i, ArrayList<Integer> ans) {
		if(i >= a.length || sum < 0) return false;
		if(sum == 0) return true;
		ans.add(a[i]);
		boolean leftPossible = partition(a, sum - a[i], i + 1, ans);   // i is current index, sum - current element(for reducing sum 10 to 0)
		if(leftPossible) return true;
		ans.remove(ans.size() - 1);     // This makes backtracking possible  // ans.size() - 1 --> this index points to last element added to ans
		                                                         // if !leftPossible(if sum do not become 0 for adding the element in the leftside)
		                                                        // then we remove the last element added to ans and it goes to rightside
		return partition(a, sum, i + 1, ans);     // and we return same sum 10 and next index (i + 1)
	}

}
