package co.edu.emp;

//CRUD ó��.
public interface EmployeeService {
	//�ʱ�ȭ(init)
	public void init();
	//�߰�
	public void input();
	//��ȸ
	public void search();
	public String search(int employeeId); //��� ���̵��� �̸� ��ȯ.
	public void print(); //��ü������� ���.
	public int searchSal(int employeeId); //������̵� -> �޿� ��ȯ
	
}
