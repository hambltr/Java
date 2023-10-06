package ch02_dataType;
/*	
 	자료형
	변수
	상수=값=데이터 
*/
public class Test03 {
	public static void main(String args[]){
		
		//자료형 변수 = 값
		int b1; //변수 선언
		b1 = 127; //값 할당
		Short s1 = 32767;
		int i1 = 2147483647;//default
		long l1 = 200L;
		
		float f1 = 12.6f;//float에는 숫자 끝에 f를 붙혀줘야 한다.
		double d1 = 12.6;//double은 디폴트 값이기 때문에 d를 붙힐 필요는 없다. 근데 써도됨
		
		String name = "비둘기";
		String name2 = new String("닭둘기");//이렇게도 사용 가능
		String name3 = "참새";//일반적으로 문자열 리터럴을 사용하는 방법이 더 효율적이며 권장됩니다.
		
		
		//출력
		System.out.println("b1: "+b1);
		System.out.println("=============");
		
		System.out.println("s1: "+s1);
		System.out.println("=============");
		
		System.out.println("i1: "+i1);
		System.out.println("=============");
	
		System.out.println("l1: "+l1);
		System.out.println("=============");
	
		System.out.println("f1: "+f1);
		System.out.println("=============");
		
		System.out.println("d1: "+d1);
		System.out.println("=============");

		System.out.println("name: "+name);
		System.out.println("=============");

		System.out.println("name2: "+name2);
		System.out.println("=============");
		
		System.out.println("name3: "+name3);
		System.out.println("=============");
		
	}//main-end
}//class-end
