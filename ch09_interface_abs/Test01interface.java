package ch09_interface_abs;
//�������̽� �ǽ�

interface AA{
	int MAX =100; //== static final int MAX=100;
	//�� ���� �Ұ�
	public void aa();
	public void bb();

}//interface-end

class AAA implements AA{

	//�������̵�
	public void aa(){
		//MAX =100; -> �ش� �� ���� �Ұ�
		System.out.println("MAX: "+MAX);
		System.out.println("aa() has been called...");
	}//aa()
	
	public void bb(){
		System.out.println("bb() has been called...");	
	}//bb()
	
}//class-end

public class Test01interface {
	public static void main(String[] args) {
		AA test=new AAA();//���� Ŭ���� ������ ���� ��ü ó��
		test.aa();
		test.bb();


	}//main-end
}//class-end
