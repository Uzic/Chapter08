
public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw { // InvalidWithdraw�� ����
		BankAccount ba = new BankAccount(-100000);
			ba.deposit(100000);
			ba.withdraw(500000);
	}
}
