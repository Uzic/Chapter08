
public class Ex07 { // ���� ����
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3); // PrintTime ��ü ����
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!"); // ������ ��ü
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6); // PrintTime ��ü ����
		Thread th2 = new Thread(p2, "�ݰ����ϴ�."); // ������ ��ü
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
