import java.util.Date; // Date Ŭ����

public class PrintTime implements Runnable {
	private int count;

	public PrintTime(int count) { // �⺻ ������
		this.count = count;
	}

	public void run() { // �ǻ� �޼ҵ�
		Date current = new Date();
		while (count != 0) {
			System.out.println("����: " + Thread.currentThread().getPriority() + " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {
				Thread.sleep(1000); // ������  ����
				current = new Date(); // ���� �ð�
			} catch (InterruptedException e) {}
		}
	}
}
