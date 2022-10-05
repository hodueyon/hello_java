package co.edu.emp.list;

import java.util.Calendar;

public class MethodCalendar {
		private static MethodCalendar instance = new MethodCalendar();
		private MethodCalendar() {};
		public static MethodCalendar getInstance() {
			return instance;
		}
	public void makeCal(int year, int month) {
		System.out.println("     >>  " + year + "��  " + month + "��  << ");
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		//����
		for(String day : days ) {//�ڽ��� for of / day�� ���� 
			System.out.printf("%4s", day); //f�� ������ �ǹ� string
		}
		System.out.println(); //�� �ٲ�
		
		// 1���� ��ġ�� ����.
		for(int i = 0; i<getFirstDay(year, month); i++) {
			System.out.printf("%4s", " "); //4�ڸ���ŭ�� string ������
		}
		
		//��¥ ���
		for (int i =1; i <=getLastDate(year, month); i++) {
			System.out.printf("%4d", i); //4�ڸ� �ʺ�ŭ ���� �����ð�.
			if((i+getFirstDay(year, month)) % 7 == 0) {
				System.out.println(); //7�ϸ��� �� ����
			}
		}
	} //end of makeCal()
	
	public int getFirstDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		return cal.get(Calendar.DAY_OF_WEEK) -1; //1
	}//end of getFirstDay()
	
	public int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		return cal.getActualMaximum(Calendar.DATE);
		
	}//end of getLastDate.
}//end of class.

	