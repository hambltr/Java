package ch07_cons;
//생성자 = 클래스 이름
//생성자 = 리턴형 없음, 객체(필드) 초기화가 목적이다
//생성자 = 매개변수를 갖는다. 오버로드가 가능하다 (중복o)
//객체 생성시 호출된다. 

class Demo{
	public Demo(){ //default 생성자
		System.out.println("default cons has been called... ");
	}//cons_Demo



	public Demo(String name){ //매개변수 생성자
		System.out.println("매개변수 있는 생성자 호출됨... ");
	}//cons_Demo

}//class_Demo

public class Test01 {

	public static void main(String[] args) {
		new Demo();//객체생성, 생성자 호출
		new Demo("aaa");
	}//main

}//class_Test01
