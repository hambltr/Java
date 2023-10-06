package ch09_interface_abs;
//인터페이스 실습
interface AA2{
	public int aa();//메서드 선언
}

interface BB2{
	public char bb();//메서드 선언
}

interface CC2{
	public String cc();//메서드 선언
}

//클래스에서 인터페이스를 상속받아 오버라이딩

class DD2 implements AA2,BB2,CC2{

	//오버라이딩: 상속받은 메서드 내용 재정의
	@Override
	public int aa() {
		return 0;
	}

	@Override
	public char bb() {
		return 'A';
	}

	@Override
	public String cc() {
		return "qwert";
	}
	
	
}//class-end

public class Test02interface {
	public static void main(String[] args) {
		
		DD2 test=new DD2();
		
		int a=test.aa();
		char ch=test.bb();
		String str=test.cc();
		
		System.out.println("a: "+a);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
		
				
	}//main-end
}//class-end
