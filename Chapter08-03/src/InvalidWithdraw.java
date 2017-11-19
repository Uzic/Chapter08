
public class InvalidWithdraw extends RuntimeException { // 수정한 클래스
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
