package co.edu.inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		String[] flowers = new String[3];
		//ũ�Ⱑ �������� ���� �Ұ�.
		flowers[0] = "���";
		flowers[1] = "�عٶ��" ;
		flowers[2] = "����ȭ��" ;
//		flowers[3] = "���" ;
		
		//flowers2 ����
		String[] flowers2 = new String[6];
		for (String str : flowers2) {
			if(str != null) {
				System.out.println(str);
			}
		}
		//�迭�� ũ�� ���� => �÷���(ArrayList)
		//Object ��� Ŭ������ �ֻ��� Ŭ����. 
		ArrayList flowers3 = new ArrayList(); //ũ�� ���� ���ϸ� 10��¥�� ���� ����
		flowers3.add("���"); //ù��° ��ġ�� ��� ����
		flowers3.add("�عٶ��");
		flowers3.add("����ȭ��");
		flowers3.add("����ȭ��");
		flowers3.add("����ȭ��");
		flowers3.add("����ȭ��");
		flowers3.add("����ȭ��");
		flowers3.add("����ȭ��");
//		flowers3.add(123);
		
		for(Object str : flowers3) { 
			String result = (String) str; //����� ���� String���� ��ȯ
			System.out.println(result);
		}
		
		//�÷����� ũ�� : size() no length
		for(int i=0; i<flowers3.size(); i++) {
			String result = (String) flowers3.get(i);
			System.out.println(result);
		}
	}//end main
}// end class
