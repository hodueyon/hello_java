package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpObjectExam {
	public static void main(String[] args) throws Exception {
		
		//C://Temp/emp.dat �о���̴� ��� �����
		FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> empList = (ArrayList<Emp>) ois.readObject(); //objectŸ������ �о��ֻ� -> Arraylist �� ĳ����
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1. ������ 2. ������ 3. ���� 4. ����");
			System.out.println("�޴� ���� >>");
			int menu = scn.nextInt();
			scn.nextLine();
			String[] empAry; //�������� �Ͻ� �� 
			if(menu == 1) {
//				System.out.println("���id >> ");
//				int id = scn.nextInt();
//				scn.nextLine();
//				System.out.println("��� �̸� >> ");
//				String name = scn.nextLine();
//				System.out.println("�μ� �̸� >> ");
//				String dept = scn.nextLine();
//				
//				Emp employee = new Emp(id, name, dept);
//				empList.add(employee);
				
//���� �Ѱ�				
				System.out.println(">>");
				String empVal = scn.nextLine();
				//split�� �̿��Ұ��
				empAry = empVal.split(" ");
				Emp emp = new Emp(Integer.parseInt(empAry[0]), empAry[1], empAry[2]);
				empList.add(emp);
				System.out.println("�Է� �Ϸ�");
				
			} else if(menu ==2) {
				for(Emp emp:empList) {
					System.out.println(emp.toString());
				}
			} else if(menu == 3) {
				//�����ȣ�� �������� ����
				System.out.println("��� ��ȣ�� �Է� �ϼ��� >>");
				int empId = scn.nextInt();
				scn.nextLine();
				for(int i = 0; i<empList.size(); i++) {
					if(empId == empList.get(i).id)
					empList.remove(i);
				}
				System.out.println("�����Ǿ����ϴ�.");
				
			} else if (menu ==4) {
				//�÷��ǿ� �ִ� ObjectOutStream�� Ȱ���ؼ� C:/Temp/emp.dat ����.
				try(FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
					oos.writeObject(empList);
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �޴��� �����߽��ϴ�.");
			}
		}
	}//end main.
}
