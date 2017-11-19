
public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw { // InvalidWithdraw¸¦ ½ÇÇà
		BankAccount ba = new BankAccount(-100000);
			ba.deposit(100000);
			ba.withdraw(500000);
	}
}
