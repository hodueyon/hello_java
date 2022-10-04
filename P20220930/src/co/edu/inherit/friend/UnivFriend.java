package co.edu.inherit.friend;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	public UnivFriend() {
		super();
	}
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); //Friend(String name, String phone)
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String showInfo() {
		return "�б� ģ���� �̸��� " + getName()
				+ ", ����ó�� " + getPhone()
				+ ", �б����� " + this.univ
				+ ", ������ " + this.major + "�Դϴ�.";
	}
	
}
