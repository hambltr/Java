package ch04_control;

public class Test12for {
	public static void main(String[] args) {

		//���� - 1~10 ���� ¦���� ����ؼ� ����Ͻÿ� (for,if�� ���)
		for (int i=1; i<=10; i++){
			if (i%2==0){
				System.out.print(i+" ");
			}//if-end
			
		}//for-end
		System.out.println();
		//-------------------------------------------------------
		//System.out.println();//����
		//�̷� ���� ����
		//for(int i=2; i<=10; i+=2){
		//	System.out.print(i+" ");
		//}//for-end
		//-------------------------------------------------------
		//System.out.println();

		//1-100 7�ǹ�� + ��ü ��
		
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

		//1-200 2 4 7�� �����

		for (int i=1; i<=200; i++){
			if (i%2==0 && i%4==0 && i%7==0){
				System.out.print(i+" ");
			}//if-end
		}//for-end

		//-------------------------------------------------------
		System.out.println();

		//1-200 3 7 9�� �����

		for (int i=1; i<=200; i++){
			if (i%3==0 && i%7==0 && i%9==0){
				System.out.print(i+" ");
			}//if-end
		}//for-end


	}//main-end
}//class-end
