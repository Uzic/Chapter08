import java.util.LinkedList; // 링크드 리스트 클래스

public class PrimeNumber03 implements Runnable { // Runnable인터페이스를 상속 받음
	private int number;
	private String name;
	LinkedList<Integer> prime = new LinkedList<>(); // 링크드리스트 정의
	
	public PrimeNumber03(int number, String name) { // 생성자 정의
		this.number = number;
		this.name = name;
	}
	
	public void run() { // 소수 만드는 메소드
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0) // 지정한 숫자가 될 시 break
					break;
			}
			if(j == i) // 조건을 만족할 시 리스트 삽입
				prime.add((Integer)j);
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
