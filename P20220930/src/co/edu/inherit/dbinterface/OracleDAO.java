package co.edu.inherit.dbinterface;

public class OracleDAO implements DaoService {

	@Override
	public void search() {
		System.out.println("oracle ��ȸ");
	}

	@Override
	public void modify() {
		System.out.println("oracle ����.");
	}

	@Override
	public void remove() {
		System.out.println("oracle ����.");
	}

	@Override
	public void insert() {
		System.out.println("oracle ����.");
	}
	//�߰�, ����, ����, ��ȸ.
	
	
//	public void add() {
//		System.out.println("oracle ����.");
//	}
//	public void modify() {
//		System.out.println("oracle ����.");
//	}
//	public void find() {
//		System.out.println("oracle ��ȸ");
//	}
//	public void remove() {
//		System.out.println("oracle ����.");
//	}
}
