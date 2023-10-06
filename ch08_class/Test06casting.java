package ch08_class;
//class_캐스팅 예제

class Super1{
	//사용자 정의 메서드
	public void disp(){
		System.out.println("super1.disp()");
	}
	
}//class_end===============================================


//파생클래스
class Sub1 extends Super1{
	//오버라이딩
	public void disp(){
		System.out.println("Sub1.disp()");
	}

	
	//사용자 정의 메서드
	public void kk (){
		System.out.println("Sub1.kk()");
	}
	
}//class_end===============================================

public class Test06casting {

	public static void main(String[] args) {
		
		Super1 super1=new Super1();//객체 생성, 생성자 호출
		super1.disp();
		//실행
		
		//상위 클래스 변수로 하위 객체 처리 double d=100;
		// upcasting
		
		super1=new Sub1(); //객체생성, 생성자 호출
		super1.disp();
		//실행
		
		((Sub1)super1).kk(); // cf: int a=(int)12.5;
		
		
	}//main
	
}//class_end===============================================
