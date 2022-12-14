package co.edu.inherit.friend;

import java.util.Scanner;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	//친구등록 - 학교/회사/그외 친구..
	public void exe() {
		
		while(true) {
			System.out.println("1. 친구 등록 2. 친구 조회 3. 종료");
			System.out.println("선택 >>>");
			int menu = scn.nextInt();
			scn.nextLine(); 
			if(menu ==1) {
				System.out.println("1. 회사친구 2. 학교친구 3.그외 친구");
				int subMenu = scn.nextInt();
				scn.nextLine();
				if(subMenu ==1) {
					addComFriend();
				}else if(subMenu ==2) {
					addUnivFriend();
				}else if(subMenu ==3) {
					addFriend();
				}else {
					System.out.println("잘못된 메뉴를 선택했습니다.");
				}				
			}else if(menu ==2) {
				searchFriend();
			}else if(menu ==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못되 메뉴를 선택했습니다.");
			}
		}
		System.out.println("프로그램 종료.");
	}// end of exe()
	//추가 메소드 정의
	public void addComFriend() {
		System.out.println("친구 이름 >>");
		String name = scn.nextLine();
		System.out.println("전화 번호 >>");
		String phone = scn.nextLine();
		System.out.println("회사명 입력 >>");
		String company = scn.nextLine();
		System.out.println("부서명 입력 >>");
		String dept = scn.nextLine();
		
		ComFriend comFrnd = new ComFriend(name, phone, company, dept);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = comFrnd;
				break;
			}
		}
	}//end addComFriend;
	
	public void addUnivFriend() {
		System.out.println("친구 이름 >>");
		String name = scn.nextLine();
		System.out.println("전화 번호 >>");
		String phone = scn.nextLine();
		System.out.println("학교명 입력 >>");
		String univ = scn.nextLine();
		System.out.println("전공명 입력 >>");
		String major = scn.nextLine();
		
		UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = univFrnd;
				break;
			}
		}
	}//end addUnivFriend
	
	public void addFriend() {
		System.out.println("친구 이름 >>");
		String name = scn.nextLine();
		System.out.println("전화 번호 >>");
		String phone = scn.nextLine();
		
		Friend frnd = new Friend(name, phone);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}// end addFriend
	
	public void searchFriend() {
		//권수미, 권미현, 강민기 권 치면 수미, 미현 나오게끔.
		System.out.println("찾을 친구 이름을 입력하세요.");
		String name = scn.nextLine();
		boolean check = false;
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().contains(name)) {
				System.out.println(friends[i].showInfo());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("검색한 이름이 존재하지 않습니다.");
		}
	}
	
}//end of class
