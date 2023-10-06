package ch03_operation;

public class Test01 {
	public static void main(String args[]){

		int a=5;

		System.out.println(++a); //6
		System.out.println(a++); //6 : 선 출력, 후 연산 : 출력 값에 영향x
		System.out.println(a);   //7
		//
		a=5;//변수의 재사용  -> 변수값 초기화 안해주면 위에서 증가한 값으로 계속 연산함
		int b = ++a + a++; //복합연산
		System.out.println("a: "+a);//7
		System.out.println("b: "+b);//12
		//
		a=5; //변수의 재사용  -> 변수값 초기화 안해주면 위에서 증가한 값으로 계속 연산함
		b=++a + ++a;
		System.out.println(a); 
		System.out.println(b); 
		//
		for(int i=1; i<=10; i++){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		for(int i=1; i<=10; ++i){
			System.out.print(i+" ");
		}
		
	}//main-end

}//class-end

