package ch02_dataType;

public class Test04Casting {
	public static void main(String args[]){
		//�Ҵ�� : ������ ������ �ڷ������� Ŭ�� �ڵ����� ����ȯ
		double a = 100; // ���ԵǸ鼭 double������ ��ȯ
		System.out.println(a);

		//���� ��, �ڷ����� ū������ ��ȯ
		System.out.println(10+12.5);//double������ ��ȯ

		int intValue = 10;       // ������ ����
		double doubleValue = intValue; // �������� �ε� �Ҽ������� �ڵ� ����ȯ
		System.out.println(doubleValue);

		//��������ȯ 
		//int a=12.5;

		int b=(int)12.5;
		System.out.println("b: "+b);
		
		
		//**�׻� �����ʹ� �ڷ������� Ŀ����**
		
		char ch=(char)65;
		char ch2=(char)65.7;
		System.out.println("ch: " +ch);
		System.out.println("ch2: "+ch2);

/*		������ ���ȭ
		- ������ ����� ��ȯ ���ִ� ��
		- ���α׷� ������ �� ���� �Ұ��� 
*/
		final int MAX=100;
		//MAX=500;//����, �� ���� �Ұ�
		System.out.println("MAX: "+MAX);
		
	}//main-end
}//class-end
