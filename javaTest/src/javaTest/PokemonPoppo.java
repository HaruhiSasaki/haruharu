package javaTest;

import java.util.Scanner;

public class PokemonPoppo {
	Scanner scanner = new Scanner(System.in);
	Pokemonmoto Pop = new Pokemonmoto();

	String name = "ポッポ";

	public int levelup(int a) {
		Pop.setLevel(3);
		int level = Pop.getLevel() + a;
		System.out.println(name + "のレベルが" + level + "に上がった");
		return level;
	}

	public String shinka(int level) {
		if (level < 10) {
			name = "ポッポ";
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
