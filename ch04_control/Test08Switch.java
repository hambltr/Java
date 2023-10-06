package ch04_control;
import java.util.Scanner;
//성적처리
public class Test08Switch {
	public static void main(String[] args) {

		char grade=' '; //변수선언, 초기화
		Scanner scan=new Scanner(System.in);

		System.out.println("점수를 입력하세요 :");
		int score=scan.nextInt();


		if (score>100 || score<0){
			System.out.println("에러");

		}else{ 
			switch(score/10){
			case 9:
			case 10:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';

			//상위 case 식은 몫 연산으로 case9: = 90~99점, case8:= 89~80점을 구현한 것이다.
				
			}//switch-end
			System.out.println("점수: "+score+" 학점: "+grade);
		}//else-end

	}//class-end
}//main-end
//90A 80B 70C 60D F