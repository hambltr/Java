package ch15_util;
//Wrapper class: �⺻ �ڷ��� Ŭ����

public class Test01_Wrapperclass {

	public static void main(String[] args){
		
		int a=10; // �⺻�ڷ��� :: stack�޸𸮿� �Ҵ�
		Integer a2 = new Integer(a);//��ü ���� :: heap������ �޸� �Ҵ�
		Integer a3 = new Integer(100);//��ü ����
		
		//---------------------------------
		
		//AutoBoxing
		int x=10; //stack�޸𸮿� �Ҵ�
		Integer x2=x; //stack���� heap �������� ����
		
		//UnBoxing
		Integer y = new Integer(200);// heap�� �޸� �Ҵ�
		int y2=y;
		
		double d = 12.5;
		Double d2 = new Double(d);
		Double d3 = new Double (45.5);
		
		//toString()�� Object�� �����ϴ� �޼����̴�
		//toString(): ��ü�� ���ڿ��� ��ȯ�� �� ����Ѵ�.
		
		System.out.println("a: "+a);
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a2);//�̷��Ե� �����ѵ� �� toString ������
		System.out.println(a3);
		
		System.out.println();
		
		System.out.println("d: "+d);
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
	}//main

}//class
