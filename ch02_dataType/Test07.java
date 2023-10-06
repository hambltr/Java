package ch02_dataType;

public class Test07 {
	public static void main(String args[]){
		Test07 test07=new Test07(); //객체 생성
		test07.aa();//객체.메서드 호출
		int a = test07.bb();//객체.메서드 호출
		System.out.println("a 값: "+a);
		
	}//main-end
	
	public void aa(){
		System.out.println("aa는 () 입니다.");
		//void는 해당 메서드가  어떤 값도 반환하지 않는다. 그래서 호출 해서 처리해줘야 한다.
		//void를 사용하면 return은 사용하지 않는다.
		
	}//void-aa-end
	
	public int bb(){
		System.out.println("bb() 메서드를 실행 하였습니다.");
		return 200; //return 값을 지정해 주면 오류가 나지 않는다.
		//int 정수형에서 return을 사용해서 상위 test.bb()로 값을 반환해주었다.
		
	}//int-bb-end
	
}//class-end
