package projects;
import java.util.Arrays;
public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] arr = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
		int[] brr = new int[n];
		long sum = 0;
		Arrays.fill(brr, 1);
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                brr[i] = brr[i - 1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > arr[i + 1]) {
                brr[i] = Math.max(brr[i + 1] + 1, brr[i]);
            }
        }
        for(int i = 0; i < n; i++) {
            sum = sum + (long)brr[i];
        }
        System.out.println(sum);

	}

}
