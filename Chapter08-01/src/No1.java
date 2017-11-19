import java.util.InputMismatchException;
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
