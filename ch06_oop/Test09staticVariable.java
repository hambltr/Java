package ch06_oop;
//static ����: �� Ŭ������ ��� ��ü�� �����Ѵ� ***

//	�ùٸ�  ����: ����, �̼��� �Ǻ��Ͽ� ����ϱ�

public class Test09staticVariable {
	private String name; //��������
	private int age; //��������
	private static int adult=18; //��������
	
	//������(=������ �޼���)
	public Test09staticVariable(String name,int age){
		this.name=name;
		this.age=age;
		
	}//constructor_end
	
	//����� ���� �޼���
	public void dp(){
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		if(age>=adult){
			System.out.println("���� �Դϴ�.");
		}else{
			System.out.println("�̼����� �Դϴ�.");
		}//if-else_end
		System.out.println();//����
	}//dp
	
	
	public static void main(String[] args) {
		
		Test09staticVariable im,iu,lee; //���� ����

		im=new Test09staticVariable("�ӿ���",99);//��ü ����
		iu=new Test09staticVariable("������",99);//��ü ����
		lee=new Test09staticVariable("�̽þ�",1);//��ü ����
		
		im.dp();//��ü,�޼���() �޼��� ȣ��
		iu.dp();
		lee.dp();
		
		
	}//main_end
	
}//class_end
