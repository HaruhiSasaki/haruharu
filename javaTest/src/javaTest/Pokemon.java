package javaTest;

import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) {
		String name = null;
		int level = 1;
		Scanner scanner = new Scanner(System.in);
		PokemonPoppo torisan = new PokemonPoppo();
		System.out.println("何レベルあげますか？");
		int a = scanner.nextInt(); //上げるレベルを入力

		level = torisan.levelup(a);
		//レベル上げの処理

		name = torisan.shinka(a);
		//進化の処理

		System.out.println(name + "はレベル" + level + "です");
		System.out.println("正常に動作が終了しました。");
		scanner.close();
	}

}
