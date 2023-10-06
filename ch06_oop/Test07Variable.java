package ch06_oop;
//전역변수 : 메서드 밖에서 선언한 변수, 초기화o
//지역변수: 메서드 안에서 선언한 변수, 초기화x
//배열: 
//매개변수: 지역변수이다
public class Test07Variable {

	private String name;
	private double height;
	private int age;


	//생성자

	//사용자 정의 메서드
	public void setData(String name, int age, double height){
		this.name=name; 	//this.전역변수=매개변수 : 여러 메서드에서 사용 가능
		this.height=height; 
		this.age=age; 		

	}//setData

	//사용자 정의 메서드: 출력
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("나이: "+age);

		
		
	}//disp()


	public static void main(String args[]){
		
		Test07Variable t = new Test07Variable();//객체 생성
		t.setData("Snoop Dogg", 51, 193.0); // 상단에 선언한 메서드의 매개변수 순서대로 지정해줄 것
		t.disp();
		
		


	}//main

}//class
