package co.edu.inherit.interfaces;

public class DeptServiceImpl implements DaoService{

	@Override
	public void insert() {
		System.out.println("�μ� ����.");
	}

	@Override
	public void search() {
		System.out.println("�μ� ��ȸ");
	}

	@Override
	public void delete() {
		System.out.println("�μ� ����");
	}

}
