package ch03_operation;

public class Test05 {
	public static void main(String[] args) {
		//shift����
		int a=7;    // 00000000 00000000 00000000 00000111
		int b=a<<2; // 00000000 00000000 00000000 00011100
		// 2��ŭ �������� shift ����
		
		System.out.println("(a<<2) b: "+b);
		
		int c=a>>2; // 00000000 00000000 00000000 00000001 -> a�� ����̹Ƿ� ���ʿ� 0�� ����, if. ���� �ΰ�� 1�� ����
		// 2��ŭ �������� shift ����
		
		System.out.println("(a>>2) c: "+c);
		
		
	}//main-end
}//class-end
