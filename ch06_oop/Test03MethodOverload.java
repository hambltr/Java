package ch06_oop;
//�Ű�����, ���ϰ�, �����ε� �ǽ�
//�����ε� : �ϳ��� Ŭ���� �ȿ� �������� �޼��尡 ������ �ִ� ���, �Ű������� ���� �ٸ��� ������
//		: �׷��Ƿ� �ڷ����� �ٸ��ų� ������ �޶�� ��
public class Test03MethodOverload {
/*
	//����� ���� �޼���
	public int add(int a, int b){
		int s=a+b;
		return s;
	}//add()_end

	//����� ���� �޼��� : �Ű����� �ڷ����� �޶�� �� *** double�� int ��  �Ȱ��� �Ű������� ������
	public double add(double a, double b){
		double s=a+b;
		return s;
	}//add()_end

*/

	//Test03Demo ���� ��ü�� ����ͼ� ����ϴ� �ڵ�- �̷��Ե� ������
	Test03MethodOverload t = new Test03MethodOverload();//��ü ����

	public static void main(String[] args) {


		Test03Demo t=new Test03Demo();
		int a=t.add(8, 7);
		double d=t.add(3.5, 7.7);
/*
		int a=t.add(7,5);
		double d=t.add(3.6, 7.7);

		System.out.println("a: "+a);// ���� �޾Ƽ� �Ҵ��ߴٰ� ������
		System.out.println("d: "+d);// ���� �޾Ƽ� �Ҵ��ߴٰ� ������

		System.out.println(t.add(10,7));//���� ������ �ָ鼭, �ٷ� ������

*/
		//������ ���� �̸� add=�������� �����ؼ� �ʿ��� ��, ȿ�������� �ҷ��ͼ� ���� ������
		//�ڵ� ���μ��� ������

		System.out.println(a);
		System.out.println(d);

	}//main_end

}//class_end
