package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.staticMethod(); //error �ƴϰ� warning
		
		Student.staticMethod();
		
		Math.random(); //�����޼ҵ�
		Math.round(.5); //�����޼ҵ�
		
		s1.setNum("111-111");
		s1.setName("ȫ�浿");
		s1.setMajor("��ǻ�Ͱ���");
		s1.setAge(20);
		
		System.out.println(s1.getNum()); // String �ʱⰪ = null
		System.out.println(s1.getAge()); // int �ʱⰪ = 0 
		System.out.println(s1.showInfo());
		
		System.out.println("���� ==>>" + s1);
		
		Student s2 = new Student();
		s2.setName("������");
		s2.setNum("111-222");
		s2.setMajor("Ž����");
		System.out.println(s2.showInfo());
		
		String[] hob = {"����","������"};
		s1.setHobbies(hob);
		s1.addHobby("���ǵ��");
		System.out.println(s1.getHobb());
		
		System.out.println(s2.getHobb());
		
		Student s3 = new Student();
		System.out.println(s3.getName());
		
		Student s4 = new Student("111-234","������");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student("222-222", "������", "�����а�");
		System.out.println(s5.showInfo());
	}
}// end class
