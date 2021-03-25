package projects;

import java.util.Scanner;

public class flame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String x = sc.nextLine();
		System.out.println("Enter the second name: ");
		String  y = sc.nextLine();
		String p = "flame";
		int n = x.length() + y.length();
		int checked = 0;
		int flame = 0;
		int q = 0;
		boolean isChecked[] = new boolean[y.length()];
		boolean isChecked2[] = new boolean[x.length()];
		boolean isChecked3[] = new boolean[p.length()];
		for(int i = 0; i < x.length(); i++) {
			int a = x.charAt(i);
			for(int j = 0; j < y.length(); j++) {
				if(a == y.charAt(j) && !isChecked[j]) {
					isChecked[j] = true;
					n -= 1;
					if(checked == 0) {
						for(int k = 0; k < x.length(); k++) {
							if(a == x.charAt(k) && !isChecked2[k]) {
								isChecked2[k] = true;
								n -= 1;
							}
						}
					}
				}
			}
			
		}
		System.out.println("Total mismatched words: " + n);
		
		boolean isPrinted = false;
		for(int m = 1; ; m++) {
			for(int o = 0; o < p.length(); o++) {
				if(!isChecked3[o]) {
					if(q == 4) {
					    char d = p.charAt(o);
						//System.out.println("They are: " + d);
						switch(d) {
						case 'f':
							System.out.println("They are FRIENDS!!");
							break;
						case 'l':
							System.out.println("They are in LOVE!!");
							break;
						case 'a':
							System.out.println("They are AFFECTIONATE to each other!!");
							break;
						case 'm':
							System.out.println("They are going to be MARRIED!!");
							break;
						case 'e':
							System.out.println("They are ENEMIES!!");
							break;
						}
						isPrinted = true;
						break;
					}
				    flame += 1;
				}
				if(flame == n && !isChecked3[o] && q != 4) {
					isChecked3[o] = true;
					q += 1;
					flame = 0;
				}
			}
			if(q == 4 && isPrinted)
				break;
		}
		
		
	}

}
