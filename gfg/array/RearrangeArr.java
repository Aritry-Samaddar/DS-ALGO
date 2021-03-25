package gfg.array;

public class RearrangeArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = {4,0,2,1,3};
		long brr[] = new long[arr.length];
		for(int i = 0; i < arr.length; i++) {
			brr[i] = arr[(int) arr[i]];
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = brr[i];
		}
		for(long e : arr) {
			System.out.print(e + " ");
		}

	}

}
