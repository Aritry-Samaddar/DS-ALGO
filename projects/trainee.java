package projects;

import java.util.Scanner;

public class trainee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int trainees = 3;
		int rounds = 3;
		float p = 0;
		float q = 0;
		float r = 0;
		float s = 0;
		boolean isChecked = false;
		boolean isChecked2 = false;
		for(int i = 1; i <= rounds; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
				isChecked = true;
			}
			s = (a + b + c) / (rounds);
			switch(i) {
			case 1 :
				p = s;
				break;
			case 2 :
				q = s;
				break;
			case 3 :
				r = s;
				break;
			}
		}
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
			} else {
				System.out.println("FIT TRAINEE : " + "2");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + q);
			}
		} else {
			if(q > r) {
				System.out.println("FIT TRAINEE : " + "2");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + q);
			} else {
				System.out.println("FIT TRAINEE : " + "3");
				System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + r);
			}
		}

	}

}
