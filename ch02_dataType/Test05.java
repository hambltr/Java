package ch02_dataType;

public class Test05 {
	public static void main(String args[]){
		//����
		//10���� 2������ ���
		//10���� 8������ ���
		//10���� 16������ ���
		
		int a=10;
		System.out.println(a);//10���� ���
		System.out.println(Integer.toBinaryString(a));//2����
		System.out.println(Integer.toOctalString(a));//8����
		System.out.println(Integer.toHexString(a));//16����
		
		System.out.println("------------------------------");
		
		int b=014;// ���� �տ� 0�� ���� 8��  >> 12
		int c=0xA;// ���� �տ� 0x�� ���� 16��  >> 10
		
		System.out.println("b: "+b);
		System.out.println("8������ b: "+Integer.toOctalString(b));//8����
		System.out.println("c: "+c);
		System.out.println("16������ c: "+Integer.toHexString(c));//16����
		
		
		
	}//main-end
}//class-end
