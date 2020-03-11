package javaTest;

import java.util.Scanner;

public class PokemonPoppo {
	Scanner scanner = new Scanner(System.in);

	int level = 1;
	String name = "ポッポ";

	public int levelup(int a) {
		level = level + a;
		System.out.println(name + "のレベルが" + level + "に上がった");
		return level;
	}

	public String shinka(int level) {
		if (level < 10) {
			name = "pop";
		} else if (level < 20) {
			System.out.println("進化させますか？　[yes=1] or [no=2]: ");
			int yes = scanner.nextInt();
			if (yes == 1) {
				name = "ピジョン";
				System.out.println("ピジョンに進化した");
			} else {
				System.out.println("ポッポは進化しなかった");
			}

		} else {
			System.out.println("進化させますか？　[yes=1] or [no=2]: ");
			int yes = scanner.nextInt();
			if (yes == 1) {
				name = "ピジョット";
				System.out.println("ピジョットに進化した");
			} else {
				System.out.println("進化しなかった");
			}
		}
		return name;
	}

	public void skill() {

	}

}
