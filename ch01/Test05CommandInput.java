package ch01;
//���ɵ� �μ��� �ޱ�
public class Test05CommandInput {
	public static void main(String args[]){
		
		int su1=Integer.parseInt(args[0]);// integer.parseInt("123") : ���ڿ��� ������ ��ȯ
		int su2=Integer.parseInt(args[1]);// integer.parseInt("123") : ���ڿ��� ������ ��ȯ
		int s1=su1+su2;//���� (��)
		int s2=su1-su2;//���� (��)
		
		System.out.println("�� ���� ���� ���� "+s1+" �Դϴ�.");
		System.out.println("�� ���� �� ���� "+s2+" �Դϴ�.");
		
		/* 
		���� : ������ �� �� �־�� ������
		�ֹι�ȣ, ��ȭ��ȣ, ������ȣ : ���ڿ� (String)
		
		Integer.parseInt >> ���ڿ��� ������ ��ȯ
		""+���� >> ������ ���ڿ��� �ڵ� ��ȯ, �̸� ���ڿ� ���� �Ǵ� ���ڿ� ���� �̶�� �մϴ�.
		
			Java���� �޼���� Ŭ���� �̸��� ������ ��, 
			�޼������ �ĺ��ϱ� ���� ��Ģ���� ī�� ǥ���(Camel Case)�� ����մϴ�. 
			�� ��Ģ�� ���� �޼������ �ҹ��ڷ� �����ϰ�, ���� �ܾ��� ���� �κп� �빮�ڸ� ����մϴ�. 
			���� parseInt�� ���� �빮�ڷ� �����ϴ� �޼������ ����Ǹ�, 
			�� ��Ģ�� ������ �ʴ� ��� ������ ������ �߻��� �� �ֽ��ϴ�.
		 
		��Ŭ�������� �����ϸ�, ������ �߻��մϴ�.
		�� ������ �ڵ忡 ������ �ִ� ���� �ƴ�, �迭 ���� �������� �ʾƼ� �߻��ϴ� �����Դϴ�.
		�׷��Ƿ� ������ ���� �迭 ���� ������ �ָ� �˴ϴ�.
		
		Run Configurations >> arguments >> program arguments 
		>> �� �Է� �� apply >> Run
		*/
		
		//""+���� : �ǽ�
		int a=100;
		int b=200;
		
		System.out.println("������ ���ڿ��� ��ȯ�ϱ� �ǽ�");
		String str1=""+a;//������ ���ڿ��� ��ȯ, ���� �� ��
		String str2=""+b;
		System.out.println(a+b);//��������
			//�̴� ������ ������ a�� b�� �ҷ��� ���������Ƿ�
			//100+200�� ����Ǿ� 300�� ������ ��µ˴ϴ�.
		System.out.println(str1+str2);//���ڿ� �����Ͽ� ��� ��
			// str1, str2 ��� ���𿡼� ���������� ��ȯ�� 100�� 200�� ���� ���̹Ƿ�
			// ��°��� ����� ���� �ƴ� 100200 �Դϴ�.
		
		
		
	}//main-end
}//class-end