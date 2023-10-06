package ch04_control;

public class Test17while {
	public static void main(String args[]){
		/*
		초기값;
		while(조건){
		처리;
		층감치;
		}
		 */

		//"금요일"  5회 출력                                  
		//for(int i=1; i<=5; i++){ } 지금은 for문처럼 쓰면 됨
		int i=1;		//초기값
		while(i<=5){	//조건
			System.out.println("금요일");
			i++; 		//증감치
		}//while 

		System.out.println();//ㄱㅎ

		i=1; //for문 처럼 재 선언 하지 않고 재사용하면 메모리 절약 ㄱㄴ
		while(i<=10){
			System.out.println(i+"이름");
			i++;
		}//while

		System.out.println();//ㄱㅎ

		//1~10 출력해보슈
		i=1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while

		System.out.println();//ㄱㅎ

		//1~20 짝수만 출력해보슈

		i=1;
		while(i<=20){
			if(i%2==0){
				System.out.print(i+" ");
			}//if
			i++;
		}//while

		System.out.println();//ㄱㅎ

		//1~10까지 다 더하슈

		i=1;
		int sum=0; //더한 값을 저장할 변수 선언
		while(i<=10){
			sum+=i;
			i++;
		}//while

		System.out.print(sum);

		//1~20까지 짝수만 더하슈

		i=1;
		sum=0;
		while(i<=20){
			if(i%2==0){
				sum += i;
			}//if
			i++;
		}//while
		System.out.println();//ㄱㅎ
		System.out.println(sum);


	}//main



}//main


