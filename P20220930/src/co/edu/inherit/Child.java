package co.edu.inherit;

public class Child extends Parent { //Parent ���̺��� ��ӹްڴ�.
	String field1;
	Child (){
		super("args"); //�θ�Ŭ������ �⺻������ ȣ�� ()�� �Ű԰� ������ �Ű԰� �ִ� �����ڷ� ȣ��
		System.out.println("Child() call.");
	}
	void method1() {
		System.out.println("method1() call.");
	}
	//�θ�Ŭ�������� �޼ҵ带 ������. overrideing. 
	//�θ� Ŭ������ �޼ҵ��� �̸��� �ް� ���� Ÿ���� ���ƾ� �Ѵ�.
	@Override //�Ƴ����̼� : �θ�Ŭ������ �޼ҵ�(��ȯ��, �޼ҵ����̸�, �Ű���)üũ.
	void method() { 
		System.out.println("Child method() call.");
	}
	
	@Override //Parent���� �� ��� ���µ� ���� �� ������ ��� Ŭ������ �⺻������
	//Object��� �ֻ��� Ŭ������ ��ӹް� �ֱ� ������.
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}
	
}// end class
