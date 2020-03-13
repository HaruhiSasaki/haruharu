package javaTest;

import java.util.Scanner;

public class Toi10Sub {

	private int year = 2010;
	private int nenrei = 30;
	private int umare = 1989;

	Scanner scanner = new Scanner(System.in);

	public void age(int umare) {
		System.out.println("調べたい年を西暦で入力してください");
		year = scanner.nextInt(); //調べたい年を入力
		nenrei = year - umare;
		System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
	
	}

	public void seireki(int umare) {
		System.out.println("調べたい年齢を入力してください");
		nenrei = scanner.nextInt(); //調べたい年齢を入力
		year = nenrei + umare;
		System.out.println("あなたが" + nenrei + "歳の時は西暦は" + year + "年です");
	}
	//		scanner.close();



	public int getUmare() {
		return umare;
	}

	public void setUmare(int umare) {
		this.umare = umare;
	}

	public int getNenrei() {
		return nenrei;
	}

	public void setNenrei(int nenrei) {
		this.nenrei = nenrei;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
