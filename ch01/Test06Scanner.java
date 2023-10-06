package ch01;

import java.util.Scanner;//데이터 입력 받는 클래스

public class Test06Scanner {
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);//객체생성
		
		System.out.print("정수를 입력하세요 :");//메세지 출력단
		int a=scan.nextInt();//정수를 입력 받아서 a에 할당
		
		System.out.print("실수를 입력하세요 :");
		double d=scan.nextDouble();//실수를 입력 받아서 d에 할당
		
		System.out.print("문자열을 입력하세요 :");
		String str=scan.next();//문자열을 입력받아 str에 할당, str은 임의로 만든 함수임
		
		//출력
		System.out.println("출력값");
		System.out.println("정수 출력 :"+a);
		System.out.println("정수 출력 :"+d);
		System.out.println("문자열 출력 :"+str);
		
		//System.out.printf() : format(형식) 을 사용하여 출력
		System.out.printf("a값: %d\n",a);//%d : 10진수 형식으로 정수를 출력
		System.out.printf("d값: %f\n",d);//%f : 실수를 출력
		System.out.printf("str값: %s\n",str);//%s : 문자열을 출력		
		
/*			
  			printf는 형식화된 출력이 필요한 경우에 사용됩니다. 
			ex)소수점 이하 자릿수를 제한하거나 특정 형식에 따라 출력을 다루고 싶을 때 유용합니다. 
		
 			%d, %f, %s와 같은 형식 지정자는 자바에서 
   			printf 메서드와 함께 사용하여 출력을 형식화하는 데 사용됩니다.
   		 
   			%d (정수 형식 지정자):정수를 출력할 때 사용됩니다.
 			%f (부동 소수점 형식 지정자):부동 소수점 숫자 (실수)를 출력할 때 사용됩니다.
 			%s (문자열 형식 지정자):문자열을 출력할 때 사용됩니다.
 		 
 		 
 
		 
			println은 일반적으로 개행이 필요한 경우에 사용됩니다. 
			ex)여러 줄의 텍스트를 출력하거나 줄 바꿈이 중요한 경우에 사용됩니다.

			print는 줄 바꿈 없이 여러 출력을 하나의 줄에 이어서 표시하려는 경우에 사용됩니다.

*/
		
		System.out.printf("a값: %7d\n",a);
		System.out.printf("d값: %7.1f\n",d);
		System.out.printf("str값: %7s\n",str);	
		
		System.out.println("---------------------------------------------------");
		
		System.out.printf("%7s %7s %7s\n","나이","키","이름");
		System.out.println("---------------------------------------------------");
		System.out.printf("%-7d %-7.1f %-7s\n",a,d,str);

		
/*
		 printf 의 경우, 어떻게 출력할 지 세세하게 지정해 줄 수 있습니다.
		 %d 같은 형식 지정자 사이에 숫자를 넣어 몇 칸 이격 시킬 지 지정하거나
		 %d 같은 형식 지정자 사이 숫자 앞에 -를 넣어 좌측으로 정렬할 수도 있습니다.
		 
		 ex) 
		 %5d: 숫자를 5칸의 공간 안에서 오른쪽으로 정렬하여 출력합니다.
		 %-5d: 숫자를 5칸의 공간 안에서 왼쪽으로 정렬하여 출력합니다.
		 System.out.printf("%5d",a);  >> 변수 a를 우측으로 5칸 정렬하여 출력
		 System.out.printf("%-5d",a); >> 변수 a를 좌측으로 5칸 정렬하여 출력
*/
		
	}//main-end
}//class-end
