package recursion;

import java.util.*;

public class StrSequences {

	static int[] arr = {1, 2, 3};
	static ArrayList<Integer> al = new ArrayList<>();
	static int sum = 0;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recs(0);
		
		ArrayList<Integer> al = new ArrayList<>();
		int[] arr = {1, 2, 3};
		recc(arr, 0, 3, arr.length, al, 0);
		
		
		System.out.println(fun(arr, 0, 3, arr.length, 0) - 1);
		
		funn(arr, 0, 3, arr.length, 0);
	    System.out.println(count - 1);

	}

//	TIME COMPLEXITY : (2)^N..................FOR PRINT STATEMENT IT WOULD BE NEARLY (2)^N * N
//	SPACE COMPLEXITY : O(N)
	static void recs(int index) {
		if(index == arr.length) {
			for(int e : al) {
				System.out.print(e + " ");
			}
			System.out.println();
			return;
		}
		
		al.add(arr[index]);
		recs(index + 1);
		al.remove(al.size() - 1);
		recs(index + 1);
	}
	
	static void recc(int[] arr, int index, int n, int size, ArrayList<Integer> al, int sum) {
		if(index == size) {
			if(sum % n == 0) {
			    for(int e : al) {
				    System.out.print(e + " ");
			    }
			    System.out.println();
		    }
			return;
		}
		al.add(arr[index]);
		recc(arr, index + 1, n, size, al, sum + arr[index]);
		al.remove(al.size() - 1);
		recc(arr, index + 1, n, size, al, sum - arr[index]);
	}
	
	
	static void funn(int[] arr, int index, int n, int size, int sum) {
		if(index == size) {
			if(sum % n == 0) {
			    count++;
		    }
			return;
		}
		funn(arr, index + 1, n, size, sum + arr[index]);
		funn(arr, index + 1, n, size, sum - arr[index]);
	}
	
	
//	TIME COMPLEXITY : (2)^N
	static int fun(int[] arr, int index, int n, int size, int sum) {
		if(index == size) {
			if(sum % n == 0) return 1;
			else return 0;
		}
		return fun(arr, index + 1, n, size, sum + arr[index]) + fun(arr, index + 1, n, size, sum - arr[index]);
	}
}
