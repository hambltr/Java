package ch01;
	//test08: 저장 이름

/*
	자바 프로그램은 여러개의 클래스로 구성된다
	저장 이름은 주 클래스 이름으로 저장해야 합니다.
	주 클래스는 main()이 소속된 클래스 입니다.
	주 클래스에만 public 접근제한자를 쓸 수 있다.

	패키지는 모두 소문자
	클래스의 첫글자는 대문자
	매서드의 첫글자는 소문자, 뒤쪽에 괄호() 
		System(클래스).out(클래스 변수 =객체).println();
	변수의 첫글자는 소문자


*/

//Test08 : 저장 이름
public class Test08{
	public static void main(String args[]){
		Demo demo = new Demo();//객체 생성
		demo.aa();//객체.메서드(); >> 메서드 호출
	}//main-end
}//class-end


class Demo{
	public void aa(){
		System.out.println("이것은 Demo.aa() 메서드 입니다.");
	}
}