package co.edu;

public class Student { // public ���� -> Ÿ Ŭ���������� ��밡��.
	// �ʵ�
	private String num; // private �ٿ��ָ� ĸ��ȭ. 
	private String name;
	private String major;
	private int age; // ���� �� 23, 0, -12 ���̶� ������ ���� �ȵ�. �׷��� �����̺���Ʈ �־��ְ�
					//setAge��� �޼ҵ� ���� ���� �����ϰڴٴ°�. 
	private String[] hobbies = new String[5]; //5���� ���� ���� �� �ִ�.
	
	//  ���� �޼ҵ�.  static ����.-> �ν��Ͻ� �ȸ���� ��� ����. (class.staticMethod 
	public static void staticMethod( ) {
		System.out.println("staticMethod call.");
	}
	
	// ������(�ʵ��� ���� �ʱ�ȭ) 
	// ������ �����ε� (������ �̸��� �����ڸ� ������ ����)
	public Student() { //void��� �޼ҵ� �ƴ�.
		//�Ű����� ���� ������ -> �⺻������
		this.name = "�⺻��";
		this.num = "000-000";
	}
	public Student(String num, String name) { //�����ڸ� �̿��ؼ� �ʵ带 ������.
		this.num = num;
		this.name = name;
	}
	public Student(String num, String name, String major) {
		this(num, name); //�⺻ ������.
		this.major = major;
	}
	
	// �żҵ�
	void setHobbies(String[] hobbies) { //�Ű��� �Ϻ�
//		this.hobbies = hobbies;
		for(String hobby : hobbies) { 
			for(int i = 0; i<this.hobbies.length; i++) {
				if(this.hobbies[i]==null) {
					this.hobbies[i] = hobby;
					break;
				}
			}
		}
	}
	
	String[] getHobbies(String[] hobbies) {
		return this.hobbies;
	}
	String getHobb() {
		String str = "��̴� ";
		for(String hobby : hobbies) {
			if(hobby != null) {
				str += hobby + " "; // => str = str+ hobby + " ";
			}
		}
		str += "�Դϴ�.";
		return str;
	}
	//����߰�
	void addHobby(String hobby) {
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	void setNum(String num) {
		this.num = num; 
	}
	String getNum() { //�ҷ����⸸ �ϴ� �޼ҵ�� �ް������� �ʿ����.
		return this.num;
	}
	
	void setAge(int age) {
		if (age < 0) {
			this.age = 0; //this.age�� �ʵ� 
		} else {
			this.age = age;
		}
	}
	int getAge() {
		return this.age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
	void setMajor(String major) {
		this.major = major;
	}
	
	String getMajor() {
		return this.major;
	}
	// showInfo()
	// �̸� - �й� - ���� �����ִ� ��� �����
	public String showInfo() {
		return "�̸��� " + this.name + "�̰� �й��� " + this.num + "�̰� ������ " + this.major + "�Դϴ�.";
	}
	
	void study() {
		System.out.println(name + "�� �����ؿ� ������");
	}

	void game() {
		System.out.println(name + "�� ������ �ؿ�");
	}

	void sleep() {
		System.out.println(name + "�� ��ϴ�. �帣��");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
