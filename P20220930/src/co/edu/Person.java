package co.edu;

//��� : �Ӽ�(�̸�, ����, Ű, ������)
//		���(�޸���, �Դ´�, �ܴ�)
public class Person {
	//�Ӽ� => �ʵ�. 
	String name;
	int age;
	double height;
	double weight;
	//��� -> �޼ҵ�.
	void run(){
		System.out.println(name + "�� �޷���");
	}
	void eat(String food){
		System.out.println(name + "�� " + food + "�� �Ծ��");
	}
	void sleep(){
		System.out.println(name + "�� �帣��");
	}
}	
