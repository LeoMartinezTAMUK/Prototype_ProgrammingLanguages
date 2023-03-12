public class atmFunc {
    private atm user;

    public atmFunc(atm user) {
        this.user = user;
    }

    public void menu() {
    	System.out.println("\n**** Welcome to the ATM ****");
        System.out.println("\nSelect Options");
        System.out.println("1. Check Balance");
        System.out.println("2. Cash Withdrawal");
        System.out.println("3. Show User Details");
        System.out.println("4. Update Mobile Number");
        System.out.println("5. Exit");
    }
    public void checkBalance() {
        System.out.println("**** Check Balance ****");
        System.out.printf("\nYour Bank balance is: $%.2f\n", user.getBalance());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void cashWithdraw(double amount) {
        if (amount > user.getBalance()) {
            System.out.printf("Error: Insufficient funds. Cannot withdraw $%.2f\n", amount);
        } else {
            user.setCashWithdraw(amount);
            System.out.printf("You have withdrawn $%.2f\n", amount);
            System.out.printf("Your new balance is: $%.2f\n", user.getBalance());
        }
        System.out.print("\nPress ENTER for Main Menu");
    }


    public void showUserDetails() {
        System.out.println("**** User Details ****");
        System.out.println("\n-> Account No: " + user.getAccountNo());
        System.out.println("\n-> Name: " + user.getName());
        System.out.printf("\n-> Balance: $%.2f\n", user.getBalance());
        System.out.println("\n-> Mobile No.: " + user.getMobileNo());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void updateMobileNo(String prevMobileNo, String newMobileNo) {
            user.setMobile(prevMobileNo, newMobileNo);
        System.out.print("\nPress ENTER for Main Menu");
    }

    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}
}
