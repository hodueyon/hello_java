package co.edu;

public class Singletone {
//���ø����̼ǿ� �� 1���� ����� ������
	//private �����ʵ�
	private static Singletone singleton = new Singletone();
	
	//private ������.
	
	private Singletone() {
	}
	
	//public getInstance() ; �����ڸ� ���������
	public static Singletone getInstance() {
		return singleton;
	}
	
}
