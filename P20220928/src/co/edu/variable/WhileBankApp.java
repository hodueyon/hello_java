package co.edu.variable;

import java.util.Scanner;

//���� ���� ���� : ���¹�ȣ , ������ �̸�, �ܰ�
// ���� ���� ���� : Account[] banks;
public class WhileBankApp {

	public static void main(String[] args) {
		// �޴� : 1:����, 2:���, 3:�ܾ���ȸ, 4:����
		Account[] banks = new Account[10]; // banks���

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("0:���� ����, 1:����, 2:���, 3:�ܾ���ȸ, 4:����");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				// ���ݱ��. ���¹�ȣ, ��.
				System.out.println("���¹�ȣ >>> ");
				String accNo = scn.nextLine();
				System.out.println("������ �ݾ� >>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo)) {
						banks[i].balance = banks[i].balance + money; // ���ݾ��� �������̱� ������.
					} else {
						System.out.println("�Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
					}
				}
			} else if (menu == 2) {
				System.out.println("���¹�ȣ >>> ");
				String accNo = scn.nextLine();
				System.out.println("����� �ݾ� >>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo)) {
						if (banks[i].balance - money > 0) {
							banks[i].balance = banks[i].balance - money; // ���ݾ��� �������̱� ������.
						} else {
							System.out.println("�ܰ� �����մϴ�.");
							break;
						}
					}
				}
			} else if (menu == 3) {
				System.out.println("��ȸ�� ���¹�ȣ �Է� >>.");
				String accNo = scn.nextLine();
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo)) {
						System.out.println("�ܾ� : " + banks[i].balance);
					} else {
						System.out.println("���� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
						break;
					}
				}

			} else if (menu == 4) {
				System.out.println("�����մϴ�.");
				break;
			} else if (menu == 0) {
				System.out.println("���¹�ȣ�Է�>>>  ");
				String accNo = scn.nextLine();
				System.out.println("������>>>  ");
				String owner = scn.nextLine();
				Account acc = new Account(); // �ν��Ͻ� ����. Account Ŭ������ ���� �Ѱ�.
				acc.accNo = accNo;
				acc.owner = owner;
				// ���� ��ȣ ����.
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] == null) {
						// �Ѱ� �Է�.break;
						banks[i] = acc;
						break;
					}
				}
				System.out.println("���� ���� �Ϸ�");
			}

		} // end while

	}// end main
}// end class
