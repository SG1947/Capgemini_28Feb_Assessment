package newprog;

public class Vararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		varArgs();
	
		varArgs(1,2,3); //1.0 2.0 3.0

	}
	public static void varArgs(int a, int b, double ... d ) {//0..1....n arguments
//		System.out.println(d);
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
	
    
}

//package Banking.view;
//
//import java.util.Scanner;
//
//import Banking.exception.InsufficientBalanceException;
//import Banking.exception.InvalidAmountException;
//import Banking.model.Bank_account;
//import Banking.model.Current_account;
//import Banking.model.Savings_account;
//
//public class Driver {
//
//	public static void main(String[] args) {
//
//		Bank_account ba = null;
//		Scanner userInput = new Scanner(System.in);
//
//		System.out.println("Enter account type");
//		System.out.println("1. Current");
//		System.out.println("2. Savings");
//		System.out.println("Please enter your choice of account :");
//		int choice = userInput.nextInt();
//
//		if (choice == 1) {
//			ba = new Current_account();
//		} else {
//			ba = new Savings_account();
//		}
//
//		boolean flag = true;
//
//		while (flag) {
//			System.out.println("Enter what operation to perform");
//			System.out.println("1. Set Account Number");
//			System.out.println("2. Get Account Number");
//			System.out.println("3. Set Account Holder Name");
//			System.out.println("4. Get Account Holder Name");
//			System.out.println("5. Get Account Balance (PIN required)");
//			System.out.println("6. Withdraw Amount(PIN required)");
//			System.out.println("7. Withdraw Amount with Remarks(PIN required)");
//			System.out.println("8. Deposit Amount(PIN required)");
//			System.out.println("9. Deposit Amount using Payment Gateway(PIN required)");
//			System.out.println("10. Exit");
//			System.out.println("Enter your choice of operation: ");
//			int operations = userInput.nextInt();
//
//			switch (operations) {
//
//			case 1:
//				System.out.print("Enter account number: ");
//				int accNo = userInput.nextInt();
//				userInput.nextLine();
//				ba.setAccountNumber(accNo);
//				System.out.println("Account number set successfully");
//				break;
//
//			case 2:
//				System.out.println("Account Number: " + ba.getAccountNumber());
//				break;
//
//			case 3:
//				userInput.nextLine();
//				System.out.print("Enter account holder name: ");
//				String name = userInput.nextLine();
//				ba.setAccountHolderName(name);
//				System.out.println("Account holder name set successfully");
//				break;
//
//			case 4:
//				System.out.println("Account Holder Name: " + ba.getAccountHolderName());
//				break;
//
//			case 5:
//				System.out.print("Enter PIN: ");
//				short pin = userInput.nextShort();
//				double bal = ba.getBalance(pin);
//				if (bal == -1) {
//					System.out.println("Invalid PIN");
//				} else {
//					System.out.println("Current Balance: " + bal);
//				}
//				break;
//
//			case 6:
//				try {
//					System.out.print("Enter PIN: ");
//					short pin1 = userInput.nextShort();
//
//					System.out.print("Enter withdrawal amount: ");
//					double withdraw = userInput.nextDouble();
//
//					double bal1 = ba.setBalanceWithdrawal(withdraw, pin1);
//
//					if (bal1 == -1) {
//						System.out.println("Invalid PIN");
//					} else {
//						System.out.println("Withdrawal successful");
//					}
//				} catch (InsufficientBalanceException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//
//			case 7:
//				try {
//					System.out.print("Enter PIN: ");
//					short pin2 = userInput.nextShort();
//
//					System.out.print("Enter withdrawal amount: ");
//					double withdraw = userInput.nextDouble();
//					userInput.nextLine();
//
//					System.out.print("Enter remarks: ");
//					String remarks = userInput.nextLine();
//
//					double bal2 = ba.setBalanceWithdrawal(withdraw, remarks, pin2);
//
//					if (bal2 == -1) {
//						System.out.println("Invalid PIN");
//					} else {
//						System.out.println("Withdrawal successful");
//					}
//				} catch (InsufficientBalanceException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//
//			case 8:
//				try {
//					System.out.print("Enter PIN: ");
//					short pin3 = userInput.nextShort();
//
//					System.out.print("Enter deposit amount: ");
//					double deposit = userInput.nextDouble();
//
//					double bal3 = ba.setBalanceDeposit(deposit, pin3);
//
//					if (bal3 == -1) {
//						System.out.println("Invalid PIN");
//					} else {
//						System.out.println("Deposit successful");
//					}
//				} catch (InvalidAmountException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//
//			case 9:
//				try {
//					System.out.print("Enter PIN: ");
//					short pin4 = userInput.nextShort();
//
//					System.out.print("Enter deposit amount: ");
//					double deposit = userInput.nextDouble();
//					userInput.nextLine();
//
//					System.out.print("Enter payment gateway (Razorpay/Bhimpay): ");
//					String gateway = userInput.nextLine();
//
//					double bal4 = ba.setBalanceDeposit(deposit, gateway, pin4);
//
//					if (bal4 == -1) {
//						System.out.println("Invalid PIN");
//					} else {
//						System.out.println("Deposit processed");
//					}
//				} catch (InvalidAmountException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//
//			case 10:
//				System.out.println("Thank you!");
//				flag = false;
//				break;
//
//			default:
//				System.out.println("Invalid choice");
//			}
//		}
//
//		userInput.close();
//	}
//}

