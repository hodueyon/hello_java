package co.edu.friends;

import java.util.Scanner;

public class FriendsPgm {

	private static FriendsPgm instance = new FriendsPgm();

	private FriendsPgm() {
	}

	public static FriendsPgm getinstance() {
		return instance;
	}

	Scanner scn = new Scanner(System.in);
	Friends[] myFriends = new Friends[100];

	// 1. ��ȭ ��ȣ ���
	public void addFr() {
		System.out.println("��ȭ ��ȣ ���");
		System.out.println("��ȭ ��ȣ �Է� >> ");
		int phoneNum = scn.nextInt();
		scn.nextLine();
		System.out.println("�̸� �Է� >> ");
		String name = scn.nextLine();
		System.out.println("���� �Է�(09/17 ��������) >> ");
		String bday = scn.nextLine();
		System.out.println("Ư¡ �Է� >>");
		String fig = scn.nextLine();

		Friends fr = new Friends(phoneNum, name, bday, fig);

		for (int i = 0; i < myFriends.length; i++) {
			if (myFriends[i] == null) {
				myFriends[i] = fr;
				break;
			}
		}
	}// end addFr

	// 2. ��� ��ȣ ��� �����ֱ�
	public void frList() {
		System.out.println("��� ģ�� ���");
		for (Friends fr : myFriends) {
			if (fr != null) {
				System.out.println(fr.toString());
			}
		}
	}

	// 3. �̸� �˻� �� ��ȣ ã��
	public void findFr() {
		System.out.println("ģ�� ��ȣ ã��");
		System.out.println("�̸� �Է� >> ");
		String name = scn.nextLine();
		boolean check = false;
		for (Friends fr : myFriends) {
			if (fr != null && fr.getName() == (name)) {
				System.out.println(fr.toString());
				check = true;
			}
		}
		if (check = false) {
			System.out.println("�ش� ��ȣ�� ���� ��ȣ �Դϴ�.");
		}
	}

	// 4. ����
	public void delFr() {
		System.out.println("ģ�� ����");
		System.out.println("��ȣ �Է� >> ");
		int phoneNum = scn.nextInt();
		for (Friends fr : myFriends) {
			if (fr != null && fr.getNum() == (phoneNum)) {
				fr = null;
				System.out.println("��ȣ�� �����Ǿ����ϴ�.");
			}
		}
	}

	// 5. �Ŵ�
	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("ģ�� ���� ���α׷� �Դϴ�");
			System.out.println("1. ��ȭ ��ȣ ��� 2. ��� ģ�� ���� 3. ģ�� �˻� 4. ģ�� ���� 5. ����");
			System.out.println("�޴� ���� >");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addFr();
				break;
			case 2:
				frList();
				break;
			case 3:
				findFr();
				break;
			case 4:
				delFr();
			case 5:
				run = false;
			default:
				System.out.println("�߸��� �޴� �Դϴ�");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}// end exe()

}// end of class
