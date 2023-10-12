package ch15_util;


public class Test10_String {
	public static void main(String[] args) {

		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2); //true 값 반환
		
		//========================================
		
		String s3="Hello";
		String s4="hello";
		System.out.println(s3==s4); //false 값 반환
		
		String s5=new String("hello");
		String s6=new String("hello");
		System.out.println(s5==s6); //false 값 반환

		
		System.out.println(s5.equals(s6)); //true 값 반환 : s5 s6 문자열은 같기 때문에 true
		
		System.out.println(s5.toString().equals(s6.toString()));
		//생략된 표현 : (s5.toString().equals(s6.toString())) = (s5.equals(s6))
	}
}
