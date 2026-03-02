package Banking.view;

import java.util.Scanner;
import Banking.controller.*;
import Banking.exception.*;
import Banking.model.Bank_account;

public class Driver {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Bank_account_controller controller = new Bank_account_controller();

        System.out.println("Enter account type");
        System.out.println("1. Current");
        System.out.println("2. Savings");
        int choice = userInput.nextInt();
        
        controller.createAccount(choice);
        
        boolean flag = true;

        while (flag) {

            System.out.println("1. Set Account Number");
            System.out.println("2. Get Account Number");
            System.out.println("3. Set Account Holder Name");
            System.out.println("4. Get Account Holder Name");
            System.out.println("5. Get Account Balance (PIN required)");
            System.out.println("6. Withdraw Amount (PIN required)");
            System.out.println("7. Withdraw Amount with Remarks (PIN required)");
            System.out.println("8. Deposit Amount (PIN required)");
            System.out.println("9. Deposit Amount using Payment Gateway (PIN required)");
            System.out.println("10. Exit");

            int operation = userInput.nextInt();

            try {
                switch (operation) {

                case 1:
                    System.out.print("Enter account number: ");
                    controller.setAccountNumber(userInput.nextInt());
                    System.out.println("Account number set successfully");
                    break;

                case 2:
                    System.out.println("Account Number: "
                            + controller.getAccountNumber());
                    break;

                case 3:
                    userInput.nextLine();
                    System.out.print("Enter account holder name: ");
                    controller.setAccountHolderName(userInput.nextLine());
                    System.out.println("Account holder name set successfully");
                    break;

                case 4:
                    System.out.println("Account Holder Name: "
                            + controller.getAccountHolderName());
                    break;

                case 5:
                    System.out.print("Enter PIN: ");
                    short pin = userInput.nextShort();
                    double bal = controller.getBalance(pin);
                    if (bal == -1) {
                        System.out.println("Invalid PIN");
                    } else {
                        System.out.println("Current Balance: " + bal);
                    }
                    break;

                case 6:
                    System.out.print("Enter PIN: ");
                    short pin1 = userInput.nextShort();
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = userInput.nextDouble();

                    if (controller.withdraw(withdraw, pin1) == -1) {
                        System.out.println("Invalid PIN");
                    } else {
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case 7:
                    System.out.print("Enter PIN: ");
                    short pin2 = userInput.nextShort();
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw2 = userInput.nextDouble();
                    userInput.nextLine();
                    System.out.print("Enter remarks: ");
                    String remarks = userInput.nextLine();

                    if (controller.withdraw(withdraw2, remarks, pin2) == -1) {
                        System.out.println("Invalid PIN");
                    } else {
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case 8:
                    System.out.print("Enter PIN: ");
                    short pin3 = userInput.nextShort();
                    System.out.print("Enter deposit amount: ");
                    double deposit = userInput.nextDouble();

                    if (controller.deposit(deposit, pin3) == -1) {
                        System.out.println("Invalid PIN");
                    } else {
                        System.out.println("Deposit successful");
                    }
                    break;

                case 9:
                    System.out.print("Enter PIN: ");
                    short pin4 = userInput.nextShort();
                    System.out.print("Enter deposit amount: ");
                    double deposit2 = userInput.nextDouble();
                    userInput.nextLine();
                    System.out.print("Enter payment gateway: ");
                    String gateway = userInput.nextLine();

                    if (controller.deposit(deposit2, gateway, pin4) == -1) {
                        System.out.println("Invalid PIN");
                    } else {
                        System.out.println("Deposit successful");
                    }
                    break;

                case 10:
                    System.out.println("Thank you!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        userInput.close();
    }
}









