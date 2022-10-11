package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

//ObjectOutputStream�� Serializable �� �����ϴ� Ŭ����. 
class Emp implements Serializable {
	int id;
	String name;
	String dept;

	public Emp(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "���id : " + id + ", �̸� : " + name + ", �μ� : " + dept;
	}
}

public class ObjectExample {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");
			ObjectInputStream oos = new ObjectInputStream(fis);
			) {
			ArrayList<Emp> list = (ArrayList<Emp>) oos.readObject();
			
			for(Emp emp:list) {
				System.out.println(emp.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeObj() {
		// ����� ��Ʈ�� -> Class�ν��Ͻ� ���� -> ���� �����
		// ObjectInputStream, ObjectOutputStream : object ���.
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(new Emp(100, "��ȣ��", "�λ�"));
		empList.add(new Emp(200, "�쿵��", "����"));
		empList.add(new Emp(300, "������", "�ѹ�"));

		try (FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//					FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat"); //try ()�� ���ָ� ���� close �����൵ ��.
//					ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(empList);

//					oos.close();
//					fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("completed~");
	}
}
