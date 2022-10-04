package co.edu.emp;

import java.util.Scanner;

//����Ŭ���� 
public class EmployeeApp {
	public static void main(String[] args) {
		// 1. �����(�ʱ�ȭ) 2. ������� �Է� 3. ����˻� 4. �������Ʈ 9. ����
		Scanner scn = new Scanner(System.in);
		EmployeeService service = new EmployeeArray();//new EmployeeArrayList�θ� �ٲٸ� �� ���� �ִ�.
		while (true) {
			System.out.println("1. �����(�ʱ�ȭ) 2. ������� �Է� 3. ����˻� 4. �������Ʈ 9. ����");
			System.out.println("���� >> ");
			int menu = Integer.parseInt(scn.nextLine()); //"1" -> 1 ���ڿ� ���� int������ �ٲٱ�, static �޼ҵ�
			if(menu == 1) {
				service.init();
			}else if(menu ==2) {
				service.input();
			}else if(menu ==3) {
				System.out.println("�˻��� ��� ��ȣ �Է� >> ");
				int eId = Integer.parseInt(scn.nextLine()); //"100"Enter. �� ����.
				String name = service.search(eId);
				System.out.println("����� �̸��� "+ name + "�Դϴ�.");
			}else if(menu ==4) {
				service.print();
			}else if(menu ==9) {
				System.out.println("���α׷��� �����մϴ� ");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}// end main
}// end class
