package ch02_dataType;

public class Test07 {
	public static void main(String args[]){
		Test07 test07=new Test07(); //��ü ����
		test07.aa();//��ü.�޼��� ȣ��
		int a = test07.bb();//��ü.�޼��� ȣ��
		System.out.println("a ��: "+a);
		
	}//main-end
	
	public void aa(){
		System.out.println("aa�� () �Դϴ�.");
		//void�� �ش� �޼��尡  � ���� ��ȯ���� �ʴ´�. �׷��� ȣ�� �ؼ� ó������� �Ѵ�.
		//void�� ����ϸ� return�� ������� �ʴ´�.
		
	}//void-aa-end
	
	public int bb(){
		System.out.println("bb() �޼��带 ���� �Ͽ����ϴ�.");
		return 200; //return ���� ������ �ָ� ������ ���� �ʴ´�.
		//int ���������� return�� ����ؼ� ���� test.bb()�� ���� ��ȯ���־���.
		
	}//int-bb-end
	
}//class-end
