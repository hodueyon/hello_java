package co.edu.memo;

import java.util.Scanner;


import co.edu.memo.except.ExitException;
import co.edu.memo.except.MenuException;

public class MemoApp {
	public static void main(String[] args) {
		MemoManager manager = MemoManager.getInstance();
		Scanner scn = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("1.��� 2.�˻� 3.���� 4.����");

				System.out.println("���� >> ");
				int menu = Integer.parseInt(scn.nextLine());

				if (menu < MENU.INSERT || menu > MENU.EXIT) {
					throw new MenuException(menu);
				}
				switch (menu) {
				case MENU.INSERT:
					// �Է��۾�
					manager.inputData();
					break;

				case MENU.SEARCH:
					// ��ȸ
					manager.searchData();
					break;
					
				case MENU.DELETE:
					// ����
					manager.deleteData();
					break;
				case MENU.EXIT:
					// ���ο� ��������
					manager.storeToFile();
					throw new ExitException();
				}
			} catch (MenuException e) {
				e.showErrMessage();
			} catch (ExitException e) {
				break;
			}
			
		} // end while
		System.out.println("���α׷� ����");
		scn.close();
	}
}