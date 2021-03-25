package projects;

import java.util.Scanner;

public class trainees {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int trainees = 3;
		int rounds = 3;
		float p = 0;
		float q = 0;
		float r = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		boolean isChecked = false;
		boolean isChecked2 = false;
		for(int i = 1; i <= rounds; i++) {
			for(int j = 1; j <= trainees; j++) {
				int a = sc.nextInt();
				if(a < 1 && a > 100) {
					isChecked = true;
				}
				switch(j) {
				case 1 :
					l += a;
					break;
				case 2 :
					m += a;
					break;
				case 3 :
					n += a;
					break;
				}
			}
		}
		p = l / rounds;
		q = m / rounds;
		r = n / rounds;
		if(isChecked == true) {
			System.out.println("INVALID INPUT");
		}
		if(p < 70 && q < 70 && r < 70) {
			System.out.println("ALL TRAINEES ARE UNFIT.");
			isChecked2 = true;
		}
		if(p > q && isChecked == false && isChecked2 == false) {
			if(p > r) {
				System.out.println("FIT TRAINEE : " + "1");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + p);
			} else if(p == r) {
				System.out.println("FIT TRAINEE : " + "1");
				System.out.println("FIT TRAINEE : " + "3");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + p);
			}
		} else if(q > p && isChecked == false && isChecked2 == false) {
			if(q > r) {
				System.out.println("FIT TRAINEE : " + "2");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + q);
			} else if(q == r) {
				System.out.println("FIT TRAINEE : " + "2");
				System.out.println("FIT TRAINEE : " + "3");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + q);
			}
		}
		
		

	}

}
