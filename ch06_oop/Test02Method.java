package ch06_oop;
//�޼���.���ϰ� �ޱ�
public class Test02Method {
	public int aa(){
		System.out.println("aa() has been called...");
		return 100;
	}//aa()-end

	public double bb(){
		System.out.println("bb() has been called...");
		return 12.5;
	}//bb()-end

	public String cc(){
		System.out.println("cc() has been called...");
		return "ȫ�浿";
	}//cc()-end

	public static void main(String args[]){
		
		Test02Method t = new Test02Method(); //��ü����  -> ������ ȣ�� , (�޸� �Ҵ�)
		
		int a=t.aa();
		double d=t.bb();
		String s=t.cc();
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		
		// �ڷ����� �°�, ��ü ������ ��ü.�޼���();
		// �帧�� �˾Ƶ� ���� �̻��� ����

	}//main

}//class-end
