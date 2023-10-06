package ch06_oop;
//변수
//전역변수: 메서드 밖에서 선언된 변수, 자동으로 초기화 된다.
//지역변수: 메서드 안에서 선언된 변수, 자동으로 초기화 되지 않음.
//배열은 지역변수 일지라도 자동으로 초기화 된다.
//static 메서드는 static으로 선언된 변수와 메서드만 사용(호출) 할 수 있다.

public class Test06Variable {
	static int b;
	//전역변수 선언 : 하단 static 때문에 여기에도 static을 붙혀줘야 쓸 수 있음, 자동 초기화
	
	static public void aa(){
		System.out.println("aa() Method has heen called...");
	}//aa()
	
	public static void main(String args[]){
		
		System.out.println("b:" +b);// 상단 전역변수에 static 안붙히면 에러남
		aa();
		
	}//main_end
}//class_end
