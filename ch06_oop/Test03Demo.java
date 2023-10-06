package ch06_oop;

public class Test03Demo {
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
}//class_end

//저장만 하기
//Test03MethodOverload에서 끌어다 쓰기 가능