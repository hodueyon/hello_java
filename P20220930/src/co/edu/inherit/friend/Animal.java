package co.edu.inherit.friend;

public abstract class Animal { //�߻�Ŭ����
	private String kind;
	public Animal( ) {
		
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public void move() {
		System.out.println("�����Դϴ�.");
	}
	public abstract void eat(); //�߻� �޼ҵ� :  �ڽ�Ŭ���� ������ ����
	public abstract void speak(); 
}
