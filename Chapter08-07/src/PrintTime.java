import java.util.Date; // Date 클래스

public class PrintTime implements Runnable {
	private int count;

	public PrintTime(int count) { // 기본 생성자
		this.count = count;
	}

	public void run() { // 실생 메소드
		Date current = new Date();
		while (count != 0) {
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {
				Thread.sleep(1000); // 딜레이  설정
				current = new Date(); // 현재 시각
			} catch (InterruptedException e) {}
		}
	}
}
