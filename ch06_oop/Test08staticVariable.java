package ch06_oop;
//static �޼���� static���� ����� ����, �޼��常 ���(ȣ��)�� �� �ִ�.
//static �޼��忡���� this �� ������� ����
//static �̶�� Ŭ������ �ҼӵǾ� �ֱ� ������ this ��� �Ұ�
//this�� �ڽ��� Ŭ���� ��ü�� �ǹ��Ѵ�

//static �޼���� ������ ��ü������ ���� �ʰ� ��� �����ϴ�.
//Ŭ�����̸�.�޼���();
//Math.PI; :pi��: 3.141592...
//Math.abs(-77); :����

public class Test08staticVariable {
	
	static int b=100;
	public static void bb(){
		System.out.println("bb() has been called...");
	}//bb()
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-77));
		System.out.println(Math.PI);

		//System.out.println("this.b: "+this.b);
		//       �̷��� ��� �Ұ�, static / this x
		
		System.out.println("b: "+b);
		bb();//�޼��� ȣ��
		//static������ �� ���� ��
		
	}//main
	
	
	
}//class_end
