
// *** case 4 of Test.java needs to be revised ***

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0, enterPin;
        long enterAccountNo;

        try (Scanner scanner = new Scanner(System.in)) {
			atm user1 = new atm();
			user1.setData(1234567, "Tim", 1111, 45000.90, "9087654321");

			do {
			    clearScreen();

			    System.out.println("\n****Welcome to the ATM****");
			    System.out.print("\nEnter Your Account No: ");
			    enterAccountNo = scanner.nextLong();
			    System.out.print("Enter PIN: ");
			    enterPin = scanner.nextInt();

			    if (enterAccountNo == user1.getAccountNo() && enterPin == user1.getPin()) {
			        do {
			            double amount = 0;
			            //String oldMobileNo, newMobileNo;
			            //char menu;

			            clearScreen();

			            System.out.println("\n**** Welcome to the ATM ****");
			            System.out.println("\nSelect Options");
			            System.out.println("1. Check Balance");
			            System.out.println("2. Cash Withdrawal");
			            System.out.println("3. Show User Details");
			            System.out.println("4. Update Mobile No.");
			            System.out.println("5. Exit");
			            choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    clearScreen();
			                    System.out.println("**** Check Balance ****");
			                    System.out.println("\nYour Bank balance is: $" + user1.getBalance());
			                    System.out.print("\nPress ENTER for Main Menu");
			                    scanner.nextLine();
			                    scanner.nextLine();
			                    break;

			                case 2:
			                    clearScreen();
			                    System.out.println("**** Cash Withdrawal ****");
			                    System.out.print("\nEnter the amount: ");
			                    amount = scanner.nextDouble();
			                    user1.cashWithdraw(amount);
			                    System.out.print("\nPress ENTER for Main Menu");
			                    scanner.nextLine();
			                    scanner.nextLine();
			                    break;

			                case 3:
			                    clearScreen();
			                    System.out.println("**** User Details ****");
			                    System.out.println("\n-> Account No: " + user1.getAccountNo());
			                    System.out.println("\n-> Name: " + user1.getName());
			                    System.out.println("\n-> Balance: $" + user1.getBalance());
			                    System.out.println("\n-> Mobile No.: " + user1.getMobileNo());
			                    System.out.print("\nPress ENTER for Main Menu");
			                    scanner.nextLine();
			                    scanner.nextLine();
			                    break;
			                    
			                case 4:		// *** NEEDS FIXING *** // 
			                    clearScreen();
			                    System.out.println("**** Update Mobile Number ****\n");

			                    // Take old mobile number
			                    System.out.print("Enter Old Mobile No. ");
			                    String prevMobileNo = scanner.nextLine();
			                
			                    // Take new mobile number
			                    System.out.print("\nEnter New Mobile No. ");
			                    String newMobileNo = scanner.nextLine();

			                    // Set the new mobile number
			                    user1.setMobile(prevMobileNo, newMobileNo);

			                    // Pause until ENTER is pushed
			                    System.out.print("\nPress ENTER for Main Menu");
			                    scanner.nextLine();
			                    break;

			                case 5:
			                    System.exit(0);

			                default:
			                    System.out.println("\nInvalid choice. Please select a valid option.");
			                    System.out.print("\nPress ENTER to try again");
			                    scanner.nextLine();
			                    scanner.nextLine();
			            }
			        } while (true);
			    } else {
			        System.out.println("\nInvalid account number or PIN. Please try again.");
			        System.out.print("\nPress ENTER to try again");
			        scanner.nextLine();
			        scanner.nextLine();
			    }
			} while (true);
		}
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
   
