package ch05_array;

public class Test01Array {
	public static void main(String[] args) {
		//���� ���
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);

		System.out.println();

		//�迭  
		int d[]={40,50,60};
		System.out.println("d �迭 ��� ����: "+d.length);
	/*	
		System.out.println();
		
		System.out.println("d[0]: "+d[0]);
		System.out.println("d[1]: "+d[1]);
	 	System.out.println("d[2]: "+d[2]);
	*/	//��¹� :: ������ ���� �ڵ� ��������
		
		System.out.println();
		
		System.out.println("for��");
		//for�� ����Ͽ� ��� : �ַ� �̷��� ���� ��
		//�� ������ �ִ� i ���� ������ �ɾ ���ϴ� �迭�� ��� ('i>=3', 'i<=3','i==3' ��ȣ ��� ����)
		for(int i=0; i<3; i++){//i=0,1,2 �� ���� ����
			System.out.println("d["+i+"]: "+d[i]);
			//d�迭�� 0����, 1��°, 2��° ���� ȣ����
			
		}//for
	}//main
}//class
