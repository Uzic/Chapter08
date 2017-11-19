
public class Ex06 {
	public static void main(String[] args) { // 스레드 실행파일
		new Thread(new PrimeNumber03(20, "소수 만드는 스레드")).start();
	}
}
