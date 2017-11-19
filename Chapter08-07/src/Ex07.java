
public class Ex07 { // 실행 파일
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3); // PrintTime 객체 생성
		Thread th1 = new Thread(p1, "안녕하세요!"); // 스레드 객체
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6); // PrintTime 객체 생성
		Thread th2 = new Thread(p2, "반갑습니다."); // 스레드 객체
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
