package ch04_control;

public class Test12for {
	public static void main(String[] args) {

		//예제 - 1~10 까지 짝수만 사용해서 출력하시오 (for,if문 사용)
		for (int i=1; i<=10; i++){
			if (i%2==0){
				System.out.print(i+" ");
			}//if-end
			
		}//for-end
		System.out.println();
		//-------------------------------------------------------
		//System.out.println();//개행
		//이래 하지 마소
		//for(int i=2; i<=10; i+=2){
		//	System.out.print(i+" ");
		//}//for-end
		//-------------------------------------------------------
		//System.out.println();

		//1-100 7의배수 + 전체 합
		
		int sum=0;
		for (int i=1; i<=100; i++){
			if (i%7==0){
				System.out.print(i+" ");
			}//if-end
			
			sum += i;
		}//for-end
		System.out.println();
		System.out.print("sum: "+sum);
		//-------------------------------------------------------
		System.out.println();

		//1-200 2 4 7의 공배수

		for (int i=1; i<=200; i++){
			if (i%2==0 && i%4==0 && i%7==0){
				System.out.print(i+" ");
			}//if-end
		}//for-end

		//-------------------------------------------------------
		System.out.println();

		//1-200 3 7 9의 공배수

		for (int i=1; i<=200; i++){
			if (i%3==0 && i%7==0 && i%9==0){
				System.out.print(i+" ");
			}//if-end
		}//for-end


	}//main-end
}//class-end
