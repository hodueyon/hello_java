package co.edu.variable;

//�ڹٴ� class ����
//Ŭ������ main �޼ҵ�� ����

public class App {
	public static void main(String[] args) {
		System.out.println("�Ű����� ���."); //(�Ű����� ���)
		
		//������ Ÿ�� ���� -> ����(int, long), �Ǽ�(double, float)
		//��-����(boolean), ���ڿ� : String
		
		int myAge = 29; //���� = �������� Ÿ�� �׻� ����.
		//myAge = "�����ټ�"; //������ ����.
		String ������ = "������ȩ";
		������ = "29"; //���ڿ� 29.
		
		int result = myAge + 30;
		System.out.println(myAge + "���� 30�� ���ϸ� " + result + "�Դϴ�.");
		
		//�迭
		//let numAry = []; �ڹ� ��ũ��Ʈ ���
		int[] numAry = {20, 29, 13, 44, 88, 33}; //�迭 ����.
		int sum = 0;
//		1) �迭�� �հ�
		int sum2 = 0;
		for(int i = 0; i < 6; i++) {
			//¦�� ������ ��쿡�� �հ�
			if(numAry[i] % 2 == 0){
			sum = sum + numAry[i];
			}
			if(i % 2 == 0) { // Ȧ�� �ڸ� �ε������� ��. (�ε����� 0���� �����ϱ� ����) 
			sum2 = sum2 + numAry[i];
			}
		}
		System.out.println("¦���� �հ�=> " + sum);
		System.out.println("Ȧ�� �ε����� �հ� " +sum2);

//		2) �迭����
		sum = 0; //0������ �ʱ�ȭ. 
//		���� : sum�� ���� 100�� �Ѿ�� ���� break; �׶��� sum ���
		for (int i =0; i < 6; i++) {
			sum = sum + numAry[i];
			if(sum > 100) {
				System.out.println("100�� �Ѿ�� ������ �� " + sum);
				break;
			}
		}
		System.out.println("����Ŀ�ԿϷ�.");
	}
}