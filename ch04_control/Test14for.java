package ch04_control;

public class Test14for {
	public static void main(String[] args) {
		// 1-10, 짝수의 합을 구하여 출력, (for문 if문 사용)

		int sum = 0;
		for (int i = 1; i<=10; i++) {
			if (i%2==0) {
				sum += i;
			}//if-end
		}//for-end
		System.out.println("1-10 짝수의 합: " + sum);

		int sum2 =0;
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				sum2 += i;
			}//if-end
		}//for-end
		System.out.println("1-10 홀수의 합: " + sum2);

	}//main-end
}//class-end

