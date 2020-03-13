package javaTest;

import java.util.Scanner;

public class Toi10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int flag = 1;
		boolean a = true;
		Toi10Sub mondai = new Toi10Sub();

		while (a) {

			System.out.println("モードを選択してください。(1or2):");
			int mode = scanner.nextInt(); //modeを入力

			System.out.println("生まれた歳を西暦で入力してください");
			int umare = scanner.nextInt(); //生まれた歳を入力

			if (mode == 1) {
				//モード1の場合、西暦から年齢を求める
				mondai.age(umare);
				a = false;
			} else if (mode == 2) {
				//モード2の場合、年齢から西暦を求める。
				mondai.seireki(umare);
				a = false;
			} else {
				System.out.println("正しいモードが入力されませんでした。もう一度入力してください");
			}
		}

		int umare0 = mondai.getUmare();
		mondai.setNenrei(2020 - umare0);

		int nenrei0 = mondai.getNenrei();
		System.out.println("あなたは" + umare0 + "生まれの" + nenrei0 + "歳です");
		System.out.println("処理は正常に終了しました");
		scanner.close();
	}

}
