package ch04_control;

public class Test02If {
	public static void main(String[] args) {
		//����: � ���� �Է� �޾Ƽ�, �� ���� ������� �������� �Ǻ�

		int num=Integer.parseInt(args[0]);
		if (num<0){
			System.out.println("�Է��Ͻ� ���� '"+num+"'��/�� ���� �Դϴ�.");
		}
		else if (num>0){
			System.out.println("�Է��Ͻ� ���� '"+num+"'��/�� ��� �Դϴ�.");			
		}
		else if (num==0){
			System.out.println("�Է��Ͻ� ���� '"+num+"'��/�� ������ ����� �ƴ� '0' �Դϴ�.");	
		}

	}//class-end
}//main-end
