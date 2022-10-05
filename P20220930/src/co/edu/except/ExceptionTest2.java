package co.edu.except;
class NegativeValException extends RuntimeException {
	NegativeValException() {
		
	}
	
	NegativeValException(String msg) {
		super(msg);
	}
}// end class NegativeValException
public class ExceptionTest2 {
	public static void main(String[] args) {
		try{
			positiveVal(10,-20);
		}catch(NegativeValException e) {
			System.out.println("���ܰ� �߻�.");
		}
		System.out.println("���α׷� ����.");
	}
	
	public static int positiveVal(int n1, int n2) throws NegativeValException {
		int result = n1 + n2;
		if(result < 0) {
			throw new NegativeValException("���� ���� �߻�");
		}
		return result;
	}
	
}
