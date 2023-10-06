package ch03_operation;

public class Test02 {
	public static void main(String[] args) {
		
		int a=5, b=3; //단순 연산 예제
		System.out.println("a+b: "+(a+b));
		System.out.println("a-b: "+(a-b));
		System.out.println("a*b: "+(a*b));
		System.out.println("a/b: "+(a/b));
		System.out.println("a%b: "+(a%b));	
		System.out.println(); //개행
		
		System.out.println("게시판 페이지 수 구하기"); 
		int totalCount=37;
		int pageCount=(totalCount/10)+(totalCount%10==0?0:1);
		//						3	 +	 1
		//totalCount 가 10으로 나누었을때 나머지 값이 0인가? True >> 0 , False >> 1
		
		System.out.println("Page: "+pageCount);
		
	}//main-end

}//class-end
