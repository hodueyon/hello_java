package co.edu.inherit.dbinterface;

public class mysqlDAO implements DaoService {

	@Override
	public void search() {
		System.out.println("mysql ��ȸ.");		
	}

	@Override
	public void modify() {
		System.out.println("my sql ����.");
	}

	@Override
	public void remove() {
		System.out.println("my sql ����.");
	}

	@Override
	public void insert() {
		System.out.println("mysql ����.");
		
	}

	
	//	public void insert() {
//		
//	}
//	public void search() {
//		
//	}
//	public void delete () {
//		System.out.println("my sql ����.");
//	}
//	public void update() {
//		System.out.println("my sql ����.");
//	}
}
