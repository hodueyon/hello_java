package co.edu.api;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		//indexOf �޼ҵ� - �Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε����� ����, 
		//�ε����� 0���� ����, ���� ���� �ʴ´ٸ� -1�� �����Ѵ�.
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
}