package co.edu.board;

public class BoardExe {
	public static void main(String[] args) {
		BoardDAO dao = BoardDAO.getInstance();
		//�̱������� �ν��Ͻ� ��������
		dao.exe();
	}
}
