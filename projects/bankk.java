package projects;

import java.util.Scanner;

public class bankk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		acc obj = new acc();
		
		int i = 1;
		while(i > 0) {
			System.out.println("Press 1 to create a new account");
			System.out.println("Press 2 to access the existing account");
			System.out.println("Press 0 to exit");
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("Enter Account Holder Name : ");
				String a = sc.next();
				obj.setName(a);
				System.out.println("Choose Type Of Account : ");
				System.out.println("Press 1 for Savings Account");
				System.out.println("Press 2 for Current Account");
			    int b = sc.nextInt();
			    if(b == 1) {
			    	obj.setType("Savings");
			    } else {
			    	obj.setType("Current");
			    }
			    System.out.println("Enter The Opening Amount : ");
				int c = sc.nextInt();
				obj.setAmount(c);
				
			} else if(n == 2) {
				System.out.println("Account Holder Name : " + obj.getName());
				System.out.println("Type Of Account : " + obj.getType());
				System.out.println("The Opening Amount : " + obj.getAmount());
			} else {
				System.exit(0);
			}
			i++;
		}
		
		

	}

}
