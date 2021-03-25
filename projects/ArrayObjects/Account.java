package projects.ArrayObjects;

public class Account {
	private String name, type, transaction;
	private int amount, accNum, deposite, withdraw, balance;
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getAmount() {
		return amount;
	}
	public int getAccNum() {
		return accNum;
	}
	public int getDeposite() {
		return deposite;
	}
	public int getWithdraw() {
		return withdraw;
	}
	
	public void deposite(int deposite) {
		this.deposite = deposite;
		amount += deposite;
		System.out.println("The updated account balance : " + amount);
	}
	public void withdraw(int withdraw) {
		this.withdraw = withdraw;
		if(amount >= withdraw) {
			amount -= withdraw;
			System.out.println("The updated account balance : " + amount);
		} else {
			System.out.println("Balance is insufficient!!");
		}
		
	}
	public void accDetails() {
		System.out.println("Name of the account holder : " + name);
		System.out.println("Account number : " + accNum);
		System.out.println("Account type : " + type);
		System.out.println("Account balance : " + amount);
	}
	public void statement() {
		
		
	}
	public void setValue(String transaction, int balance, int amount) {
		this.transaction = transaction;
		this.balance = balance;
		this.amount = amount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
