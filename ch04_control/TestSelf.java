package ch04_control;

public class TestSelf {
	public static void main(String args[]){
		// 1-10, 짝수의 합을 구하여 출력, (for문 if문 사용)

		int sum = 0;
		for(int i=1; i<=10; i++){
			if(i%2==0){	
				sum += i;
			}//if
			
			
		}//for
		System.out.println(sum);
	}//main
}//class
