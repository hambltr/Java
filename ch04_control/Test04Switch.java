package ch04_control;
import java.util.Scanner;
public class Test04Switch {

	public static void main(String[] args) {
		//� ���� �Է� �޾Ƽ� ¦������ Ȧ������ ���
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������ ���� �Է��Ͻÿ�. >> ");
		int num = scan.nextInt();//nextInt(); :: �Է¹��� int �� ����� �� �ְ� ���ִ� �޼���
								 //��ü. �޼���()
		
		switch(num%2){
		case 0:
			System.out.println(num+" ��/�� ¦���Դϴ�.");
			break;
		case 1:
			System.out.println(num+" ��/�� Ȧ���Դϴ�.");
			break;
			
		}//switch-case-end	
		
	}//main-end

}//class-end
