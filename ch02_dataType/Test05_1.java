package ch02_dataType;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���: ");
		int a = scanner.nextInt(); // ����ڷκ��� ���� �Է� ����

		System.out.println("�Էµ� ��: " + a);
		System.out.println("2����: " + Integer.toBinaryString(a));
		System.out.println("8����: " + Integer.toOctalString(a));
		System.out.println("16����: " + Integer.toHexString(a));

		scanner.close();
	}
}


