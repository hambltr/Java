package ch01;

import java.util.Scanner;//������ �Է� �޴� Ŭ����

public class Test06Scanner {
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);//��ü����
		
		System.out.print("������ �Է��ϼ��� :");//�޼��� ��´�
		int a=scan.nextInt();//������ �Է� �޾Ƽ� a�� �Ҵ�
		
		System.out.print("�Ǽ��� �Է��ϼ��� :");
		double d=scan.nextDouble();//�Ǽ��� �Է� �޾Ƽ� d�� �Ҵ�
		
		System.out.print("���ڿ��� �Է��ϼ��� :");
		String str=scan.next();//���ڿ��� �Է¹޾� str�� �Ҵ�, str�� ���Ƿ� ���� �Լ���
		
		//���
		System.out.println("��°�");
		System.out.println("���� ��� :"+a);
		System.out.println("���� ��� :"+d);
		System.out.println("���ڿ� ��� :"+str);
		
		//System.out.printf() : format(����) �� ����Ͽ� ���
		System.out.printf("a��: %d\n",a);//%d : 10���� �������� ������ ���
		System.out.printf("d��: %f\n",d);//%f : �Ǽ��� ���
		System.out.printf("str��: %s\n",str);//%s : ���ڿ��� ���		
		
/*			
  			printf�� ����ȭ�� ����� �ʿ��� ��쿡 ���˴ϴ�. 
			ex)�Ҽ��� ���� �ڸ����� �����ϰų� Ư�� ���Ŀ� ���� ����� �ٷ�� ���� �� �����մϴ�. 
		
 			%d, %f, %s�� ���� ���� �����ڴ� �ڹٿ��� 
   			printf �޼���� �Բ� ����Ͽ� ����� ����ȭ�ϴ� �� ���˴ϴ�.
   		 
   			%d (���� ���� ������):������ ����� �� ���˴ϴ�.
 			%f (�ε� �Ҽ��� ���� ������):�ε� �Ҽ��� ���� (�Ǽ�)�� ����� �� ���˴ϴ�.
 			%s (���ڿ� ���� ������):���ڿ��� ����� �� ���˴ϴ�.
 		 
 		 
 
		 
			println�� �Ϲ������� ������ �ʿ��� ��쿡 ���˴ϴ�. 
			ex)���� ���� �ؽ�Ʈ�� ����ϰų� �� �ٲ��� �߿��� ��쿡 ���˴ϴ�.

			print�� �� �ٲ� ���� ���� ����� �ϳ��� �ٿ� �̾ ǥ���Ϸ��� ��쿡 ���˴ϴ�.

*/
		
		System.out.printf("a��: %7d\n",a);
		System.out.printf("d��: %7.1f\n",d);
		System.out.printf("str��: %7s\n",str);	
		
		System.out.println("---------------------------------------------------");
		
		System.out.printf("%7s %7s %7s\n","����","Ű","�̸�");
		System.out.println("---------------------------------------------------");
		System.out.printf("%-7d %-7.1f %-7s\n",a,d,str);

		
/*
		 printf �� ���, ��� ����� �� �����ϰ� ������ �� �� �ֽ��ϴ�.
		 %d ���� ���� ������ ���̿� ���ڸ� �־� �� ĭ �̰� ��ų �� �����ϰų�
		 %d ���� ���� ������ ���� ���� �տ� -�� �־� �������� ������ ���� �ֽ��ϴ�.
		 
		 ex) 
		 %5d: ���ڸ� 5ĭ�� ���� �ȿ��� ���������� �����Ͽ� ����մϴ�.
		 %-5d: ���ڸ� 5ĭ�� ���� �ȿ��� �������� �����Ͽ� ����մϴ�.
		 System.out.printf("%5d",a);  >> ���� a�� �������� 5ĭ �����Ͽ� ���
		 System.out.printf("%-5d",a); >> ���� a�� �������� 5ĭ �����Ͽ� ���
*/
		
	}//main-end
}//class-end
