package ch04_control;

public class Test13for {
	public static void main(String[] args) {
		//1-10���� �ջ��Ͻ�

		int sum=0;//���� ���� ������ �ݵ�� �ʱ�ȭ : ��������
		for(int i=1; i<=10; i++){
			sum += i; //sum=sum+i
		}//for-end
		
		System.out.println("1-10 ��ü ��: "+sum);

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