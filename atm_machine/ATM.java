package spark_batch.basic_projects.atm_machine;

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM() {
        checkPin();
    }


    Scanner input = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your pin: ");
        int userPin = input.nextInt();
        int pin = 1234;
        if (pin == userPin) menu();
        else System.out.println("Invalid pin");
    }



    public void menu() {
        int amount;
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.println("Enter your choice from above: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    amount = input.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    amount = input.nextInt();
                    deposit(amount);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }

    private void deposit(double money) {
        if (money > 0){
            this.balance += money;
            System.out.println(money + " deposited successfully");
            checkBalance();
        } else System.out.println("Invalid amount");
    }

    private void withdraw(double money) {
        if (money < this.balance) {
            this.balance -= money;
            System.out.println(money + " rupees successfully withdrew");
            checkBalance();
        }
        else System.out.println("Insufficient balance");
    }

    private void checkBalance() {
        System.out.println("Current balance is " + this.balance);
    }
}
