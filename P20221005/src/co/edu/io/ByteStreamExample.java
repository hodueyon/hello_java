package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

	public static void main(String[] args) {
		try {
			fileCopy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// byte������ �а� ����.
	public static void fileCopy() throws IOException {
		FileInputStream fis = new FileInputStream("C:/Temp/origin.jpg");
		FileOutputStream fos = new FileOutputStream("C:/Temp/copy.jpg");
		//�о�� origin�� copy���  ���Ϸ� �����.
		byte [] buf = new byte[100]; //�ѹ��� 100����Ʈ��ŭ �о���ϰ�
		
		//copy����µ� �ɸ� �ð� ���
		long start = System.currentTimeMillis();
		while (true) {
			int bytes = fis.read(buf); // �Ű��� ���� �� : �ѹ���Ʈ�� �б�.
			
			if (bytes == -1) 
				break;
				
			fos.write(buf); //�迭�� ũ�⸸ŭ ���ۿ� �����ϰ� �ѹ��� ����
		}
		fos.close();
		fis.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.out.println("complete..");
		}
		
	public static void readBuf() throws IOException {
		InputStream is = new FileInputStream("C:/Temp/data2.dat");
		byte[] buf = new byte[2];

		while (true) {
			int bytes = is.read(buf); // �迭�� ����� ũ�⸸ŭ �о����.
			if (bytes == -1) { // �о�� ���� ������ �������ð�
				break;
			}
			for (int i = 0; i < bytes; i++) {
				System.out.print(buf[i] + " ");
			}
			System.out.println();
		}
		System.out.println("complete!");
		is.close();
	}

	public static void writeBuf() throws IOException { // �� ������ Exception
		byte[] arr = new byte[] { 10, 20, 30 };
		OutputStream os = new FileOutputStream("C:/Temp/data2.dat");
		os.write(arr);
		os.close();

		System.out.println("complete~");
	}

	public static void read() {
		try {
			InputStream is = new FileInputStream("C:/Temp/data1.dat");

			while (true) {
				int bytes = is.read(); // byte �а� �� �̻� ���� ����Ʈ ������ -1�� ��ȯ
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes);
			}

			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("complete");
	}

	public static void write() {
		// ��½�Ʈ��(����Ʈ)
		try {
			OutputStream os = new FileOutputStream("C:/Temp/data1.dat");
			// write(byte b)
			byte a = 10;
			byte b = 20;

			os.write(a);
			os.write(b);

			// resource ��ȯ
			os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Complete");
	}
}// end class
