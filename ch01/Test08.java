package ch01;
	//test08: ���� �̸�

/*
	�ڹ� ���α׷��� �������� Ŭ������ �����ȴ�
	���� �̸��� �� Ŭ���� �̸����� �����ؾ� �մϴ�.
	�� Ŭ������ main()�� �Ҽӵ� Ŭ���� �Դϴ�.
	�� Ŭ�������� public ���������ڸ� �� �� �ִ�.

	��Ű���� ��� �ҹ���
	Ŭ������ ù���ڴ� �빮��
	�ż����� ù���ڴ� �ҹ���, ���ʿ� ��ȣ() 
		System(Ŭ����).out(Ŭ���� ���� =��ü).println();
	������ ù���ڴ� �ҹ���


*/

//Test08 : ���� �̸�
public class Test08{
	public static void main(String args[]){
		Demo demo = new Demo();//��ü ����
		demo.aa();//��ü.�޼���(); >> �޼��� ȣ��
	}//main-end
}//class-end


class Demo{
	public void aa(){
		System.out.println("�̰��� Demo.aa() �޼��� �Դϴ�.");
	}
}