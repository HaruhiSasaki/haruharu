package javaTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("年齢を入力してください。");
		int nenrei = scanner.nextInt(); //年齢を入力
		int kakaku = 0;
		if(nenrei == 0) {
			kakaku = 100;
		}
		else {
			kakaku = 50000;
		}
		System.out.println("価格は" + kakaku + "円です");
		scanner.close();
	}

}
