package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;


//�÷��� �̿��� ���� ����.
public class EmployeeArrayList implements EmployeeService {
	
	Employee[] list;
	int idx;
	Scanner scn = new Scanner(System.in);
	ArrayList List = new ArrayList();
	
	@Override
	public void init() {
		
	}

	@Override
	public void input() {
		if(idx >=list.length) {
			System.out.println("�� �̻� �Է� �Ұ�");
			return;
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
		List.add(emp);
	}

	@Override
	public void search() {
		
		
	}

	@Override
	public String search(int employeeId) {
		
		return null;
	}

	@Override
	public void print() {
		for(int i =0; i<List.size(); i++) {
			
		}
		
	}

}
