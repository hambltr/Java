package ch07_cons;
//������ = Ŭ���� �̸�
//������ = ������ ����, ��ü(�ʵ�) �ʱ�ȭ�� �����̴�
//������ = �Ű������� ���´�. �����ε尡 �����ϴ� (�ߺ�o)
//��ü ������ ȣ��ȴ�. 

class Demo{
	public Demo(){ //default ������
		System.out.println("default cons has been called... ");
	}//cons_Demo



	public Demo(String name){ //�Ű����� ������
		System.out.println("�Ű����� �ִ� ������ ȣ���... ");
	}//cons_Demo

}//class_Demo

public class Test01 {

	public static void main(String[] args) {
		new Demo();//��ü����, ������ ȣ��
		new Demo("aaa");
	}//main

}//class_Test01
