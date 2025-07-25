package Task1;

class BankDetails {
	 private double balance;
	 public void deposit(double amount) {
	 if (amount > 0) {
	 balance += amount;
	 }
	 }
	 public double getBalance() {
	          return balance;
	       }
	    }
	public class BankAccount {
	 public static void main(String[] args) {
	 BankDetails bd = new BankDetails();
	 bd.deposit(15000);
	 System.out.println("Total Amount: ₹" + bd.getBalance()+"/-");
	 }
	}