package ch09_interface_abs;
//�߻�Ŭ���� �ǽ�
abstract class Abs{
	abstract public void aa();//�߻�޼���

	public void bb(){ //�Ϲ� �޼���
		System.out.println("�߻� Ŭ���� �ȿ� �ִ� �Ϲ� �޼��� �Դϴ�.");
	}


}//class-end

class AbsTest extends Abs{
	//�������̵�
	public void aa(){
		System.out.println("�������̵� �� �߻� �޼��� �Դϴ�.");
	}
	
	
}//class-end

public class Test03abs {
	public static void main(String[] args) {
		AbsTest test=new AbsTest();//��ü����, ������ ȣ��
		test.aa(); // �������̵� : �߻�޼���
		test.bb(); // �Ϲ� �޼���



	}//main-end
}//class-end
