package co.edu.memo.except;

//Exception ��ӹ����� ������ try = catch��������
public class MenuException extends Exception {
	int choice;
	
	public MenuException(int choice) {
		this.choice =choice;
	}
	
	public void showErrMessage() {
		System.out.println(choice + "�� ���� �޴��Դϴ�.");
	}
}
