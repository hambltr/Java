package ch15_util;
//Object Ŭ���� �ǽ�

class Demo{

}//class-end

public class Test09_Object {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		
		//��ü�� Ŭ���� �̸� ���ϱ�
		System.out.println("d1��ü�� Ŭ����: "+d1.getClass());
		System.out.println("d2��ü�� Ŭ����: "+d2.getClass());
		System.out.println("d3��ü�� Ŭ����: "+d3.getClass());
		
		System.out.println();
		
		Test09_Object a1 = new Test09_Object();
		Test09_Object a2 = new Test09_Object();
		Test09_Object a3 = new Test09_Object();
		
		System.out.println("a1��ü�� Ŭ����: "+a1.getClass());
		System.out.println("a2��ü�� Ŭ����: "+a1.getClass());
		System.out.println("a3��ü�� Ŭ����: "+a1.getClass());
		
		System.out.println();
		
		//�� ��ü�� �ؽ��ڵ� ���ϱ� , ��ǻ�ʹ� �ؽ��ڵ�� ��ü�� �����Ѵ�.
		System.out.println("d1 ��ü�� �ؽ��ڵ�: "+d1.hashCode());
		System.out.println("d2 ��ü�� �ؽ��ڵ�: "+d2.hashCode());
		System.out.println("d3 ��ü�� �ؽ��ڵ�: "+d3.hashCode());
		
		
		System.out.println();
		
		//��ü ���ڿ� ����ϱ�: 16������ ǥ����
		System.out.println("d1��ü ���ڿ�: "+d1.toString());
		System.out.println("d2��ü ���ڿ�: "+d2.toString());
		System.out.println("d3��ü ���ڿ�: "+d3.toString());
		
	}//main-end
}//class-end
