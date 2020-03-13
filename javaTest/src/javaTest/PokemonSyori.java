package javaTest;

import java.util.Scanner;

public class PokemonSyori {
	Scanner scanner = new Scanner(System.in);

	///////////　レベルアップの処理 /////////////////
	public int levelup(String string) {
		System.out.println("何レベルあげますか？");
		int a = scanner.nextInt(); //上げるレベルを入力
		int level = 1 + a; //上げるレベルの追加

		System.out.println(string + "のレベルが" + level + "に上がった");
		return level;
	}
	//////////////////////////////////////////////

	/////////　進化の処理　/////////////////////////
	public String shinka(int level, String name, int one, String onename, int two, String twoname) {

		if (level > one) {
			System.out.println("進化させますか？　[yes=1] or [no=2]: ");
			int yes = scanner.nextInt();
			if (yes == 1) {
				name = onename;
				System.out.println(onename + "に進化した");
			} else {
				System.out.println(name + "は進化しなかった");
			}

		} else if (level > two) {
			System.out.println("進化させますか？　[yes=1] or [no=2]: ");
			int yes = scanner.nextInt();
			if (yes == 1) {
				name = twoname;
				System.out.println(twoname + "に進化した");
			} else {
				System.out.println("進化させませんでした");
			}
		}
		return name;
	}
	//////////////////////////////////////////////

	////////　　ニックネームの変更処理 ///////////////

	public String changeName () {
		System.out.println("新しいニックネームを入力してください");
		String newName = scanner.next();
		System.out.println(newName + "に変更しました");
		return newName;
	}

	/////////////////////////////////////////////

	///////     現在のポケモンの表示処理　//////////

	public void joho(String name,String nickname,int level) {
		System.out.println("---------------------------");
		System.out.println("あなたのポケモンの情報");
		System.out.println("ポケモン名:" + name);
		System.out.println("ニックネーム:" + nickname);
		System.out.println("レベル:" +  level);
		System.out.println("---------------------------");
	}




}
