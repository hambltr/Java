package ch07_cons;

class SinSang{
	//�������� = �ʵ� = ������Ƽ = property
	private String name;	//�̸�
	private int age;		//����
	private double height;	//Ű

	//����Ʈ ������ �����ε�
	public SinSang(){}

	//�Ű������� �ִ� ������ �����ε�
	public SinSang(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;

	}//cons_end

	//�Ű������� �ִ� ������ �����ε�
	public SinSang(int age, String name, double height){
		this.age=age;
		this.name=name;
		this.height=height;

	}//cons_end

	//����� ���� �޼���
	public void disp(){

		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("Ű: "+height+"\n");

	}//disp()_end
}//class_end

public class Test03 {

	public static void main(String[] args) {
		SinSang kim,lee,park;//��������-���۷��� ����


		kim= new SinSang("������",45,155.5);
		lee= new SinSang(31,"������", 165.6);
		park= new SinSang("����ȣ", 13,180.2);

		kim.disp();
		lee.disp();
		park.disp();

	}//main_end
}//class_end
