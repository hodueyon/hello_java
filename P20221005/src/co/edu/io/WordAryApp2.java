package co.edu.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordAryApp2 {
	public static void main(String[] args) throws Exception {
		// ���� ������ 10���� ����ϰ� Ÿ�����ؼ� ������ ������� ..
		ArrayList<String> words = randomWords(10);
		System.out.println(words.size());
		for (String word : words) {
			System.out.println(word);
		}
		// �ϳ��� ã�Ƽ� ���찳��.
		Scanner scn = new Scanner(System.in);
		while (true) {
			if (words.size() == 0) {
				System.out.println("��");
				break;
			}
			for (int i = 0; i < words.size(); i++) {
				System.out.printf("%s \n", words.get(i));
				System.out.print("\n>>");
				String input = scn.nextLine();
				if (words.get(i).equals(input)) {
					words.remove(i);
				}
			}

		}

	}

	public static ArrayList<String> randomWords(int times) throws Exception {
		// ArrayList<String>�� ��ü ������ ���,
		ArrayList<String> words = new ArrayList<String>();
		String path = "src/co/edu/io/wordAry.txt";
		File file = new File(path); // ����� ������..�����
		Scanner scn = new Scanner(file);
		while (scn.hasNext()) {
			String readStr = scn.nextLine();
			readStr = readStr.replaceAll("\"", "").trim();
//			System.out.println(readStr);
			words.add(readStr.substring(0, readStr.indexOf(","))); // indexof(",") - ��ǥ�� �� �ε��� �� ã����
		}
		// ������ ���� times����ŭ ��ȯ�ϵ���.
		ArrayList<String> randomWords = new ArrayList<String>();
		while (randomWords.size() < times) {
			randomWords.add(words.get((int) (Math.random() * 494)));
		}

		scn.close();
		return randomWords;

	}
}
