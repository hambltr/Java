package ch04_control;

public class Test01If {
	public static void main(String[] args) {
		//if�� ����
		//if(7<3){
		//System.out.println("7>3");
		//} false �� ��� �� ������ ���ع���

		//� ���� �Է� �޾Ƽ� �� ���� Ȧ������ ¦������ �Ǻ�
		int num2=Integer.parseInt(args[0]);//���ڿ��� ���ڷ� ��ȯ
		if (num2%2==0){
			System.out.println("�Է��Ͻ� ���� '"+num2+"'��/�� ¦�� �Դϴ�.");
		}//Ȧ¦ if-end

		else if (num2%2 !=0){
			System.out.println("�Է��Ͻ� ���� '"+num2+"'��/�� Ȧ�� �Դϴ�.");
		}//Ȧ¦ else-end 

		System.out.println("----------------------------");
		
		//� ���� �Է¹޾Ƽ� 3�� ������� �Ǻ�
		int num3=Integer.parseInt(args[1]);
		if (num3%3==0){
			System.out.println("�Է��Ͻ� ���� '"+num3+"'��/�� 3�� ��� �Դϴ�.");
		}//3�ǹ�� if-end
		
		else if (num3%3!=0){
			System.out.println("�Է��Ͻ� ���� '"+num3+"'��/�� 3�� ����� �ƴմϴ�.");
		}//3�ǹ�� else-end

		System.out.println("----------------------------");
		
		//� ���� �Է¹޾Ƽ� 7�� ������� �Ǻ�
		int num7=Integer.parseInt(args[2]);
		if (num7%7==0){
			System.out.println("�Է��Ͻ� ���� '"+num7+"'��/�� 7�� ��� �Դϴ�.");
		}//3�ǹ�� if-end
		
		else if (num7%7!=0){
			System.out.println("�Է��Ͻ� ���� '"+num7+"'��/�� 7�� ����� �ƴմϴ�.");
		}//3�ǹ�� else-end
		
	}//main-end
}//class-end