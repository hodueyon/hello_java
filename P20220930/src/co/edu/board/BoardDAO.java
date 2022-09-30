package co.edu.board;

import java.util.Scanner;

//��ɸ�
public class BoardDAO {
	//singleton����� �ν��Ͻ� ����.
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}//������ ȣ���ϴ� ��� ���� -> �ܺο��� ������ �� ����.
	
	Scanner scn = new Scanner(System.in);
	Board[] myBoards = new Board[100];

	// 1. �۵��
	public void addBoard() {
		System.out.println("�� ��� ���");
		System.out.println("�� ��ȣ �Է� >> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.println("�� ���� �Է� >> ");
		String title = scn.nextLine();
		System.out.println("�� ���� �Է� >> ");
		String content = scn.nextLine();

		Board brd = new Board(bNo, title, content);
		// �迭 ���
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
	} // end addBoard();

	// 2. �۸��
	public void boardList() {
		System.out.println("�� ��� Ȯ��");
		for (Board brd : myBoards) {
			if (brd != null) {
				System.out.println(brd.toString());
			}
		}
	}

	// 3. �� �󼼺���
	public void boardDetail() {
		System.out.println("�󼼺��� ���.");
		System.out.println("�� ��ȣ �Է� >> ");
		int bNo = scn.nextInt();
		
//		for(int i=0; i<myBoards.length; i++) {
//			if(myBoards[i] != null && myBoards[i].getBoardNo()==(bNo)) {
//				System.out.println(myBoards[i].toString());
//			}
		for (Board brd : myBoards) {
			if(brd != null && brd.getBoardNo() ==(bNo)) {
				System.out.println(brd.toString());
			}
		}
	}

	// 4. �ۻ���
	public void delBoard() {
		System.out.println("�� ���� ���.");
		System.out.println("�� ��ȣ �Է� >> ");
		int bNo = scn.nextInt();
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i] != null && myBoards[i].getBoardNo()==(bNo)) {
				myBoards[i] = null;
			}
		}
		
	}

	// 5. ��ü �޴�
	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("1. �� ��� 2. �� ��� 3. �� �󼼺��� 4. �� ���� 9. ����");
			System.out.print("���� >> ");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addBoard();
				break;
			case 2:
				boardList();
				break;
			case 3:
				boardDetail();
				break;
			case 4:
				delBoard();
				break;
			case 9:
				run = false;
			default:
				System.out.println("�߸��� �޴� �Դϴ�.");
			}

		} // end of while
		System.out.println("���α׷� ����.");
	}// end of exe()
}// end class
