package ch08_class;
//class_ĳ���� ����

class Super1{
	//����� ���� �޼���
	public void disp(){
		System.out.println("super1.disp()");
	}
	
}//class_end===============================================


//�Ļ�Ŭ����
class Sub1 extends Super1{
	//�������̵�
	public void disp(){
		System.out.println("Sub1.disp()");
	}

	
	//����� ���� �޼���
	public void kk (){
		System.out.println("Sub1.kk()");
	}
	
}//class_end===============================================

public class Test06casting {

	public static void main(String[] args) {
		
		Super1 super1=new Super1();//��ü ����, ������ ȣ��
		super1.disp();
		//����
		
		//���� Ŭ���� ������ ���� ��ü ó�� double d=100;
		// upcasting
		
		super1=new Sub1(); //��ü����, ������ ȣ��
		super1.disp();
		//����
		
		((Sub1)super1).kk(); // cf: int a=(int)12.5;
		
		
	}//main
	
}//class_end===============================================
