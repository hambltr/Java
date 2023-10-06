package ch05_array;
//전역변수는 자동으로 초기화 , 메서드 밖에서 선언
//지역변수는 자동으로 초기화 되지 않음, 메서드 안에서 선언
//배열은 지역에서 선언해도 자동으로 초기화 

//static 메서드는 static으로 선언된 변수, 메서드만 사용 또는 호출 할 수 있다
public class Test02Array {
	static int max; //전역변수 : 자동으로 초기화
	
	public static void aa(){
		System.out.println("aa() 입니다. ");
	}//aa()

	public static void main(String args[]){
		System.out.println(max);
		aa();//메서드 호출
		
		//배열은 지역일지라도 자동으로 초기화 됨
		int a[]=new int[3]; //배열선언, 배열생성
		for(int i=0; i<a.length; i++){
			System.out.println("a["+i+"]: "+(a[i]));
		}//for
	}//main
}//class
