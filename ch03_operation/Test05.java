package ch03_operation;

public class Test05 {
	public static void main(String[] args) {
		//shift연산
		int a=7;    // 00000000 00000000 00000000 00000111
		int b=a<<2; // 00000000 00000000 00000000 00011100
		// 2만큼 좌측으로 shift 연산
		
		System.out.println("(a<<2) b: "+b);
		
		int c=a>>2; // 00000000 00000000 00000000 00000001 -> a가 양수이므로 왼쪽에 0이 붙음, if. 음수 인경우 1이 붙음
		// 2만큼 우측으로 shift 연산
		
		System.out.println("(a>>2) c: "+c);
		
		
	}//main-end
}//class-end
