package ch06_oop;
/*
 * �޼��� ����
 * ����������: [static] ���� ���� , ������ �޼����̸�(�Ű�����,,,){ó������}
 * public void aa(){ó������;}
 * public int bb(){ return 100;}
 */
public class Test01Method {
	//����� ���� �޼���
	public static void aa(){
		System.out.println("aa() has been called...");
		System.out.println("Monday");
		
	}//aa()-end
	
	public static void main(String args[]){	
		//aa(); // �޼��� ȣ�� �Ұ� - static �޼���� static���� ����� �޼��常 ȣ���� �� �ִ�.
		//�� ��ü�� �����ؼ� �����ϴ� ��쿣 ��� ����
		
		Test01Method t=new Test01Method(); // ��ü ����
		t.aa();//��ü.�޼���();
		
		
		
	}//main-end
}//class-end
