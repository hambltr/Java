package ch08_class;

class PersonSuper{
	protected String name; //전역변수 = 필드
	
	public PersonSuper(){}//디폴트 생성자
	
	//인자 있는 생성자 (매개변수)
	public PersonSuper(String name){
		this.name=name;
	}
	
	//사용자 정의 메서드
	protected void disp(){
		System.out.println("이름: " + name);
	}
	
}//class_end==============================================



class PersonSub extends PersonSuper{
	private double left_eye;//좌안시
	private double right_eye;//우안시
	
	public PersonSub(){}//디폴트 생성자
	
	//인자 있는 생성자(매개변수)
	public PersonSub(String name,double left_eye, double right_eye){
		super(name);//상위클래스 생성자 호출
		this.left_eye=left_eye;
		this.right_eye=right_eye;
	}//cons_end
	
	//메서드 오버라이딩: 상속 받은 메서드 내용 재정의
	public void disp(){
		System.out.println(); //개행
		System.out.println("이름: "+name);
		System.out.println("좌안시: "+left_eye);
		System.out.println("우안시: "+right_eye);
	}//disp()_end

}//class_end==============================================


class PersonSin extends PersonSuper{
	private String addr;//주소
	private String tel;//전화
	
	public PersonSin(){}//디폴트 생성자
	
	//인자 있는 생성자(매개변수)
	public PersonSin(String name, String tel, String addr){
		super(name);//상위 클래스 생성자 호출
		this.addr=addr;
		this.tel=tel;
	}//cons_end
	
	//메서드 오버라이딩
	public void disp(){
		System.out.println(); //개행
		System.out.println("이름: "+name);
		System.out.println("전화: "+tel);
		System.out.println("주소: "+addr);
	}
	
}//class_end==============================================

public class Test05extends {
	public static void main(String[] args) {

		PersonSub sub=new PersonSub("aaa",1.2,1.5);
		sub.disp();
		//실행
		
		PersonSin sin=new PersonSin("acdc","010-4444-4444", "sgdlkjkgsd 205호");
		sin.disp();
		//실행
		
	}//main_end
}//class_end==============================================
