package tcs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		int n = sc.nextInt();
		float m = 0;
		if(n >= 20 && n <= 30) {
			m = (float) ((3.14) * n * n);
			System.out.println(df.format(m));
		} else {
			System.out.println("Wrong Radius Entered!!");
		}

	}

}
