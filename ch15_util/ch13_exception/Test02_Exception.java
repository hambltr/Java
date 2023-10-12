package ch13_exception;

public class Test02_Exception {
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt(args[0]);
			//if(num%2==0){
			if(num%0==0){
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