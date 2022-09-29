package co.edu.variable;

public class MethodCalendar {
	
	public static void main(String[] args) {
		makeCal(6); //ȣ��
	}
	
	public static void makeCal(int month) {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		//����
		for(String day : days ) {//�ڽ��� for of / day�� ���� 
			System.out.printf("%4s", day); //f�� ������ �ǹ� string
		}
		System.out.println(); //�� �ٲ�
		
		// 1���� ��ġ�� ����.
		for(int i = 0; i<getFirstDay(month); i++) {
			System.out.printf("%4s", " "); //4�ڸ���ŭ�� string ������
		}
		
		//��¥ ���
		for (int i =1; i <=getLastDate(month); i++) {
			System.out.printf("%4d", i); //4�ڸ� �ʺ�ŭ ���� �����ð�.
			if((i+getFirstDay(month)) % 7 == 0) {
				System.out.println(); //7�ϸ��� �� ����
			}
		}
	} //end of makeCal()

	public static int getFirstDay(int month) {
		if(month ==9 ) {
			return 4;
		} else if(month ==8) {
			return 1;
		} else if(month ==7) {
			return 5;
		} else if(month ==6) {
			return 3; 
		}	else {
			return 0;
		}
	}//end of getFirstDay()
	
	public static int getLastDate(int month) {
		//switch..case ���� 
		switch(month) {
		case 9 : 
			return 30;
		case 8:
			return 31;
		case 7:
			return 31;
		case 6 :
			return 30;
		default : 
			return 30;
		}
	}//end of getLastDate.
}//end of class.

	