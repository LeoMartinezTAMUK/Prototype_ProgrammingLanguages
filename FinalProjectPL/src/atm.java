/* Program was written in Java and tested in Eclipse IDE Version: 2022-12 (4.26.0)
Java version "19.0.2" 2023-01-17
Java(TM) SE Runtime Environment (build 19.0.2+7-44)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)
	
Final Project Prototype/Template Programming Languages CSEN 4366
Group 1: Leo Martinez III, Jalen Williams, Amelia Trevino	*/

// *** case 4 of Test.java needs to be revised ***

/* ATM
-> Check Balance
-> Cash withdraw
-> User Details
-> Update Mobile No.
*/

class atm {
private long accountNo;
private String name;
private int pin;
private double balance;
private long mobileNo;

//
public void setData(long accountNo, String name, int pin, double balance, long mobileNo) {
    this.accountNo = accountNo;
    this.name = name;
    this.pin = pin;
    this.balance = balance;
    this.mobileNo = mobileNo;
}

public long getAccountNo() {
    return accountNo;
}

public String getName() {
    return name;
}

public int getPin() {
    return pin;
}

public double getBalance() {
    return balance;
}

public long getMobileNo() {
    return mobileNo;
}

public void setMobile(long prevMobileNo, long newMobileNo) {
    if (prevMobileNo == mobileNo) {
    	mobileNo = newMobileNo;
        System.out.println("\nYour phone number was successfully updated!");
    } else {
        System.out.println("\nOld phone number does not match.");
    }
}

public void cashWithdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("\nPlease Collect Your Cash");
        System.out.println("Available Balance: $" + balance);
    } else {
        System.out.println("\nInvalid Input or Insufficient Balance");
    }
}

//
}
