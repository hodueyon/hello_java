package co.edu;

public class MyMath {
	// ���밪�� ���ϴ� �޼ҵ�.
	public static int abs(int num) {
		return num > 0 ? num : -num; //���� ������
	}
	// ������ ���ϴ� �޼ҵ�.
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 1; i <=exponent; i++) {
			result = result * base;
		}
		return result;
	}
}// end class.
