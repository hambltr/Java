package ch15_util;
//Wrapper class: 기본 자료형 클래스

public class Test01_Wrapperclass {

	public static void main(String[] args){
		
		int a=10; // 기본자료형 :: stack메모리에 할당
		Integer a2 = new Integer(a);//객체 생성 :: heap영역에 메모리 할당
		Integer a3 = new Integer(100);//객체 생성
		
		//---------------------------------
		
		//AutoBoxing
		int x=10; //stack메모리에 할당
		Integer x2=x; //stack에서 heap 영역으로 저장
		
		//UnBoxing
		Integer y = new Integer(200);// heap에 메모리 할당
		int y2=y;
		
		double d = 12.5;
		Double d2 = new Double(d);
		Double d3 = new Double (45.5);
		
		//toString()은 Object를 제공하는 메서드이다
		//toString(): 객체를 문자열로 변환할 때 사용한다.
		
		System.out.println("a: "+a);
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a2);//이렇게도 가능한데 걍 toString 붙히슈
		System.out.println(a3);
		
		System.out.println();
		
		System.out.println("d: "+d);
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
	}//main

}//class
