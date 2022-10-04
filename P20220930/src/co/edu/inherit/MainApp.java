package co.edu.inherit;

public class MainApp {
	public static void main(String[] args) {
		Child child = new Child(); //�ν��Ͻ������ //field1, methodl()
		child.method(); //Parent�� �޼ҵ�
		child.method1(); //Child�� �޼ҵ�
		
		Child2 child2 = new Child2();
		child2.method(); // 
		child2.method2();//Child2�� �޼ҵ�
		
		Parent c1 = new Parent();
		c1 = new Child(); //�θ�Ŭ������ ���������� �ڽ��ν��Ͻ� ���� ����.
		c1 = new Child2(); // �ڵ�����ȯ(�ڽ� �ν��Ͻ� => �θ��ν��Ͻ� )
		
//		c1 .method2(); //�θ�Ŭ������ ����鸸 ȣ�Ⱑ��.
		
		if(c1 instanceof Child2) {
			Child2 c2 = (Child2) c1; //��������ȯ(casting)
			c2.method2();
		}
		
		Parent c3 = new Parent(); // c3�� parent�� �ν��Ͻ�
		if(c3 instanceof Child2) { //c3�� Child2�� �ν��Ϛ����� Ȯ�� �۾�.
		Child2 c4 = (Child2) c3; //casting .
		c4.method2();
		}
		
		}
}// end class
