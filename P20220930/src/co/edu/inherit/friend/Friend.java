package co.edu.inherit.friend;

public /*final*/ class Friend { //final class ����� �� ����.
	private String name;
	private String phone;
	//������
	public Friend(String name, String phone) {
		super(); //object�� ������ ȣ�� 
		this.name = name;
		this.phone = phone;
	}
	public Friend() {} //�⺻ ������ ����.
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String showInfo() {
		return "ģ���� �̸��� " + name  + ", ����ó�� " + phone;
	}
}
