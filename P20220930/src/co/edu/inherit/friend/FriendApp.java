package co.edu.inherit.friend;

public class FriendApp {
	public static void main(String[] args) {
		//ģ��
		Friend frnd = new Friend("��ȣ��", "010-1111-2222");
//		frnd.setName("��ȣ��");
//		frnd.setPhone("010-1111-2222");
		
		UnivFriend univFrnd = new UnivFriend("������", "010-2222-3333", "��ϴ�", "�����а�");
		ComFriend comFrnd = new ComFriend("���缮", "010-4545-2345", "MBC", "�̵��μ�");
	
		Friend [] friends = new Friend[5]; //�θ�Ŭ������ �������� �㵵�� �迭.
		friends[0] =frnd;
		friends[1] = univFrnd;
		friends[2] = comFrnd;
		
		for(Friend friend : friends) {
			if(friend != null)
			System.out.println(friend.showInfo());
		}
	}
}
