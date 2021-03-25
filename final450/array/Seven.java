package final450.array;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {1, 2, 3, 4, 5};
		long n = 5;
		long last = arr[arr.length - 1];
		for(int i = (int) (n - 1); i > 0; i--) {         //for(int i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
		for(long e : arr) {
			System.out.print(e + " ");
		}

	}

}
