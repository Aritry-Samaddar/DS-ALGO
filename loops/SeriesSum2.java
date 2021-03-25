package loops;

import java.util.Scanner;
import java.lang.ArithmeticException;
public class SeriesSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		float result = 0;
		for(float i = 1; i <= n; i++) { // if n = infinity then the series = loge 2; Taylor's Theorem;
			if(i % 2 == 0) {
				result -= 1 / i;
			} else {
				result += 1 / i;
			}
			
		}
		System.out.println("sum is: " + result);
	}

}
