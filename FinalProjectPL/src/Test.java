import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0, enterPin;
        double amount;
        long enterAccountNo, prevMobileNo, newMobileNo;

        	try (Scanner scanner = new Scanner(System.in)) {
				atm user1 = new atm(1234567, "Tim", 1111, 45000.90, 1);
				atmFunc options1 = new atmFunc(user1);
		        boolean validChoice = true;

					atmFunc.clearScreen();
				    System.out.println("\n****Welcome to the ATM****");
				    System.out.print("\nEnter Your Account No: ");
				    enterAccountNo = scanner.nextLong();
				    scanner.nextLine();
				    System.out.print("Enter PIN: ");
				    enterPin = scanner.nextInt();
				    scanner.nextLine();

				    if (enterAccountNo == user1.getAccountNo() && enterPin == user1.getPin()) {
				        do {
				        	atmFunc.clearScreen();
				            options1.menu();
				            choice = scanner.nextInt();
				            switch (choice) {
				                case 1:
				                	atmFunc.clearScreen();
				                    options1.checkBalance();
				                    scanner.nextLine();
				                    scanner.nextLine();
				                    break;
				                case 2:
				                	atmFunc.clearScreen();
				                	System.out.println("Please enter an amount: ");
				                    amount = scanner.nextDouble();
				                    options1.cashWithdraw(amount);
				                    scanner.nextLine();
				                    scanner.nextLine();
				                    break;
				                case 3:
				                	atmFunc.clearScreen();
				                    options1.showUserDetails();
				                    scanner.nextLine();
				                    scanner.nextLine();
				                    break;
				                case 4:
				                	atmFunc.clearScreen();
				                    System.out.print("\n**** Update Mobile Number ****\n" + "\nPlease do not include '()' or '-'\n");
				                    System.out.print("Enter Old Mobile Number: ");
				                    prevMobileNo = scanner.nextLong();
				                    System.out.print("\nEnter New Mobile Number: ");
				                    newMobileNo = scanner.nextLong();				                    
				                    options1.updateMobileNo(prevMobileNo, newMobileNo);
				                    scanner.nextLine();
				                    scanner.nextLine();
				                    break;
				                case 5:
				                	atmFunc.clearScreen();
				                	System.out.print("\n****Thank you, have a great day!****");
				                	validChoice = false;
				                	break;
				                default:
				                    System.out.println("\nInvalid choice. Please select a valid option.");
				                    System.out.print("\nPress ENTER to try again");
				                    scanner.nextLine();
				                    scanner.nextLine();
				            }
				        } while (validChoice);
				    } else {
				        System.out.println("\nInvalid account number or PIN. Please try again.");
				        System.out.print("\nPress ENTER to try again");
				        scanner.nextLine();
				        scanner.nextLine();
				    }
				}
			}
	}