package ch08_class;
//Ŭ���� ���, Ŭ���� ĳ���� ����

class PanMae3{
	protected String pum;//��ǰ��
	protected int su;
	protected int dan;

	public PanMae3(){}//����Ʈ ������

	//���� �ִ� ������ (�Ű�����)
	public PanMae3(String pum, int su, int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons_end

	//����� ���� �޼���
	public void disp(){
		System.out.println();
		System.out.println(pum+" "+su+" "+dan);
	}//disp()_end

}//class_end==========


//�Ļ�Ŭ����
class SalePanMae3 extends PanMae3{

	private double rate; //������

	public SalePanMae3(){}//����Ʈ ������

	//���� �ִ� ������ (�Ű�����)
	public SalePanMae3(String pum, int su, int dan, double rate){
		super(pum,su,dan); //���� Ŭ���� ������ ȣ��
		this.rate = rate; // ������ �ʱ�ȭ
		
	}//cons_end

	//�������̵�: ��� ���� �޼��� ���� ������
	public void disp(){
		System.out.println();//����
		System.out.println("ǰ��: "+pum);
		System.out.println("����: "+su);
		System.out.println("�ܰ�: "+dan);
	}//disp()_end

	//����� ���� �޼���
	public void halInAk(){
		System.out.println("���ξ�: "+(dan*rate));
	}

}//class_end==========

public class Test07casting {
	public static void main(String[] args) {
		
		PanMae3 p[]=new PanMae3[4];//�迭����
		
		//���� Ŭ���� ������ ���� ��ü ó��
		p[0]=new PanMae3("aaaa",4,6000);	//��ü����
		p[1]=new SalePanMae3("abab",4,6000,0.2);
		p[2]=new PanMae3("bbbb",4,9000);
		p[3]=new SalePanMae3("cccc",5,56000,0.2);
		
		for(int i=0; i<p.length; i++){
			p[i].disp();
			//p[i].halInAk(); //����
			
			if (p[i] instanceof SalePanMae3){
				((SalePanMae3)p[i]).halInAk();
				
			}//if-end
		}//for-end
		
		
	}//main-end
}//class-end
