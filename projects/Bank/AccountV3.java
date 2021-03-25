package projects.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountV3 {
    int statementArrayCount;
    String[] statementArray = new String[20];
    int balanceArrayCount;
    double[] balanceArray = new double[20];
    String name;
    int ac_no;
    int ac_type;
    String type;
    double balance;
    Scanner sc = new Scanner(System.in);

    AccountV3() {
    }

    void create(int n) {
        this.ac_no = n;
        System.out.println("Enter Account Holder Name: ");
        this.name = this.sc.nextLine();
        while (true) {
            boolean bl = true;
            while (bl) {
                try {
                    System.out.println("\nChoose type of Account:\n1. Savings\n2. Current");
                    this.ac_type = this.sc.nextInt();
                    bl = false;
                }
                catch (InputMismatchException inputMismatchException) {
                    this.sc.nextLine();
                    System.out.println("It should be an Integer input!");
                }
            }
            if (this.ac_type == 1) {
                this.type = "Savings Account";
                break;
            }
            if (this.ac_type == 2) {
                this.type = "Current Account";
                break;
            }
            System.out.println("\nWrong Input!! Try Again.\n");
        }
        while (true) {
            double d = 0.0;
            boolean bl = true;
            while (bl) {
                try {
                    System.out.println("\nEnter the Opening Amount: ");
                    d = this.sc.nextInt();
                    bl = false;
                }
                catch (InputMismatchException inputMismatchException) {
                    this.sc.nextLine();
                    System.out.println("It should be an Integer input!");
                }
            }
            if (d >= 0.0) {
                if (!(d > 0.0)) break;
                this.balance = d;
                this.statementArray[this.statementArrayCount++] = "  " + this.statementArrayCount + ".\t  Credit\t+" + d;
                this.balanceArray[this.balanceArrayCount++] = this.balance;
                break;
            }
            System.out.println("Invalid Amount!");
        }
        System.out.println("\nAccount Number Generated: " + n);
    }

    void existing() {
        int n = 0;
        boolean bl = true;
        block13: while (bl) {
            boolean bl2 = true;
            while (bl2) {
                try {
                    System.out.println("\nPress:\n1. Deposit\n2. Withdraw\n3. Account Details\n4. Statement\n0. LogOut");
                    n = this.sc.nextInt();
                    bl2 = false;
                }
                catch (InputMismatchException inputMismatchException) {
                    this.sc.nextLine();
                    System.out.println("It should be an Integer input!");
                }
            }
            switch (n) {
                case 0: {
                    bl = false;
                    continue block13;
                }
                case 1: {
                    boolean bl3;
                    double d;
                    while (true) {
                        d = 0.0;
                        bl3 = true;
                        while (bl3) {
                            try {
                                System.out.println("\nEnter the amount to Deposit:");
                                d = this.sc.nextDouble();
                                bl3 = false;
                            }
                            catch (InputMismatchException inputMismatchException) {
                                this.sc.nextLine();
                                System.out.println("It should be an Integer input!");
                            }
                        }
                        if (d > 0.0) {
                            this.balance += d;
                            break;
                        }
                        System.out.println("Invalid Amount!");
                    }
                    this.statementArray[this.statementArrayCount++] = "  " + this.statementArrayCount + ".\t  Credit\t+" + d;
                    this.balanceArray[this.balanceArrayCount++] = this.balance;
                    System.out.println("Amount Deposited.\nUpdated Balance: " + this.balance);
                    continue block13;
                }
                case 2: {
                    boolean bl3;
                    while (true) {
                        double d = 0.0;
                        bl3 = true;
                        while (bl3) {
                            try {
                                System.out.println("\nEnter the amount to Withdraw:");
                                d = this.sc.nextDouble();
                                bl3 = false;
                            }
                            catch (InputMismatchException inputMismatchException) {
                                this.sc.nextLine();
                                System.out.println("It should be an Integer input!");
                            }
                        }
                        if (d > 0.0) {
                            if (this.balance >= d) {
                                this.balance -= d;
                                this.statementArray[this.statementArrayCount++] = "  " + this.statementArrayCount + ".\t  Debit \t-" + d;
                                this.balanceArray[this.balanceArrayCount++] = this.balance;
                                System.out.println("Withdrawl Successful.\nRemaining Balance: " + this.balance);
                                continue block13;
                            }
                            System.out.println("Low Balance!");
                            continue block13;
                        }
                        System.out.println("Invalid Amount!");
                    }
                }
                case 3: {
                    System.out.println("\n**Account Details**\nName of Account Holder: " + this.name + "\nAccount Number: " + this.ac_no + "\nType of Account: " + this.type + "\nBalance: " + this.balance);
                    continue block13;
                }
                case 4: {
                    int n2;
                    String[] arrstring = new String[10];
                    for (n2 = 0; n2 < this.balanceArrayCount; ++n2) {
                        arrstring[n2] = this.statementArray[n2] + "\t\t" + this.balanceArray[n2];
                    }
                    System.out.println("\n**** Statement ****\nName of Account Holder: " + this.name + "\nAccount Number: " + this.ac_no + "\nType of Account: " + this.type);
                    System.out.println("Sl no.\tTransactions\tAmount\t\tBalance");
                    for (n2 = 0; n2 < this.balanceArrayCount; ++n2) {
                        System.out.println(arrstring[n2]);
                    }
                    System.out.println("\nClosing Balance: " + this.balance);
                    continue block13;
                }
            }
            System.out.println("Wrong Input!! Try Again.");
        }
    }
}