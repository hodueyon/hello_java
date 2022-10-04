package co.edu.inherit.interfaces;

public class DaoMain {
	public static void main(String[] args) {
		EmpServiceImpl service = new EmpServiceImpl();
		service.setDb("�λ�");
		service.insert();
		service.delete();
		
		DeptServiceImpl service2 = new DeptServiceImpl();
		service2.insert();
		service2.delete();
		
		DaoService dao = new DeptServiceImpl(); //����Ŭ����
//		dao = new DeptServiceImpl();
		dao.insert();
		dao.search();
		dao.delete();
	}
}
