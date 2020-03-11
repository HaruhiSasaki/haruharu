package javaTest;

import java.util.Scanner;

public class Toi10Sub1 {

	Scanner scanner = new Scanner(System.in);

	public void seireki(int umare) {
		System.out.println("調べたい年齢を入力してください");
		int nenrei = scanner.nextInt(); //調べたい年齢を入力
		int year = nenrei + umare;
		System.out.println("あなたが" + nenrei + "歳の時は西暦は" + year + "年です");
	}

	//		scanner.close();
}