package final450.array;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int arr[] = {4, 5, 1, 2};
//		 int m = arr.length;
//		 int n = arr.length;
//		 int[] brr = new int[n];
//		 for(int i = 0; i < n; i++) {
//			 brr[i] = arr[m - 1];
//			 m--;
//		 }
//		 for(int x : brr) {
//			 System.out.print(x + " ");
//		 }
		
		
		int arr[] = {4, 5, 1, 2};
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
