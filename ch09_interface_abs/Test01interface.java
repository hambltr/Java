package ch09_interface_abs;
//인터페이스 실습

interface AA{
	int MAX =100; //== static final int MAX=100;
	//값 변경 불가
	public void aa();
	public void bb();

}//interface-end

class AAA implements AA{

	//오버라이딩
	public void aa(){
		//MAX =100; -> 해당 값 변경 불가
		System.out.println("MAX: "+MAX);
		System.out.println("aa() has been called...");
	}//aa()
	
	public void bb(){
		System.out.println("bb() has been called...");	
	}//bb()
	
}//class-end

public class Test01interface {
	public static void main(String[] args) {
		AA test=new AAA();//상위 클래스 변수로 하위 객체 처리
		test.aa();
		test.bb();


	}//main-end
}//class-end
