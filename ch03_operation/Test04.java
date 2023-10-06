package ch03_operation;
//bit 연산 (2진수 연산)
public class Test04 {

	public static void main(String[] args) {
		
		int a=10; // 00000000 00000000 00000000 00001010
		int b=7;  // 00000000 00000000 00000000 00000111
			    // &:00000000 00000000 00000000 00000010
		
		System.out.println("a&b: "+(a&b)); //2
				// |:00000000 00000000 00000000 00001111
		
		System.out.println("a|b: "+(a|b)); //2
		
	}//main-end
}//class-end
