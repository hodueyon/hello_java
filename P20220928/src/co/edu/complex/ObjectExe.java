package co.edu.complex;

import java.util.Scanner;

public class ObjectExe { // ��ü �����
	public static void main(String[] args) {

		String s1 = "ȫ�浿";
		int i1 = 20;
		double d1 = 162; // 162.0(promotion)

		Person p1 = new Person(); // �ν��Ͻ� ����.//p1�̶�� �� ���� �����
		p1.name = "������";
		p1.age = 29;
		p1.height = 162.3;
		System.out.println(p1);

		Person p2 = new Person();
		p2.name = "����";
		p2.age = 23;
		p2.height = 163.2;

		Person p3 = new Person(); // �ν��Ͻ� ����.//p1�̶�� �� ���� �����
		p3.name = "�ּҿ�";
		p3.age = 22;
		p3.height = 172.5;
		System.out.println(p3);

		System.out.println("�̸�: " + p1.name);
		System.out.println("����: " + p1.age);
		System.out.println("Ű: " + p1.height);

		Person[] persons = { p1, p2, p3 };
		System.out.println(persons[1].name); // index�� 0���� ���� -> 1�ϸ� �ι�°�� ��̰� ����
		System.out.println(persons[1].age);
		System.out.println(persons[1].height);

		// persons[2]�� ���� ���������� �ٲٱ�.
//		persons[2].name = "������";  Ȥ�� p3.name ="������"

		// p1�������� persons[0]�� ��.
		System.out.println(persons[0] == p1);

		// �ݺ� for 
		// ���� �� �� �� ==( ��ſ� equals ����.
		// ���� �̸� ã�Ƽ� ���� 23 -> 22��� �ٲٱ�
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].name == "����") {
//				persons[i].age = 22;
//			}
//		}
		
//		String kim ="����"; ���ڿ� ���ͷ�
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].name == kim) {
//				persons[i].age = 22;
//			}
//		}
		
		//������ �̸��� �Է��ϰ�, ������ ���̸� �Է��� �����ϱ�.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �̸�>>> ");
		String name = scn.nextLine();
		System.out.println("������ ���� >>. ");
		int age = scn.nextInt();
		for(int i = 0; i<persons.length; i++) {
			if(name.equals(persons[i].name)) {
				persons[i].age = age;
			}
		}
		
		// ��ü ��� ���
		for (int i = 0; i < persons.length; i++) {
			System.out.println(i + 1 + "�� ° �̸� : " + persons[i].name + ", ���� : " + persons[i].age);
		}
		
		String n1 = new String("ȫ�浿");
		String n2 = new String("ȫ�浿");
		String m1 = "ȫ�浿";//�ν��ý� ���� �� ����� �ƴ϶� m1 m2 �ּҰ� ����.
		String m2 = "ȫ�浿";
		
		System.out.println(n1 == n2);
		System.out.println(m1 == m2);
		
		
		
	}// end ObjectExe
}// end class
