package ch06_oop;
//����
//��������: �޼��� �ۿ��� ����� ����, �ڵ����� �ʱ�ȭ �ȴ�.
//��������: �޼��� �ȿ��� ����� ����, �ڵ����� �ʱ�ȭ ���� ����.
//�迭�� �������� ������ �ڵ����� �ʱ�ȭ �ȴ�.
//static �޼���� static���� ����� ������ �޼��常 ���(ȣ��) �� �� �ִ�.

public class Test06Variable {
	static int b;
	//�������� ���� : �ϴ� static ������ ���⿡�� static�� ������� �� �� ����, �ڵ� �ʱ�ȭ
	
	static public void aa(){
		System.out.println("aa() Method has heen called...");
	}//aa()
	
	public static void main(String args[]){
		
		System.out.println("b:" +b);// ��� ���������� static �Ⱥ����� ������
		aa();
		
	}//main_end
}//class_end
