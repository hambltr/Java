package ch03_operation;

public class Test07 {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.equals("hello")); //false
		System.out.println(str.equals("Hello")); //true
		System.out.println(str.equalsIgnoreCase("hello")); //true
		
		System.out.println("-------------------");
		
	/*
		instanceof 실습
	*/
		
		String str2=new String("abc");//객체생성
		Object obj=new Object();//객체생성, >> Object는 자바 내 최상위 클래스
		System.out.println(str2 instanceof String);//true
		System.out.println(str2 instanceof Object);//true : 클래스가 상위라면 true
		System.out.println(obj instanceof Object);//true
		System.out.println(obj instanceof String);//false : 클래스가 하위라면 false
		
	}//main-end
}//class-end
