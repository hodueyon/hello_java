package co.edu.friends;

public class Friends {
	private int phoneNum;
	private String name;
	private String bday;
	private String fig;

	public Friends() {		
	}
	
	public Friends(int phoneNum, String name, String bday, String fig) {
		super(); // ���, ������ ������ ��� ��
		this.phoneNum = phoneNum;
		this.name = name;
		this.bday = bday;
		this.fig = fig;	
	}
	
	
	void setNum(int num) {
		this.phoneNum = phoneNum;
	}
	public int getNum() {
		return this.phoneNum;
	}
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	void setBday(String bday) {
		this.bday = bday;
	}
	public String getBday() {
		return this.bday;
	}
	void setFig(String fig) {
		this.fig = fig;
	}
	public String getFav() {
		return this.fig;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ��ȭ ��ȣ : " + phoneNum + ", ���� : " + bday + ", Ư¡ : " + fig;
		
	}

}// end class
