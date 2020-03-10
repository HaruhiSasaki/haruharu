package javaTest;

import java.util.Scanner;

public class Toi10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag = 1;

		while (flag == 1) {

			System.out.println("モードを選択してください。(1or2):");
			int mode = scanner.nextInt(); //modeを入力

			System.out.println("生まれた歳を西暦で入力してください");
			int umare = scanner.nextInt(); //生まれた歳を入力

			if (mode == 1) {
				System.out.println("調べたい年を西暦で入力してください");
				int year = scanner.nextInt(); //調べたい年を入力
				int nenrei = year - umare;
				System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
				flag = 0;
			} else if (mode == 2) {
				System.out.println("調べたい年齢を入力してください");
				int nenrei = scanner.nextInt(); //調べたいm年齢を入力
				int year = nenrei + umare;
				System.out.println("あなたが" + nenrei + "歳の時は西暦は" + year + "年です");
				flag = 0;
			} else {
				System.out.println("正しいモードが入力されませんでした。もう一度入力してください");
			}
		}
		System.out.println("処理は正常に終了しました");
		scanner.close();
	}

}
