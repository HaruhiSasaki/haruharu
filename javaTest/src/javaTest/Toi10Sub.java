package javaTest;

import java.util.Scanner;

public class Toi10Sub {

	Scanner scanner = new Scanner(System.in);

	public void age(int umare) {
		System.out.println("調べたい年を西暦で入力してください");
		int year = scanner.nextInt(); //調べたい年を入力
		int nenrei = year - umare;
		System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
	}

	//		scanner.close();
}
