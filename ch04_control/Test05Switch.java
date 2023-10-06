package ch04_control;
import java.util.Scanner;
public class Test05Switch {
	public static void main(String args[]){
		//달(month) 을 입력받아서 그 달의 일 수를 구하시오.
		
		int days=0;//초기값, 지역변수는 초기화 해 주어야 한다.
		Scanner scan=new Scanner(System.in);
		System.out.println("몇 월인지 입력하세요 : ");
		
		int month=scan.nextInt();;//1월~ 12월, 객체.메서드() << 선언과 동시에 자동으로 month를 입력 받은 값으로 초기화
		
		if(month>12 || month<1 ){ //잘못 된 월 입력
			System.out.println("다시 입력하세요.");
			
		}else{
			switch(month){
			case 1: case 3:
			case 5: case 7:
			case 8: case 10:
			case 12: 
				days=31;
				break;
			case 2:
				days=28;
				break;
			case 4: case 6:
			case 9: case 11:
				days=30;
				break;
			}//switch-end
			System.out.println(month+"월은 "+days+"일 까지 있는 달 입니다.");
			//출력단은 꼭 반복문 블럭 밖에서 찍도록 하자.
		}
		
	}
}
