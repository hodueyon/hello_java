package co.edu.variable;
import java.util.Scanner;

// �������� ����: ���¹�ȣ, ������, �ܰ� 
// ���� ���� ����: Account[] banks;
public class hyunji_WhilebankApp {
	public static void main(String[] args) {
	// �޴�: 1.����, 2.���, 3.�ܾ���ȸ, 4.����

		Account[] banks = new Account[10];
		Scanner scn = new Scanner(System.in);

		while(true) {
			System.out.println("0.���»���, 1.����, 2.���, 3.�ܾ���ȸ, 4.����");
			int menu = scn.nextInt();scn.nextLine();

			if(menu == 1) {
	// ���ݱ��
				System.out.println("���¹�ȣ �Է� >>> ");
				String accNo = scn.nextLine();
				System.out.println("������ �ݾ� �Է� >>> ");
				int money = scn.nextInt();
				
				for(int i = 0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						if(banks[i].getBalance() + money <100000 ) {
							System.out.println(money+"���� �ԱݵǾ����ϴ�");
							banks[i].setBalance(banks[i].getBalance() + money);
							System.out.println("���� �ܰ��"+banks[i].getBalance()+"�� �Դϴ�");
							break;
						}
						System.out.println("��ġ������ �ݾ��� �ʰ��մϴ�");
					}
				}
			}else if(menu == 2) {
	//��� ���.
		//������ȸ
				System.out.println("���¹�ȣ �Է� >>> ");
				String accNo = scn.nextLine();
		//��ݾ� �Է�
				System.out.println("����� �ݾ� �Է� >>> ");
				int money = scn.nextInt();
		//��� ����
				for(int i = 0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						if(banks[i].getBalance() - money >0 ) {
							System.out.println(money+"���� ����Ǿ����ϴ�");
							banks[i].setBalance(banks[i].getBalance() - money);
							System.out.println("���� �ܰ��"+banks[i].getBalance()+"�� �Դϴ�");
							break;
						}
						System.out.println("�ܰ� �����մϴ�");
					}
				}
			}else if(menu == 3) {
	//�ܾ� ��ȸ

				System.out.println("��ȸ�� ���¹�ȣ �Է� >>> ");
				String accNo = scn.nextLine();

				for(int i=0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						System.out.println("������: '"+banks[i].getOwner()+"' �ܾ�: " + banks[i].getBalance());
					}
				}
			}else if(menu == 4) {
	//�ý��� ����
				System.out.println("�ý����� �����Ͽ����ϴ�");
				break;
			}else if(menu == 0) {
	//���� ����
				System.out.println("���¹�ȣ �Է� >>> ");
				String accNo = scn.nextLine();
				System.out.println("������ �̸� �Է� >>> ");
				String owner = scn.nextLine();

		//�ν��Ͻ� ����.
				Account acc = new Account(); 
				acc.setAccNo(accNo);
				acc.setOwner(owner);
	    //���¹�ȣ ����.
				
				for(int i=0; i<banks.length; i++) {
					if(banks[i] == null) {
	    //���� �Ѱ� �Է�+ break;
						banks[i] = acc;
						break;
					}
				}
				System.out.println("���� ���� �Ϸ�.");

			}//else end
		}// while end
	}// method end
}//class end

//for(int i=0; i<banks.length; i++) {
//if( banks[i] != null &&banks[i].accNo != acc.accNo) {
//	
//	break;
//}System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�");
//}
//
