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
        System.out.println("\nYour Bank balance is: $" + user.getBalance());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void cashWithdraw(double amount) {
        user.cashWithdraw(amount);
        System.out.println("You have withdrawn $" + amount + ". Your new balance is: $" + user.getBalance());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void showUserDetails() {
        System.out.println("**** User Details ****");
        System.out.println("\n-> Account No: " + user.getAccountNo());
        System.out.println("\n-> Name: " + user.getName());
        System.out.println("\n-> Balance: $" + user.getBalance());
        System.out.println("\n-> Mobile No.: " + user.getMobileNo());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void updateMobileNo(long prevMobileNo, long newMobileNo) {
        user.setMobile(prevMobileNo, newMobileNo);
        System.out.println("Your new mobile number is: " + user.getMobileNo());
        System.out.print("\nPress ENTER for Main Menu");
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}
}
