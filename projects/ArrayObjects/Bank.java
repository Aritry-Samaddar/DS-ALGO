package projects.ArrayObjects;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Account> obj = new ArrayList();
		ArrayList<BANK2> fine = new ArrayList();
		int accountNumber = 1;
		for(int i = 0; ; i++) {
			System.out.println("Press 1 to create a new account");
			System.out.println("Press 2 to access existing account");
			System.out.println("Press 0 to exit");
			int press = sc.nextInt();
			switch(press) {
			case 1 : {
				Account obj2 = new Account();
				int j = 0;
				while(j >= 0) {
					System.out.println("Enter account holder name : ");
					obj2.setName(sc.next());
					sc.next();
					System.out.println("Choose account type : ");
					System.out.println("Press 1 for Savings");
					System.out.println("Press 2 for Current");
					int n = 1;
					while(n > 0) {
						int b = sc.nextInt();
						if(b == 1) {
							obj2.setType("Savings");
							break;
						} else if(b == 2) {
							obj2.setType("Current");
							break;
						} else {
							System.out.println("Doesn't exist!!");
						}
					}
					System.out.println("Enter the opening amount : ");
					int c = sc.nextInt();
					obj2.setAmount(c);
					System.out.println("Account number : " + accountNumber);
					obj2.setAccNum(accountNumber);
					accountNumber++;
					obj.add(obj2);
					j++;
					break;
				}
				
				break;
			}
			case 2 : {
				ArrayList<BANK2> array = new ArrayList();
				Account obj3 = new Account();
				System.out.println("Enter your account number : ");
				int a = sc.nextInt();
				if(a == 0 || a > accountNumber || a < 0) {
					System.out.println("Account doesn't exist!");
				} else if(a < accountNumber) {
					obj3 = obj.get(a - 1);
//				    int l = 0;
//				    int[] arr = new int[10];
//					int[] brr = new int[10];
					for(int k = 0; ; k++) {
						BANK2 array2 = new BANK2();
						System.out.println("Press 1 to Deposite money");
						System.out.println("Press 2 to Withdraw money");
						System.out.println("Press 3 for Account details");
						System.out.println("Press 4 for Statement");
						System.out.println("Press 0 to Logout");
						int b = sc.nextInt();
						switch(b) {
						case 1 : {
							System.out.println("Enter the amount to Deposite : ");
							int c = sc.nextInt();
							obj3.deposite(c);
							array2.setDeposite(c);
							array2.setBalance(obj3.getAmount());
							array.add(array2);
//							fine.addAll(array);
//							arr[k] = c;
//							brr[k] = obj3.getAmount();
//							l++;
							break;
						}
						case 2 : {
							System.out.println("Enter the amount to Withdraw : ");
							int d = sc.nextInt();
							obj3.withdraw(d);
							array2.setWithdraw(d);
							array2.setBalance(obj3.getAmount());
							array.add(array2);
//							fine.addAll(array);
//							arr[k] = -d;
//							brr[k] = obj3.getAmount();
//							l++;
							break;
						}
						case 3 : {
							obj3.accDetails();
							break;
						}
						case 4 : {
//							fine.addAll(array);
							BANK2 array3 = new BANK2();
							System.out.println("Name of the account holder : " + obj3.getName());
							System.out.println("Account number : " + obj3.getAccNum());
							System.out.println("Account type : " + obj3.getType());
//							System.out.println("Sl no\tDeposite/Withdraw\tBalance");
							System.out.println("Sl no\t\tDeposited\tWithdrawal\tBalance");
							
							for(int j = 0; j < array.size(); j++) {
//								System.out.println(j + "\t\t" + arr[j] + "\t\t" + brr[j]);
//								array3 = fine.get(j);
								array3 = array.get(j);
								System.out.println(j + "\t\t" + array3.getDeposite() + "\t\t" + array3.getWithdraw() + "\t\t" + array3.getBalance());
							}
							System.out.println("The closing amount : " + obj3.getAmount());
							break;
						}
						case 0 : {
							break;
						}
						default : {
							System.out.println("Wrong Option!!");
						}
						}
						if(b == 0) break;
					}
				}
				
				break;
			}
			case 0 : {
				System.exit(0);
			}
			default : {
				System.out.println("Wrong Option!!");
			}
				
			}
		}
		

	}

}

