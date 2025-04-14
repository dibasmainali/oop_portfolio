package Bankacc;

import java.util.Scanner;

public class LLBankDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LLBankAccount[] customers = new LLBankAccount[30];
        int customerCount = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n=== L&L Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Add 3% Interest to All Accounts");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (customerCount < 30) {
                        System.out.print("Enter customer name: ");
                        scanner.nextLine(); // clear buffer
                        String name = scanner.nextLine();
                        System.out.print("Enter account number: ");
                        int accNumber = scanner.nextInt();
                        if (findAccount(customers, customerCount, accNumber) == -1) {
                            customers[customerCount++] = new LLBankAccount(name, accNumber);
                            System.out.println("Account created successfully.");
                        } else {
                            System.out.println("Account number already exists!");
                        }
                    } else {
                        System.out.println("Maximum account limit (30) reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number to deposit into: ");
                    int depAcc = scanner.nextInt();
                    int depIndex = findAccount(customers, customerCount, depAcc);
                    if (depIndex != -1) {
                        System.out.print("Enter deposit amount: ");
                        double depAmount = scanner.nextDouble();
                        customers[depIndex].deposit(depAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number to withdraw from: ");
                    int withAcc = scanner.nextInt();
                    int withIndex = findAccount(customers, customerCount, withAcc);
                    if (withIndex != -1) {
                        System.out.print("Enter withdrawal amount: ");
                        double withAmount = scanner.nextDouble();
                        customers[withIndex].withdraw(withAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < customerCount; i++) {
                        customers[i].addInterest();
                    }
                    System.out.println("Interest added to all accounts.");
                    break;

                case 5:
                    if (customerCount == 0) {
                        System.out.println("No accounts to display.");
                    } else {
                        System.out.println("\n--- All Account Details ---");
                        for (int i = 0; i < customerCount; i++) {
                            customers[i].display();
                        }
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using L&L Bank.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static int findAccount(LLBankAccount[] accounts, int count, int accNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccNumber() == accNumber) {
                return i;
            }
        }
        return -1;
    }
}

