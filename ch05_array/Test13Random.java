package ch05_array;

public class Test13Random {
	public static void main(String[] args) {

		//public static double random() : 난수 발생
		//0.0 < num <1.0 : 0.0보다 크고 1.0보다 작음

		for(int i=1; i<=10; i++){
			System.out.println(Math.random());
			//시간을 기준으로 함
		}//for

		System.out.println();//line-skip

		//주사위를 10번 굴린 값을 구하시오

		for(int i=1; i<10; i++){
			int a=(int)(Math.random()*6+1);
			//int형으로 형변환 해주면서, 6+1 :: 굴릴 범위를 1~6까지 지정, 최소값은 1 (+1)
			System.out.print(a+" ");
			System.out.println();//line-skip

		}//for
		System.out.println();//line-skip


		for(int i=1; i<=10; i++){
			int a=(int)(Math.random()*(1024-127+1)+127);
			System.out.println(a+" ");
		}//for
		System.out.println();
		


	}//main

}//class



/*	
	(Math.random()*6+1)
	(Math.random()*나올 수 있는 경우의 수 + 나올 수 있는 가장 작은 최소값)

	int min = 127;
	int max = 1024;
	int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
	System.out.println(randomNumber);

 	int r_num = (int)(Math.randon()*(max-min+1))+min;
 	System.out.println(r_num);
 
  	int r_num = (int)(Math.random()*(46-1+1))+1
 	System.out.println(r_num);
 
 */


