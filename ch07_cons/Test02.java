package ch07_cons;

class Grade{
	private String name;//��������, �ڵ��ʱ�ȭ
	private int kor;

	//����Ʈ ������
	public Grade(){
		System.out.println("����Ʈ ������");
		name=" ";//null
		kor=0;
	}

	//�Ű������� �ִ� ������
	public Grade(String name, int kor){
		this.name=name;
		this.kor=kor;
	}

	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("���� ����: "+kor);
		System.out.println();//����

	}//disp_end

}//class_Grade

public class Test02 {

	public static void main(String[] args) {

		Grade a=new Grade();//��ü����, ������ȣ��
		a.disp();
		//����
		Grade kim=new Grade("�迬��",90); //��ü����, �Ű������� �ִ� ������ ȣ��
		Grade lee=new Grade("�̸��",80);
		Grade iu=new Grade("������",85);
		
		kim.disp(); //��ü.�޼���(); �޼��尡 ȣ��ȴ�
		lee.disp();
		iu.disp();
		
	}//main


}//class