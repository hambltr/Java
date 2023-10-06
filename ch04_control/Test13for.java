package ch04_control;

public class Test13for {
	public static void main(String[] args) {
		//1-10까지 합산하슈

		int sum=0;//합을 구할 변수를 반드시 초기화 : 지역변수
		for(int i=1; i<=10; i++){
			sum += i; //sum=sum+i
		}//for-end
		
		System.out.println("1-10 전체 합: "+sum);

	}//main-end
}//class-end
/*
	sum=sum+i
	 1   0+1
	 3   1+2
	 6   3+3
	   .
	   .
	   .
	45   36+9
	55   45+10
*/