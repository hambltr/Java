package ch02_dataType;

public class Test04Casting {
	public static void main(String args[]){
		//할당시 : 왼쪽이 오른쪽 자료형보다 클때 자동으로 형변환
		double a = 100; // 대입되면서 double형으로 변환
		System.out.println(a);

		//연신 시, 자료형이 큰쪽으로 변환
		System.out.println(10+12.5);//double형으로 변환

		int intValue = 10;       // 정수형 변수
		double doubleValue = intValue; // 정수형을 부동 소수점으로 자동 형변환
		System.out.println(doubleValue);

		//강제형변환 
		//int a=12.5;

		int b=(int)12.5;
		System.out.println("b: "+b);
		
		
		//**항상 데이터는 자료형보다 커야함**
		
		char ch=(char)65;
		char ch2=(char)65.7;
		System.out.println("ch: " +ch);
		System.out.println("ch2: "+ch2);

/*		변수의 상수화
		- 변수를 상수로 변환 해주는 것
		- 프로그램 내에서 값 변경 불가능 
*/
		final int MAX=100;
		//MAX=500;//에러, 값 변경 불가
		System.out.println("MAX: "+MAX);
		
	}//main-end
}//class-end
