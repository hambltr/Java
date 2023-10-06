package ch07_cons;

class Grade{
	private String name;//전역변수, 자동초기화
	private int kor;

	//디폴트 생성자
	public Grade(){
		System.out.println("디폴트 생성자");
		name=" ";//null
		kor=0;
	}

	//매개변수가 있는 생성자
	public Grade(String name, int kor){
		this.name=name;
		this.kor=kor;
	}

	//사용자 정의 메서드
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+kor);
		System.out.println();//개행

	}//disp_end

}//class_Grade

public class Test02 {

	public static void main(String[] args) {

		Grade a=new Grade();//객체생성, 생성자호출
		a.disp();
		//실행
		Grade kim=new Grade("김연아",90); //객체생성, 매개변수가 있는 생성자 호출
		Grade lee=new Grade("이명박",80);
		Grade iu=new Grade("아이유",85);
		
		kim.disp(); //객체.메서드(); 메서드가 호출된다
		lee.disp();
		iu.disp();
		
	}//main


}//class