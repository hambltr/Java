package ch06_oop;
//메서드.리턴값 받기
public class Test02Method {
	public int aa(){
		System.out.println("aa() has been called...");
		return 100;
	}//aa()-end

	public double bb(){
		System.out.println("bb() has been called...");
		return 12.5;
	}//bb()-end

	public String cc(){
		System.out.println("cc() has been called...");
		return "홍길동";
	}//cc()-end

	public static void main(String args[]){
		
		Test02Method t = new Test02Method(); //객체생성  -> 생성자 호출 , (메모리 할당)
		
		int a=t.aa();
		double d=t.bb();
		String s=t.cc();
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		
		// 자료형과 맞게, 객체 생성한 객체.메서드();
		// 흐름만 알아도 절반 이상은 간다

	}//main

}//class-end
