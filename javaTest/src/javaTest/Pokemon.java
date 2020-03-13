package javaTest;

import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------");

		PokemonHinagata first = new PokemonHinagata(); /////初期のポケモン選び
		PokemonSyori syori = new PokemonSyori();

		//////////////レベル上げ、名前変更の処理///////////////////////
		boolean flag = true;
		while (flag) {
			System.out.println("何をしますか？ 1：レベル上げ  2：ポケモンの名前の変更 ");
			int a = scanner.nextInt();

			////////////////////////レベル上げ、進化///////////////////////
			if (a == 1) {

				first.setLevel(syori.levelup(first.getName()));//レベル上げのメソッド

				System.out.println("現在のレベルは" + first.getLevel() + "レベルです");

				syori.shinka(first.getLevel(), first.getName(), first.getShinkalimit1(),
						first.getShinkaname1(), first.getShinkalimit2(), first.getShinkaname2());///進化のメソッド

				flag = false;

				//////////////////////ニックネーム変更///////////////////
			} else if (a == 2) {
				first.setName(syori.changeName());////ポケモンのニックネーム変更メソッド
				flag = false;
			} else {
				System.out.println("正しい数値が入力されませんでした。もう一度入力してください");
			}
		}
		//////////////////　現在のポケモンの情報表示　////////////////////////////
		syori.joho(first.getName(), first.getNickname(), first.getLevel());

		////////////////////////////////////////////////////////////////

		System.out.println("--------------------");

		System.out.println("正常に動作が終了しました。");
		scanner.close();
	}

}
