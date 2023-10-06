package ch07_cons;
class SuperTest{
	protected String title;//�������� = �ʵ�= property= �Ӽ�
	protected int num;//����


	public SuperTest(){} //����Ʈ ������

	//���� �ִ� ������ (�Ű�����)
	public SuperTest(String title,int num){
		this.title=title;
		this.num=num;
	}//cons_end

	//����� ���� �޼���
	protected void disp(){
		System.out.println("superclass disp() has been called...");
		System.out.println("title: "+title);
		System.out.println("num: "+num+"\n");
	}//disp()_end

}//class_end=============================================

//�Ļ�Ŭ���� = ����Ŭ����
class SubTest extends SuperTest{
	//������
	public SubTest(){
		super("abc",100);//���� Ŭ���� ������ ȣ��
	}//cons_end


	//�������̵�: ��ӹ��� �޼��� ������ ������ �ϴ°�
	public void disp(){
		System.out.println("�Ļ�Ŭ����");
		System.out.println("title: "+title);
		System.out.println("num: "+num+"\n");
	}//disp()_end

}//class_end=============================================

public class Test06super {
	public static void main(String[] args){
		SuperTest s1=new SuperTest("bbb",300);//String,intŸ���� �Ű�����
		s1.disp();
		//����
		s1=new SubTest();//���� Ŭ���� ������ ���� ��ü ó��
		s1.disp();
		
	}//main
}//class_end

