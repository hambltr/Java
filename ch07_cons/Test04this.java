package ch07_cons;
//this(): �ڽ��� Ŭ���� ���� ������ ȣ��

class Cons{
	String title;
	int num;

	//����Ʈ ������
	public Cons(){}

	//�Ű������� �ִ� ������
	public Cons(String title){
		//System.out.println("�ڽ��� Ŭ���� ������ ������ ȣ��"); <-�̰� �ּ� ����� ������
		this(title,100);//�ڽ��� Ŭ���� ������ ������ ȣ�� 
		//**"�� ù�ٿ� ������ ��"**
	}//cons_end

	//�Ű������� �ִ� ������
	public Cons(String title, int num) {
		this.title=title;
		this.num=num;
	}//cons_end

	//����� ���� �޼���
	public void disp(){
		System.out.println("title: "+ title);
		System.out.println("num: "+ num+"\n");
	}//disp_end
}//class_end=======================================================



public class Test04this {
	public static void main(String[] args) {
		Cons c1=new Cons("����1");//��ü����, ������ ȣ��

		c1.disp();//��ü.�޼���(); ,,, �޼��� ȣ��

		Cons c2=new Cons("����2",200);//��ü����, ������ ȣ��

		c2.disp();//��ü.�޼���(); ,,, �޼��� ȣ��

	}//main_end
}//class_end
