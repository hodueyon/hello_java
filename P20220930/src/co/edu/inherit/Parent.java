package co.edu.inherit;

public class Parent /*extends Object*/ { //Object�� ��� Ŭ������ �� ���� Ŭ����.
	//���� extends Object ������� �ʾƵ� ��� Ŭ������ Object�� �����.
	String field;
	Parent(){
		System.out.println("Parent() call.");
	}
	Parent(String args){ //�⺻ ������
		System.out.println("Parent(String args) call."); //�����ڸ� ȣ���Ѵ�.
	}
	
	void method() {
		System.out.println("parent method() call.");
	}
	@Override //Parent�� ��Ӱ��踦 ������� �ʾƵ�, �⺻������ Object�� ��ӹް� �ֱ� ������ ����
	//to string�� Object�� �޼ҵ���
	public String toString() {
		return "Parent [field=" + field + "]";
	}
	
	
	
} //end class

