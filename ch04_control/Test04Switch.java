package ch04_control;
import java.util.Scanner;
public class Test04Switch {

	public static void main(String[] args) {
		//어떤 수를 입력 받아서 짝수인지 홀수인지 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.print("임의의 수를 입력하시오. >> ");
		int num = scan.nextInt();//nextInt(); :: 입력받은 int 를 사용할 수 있게 해주는 메서드
								 //객체. 메서드()
		
		switch(num%2){
		case 0:
			System.out.println(num+" 은/는 짝수입니다.");
			break;
		case 1:
			System.out.println(num+" 은/는 홀수입니다.");
			break;
			
		}//switch-case-end	
		
	}//main-end

}//class-end
