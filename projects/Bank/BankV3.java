package projects.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankV3 {
    BankV3() {
    }

    public static void main(String[] arrstring) {
        int n = 10011;
        Scanner scanner = new Scanner(System.in);
        AccountV3[] arraccountV3 = new AccountV3[20000];
        while (true) {
            int n2 = 0;
            boolean bl = true;
            while (bl) {
                try {
                    System.out.println("\nPress:\n1. Create a new Account\n2. Access Existing Account\n0. Exit");
                    n2 = scanner.nextInt();
                    bl = false;
                }
                catch (InputMismatchException inputMismatchException) {
                    scanner.nextLine();
                    System.out.println("It should be an Integer input!");
                }
            }
            switch (n2) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    arraccountV3[n] = new AccountV3();
                    arraccountV3[n].create(n);
                    ++n;
                    break;
                }
                case 2: {
                    boolean bl2 = true;
                    int n3 = 0;
                    while (bl2) {
                        try {
                            System.out.println("Enter the Account Number: ");
                            n3 = scanner.nextInt();
                            bl2 = false;
                        }
                        catch (InputMismatchException inputMismatchException) {
                            scanner.nextLine();
                            System.out.println("It should be an Integer input!");
                        }
                    }
                    if (n3 < 10011 || n3 >= n) {
                        System.out.println("Account Doesn't Exist!");
                        break;
                    }
                    arraccountV3[n3].existing();
                    break;
                }
                default: {
                    System.out.println("Wrong Input!! Try Again.");
                }
            }
        }
    }
}