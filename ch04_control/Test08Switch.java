package ch04_control;
import java.util.Scanner;
//����ó��
public class Test08Switch {
	public static void main(String[] args) {

		char grade=' '; //��������, �ʱ�ȭ
		Scanner scan=new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� :");
		int score=scan.nextInt();


		if (score>100 || score<0){
			System.out.println("����");

		}else{ 
			switch(score/10){
			case 9:
			case 10:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';

			//���� case ���� �� �������� case9: = 90~99��, case8:= 89~80���� ������ ���̴�.
				
			}//switch-end
			System.out.println("����: "+score+" ����: "+grade);
		}//else-end

	}//class-end
}//main-end
//90A 80B 70C 60D F