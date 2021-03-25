package arrays;

import java.util.Scanner;

class account {
	String accName, accType;
	double bal, iniBal, depMoney, witMoney;
	long accNum;
	public void a() {
		System.out.println("Name of account holder: " + accName);
	}
	public void b() {
		System.out.println("Account number: " + accNum);
	}
	public void c() {
		System.out.println("Type of account: " + accType);
	}
	public void d() {
		System.out.println("Initial account balance: " + iniBal);
	}
	public void e() {
		System.out.println("Account balance: " + bal);
	}
	public void f() {
		System.out.println("Deposite money: " + depMoney);
	}
	public void g() {
		System.out.println("Withdraw money: " + witMoney);
	}
}

public class bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		account acc = new account();
		System.out.println("Enter the name of the account holder: ");
		acc.accName = sc.nextLine();
		System.out.println("Enter the bank account number: ");
		acc.accNum = sc.nextLong();
		System.out.println("Enter the type of your account: ");
		acc.accType = sc.next();
		System.out.println("Assign initial value to the account: ");
		acc.iniBal = sc.nextDouble();
		acc.bal = acc.iniBal;
		System.out.println("Enter the value you want to deposite: ");
		acc.depMoney = sc.nextDouble();
		acc.bal += acc.depMoney;
		System.out.println("Enter the value you want to withdraw: ");
		acc.witMoney = sc.nextDouble();
		acc.bal -= acc.witMoney;
		acc.a();
		acc.b();
		acc.c();
		acc.d();
		acc.f();
		acc.g();
		acc.e();
	}

}
