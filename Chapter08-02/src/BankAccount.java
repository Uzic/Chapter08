
public class BankAccount {
	private int minRepository;
	private int repository;

	public BankAccount() { // 기본 생성자
		minRepository = 0;
	}

	public BankAccount(int min) { // 최저 잔금을 저장
		minRepository = min;
	}

	public void deposit(int money) { // 출금 메소드
		repository += money;
		System.out.println("입금금액=" + money + ", 잔금=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0) // 입력 금액이 마이너스일 경우
			throw new InvalidWithdraw("금액이 마이너스입니다.");
		else if (repository - money < minRepository) // 입력 금액이 잔금을 넘어설 경우
			throw new InvalidWithdraw("잔금을 넘어서는 금액입니다.");
		else { // 정상 처리
			repository -= money;
			System.out.println("인출금액=" + money + ", 잔금=" + repository);
			return minRepository;
		}
	}
}
