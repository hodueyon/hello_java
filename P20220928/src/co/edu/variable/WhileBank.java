package co.edu.variable;

import java.util.Scanner;

public class WhileBank {
	public static void main(String[] args) {
		bankApp();
	}

	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		// �޴� : 1: ����, 2: ���, 3:�ܰ�, 4:����
		// ���� �Ѿ��� 10���� ������ �Ա��� �ȵ�. �ܰ��� ���� �ݾ� ��� ���ϰ�
		while (run) {
			System.out.println("1: ����, 2: ���, 3:�ܰ�, 4:����");
			int menu = scn.nextInt();

			switch (menu) {
			case 1:
				System.out.println("����ó���ϴ� �޴�");
				System.out.println("���ݾ��� �Է� >>> ");
				int input = scn.nextInt();
				if (money + input > 100000) {
					System.out.println("�Ա��� �Ұ��� �մϴ�.");
				} else {
					money = money + input;
				}
			
				break;
			case 2:
				System.out.println("���ó���ϴ� �޴�");
				System.out.println("��ݾ��� �Է� >>> ");
				int output = scn.nextInt();
				if (money - output < 0) {
					System.out.println("�ܰ� �����մϴ�.");
				} else {
					money = money - output;
				}
				
				break;
			case 3:
				System.out.println("�ܰ���ȸ�ϴ� �޴�");
				System.out.println("�����ܰ�� : " + money);
				break;
			case 4:
				System.out.println("�����ϴ� �޴�");
				run = false;
			}
		} // end of while
		System.out.println("end of pgm");
	}// end bankApp()
}// end class
