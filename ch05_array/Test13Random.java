package ch05_array;

public class Test13Random {
	public static void main(String[] args) {

		//public static double random() : ���� �߻�
		//0.0 < num <1.0 : 0.0���� ũ�� 1.0���� ����

		for(int i=1; i<=10; i++){
			System.out.println(Math.random());
			//�ð��� �������� ��
		}//for

		System.out.println();//line-skip

		//�ֻ����� 10�� ���� ���� ���Ͻÿ�

		for(int i=1; i<10; i++){
			int a=(int)(Math.random()*6+1);
			//int������ ����ȯ ���ָ鼭, 6+1 :: ���� ������ 1~6���� ����, �ּҰ��� 1 (+1)
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
	(Math.random()*���� �� �ִ� ����� �� + ���� �� �ִ� ���� ���� �ּҰ�)

	int min = 127;
	int max = 1024;
	int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
	System.out.println(randomNumber);

 	int r_num = (int)(Math.randon()*(max-min+1))+min;
 	System.out.println(r_num);
 
  	int r_num = (int)(Math.random()*(46-1+1))+1
 	System.out.println(r_num);
 
 */


