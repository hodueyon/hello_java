package co.edu;

//�ϳ��� ����Ŭ����(main)�� �������� ���̺귯�� Ŭ����(person.java). 
public class AppMain {
	public static void main(String[] args) {
		//Object -> Class -> Instance
		Person kim = new Person();  //�ν��Ͻ� ����	
		kim.name = "��α�";
		kim.age = 20;
		kim.sleep();
		kim.eat("���");
		
		Person lee = new Person();
		lee.name = "�̼���";
		lee.age = 25;
		lee.sleep();
		lee.eat("��������");
//		System.out.println(kim);
		
		Student stu1 = new Student();
//		stu1.name = "ȣ��";
//		stu1.num = "1-111";
//		stu1.major = "����";
		stu1.setNum("1-1111"); //="1-111" �ϸ� �ȵ�
		stu1.setName("ȣ��");
		stu1.setMajor("����");
		stu1.sleep();
		stu1.game();
		stu1.study();
		
		Student stu2 = new Student();
//		stu2.name = "�ų���";
//		stu2.num = "2-222";
//		stu2.major = "������";
		stu2.setName("�ų���");
		stu2.setNum("2-2222");
		stu2.setMajor("������");
		stu2.sleep();
		stu2.game();
		stu2.study();
		
		Student stu3 = new Student();
		
		Student[] students;
		students = new Student[] {stu1, stu2, stu3};
		for(Student stu : students) {
			System.out.println("�й� : " + stu.getNum() + ", �л��̸� : " + stu.getName() );
		}
		
		//��� 
		WorkMan wman = new WorkMan(); /*Workman���� name �Ӽ��� ������,
		WorkMan�� Person�� ��ӹ޾ұ� ������ name�̶�� �Ӽ��� �� �� �ִ�.*/
		wman.name = "������";
		wman.age = 30;
		
		StudentMan sman = new StudentMan();
		sman.school = "����б�";
		sman.height = 164.3;
		
	}// end main
}//end class
