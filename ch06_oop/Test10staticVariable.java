package ch06_oop;

//static ������ �� �� ����� ����
//static �� Ŭ������ ��� ��ü�� �����Ѵ�

class Product{
	private String name;//��ǰ��
	private int num;//��ǰ����
	private int cost;//��ǰ�ܰ� :
	//    : �ش� �κ��� static���� ���� ��� �ܰ��� �����ع���.. **

	//������(=������ �޼���)
	public Product(String name, int num, int cost){
		this.name=name;// ���������� �Ű����� ������ �Ҵ� a=100
		this.num=num;
		this.cost=cost;

	}//cons_end

	//����� ���� �޼��� 
	public void disp(){
		System.out.println(name+" "+num+" "+cost);

	}//disp_end

}//class_end

public class Test10staticVariable {

	public static void main(String[] args) {

		Product banana=new Product("�ٳ���", 1,4500); //��ü����
		Product apple=new Product("���", 3,5500);	//��ü����
		Product orange=new Product("������", 5,3000); //��ü����
		
		banana.disp();
		apple.disp();
		orange.disp();
		
	}//main_end
}//class_end
