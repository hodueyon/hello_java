package co.edu.emp.list;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
//		Calendar today = new Calendar();
		Calendar today = Calendar.getInstance(); //�̱��� ���
		today.set(2022, 9, 1); //2022�� 10�� 1��
		System.out.println("���� ���� : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("��¥ ���� : " + today.get(Calendar.DATE));
		System.out.println("�� ���� : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("���� ���� : " + today.getActualMaximum(Calendar.DATE));
	}
}
