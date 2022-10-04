package co.edu.emp;

//������ �Ѱ� ó��. �����ȣ, ����̸�, �μ���ȣ, �μ���, �̸���
public class Employee {
	private int employeeId; // ���
	private String name;
	private int deptId; // �μ���ȣ 10 : �λ�, 20 : ����, 30 : ����(�⺻��)
	private String deptName;
	private int salary;
	private String email;

	// ������.
	public Employee() {
		// �⺻ ������.
		this.deptId = 30;
		this.deptName = "����";
	}

	// 4�� �ִ� ������
	public Employee(int employeeId, String name, int deptId, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
		if (this.deptId == 10) {
			this.deptName = "�λ�";
		} else if (this.deptId == 20) {
			this.deptName = "����";
		} else {
			this.deptName = "����";
		}
	}

	// �Ű԰� 3���ִ� ������
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}

	// 2�� �ִ� ������
	public Employee(int employeeId, String name) {
		this(employeeId, name, 0); // salary���� 0���� �ʱ�ȭ
	}

	// 5�� �ִ� ������
	public Employee(int employeeId, String name, int deptId, int salary, String email) {
		this(employeeId, name, deptId, salary);
		this.email = email;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
		if (this.deptId == 10) {
			this.deptName = "�λ�";
		} else if (this.deptId == 20) {
			this.deptName = "����";
		} else {
			this.deptName = "����";
		}

	}
	public String getDeptName() {
		return deptName;
	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}// end class
