package recursion;

import java.util.ArrayList;

public class oneAnsPrint {

	static ArrayList<Integer> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4, 3};
		System.out.println(rec(arr, 0, arr.length, 0, 3));
	}

	static boolean rec(int[] arr, int index, int n, int sum, int k) {
		if(index >= n) {
			if(sum % k == 0) {
				for(int e : al) {
				    System.out.print(e + " ");
			    }
			    System.out.println();
			    return true;
			}
			return false;
		}
		
		al.add(arr[index]);
		if(rec(arr, index + 1, n, sum += arr[index], k) == true) return true;
		al.remove(al.size() - 1);
		if(rec(arr, index + 1, n, sum -= arr[index], k) == true) return true;
		return false;
	}
}
