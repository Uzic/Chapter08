
public class Ex03 {
	public static void main(String[] args) { // 수정 후 실행
		BankAccount ba = new BankAccount(-100000);
			ba.deposit(100000);
			ba.withdraw(100000);
			ba.withdraw(200000);
	}
}
