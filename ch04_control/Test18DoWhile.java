package ch04_control;
//do~while 실습 :: 근데 do while 잘안씀 걍 while문 많이쓰지
public class Test18DoWhile {
	public static void main(String args[]){
		//"금요일" 5번 출력


		int i=1;
		do{
			System.out.println(i+"금요일");
			i++;
		}while(i<=5);
		System.out.println();
		//---------------------------------------

		i=1;
		do{
			System.out.println(i+" y'all name");
			i++;
		}while(i<=10);
		System.out.println();

		System.out.println();


		//---------------------------------------
		System.out.println();
		//문제: 1~20까지 짝수만 출력
		// i 변수 재사용
		i=1;
		do{
			if (i%2==0){
				System.out.print(i+" ");
			}//if	
			i++;
		}while(i<=20);

	}//main
}//class
