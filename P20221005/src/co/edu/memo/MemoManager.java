package co.edu.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();//���� ���� �÷���
	File file = new File("C:/Temp/memobook.dat");
	Scanner scn = new Scanner(System.in);
	
	//�̱���
	private static MemoManager instance = new MemoManager();
	private MemoManager() {
		readFromFile();
	}
	public static MemoManager getInstance() {
		return instance;
	}
	
	// �߰�.
	public void inputData() {
		System.out.print("��ȣ > ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("��¥ > ");
		String date = scn.nextLine();
		System.out.println("���� > ");
		String content = scn.nextLine();
		
		memoStorage.add(new Memo(no, date, content));
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	
	//��ȸ. ���� - ��¥
	public void searchData() {
		System.out.println("��¥ >");
		String sDate = scn.nextLine();
		boolean exists = false;
		for(int i =0; i<memoStorage.size(); i++) {
			if(sDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i).toString());
				exists = true;
			}
		}
		if(!exists) {
			System.out.println("�ش� ��¥�� �޸� �����ϴ�.");
		}
	}//end searchData
	
	//��ȣ�� �Է��ϸ� �Ѱ� ����.
	public void deleteData() {
		System.out.println("��ȣ >> ");
		int sNo = Integer.parseInt(scn.nextLine());
		boolean exists = false;
		for(int i =0; i<memoStorage.size(); i++) {
			if(sNo == memoStorage.get(i).getNo()) {
				memoStorage.remove(i);
				exists = true;
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
			}
		}
		if(!exists) {
			System.out.println("�ش� ��ȣ�� �޸� �����ϴ�.");
		}
	}
	
	//���α׷� ���� ��  ������ �о ������ memoStorage ���.
	public void readFromFile() {
		//try with resource.
		try(FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			
			memoStorage = (List<Memo>) ois.readObject(); //������ �� �����ֻ�
		} catch(Exception e) {
//			e.printStackTrace(); 
			return; //������ ��¿�� ���� �� ����
		}
	}
	
	//�����ϸ� ���Ͽ� ���尥��.
	public void storeToFile() {
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			oos.writeObject(memoStorage); //��������
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
			
}// end class
