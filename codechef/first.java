package codechef;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			System.out.println("Enter x: ");
			long x = sc.nextInt();
			System.out.println("Enter y: ");
			long y = sc.nextInt();
			long diff = Math.abs(x-y);
			if(x > y) {
				if(diff % 2 == 0) {
					System.out.println("Testcases are: ");
					System.out.println(1);
				} else {
					System.out.println("Testcases are: ");
					System.out.println(2);
				}
					
			} else if(x == y){
				System.out.println("Testcases are: ");
				System.out.println(0);
			} else {
				if(diff % 2 != 0) {
					System.out.println("Testcases are: ");
					System.out.println(1);
				} else {
					if(diff % 4 != 0) {
						System.out.println("Testcases are: ");
						System.out.println(2);
					} else {
						System.out.println("Testcases are: ");
						System.out.println(3);
					}
				}
			}

		}
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0){
//		    long x = sc.nextLong();
//		    long y = sc.nextLong();
//		    long diff = Math.abs(x-y);
//		    
//		    if(x>y){
//		        if(diff%2 ==0)
//		        System.out.println(1);
//		        else
//		        System.out.println(2);
//		    }
//		    else if(x==y){
//		        System.out.println(0);
//		    }
//		    else{
//		        if(diff%2 != 0)
//		        System.out.println(1);
//		        else{
//		            if(diff%4 != 0)
//		            System.out.println(2);
//		            else
//		            System.out.println(3);
//		        }
//		    }
//		}
		
	}

}
