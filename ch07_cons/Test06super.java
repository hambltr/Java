package ch07_cons;
class SuperTest{
	protected String title;//전역변수 = 필드= property= 속성
	protected int num;//변수


	public SuperTest(){} //디폴트 생성자

	//인자 있는 생성자 (매개변수)
	public SuperTest(String title,int num){
		this.title=title;
		this.num=num;
	}//cons_end

	//사용자 정의 메서드
	protected void disp(){
		System.out.println("superclass disp() has been called...");
		System.out.println("title: "+title);
		System.out.println("num: "+num+"\n");
	}//disp()_end

}//class_end=============================================

//파생클래스 = 하위클래스
class SubTest extends SuperTest{
	//생성자
	public SubTest(){
		super("abc",100);//상위 클래스 생성자 호출
	}//cons_end


	//오버라이딩: 상속받은 메서드 내용을 재정의 하는것
	public void disp(){
		System.out.println("파생클래스");
		System.out.println("title: "+title);
		System.out.println("num: "+num+"\n");
	}//disp()_end

}//class_end=============================================

public class Test06super {
	public static void main(String[] args){
		SuperTest s1=new SuperTest("bbb",300);//String,int타입의 매개변수
		s1.disp();
		//실행
		s1=new SubTest();//상위 클래스 변수로 하위 객체 처리
		s1.disp();
		
	}//main
}//class_end

