package co.edu.emp;

import java.util.Scanner;

//�迭�� Ȱ���ؼ� ���� ����.
public class EmployeeArray implements EmployeeService {
	// ������� ����
	Employee[] list;
	int idx; // �ʵ�
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("����� �Է� >>");
		int cnt = Integer.parseInt(scn.nextLine()); // ����Ű ó���� ����
		list = new Employee[cnt]; // 5�� �ν��Ͻ��� ������ �� �ִ� ���� ����.
	}

	@Override
	public void input() {
		if (idx >= list.length) {
			System.out.println("�� �̻� �Է� �Ұ�");
			return; // �޼ҵ�����
		}
		System.out.println("��� >>");
		int eId = Integer.parseInt(scn.nextLine());
		System.out.println("�̸� >>");
		String name = scn.nextLine();
		System.out.println("�μ� >>");
		int deptId = Integer.parseInt(scn.nextLine());
		System.out.println("�޿� >> ");
		int sal = Integer.parseInt(scn.nextLine());
		System.out.println("�̸��� >>");
		String email = scn.nextLine();

		Employee emp = new Employee(eId, name, deptId, sal, email);
		list[idx++] = emp;

	}

	@Override
	public void search() {

	}

	@Override
	public String search(int employeeId) {
		// �Էµ� ���߿��� ã����. list[5] -> idx
		//100, 200, 300
		String result = null;
		for (int i = 0; i < idx; i++) {
			if (list[i].getEmployeeId() == employeeId) {
				result = list[i].getName();
				break;
			}
		}
		return result;
	}

	@Override
	public void print() {
		for (int i = 0; i < idx; i++) {
			System.out.printf("%5s %10s %7d\n", //
					list[i].getEmployeeId(), //
					list[i].getName(), //
					list[i].getSalary());//
		}
	}

	@Override
	public int searchSal(int employeeId) {
		int result = -1;
		for(int i =0; i< idx; i++) {
			if(list[i].getEmployeeId() == employeeId) {
				result = list[i].getSalary();
				break;
			}
		}
		return result;
	}

}
