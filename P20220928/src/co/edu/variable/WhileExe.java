package co.edu.variable;

import java.util.Scanner;

public class WhileExe {

	public static void main(String[] args) {
		whileFnc3();
	}

	public static void whileFnc3() {
		//���� ���� �� �Է� ��. �����ϰ� 9 �Է�.
		Scanner scn = new Scanner(System.in);
		while(true) { //while(true) ���� �ݺ��Ұ� 
			System.out.println("���� �����ϼ���. ����� -1 �Դϴ�.");
			int input = scn.nextInt();
			if(input == -1) {
				break;
			}
			MethodCalendar.makeCal(input); //�޷¸���� �޼ҵ� �ҷ���
			System.out.println();
		}
		System.out.println("end of pgm");
		scn.close();
	}
	
	public static void whileFnc2() {
		// while����.
		Scanner scn = new Scanner(System.in); // import : ctrl+shift+O
		while (true) {
			System.out.println("���� �Է��ϼ���. �����Ϸ��� stop �Է��ϼ���");
			String inputVal = scn.nextLine(); // ����ڰ� �Է��� ���� �ҷ���
			if (inputVal.equals("stop")) {
				break;
			}
			System.out.println("������Է°�> " + inputVal);
		}
		System.out.println("end of program");
		scn.close();// �ý��� �ڿ��� ��ȯ.
	}

	public static void whileFnc() {
		// for �ݺ��� : �ݺ�ȸ�� �˰� ������. for(int i=0; i<10; i++)
		int i = 0;
		while (i < 4) {
			System.out.println(i);
			i++; // ��� �� i �� ���� ��ų��
		}
		System.out.println("end of program");
	}// end whileFnc

}// end class
