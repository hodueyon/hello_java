package co.edu.variable;

public class MethodExe {
	
	// main �޼ҵ� : ù��°�� ����
	public static void main(String[] args) {
		printStar(); //ȣ����
		printStar(3); //����κ��� ���� ���´�. ���� Ÿ���� �������� ����.
		printCircle("@@@");
		printCircle("$$$", 5);
		int result = sum(sum(2, 3), sum(3,4));
		System.out.println("�������� " + result);
	}
	
	public static void printStar() { //void : ��ȯ�� ����. -> ��ȯ��, �Ű� ������ ���� prinStar �޼ҵ带 �����.
		System.out.println("��");
	}
	
	public static void printStar(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("��");
		}
	}
	
	public static void printCircle(String circle) {
		System.out.println(circle);
	}
	
	//����ϴ� ���, ����
	public static void printCircle(String circle, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(circle);
		}
	}
	
	//��ȯ���� ������ �޼ҵ�.
	public static int sum(int n1, int n2) { //�Լ� �����Ҷ� ��ȯ���� ������ Ÿ�Ե� ���������� ��.
		int result = n1 * 2 + n2 * 3; //��ȯ�� ����
		System.out.println("��� ���� " + result);
		return result; // ��ȯ���� ������ int
	}
}