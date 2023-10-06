package ch06_oop;
//static 메서드는 static으로 선언된 변수, 메서드만 사용(호출)할 수 있다.
//static 메서드에서는 this 를 사용하지 못함
//static 이라는 클래스에 소속되어 있기 때문에 this 사용 불가
//this는 자신의 클래스 객체를 의미한다

//static 메서드와 변수는 객체생성을 하지 않고도 사용 가능하다.
//클래스이름.메서드();
//Math.PI; :pi값: 3.141592...
//Math.abs(-77); :절댓값

public class Test08staticVariable {
	
	static int b=100;
	public static void bb(){
		System.out.println("bb() has been called...");
	}//bb()
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-77));
		System.out.println(Math.PI);

		//System.out.println("this.b: "+this.b);
		//       이렇게 사용 불가, static / this x
		
		System.out.println("b: "+b);
		bb();//메서드 호출
		//static에서는 걍 쓰면 됨
		
	}//main
	
	
	
}//class_end
