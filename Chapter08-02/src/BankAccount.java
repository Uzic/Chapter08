
public class BankAccount {
	private int minRepository;
	private int repository;

	public BankAccount() { // �⺻ ������
		minRepository = 0;
	}

	public BankAccount(int min) { // ���� �ܱ��� ����
		minRepository = min;
	}

	public void deposit(int money) { // ��� �޼ҵ�
		repository += money;
		System.out.println("�Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0) // �Է� �ݾ��� ���̳ʽ��� ���
			throw new InvalidWithdraw("�ݾ��� ���̳ʽ��Դϴ�.");
		else if (repository - money < minRepository) // �Է� �ݾ��� �ܱ��� �Ѿ ���
			throw new InvalidWithdraw("�ܱ��� �Ѿ�� �ݾ��Դϴ�.");
		else { // ���� ó��
			repository -= money;
			System.out.println("����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;
		}
	}
}
