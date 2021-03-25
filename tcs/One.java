package tcs;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[] a = {1, 2, 3, 1, 2, 1, 2};
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < n; j++) {
				if(a[i] == a[j]) {
					int diff = Math.abs(j - i);
					sum += diff;
				}
			}
			b[i] = sum;
		}
		
		for(int e : b) {
			System.out.print(e + " ");
		}

	}

}
