package ch09_interface_abs;
//�������̽� �ǽ�
interface AA2{
	public int aa();//�޼��� ����
}

interface BB2{
	public char bb();//�޼��� ����
}

interface CC2{
	public String cc();//�޼��� ����
}

//Ŭ�������� �������̽��� ��ӹ޾� �������̵�

class DD2 implements AA2,BB2,CC2{

	//�������̵�: ��ӹ��� �޼��� ���� ������
	@Override
	public int aa() {
		return 0;
	}

	@Override
	public char bb() {
		return 'A';
	}

	@Override
	public String cc() {
		return "qwert";
	}
	
	
}//class-end

public class Test02interface {
	public static void main(String[] args) {
		
		DD2 test=new DD2();
		
		int a=test.aa();
		char ch=test.bb();
		String str=test.cc();
		
		System.out.println("a: "+a);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
		
				
	}//main-end
}//class-end
