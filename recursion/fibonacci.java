package recursion;

public class fibonacci {

//	TIME COMPLEXITY : (2)^N......EVERYTIME FUNCTION IS HAVING TWO CALLS EACH
//	AUXILIARY SPACE COMPLEXITY : O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibo(6));
	}

	static int fibo(int n) {
		if(n <= 1) return n;
		return fibo(n - 2) + fibo(n - 1);
	}
}
// FOR REVERSE ARRAY OR PALINDROME CHECK WE USE I,J POINTER AND SO TIME COMPLEXITY WILL BE O(N/2)
// AUXILIARY SPACE COMPLEXITY IS ALSO O(N/2)

// FOR FACTORIAL TIME AND SPACE COMPLEXITY WILL BE O(N)