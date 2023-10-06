package ch09_interface_abs;
//추상클래스 실습
abstract class Abs{
	abstract public void aa();//추상메서드

	public void bb(){ //일반 메서드
		System.out.println("추상 클래스 안에 있는 일반 메서드 입니다.");
	}


}//class-end

class AbsTest extends Abs{
	//오버라이딩
	public void aa(){
		System.out.println("오버라이딩 된 추상 메서드 입니다.");
	}
	
	
}//class-end

public class Test03abs {
	public static void main(String[] args) {
		AbsTest test=new AbsTest();//객체생성, 생성자 호출
		test.aa(); // 오버라이딩 : 추상메서드
		test.bb(); // 일반 메서드



	}//main-end
}//class-end
