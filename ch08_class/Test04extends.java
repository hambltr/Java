package ch08_class;
//Ŭ���� ��� ����

class PanMae{
	//��������=�ʵ�=property(�Ӽ�)
	protected String pum;//��ȣ�ʵ�
	protected int su;
	protected int dan;


	//default ������
	public PanMae(){}

	public PanMae(String pum, int su, int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons_end

	//����� ���� �޼���
	protected void disp(){
		System.out.println(pum+" "+su+" "+dan);
	}//disp()_end

}//class_end-------------------------------------------

//�Ļ�Ŭ����
class PanMaeSub extends PanMae{

	private double rate;//������

	//default������
	public PanMaeSub(){}

	//�����ִ� ������
	public PanMaeSub(String pum, int su, int dan, double rate){
		super(pum, su, dan);//���� Ŭ���� ������ ȣ��
		this.rate=rate;
	}//cons_end

	//�޼���,�������̵�: ��ӹ��� �޼��� ���� ������
	//protected void disp(){
	public void disp(){
		System.out.println();//����
		System.out.println("ǰ��: "+pum);
		System.out.println("����: "+su);
		System.out.println("�ܰ�:: "+dan+"��");
		System.out.println("������: "+(rate * 100) + "%");

		System.out.println("���� �� �ݾ�: "+(dan*rate)+"��");
		System.out.println("������ ��: "+(dan-(dan*rate))+"��");

	}//disp_end
}//class_end-------------------------------------------



public class Test04extends {

	public static void main(String[] args) {

		PanMae p1=new PanMae("��",3, 4000);
		p1.disp();
		//����
		
		//���� Ŭ���� ������ ������ü ó��
		p1=new PanMaeSub("����",5, 25000, 0.2);
		p1.disp();
		//����

		//���� Ŭ���� ������ ������ü ó��
		//List list=new arralist();
		//Map map=new HashMap();
		
		
	}//main_end
}//class_end
