package ch04_control;
import java.util.Scanner;
public class Test07Switch {
	public static void main(String[] args) {
		//�����ڸ� �Է� �ް� �׿� �ش��ϴ� ������ �����Ͻÿ�.
		
		int x=10;
		int y=7;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������ + - * / % �� �ϳ��� �Է��ϼ���: ");
		
		char oper=scan.next().charAt(0);//���ڿ����� 0��° ���ڸ� �ҷ����� ��ü.�޼���();
		//GoodMorning
		//0123456789
		
		switch(oper){
		case'+':
			System.out.println(x+"+"+y+"="+(x+y)+" �Դϴ�.");
			break;
		case'-':
			System.out.println(x+"-"+y+"="+(x-y)+" �Դϴ�.");
			break;
		case'*':
			System.out.println(x+"*"+y+"="+(x*y)+" �Դϴ�.");
			break;
		case'/':
			System.out.println(x+"/"+y+"="+(x/y)+" �Դϴ�.");
			break;
		case'%':
			System.out.println(x+"%"+y+"="+(x%y)+" �Դϴ�.");
			break;
		}
	}
}
