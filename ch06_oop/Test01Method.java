package ch06_oop;
/*
 * 메서드 형식
 * 접근제한자: [static] 생략 가능 , 리턴형 메서드이름(매개변수,,,){처리내용}
 * public void aa(){처리내용;}
 * public int bb(){ return 100;}
 */
public class Test01Method {
	//사용자 정의 메서드
	public static void aa(){
		System.out.println("aa() has been called...");
		System.out.println("Monday");
		
	}//aa()-end
	
	public static void main(String args[]){	
		//aa(); // 메서드 호출 불가 - static 메서드는 static으로 선언된 메서드만 호출할 수 있다.
		//단 객체를 생성해서 선언하는 경우엔 사용 가능
		
		Test01Method t=new Test01Method(); // 객체 생성
		t.aa();//객체.메서드();
		
		
		
	}//main-end
}//class-end
