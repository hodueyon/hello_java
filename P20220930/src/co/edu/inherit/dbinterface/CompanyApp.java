package co.edu.inherit.dbinterface;

public class CompanyApp {
	public static void main(String[] args) {
		//�߰�, ����, ����, ��ȸ ���.
//		mysqlDAO dao = new mysqlDAO();
//		dao.insert();
//		dao.update();
//		dao.search();
//		dao.delete();
		
//		OracleDAO dao = new OracleDAO();
//		dao.add();
//		dao.modify();
//		dao.find();
//		dao.remove();

		DaoService dao = new mysqlDAO(); //ver.1
		dao = new OracleDAO(); //ver.2
		dao.insert();
		dao.modify();
		dao.remove();
		dao.search();
		
		//�͸�����ü : �������̽� ���� �ڵ�.
		DaoService anonym = new DaoService() { //�ν��Ͻ��� �� ��������, �ȿ� �ִ� �޼ҵ�� �����ϰڴ�.

			@Override
			public void search() {
				System.out.println("�͸�db ��ȸ.");
			}
			@Override
			public void modify() {	
				System.out.println("�͸�db ����.");
			}
			@Override
			public void remove() {
				System.out.println("�͸�db ����.");
			}
			@Override
			public void insert() {
				System.out.println("�͸�db �Է�.");
			} 
			
		};
		anonym.insert();
		anonym.search();
		anonym.modify();
		anonym.remove();
	}
}//end class
