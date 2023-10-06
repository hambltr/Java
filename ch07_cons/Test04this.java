package ch07_cons;
//this(): 자신의 클래스 안의 생성자 호출

class Cons{
	String title;
	int num;

	//디폴트 생성자
	public Cons(){}

	//매개변수가 있는 생성자
	public Cons(String title){
		//System.out.println("자신의 클래스 내부의 생성자 호출"); <-이거 주석 지우면 에러남
		this(title,100);//자신의 클래스 내부의 생성자 호출 
		//**"꼭 첫줄에 기재할 것"**
	}//cons_end

	//매개변수가 있는 생성자
	public Cons(String title, int num) {
		this.title=title;
		this.num=num;
	}//cons_end

	//사용자 정의 메서드
	public void disp(){
		System.out.println("title: "+ title);
		System.out.println("num: "+ num+"\n");
	}//disp_end
}//class_end=======================================================



public class Test04this {
	public static void main(String[] args) {
		Cons c1=new Cons("연습1");//객체생성, 생성자 호출

		c1.disp();//객체.메서드(); ,,, 메서드 호출

		Cons c2=new Cons("연습2",200);//객체생성, 생성자 호출

		c2.disp();//객체.메서드(); ,,, 메서드 호출

	}//main_end
}//class_end
