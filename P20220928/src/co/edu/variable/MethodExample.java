package co.edu.variable;

public class MethodExample {
	//����, ���� -> ���� ���ϱ�
	public static int getArea(int w, int h) {
		int res = w * h;
		return res;
	}
	
	//�迭����� �� ��
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i = 0; i<ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}
	
	//�μ��� ���� ����� ��ȯ.
	// �Ǽ�. float , double (float���� double�� ���� �� �ִ� ���� �� ����)
	public static double divide(double n1, double n2) {
		double result =  n1 / n2; 
		return result;
	}
	
	//�μ��� ������ �۾� . �Ű������� int ����
	public static double divide(int n1, int n2) {
		// 1bit * 8 => 1byte.
		// ���� : byte(1), short(2), int(4), long(8)
		// 	   : float(4), double(8)
		if(n2 == 0) { //int 0 ������ ���� ����, �̷� if���� �߰����ص�.
			return 0;
		}
		double result = (double) n1/n2; // 3.0/2 => 1.5 ������ ���� Ÿ�Գ����� ����. 
					//->  �ٸ� Ÿ�Գ��� ���� �� �� ū Ÿ������ ��ȯ �� �����.
					// (double)ó�� ����ڰ� ���� Ÿ�� ��ȯ ���� - ĳ����. �ڵ����� ������°� - ���θ��
		return result;
	}
	
	public static void main(String[] args) {
		int result = getArea(20, 15);
		System.out.println("��ü �ʺ�� " + result + "�Դϴ�.");
		
		int [] intAry = {23, 45, 12};
		result = sumAry(intAry);
		System.out.println("��ü �迭����� �հ�� " + result + "�Դϴ�.");
//		int sum = 0;
//		for(i = 0; i<intAry.length; i++) {
//			sum = sum + intAry[i];-
		
		int [] intAry2 = {22,33,44,55};
		result = sumAry(intAry2);
		System.out.println("��ü �迭����� �հ�� " + result + "�Դϴ�.");
		
		
		
		double d1 = 23.4567;
		double d2 = 12.34;
		double d3 = d1 + d2;
		
		d3 = divide(d1, d2);
		System.out.println("���� ����� " + d3 + "�Դϴ�.");
		
		d3 = divide(3,2);
		System.out.println("���� ����� " + d3);
		}
	}


