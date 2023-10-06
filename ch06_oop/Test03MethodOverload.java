package ch06_oop;
//매개변수, 리턴값, 오버로드 실습
//오버로드 : 하나의 클래스 안에 동명이인 메서드가 여러개 있는 경우, 매개변수로 서로 다름을 구분함
//		: 그러므로 자료형이 다르거나 갯수가 달라야 함
public class Test03MethodOverload {
/*
	//사용자 정의 메서드
	public int add(int a, int b){
		int s=a+b;
		return s;
	}//add()_end

	//사용자 정의 메서드 : 매개변수 자료형이 달라야 함 *** double이 int 면  똑같은 매개변수라 오류뜸
	public double add(double a, double b){
		double s=a+b;
		return s;
	}//add()_end

*/

	//Test03Demo 에서 객체를 끌어와서 사용하는 코드- 이렇게도 가능함
	Test03MethodOverload t = new Test03MethodOverload();//객체 생성

	public static void main(String[] args) {


		Test03Demo t=new Test03Demo();
		int a=t.add(8, 7);
		double d=t.add(3.5, 7.7);
/*
		int a=t.add(7,5);
		double d=t.add(3.6, 7.7);

		System.out.println("a: "+a);// 값을 받아서 할당했다가 찍은거
		System.out.println("d: "+d);// 값을 받아서 할당했다가 찍은거

		System.out.println(t.add(10,7));//값을 지정해 주면서, 바로 찍은거

*/
		//다음과 같이 미리 add=덧셈임을 포장해서 필요할 때, 효율적으로 불러와서 쓰는 형식임
		//코드 시인성이 좋아짐

		System.out.println(a);
		System.out.println(d);

	}//main_end

}//class_end
