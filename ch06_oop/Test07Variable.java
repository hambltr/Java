package ch06_oop;
//�������� : �޼��� �ۿ��� ������ ����, �ʱ�ȭo
//��������: �޼��� �ȿ��� ������ ����, �ʱ�ȭx
//�迭: 
//�Ű�����: ���������̴�
public class Test07Variable {

	private String name;
	private double height;
	private int age;


	//������

	//����� ���� �޼���
	public void setData(String name, int age, double height){
		this.name=name; 	//this.��������=�Ű����� : ���� �޼��忡�� ��� ����
		this.height=height; 
		this.age=age; 		

	}//setData

	//����� ���� �޼���: ���
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("Ű: "+height);
		System.out.println("����: "+age);

		
		
	}//disp()


	public static void main(String args[]){
		
		Test07Variable t = new Test07Variable();//��ü ����
		t.setData("Snoop Dogg", 51, 193.0); // ��ܿ� ������ �޼����� �Ű����� ������� �������� ��
		t.disp();
		
		


	}//main

}//class
