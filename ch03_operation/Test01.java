package ch03_operation;

public class Test01 {
	public static void main(String args[]){

		int a=5;

		System.out.println(++a); //6
		System.out.println(a++); //6 : �� ���, �� ���� : ��� ���� ����x
		System.out.println(a);   //7
		//
		a=5;//������ ����  -> ������ �ʱ�ȭ �����ָ� ������ ������ ������ ��� ������
		int b = ++a + a++; //���տ���
		System.out.println("a: "+a);//7
		System.out.println("b: "+b);//12
		//
		a=5; //������ ����  -> ������ �ʱ�ȭ �����ָ� ������ ������ ������ ��� ������
		b=++a + ++a;
		System.out.println(a); 
		System.out.println(b); 
		//
		for(int i=1; i<=10; i++){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		for(int i=1; i<=10; ++i){
			System.out.print(i+" ");
		}
		
	}//main-end

}//class-end

