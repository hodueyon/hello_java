package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		// null pointer ����
		// String str = null;
		String str = "Hello World";
		// ����ó�� : RuntimeException ��ӹ޾Ƽ� ó���ϴ� ���� Ŭ����
		try {
			String result = str.substring(0, 10);
			char chr = result.charAt(20);
			System.out.println(chr); 
		} catch (NullPointerException | StringIndexOutOfBoundsException e) { //���� ����
			System.out.println("�����ϴ� ���� �����ϴ�.");
//		} catch ( e1) {
//			System.out.println("�ε��� ������ ��� ���Դϴ�.");
		} catch(RuntimeException e2) {
			System.out.println("���� ���ܰ� �߻��߽��ϴ�.");
		} catch(Exception e3) { 
			/*exception�� ��� ���ܸ� ������. runtimeexception, 
			 * nullpointerexception ���� �� �ʿ����, exception �ϳ��� ���� ó�� ok*/
			System.out.println("�˼� ���� ���ܰ� �߻��߽��ϴ�.");
		}
		// try �������� ���� �� �ÿ� - catch ���� ���
		//catch������ ���� ������ �� ū�� ���߿� ���ϴ�. 
		//ex. exception�� nullpoinerexception���� ���� ���� ������.

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("�����Է� >> ");

			try {
				int menu = scn.nextInt(); // InputMissmatchException
				System.out.println("�Է� ���� : " + menu);
				break;
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				scn.nextLine(); //abc(enter) 
			}finally {
				System.out.println("�ݵ�� ������ �ڵ�� finally ���� �Դϴ�");
				//db connection ����ϰ� resource ��ȯ.
			}
		}
		
		
		
		System.out.println("���α׷� ����");
	}//end of main()
	
	public static void exceptMethod() {
//		 �Ϲݿ��� : Exception ��ӹ޾Ƽ� ó���ϴ� ���� Ŭ����
				try {
					Class.forName("java.lang.String");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}		
	}
}
