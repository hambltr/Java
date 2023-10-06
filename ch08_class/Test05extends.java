package ch08_class;

class PersonSuper{
	protected String name; //�������� = �ʵ�
	
	public PersonSuper(){}//����Ʈ ������
	
	//���� �ִ� ������ (�Ű�����)
	public PersonSuper(String name){
		this.name=name;
	}
	
	//����� ���� �޼���
	protected void disp(){
		System.out.println("�̸�: " + name);
	}
	
}//class_end==============================================



class PersonSub extends PersonSuper{
	private double left_eye;//�¾Ƚ�
	private double right_eye;//��Ƚ�
	
	public PersonSub(){}//����Ʈ ������
	
	//���� �ִ� ������(�Ű�����)
	public PersonSub(String name,double left_eye, double right_eye){
		super(name);//����Ŭ���� ������ ȣ��
		this.left_eye=left_eye;
		this.right_eye=right_eye;
	}//cons_end
	
	//�޼��� �������̵�: ��� ���� �޼��� ���� ������
	public void disp(){
		System.out.println(); //����
		System.out.println("�̸�: "+name);
		System.out.println("�¾Ƚ�: "+left_eye);
		System.out.println("��Ƚ�: "+right_eye);
	}//disp()_end

}//class_end==============================================


class PersonSin extends PersonSuper{
	private String addr;//�ּ�
	private String tel;//��ȭ
	
	public PersonSin(){}//����Ʈ ������
	
	//���� �ִ� ������(�Ű�����)
	public PersonSin(String name, String tel, String addr){
		super(name);//���� Ŭ���� ������ ȣ��
		this.addr=addr;
		this.tel=tel;
	}//cons_end
	
	//�޼��� �������̵�
	public void disp(){
		System.out.println(); //����
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ: "+tel);
		System.out.println("�ּ�: "+addr);
	}
	
}//class_end==============================================

public class Test05extends {
	public static void main(String[] args) {

		PersonSub sub=new PersonSub("aaa",1.2,1.5);
		sub.disp();
		//����
		
		PersonSin sin=new PersonSin("acdc","010-4444-4444", "sgdlkjkgsd 205ȣ");
		sin.disp();
		//����
		
	}//main_end
}//class_end==============================================
