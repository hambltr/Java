package ch04_control;
import java.util.Scanner;
public class Test05Switch {
	public static void main(String args[]){
		//��(month) �� �Է¹޾Ƽ� �� ���� �� ���� ���Ͻÿ�.
		
		int days=0;//�ʱⰪ, ���������� �ʱ�ȭ �� �־�� �Ѵ�.
		Scanner scan=new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ��� : ");
		
		int month=scan.nextInt();;//1��~ 12��, ��ü.�޼���() << ����� ���ÿ� �ڵ����� month�� �Է� ���� ������ �ʱ�ȭ
		
		if(month>12 || month<1 ){ //�߸� �� �� �Է�
			System.out.println("�ٽ� �Է��ϼ���.");
			
		}else{
			switch(month){
			case 1: case 3:
			case 5: case 7:
			case 8: case 10:
			case 12: 
				days=31;
				break;
			case 2:
				days=28;
				break;
			case 4: case 6:
			case 9: case 11:
				days=30;
				break;
			}//switch-end
			System.out.println(month+"���� "+days+"�� ���� �ִ� �� �Դϴ�.");
			//��´��� �� �ݺ��� �� �ۿ��� �ﵵ�� ����.
		}
		
	}
}
