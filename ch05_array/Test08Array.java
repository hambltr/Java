package ch05_array;

public class Test08Array {
	public static void main(String[] args) {

		int a[][]={
				{10,20},
				{30,40,50},
				{88,88,88,88,88}
		};
		System.out.println("���: "+a.length);
		System.out.println("�� ����: "+a[0].length);
		System.out.println("�� ����: "+a[1].length);
		System.out.println("�� ����: "+a[2].length);
		
		//���
		// 10 20
		// 30 40 50
		
		for(int i=0; i<a.length; i++){//��-out
			for(int j=0; j<a[i].length; j++){//��-inner
				System.out.print(a[i][j]+" ");
				//                 ��  ��
			}//inner
			System.out.println();//����
		}//out 
		
	}//main
}//class
