package ch02_dataType;
/*	
 	�ڷ���
	����
	���=��=������ 
*/
public class Test03 {
	public static void main(String args[]){
		
		//�ڷ��� ���� = ��
		int b1; //���� ����
		b1 = 127; //�� �Ҵ�
		Short s1 = 32767;
		int i1 = 2147483647;//default
		long l1 = 200L;
		
		float f1 = 12.6f;//float���� ���� ���� f�� ������� �Ѵ�.
		double d1 = 12.6;//double�� ����Ʈ ���̱� ������ d�� ���� �ʿ�� ����. �ٵ� �ᵵ��
		
		String name = "��ѱ�";
		String name2 = new String("�ߵѱ�");//�̷��Ե� ��� ����
		String name3 = "����";//�Ϲ������� ���ڿ� ���ͷ��� ����ϴ� ����� �� ȿ�����̸� ����˴ϴ�.
		
		
		//���
		System.out.println("b1: "+b1);
		System.out.println("=============");
		
		System.out.println("s1: "+s1);
		System.out.println("=============");
		
		System.out.println("i1: "+i1);
		System.out.println("=============");
	
		System.out.println("l1: "+l1);
		System.out.println("=============");
	
		System.out.println("f1: "+f1);
		System.out.println("=============");
		
		System.out.println("d1: "+d1);
		System.out.println("=============");

		System.out.println("name: "+name);
		System.out.println("=============");

		System.out.println("name2: "+name2);
		System.out.println("=============");
		
		System.out.println("name3: "+name3);
		System.out.println("=============");
		
	}//main-end
}//class-end
