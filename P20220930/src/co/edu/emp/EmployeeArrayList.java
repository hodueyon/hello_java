package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;

//�÷��� �̿��� ���� ����.
public class EmployeeArrayList implements EmployeeService {

	ArrayList<Employee> list;
	int idx;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("�ʱ�ȭ �Ϸ�.");
	}

	@Override
	public void input() {

		int eId = -1;
		while (true) {
			try {
				System.out.println("��� >>");
				eId = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println("�̸� >>");
		String name = "";
		try {
			name = scn.nextLine();
		} catch (Exception e1) {
			System.out.println("���ڸ� �����ϼ���.");
		}

		int deptId = -1;
		while (true) {
			try {
				System.out.println("�μ� >>");
				deptId = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e2) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
		}

		int sal = -1;
		while (true) {
			try {
				System.out.println("�޿� >> ");
				sal = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e3) {
				System.out.println("���ڷ� �Է��ϼ���.");
			}
		}
		
		System.out.println("�̸��� >>");
		String email = "";
		try {
			email = scn.nextLine();
		} catch (Exception e4) {
			System.out.println("���ڷ� �Է��ϼ���.");			
		}
		Employee emp = new Employee(eId, name, deptId, sal, email);
		list.add(emp);

	}

	@Override
	public void search() {

	}

	@Override
	public String search(int employeeId) {
		// �Էµ� ���߿��� ã����.
		String result = null;
//		for (int i = 0; i < list.size(); i++) {
//			Employee emp = list.get(i); //list[i];
//			if (emp.getEmployeeId() == employeeId) {
//				result = list.get(i).getName();
//				break;
//			}
		for (Employee emp : list) {
			if (emp.getEmployeeId() == employeeId) {
				result = emp.getName();
				break;
			}
		}
		return result;
	} // end search;

	@Override
	public void print() {
		System.out.printf("%5s %10s %7s\n", "���", "�̸�", "�޿�");
		System.out.println("=========================");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5d %10s %7d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}

	}

	@Override
	public int searchSal(int employeeId) {
		int result = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == employeeId) {
				result = list.get(i).getSalary();
				break;
			}
		}
		return result;
	}

}
