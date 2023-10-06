package ch02_dataType;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int a = scanner.nextInt(); // 사용자로부터 정수 입력 받음

		System.out.println("입력된 값: " + a);
		System.out.println("2진수: " + Integer.toBinaryString(a));
		System.out.println("8진수: " + Integer.toOctalString(a));
		System.out.println("16진수: " + Integer.toHexString(a));

		scanner.close();
	}
}


