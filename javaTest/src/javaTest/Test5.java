package javaTest;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		int a = scanner.nextInt(); //を入力
		int b = 5;
		int count = 0;
		for (; a < b;) {
			a++;
			count++;
		}
		System.out.println("aの値は" + a + "です");
		System.out.println("繰り返した回数は" + count + "です");
		scanner.close();

	}

}
