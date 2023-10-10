package ch15_util;
//Object 클래스 실습

class Demo{

}//class-end

public class Test09_Object {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		
		//객체의 클래스 이름 구하기
		System.out.println("d1객체의 클래스: "+d1.getClass());
		System.out.println("d2객체의 클래스: "+d2.getClass());
		System.out.println("d3객체의 클래스: "+d3.getClass());
		
		System.out.println();
		
		Test09_Object a1 = new Test09_Object();
		Test09_Object a2 = new Test09_Object();
		Test09_Object a3 = new Test09_Object();
		
		System.out.println("a1객체의 클래스: "+a1.getClass());
		System.out.println("a2객체의 클래스: "+a1.getClass());
		System.out.println("a3객체의 클래스: "+a1.getClass());
		
		System.out.println();
		
		//각 객체의 해쉬코드 구하기 , 컴퓨터는 해쉬코드로 객체를 관리한다.
		System.out.println("d1 객체의 해쉬코드: "+d1.hashCode());
		System.out.println("d2 객체의 해쉬코드: "+d2.hashCode());
		System.out.println("d3 객체의 해쉬코드: "+d3.hashCode());
		
		
		System.out.println();
		
		//객체 문자열 출력하기: 16진수로 표기함
		System.out.println("d1객체 문자열: "+d1.toString());
		System.out.println("d2객체 문자열: "+d2.toString());
		System.out.println("d3객체 문자열: "+d3.toString());
		
	}//main-end
}//class-end
