package co.edu.inherit.interfaces;

//����Ŭ����(�������̽��� ����ϴ� Ŭ����) 
public class EmpServiceImpl implements DaoService {
	//�ݵ�� �������̽��� �޼ҵ� ���� ������ ����� �Ѵ�.
	private String db;
	
	public EmpServiceImpl() {}
	public EmpServiceImpl(String db) {
		this.db = db;
	}
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	@Override
	public void insert() {
		System.out.println(db + "����.");	
	}

	@Override
	public void search() {
		System.out.println(db + "��ȸ.");	
	}

	@Override
	public void delete() {
		System.out.println(db + "����.");	
	}
 
}
