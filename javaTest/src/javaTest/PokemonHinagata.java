package javaTest;

import java.util.Scanner;

public class PokemonHinagata {
	Scanner scanner = new Scanner(System.in);
	private int level = 1;
	private String name = "進化前の名前";
	private int shinkalimit1 = 30;
	private String shinkaname1 = "進化１後の名前";
	private int shinkalimit2 = 50;
	private String shinkaname2 = "進化2後の名前";

	private String nickname = "あああああ";
//	private int hp = 30;
//	private int atk = 1;
//	private int def = 1;

	PokemonHinagata(){
		System.out.println("どのポケモンが欲しいですか？");
		System.out.println("1:ヒトカゲ");
		System.out.println("2:フシギダネ");
		System.out.println("3:ゼニガメ");
		int syoki = scanner.nextInt();


		if(syoki == 1) {
			name = "ヒトカゲ";
			shinkalimit1 = 16;
			shinkaname1 ="リザード";
			shinkalimit2 = 36;
			shinkaname2 = "リザードン";
		}
		else if (syoki == 2) {
			name = "フシギダネ";
			shinkalimit1 = 16;
			shinkaname1 ="フシギソウ";
			shinkalimit2 = 32;
			shinkaname2 = "フシギバナ";
		}
		else if (syoki == 3 ) {
			name = "ゼニガメ";
			shinkalimit1 = 18;
			shinkaname1 ="カメール";
			shinkalimit2 = 38;
			shinkaname2 = "カメックス";
		}



		System.out.println("名前をつけてください");
		String nickname1 = scanner.next();
		nickname = nickname1;
		System.out.println(name + "に" + nickname + "と名付けた");

		}




//////////ゲッター、セッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}

    public void setLevel(int level){
        this.level = level;
    }


	public int getShinkalimit1() {
		return shinkalimit1;
	}
	public void setShinkalimit1(int shinkalimit1) {
		this.shinkalimit1 = shinkalimit1;
	}


	public String getShinkaname1() {
		return shinkaname1;
	}
	public void setShinkaname1(String shinkaname1) {
		this.shinkaname1 = shinkaname1;
	}


	public int getShinkalimit2() {
		return shinkalimit2;
	}


	public void setShinkalimit2(int shinkalimit2) {
		this.shinkalimit2 = shinkalimit2;
	}


	public String getShinkaname2() {
		return shinkaname2;
	}

	public void setShinkaname2(String shinkaname2) {
		this.shinkaname2 = shinkaname2;
	}

	public String getNickname() {
		return nickname;
	}


}
