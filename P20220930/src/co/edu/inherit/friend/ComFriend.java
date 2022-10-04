package co.edu.inherit.friend;

public class ComFriend extends Friend {
	private String company;
	private String dept;

	public ComFriend() {
		super();
	}

	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone); // �θ� Ŭ������ ������ ȣ��
		this.company = company;
		this.dept = dept;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompany() {
		return this.company;
	}

	public String getDept() {
		return this.dept;
	}

	@Override
	public String showInfo() {
		// ȸ��ģ�� ����.
		return "ȸ��ģ���� �̸��� " + getName() //
				+ ", ����ó�� " + getPhone() //
				+ ", ȸ����� " + this.company //
				+ ", �μ����� " + this.dept + "�Դϴ�.";
	}
}
