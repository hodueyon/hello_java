package co.edu.variable;

import java.util.Scanner; //util�� ScannerŬ���� �����ð�~
import java.lang.System;

//java.lang �� ���̽� ��Ű�� -> ���� import �ʿ� ����.

public class GetSameval {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //����� �Է°��� ����
		System.out.println("�̸��� �Է��ϼ��� >>> ");
		String name = scn.nextLine(); //����� �Է°��� �о���� ��ȯ.
		boolean isChecked =false;
		String[] names = {"������", "������","������","������"};
		for(int i = 0; i <names.length; i++) {
			// " ��� ° ��ġ�� �ֽ��ϴ�." ���.
			if(names[i].equals(name)) { //���ڿ� �񱳴� ���ڿ�.equals(�񱳹��ڿ�)
			 System.out.println( i+1 + "�� ° ��ġ�� �ֽ��ϴ�."); 
			 isChecked = true;
			 break;
			}
		}
		if(!isChecked) { //!isChecked !�� not �̶� �� false
			System.out.println("�Է°��� �����ϴ�.");
		}
		System.out.println("�Է°� : " + name);
		scn.close();
	}
}
