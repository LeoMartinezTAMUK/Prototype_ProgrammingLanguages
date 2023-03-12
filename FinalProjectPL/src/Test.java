import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice; double amount; long enterAccountNo;
        String prevMobileNo, newMobileNo;

        try (Scanner scanner = new Scanner(System.in)) {
            atm user1 = new atm(1234567, "Tim", 1111, 45000.90, "123-456-7890");
            atmFunc options1 = new atmFunc(user1);
            boolean validChoice = true, validLogin = false;
            
            do {
                atmFunc.clearScreen();
                System.out.println("\n****Welcome to the ATM****" + "\nEnter Your Account No: ");
                enterAccountNo = scanner.nextLong();
                scanner.nextLine();
                System.out.print("Enter PIN: ");
                int enterPin = scanner.nextInt();
                scanner.nextLine();

                if (enterAccountNo == user1.getAccountNo() && enterPin == user1.getPin()) {
                    validLogin = true;
                } else {
                    System.out.println("\nInvalid account number or PIN. Please try again." + "\nPress ENTER to try again");
                    scanner.nextLine();
                }
            } while (!validLogin);
            
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
                        System.out.println("Please choose an amount: ");
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
                        System.out.print("\n**** Update Mobile Number ****\n" + "\nPlease do not include '()'\n" + "Enter Old Mobile Number: ");
                        scanner.nextLine();
                        prevMobileNo = scanner.nextLine();
                        System.out.print("\nEnter New Mobile Number: ");
                        newMobileNo = scanner.nextLine();
                        options1.updateMobileNo(prevMobileNo, newMobileNo);
                        scanner.nextLine();
                        break;
                    case 5:
                        atmFunc.clearScreen();
                        System.out.print("\n****Thank you, have a great day!****");
                        validChoice = false;
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please select a valid option." + "\nPress ENTER to try again");
                        scanner.nextLine();
                        scanner.nextLine();
                }
            } while (validChoice);
        }
    }
}