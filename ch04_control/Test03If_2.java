package ch04_control;

public class Test03If_2 {
	public static void main(String args[]){
		//4�� 7�� ����� �Ǻ�
		int num = Integer.parseInt(args[0]);
		if (num%4==0 && num%7==0){
			System.out.println("�� ���� 4�� 7�� ����� �Դϴ�.");
		}else{
			System.out.println("�� ���� 4�� 7�� ������� �ƴմϴ�.");
		}
	}
}
