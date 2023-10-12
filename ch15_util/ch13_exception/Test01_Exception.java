package ch13_exception;

public class Test01_Exception {
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt(args[0]);
			if(num%2==0){
			//if(num%0==0){
				System.out.println(num+" 은/는 짝수입니다.");
			}else{
				System.out.println(num+" 은/는 홀수입니다.");
			}
						
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("배열예외: "+e1);
		}catch(NullPointerException e2){
			System.out.println("숫자예외: "+e2);
		}catch(ArithmeticException e3){
			System.out.println("연산에러: "+e3);
		}finally{
			System.out.println("finally절: 예외 발생과 상관 없이 무조건 실행");
		}
	}//main
}//class
//1. 실행: 배열값을 넣지 않고 실행
//   배열예외: ArrayIndexOutOfBoundsException 발생

//2. 100 입력하고 실행: 정상처리

//3. a 입력하고 실행:  예외 발생
//	  배열예외: NumberFormatException 발생

//4. 100 입력하고, if(num%0==0) 바꾸어 실습\
//	  배열예외: NumberFormatException 발생





