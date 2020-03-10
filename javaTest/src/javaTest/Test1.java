package javaTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("a+bは" + c + "です");
		c = c + 1;
		System.out.println("c＋1は" + c + "です");

		scan.close();
	}
}
