package ch05_array;

public class Test01Array {
	public static void main(String[] args) {
		//변수 사용
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);

		System.out.println();

		//배열  
		int d[]={40,50,60};
		System.out.println("d 배열 요소 갯수: "+d.length);
	/*	
		System.out.println();
		
		System.out.println("d[0]: "+d[0]);
		System.out.println("d[1]: "+d[1]);
	 	System.out.println("d[2]: "+d[2]);
	*/	//출력문 :: 이지랄 안함 코드 더러워짐
		
		System.out.println();
		
		System.out.println("for문");
		//for문 사용하여 출력 : 주로 이렇게 많이 씀
		//값 변동이 있는 i 값에 조건을 걸어서 원하는 배열값 출력 ('i>=3', 'i<=3','i==3' 부호 사용 금지)
		for(int i=0; i<3; i++){//i=0,1,2 의 값을 가짐
			System.out.println("d["+i+"]: "+d[i]);
			//d배열의 0번쨰, 1번째, 2번째 값을 호출함
			
		}//for
	}//main
}//class
