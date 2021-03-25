package projects;

import java.util.Scanner;

public class traineess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int trainees = 3;
		int rounds = 3;
		int result = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		boolean isChecked = false;
		boolean isChecked2 = false;
		int[] p = new int[trainees];
		for(int i = 1; i <= rounds; i++) {
			for(int j = 0; j < trainees; j++) {
				int a = sc.nextInt();
				if(a < 1 || a > 100) {
					isChecked = true;
				}
				p[j] += a;
			}
		}
		if(isChecked == true) {
			System.out.println("INVALID INPUT");
		}
		if(isChecked == false) {
			for(int i = 0; i < trainees; i++) {
				p[i] /= rounds;
				if(p[i] < 70) {
					result += 1;
				}
			}
		}
		if(result == trainees && isChecked == false) {
			System.out.println("ALL TRAINEES ARE UNFIT.");
			isChecked2 = true;
		}
		if(isChecked == false && isChecked2 == false) {
			int value = 1;
			for(int k = 0; k < trainees; k++) {
				if(p[value] < p[k]) {
					l = p[k];
				}
			}
			for(int k = 0; k < trainees; k++) {
				if(l == p[k]) {
					n = k + 1;
					System.out.println("FIT TRAINEE : " + n);
				}
			}
			System.out.println("THE HIGHEST AVERAGE OXYGEN LEVEL : " + l);
		}
	}

}
