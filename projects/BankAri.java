package projects;

import java.util.Scanner;

public class BankAri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int accNo = 180045679;
		String a = "";
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i = 0; ; i++) {
			System.out.println("Press 1 to create a new account");
			System.out.println("Press 2 to access the existing account");
			System.out.println("Press 0 to exit");
			int n = sc.nextInt();
			switch(n) {
			case 1 : {
				System.out.println("Enter Account Holder Name : ");
				a = sc.nextLine();
				sc.nextLine();
				System.out.println("Choose Type Of Account : ");
				System.out.println("Press 1 for Savings Account");
				System.out.println("Press 2 for Current Account");
			    b = sc.nextInt();
				System.out.println("Enter The Opening Amount : ");
				c = sc.nextInt();
				d = accNo;
				System.out.println("Account Number Generated : " + d);
				accNo++;
				break;
			}
			case 2 : {
				System.out.println("Account Holder Name : " + a);
				if(b == 1) {
					System.out.println("Type Of Account : Savings");
				} else {
					System.out.println("Type Of Account : Current");
				}
				System.out.println("Opening Amount : " + c);
				System.out.println("Account Number : " + d);
				break;
			}
			case 0 : {
				System.exit(0);
			}
			}
			
		}

	}

}
