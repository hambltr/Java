package ch05_array;

public class Test12Math {
	public static void main(String args[]){
		
		System.out.println(Math.PI); //������ ���ȭ -> �빮�ڷ� �ۼ� PI
		//static���� �� �޼��峪 ������ ��ü ������ ���� �ʾƵ� ��� �����ϴ�.
		
		System.out.println(Math.abs(-100)); //abs = absolute : ���񰪸� ��� (���, ���� ����x)
		System.out.println(Math.abs(-12.5));
		System.out.println();//����
		
		//max(double a, double b)
		//min(double a, double b)
		
		System.out.println(Math.max(12.5, 22.5));
		// Math.max �޼���� �� ���� �μ� �߿��� �ִ��� ��ȯ�մϴ�.
		// ���⼭�� 12.5�� 22.5 �߿��� 22.5�� �� ũ�Ƿ� 22.5�� ��µ˴ϴ�.

		System.out.println(Math.min(12.5, 22.5));
		// Math.min �޼���� �� ���� �μ� �߿��� �ּڰ��� ��ȯ�մϴ�.
		// ���⼭�� 12.5�� 22.5 �߿��� 12.5�� �� �����Ƿ� 12.5�� ��µ˴ϴ�.
		
		System.out.println();//����
		
		//floor(double a)
		//ceil(double a)
		//round(double a)
		
		
		System.out.println(Math.floor(5.7));
		// Math.floor �޼���� �־��� ���ڸ� �����Ͽ� ���� ����� ������ ��ȯ�մϴ�.
		// ���⼭�� 5.7�� �����ϸ� 5�� �ǹǷ� 5�� ��µ˴ϴ�.

		System.out.println(Math.ceil(5.7));
		// Math.ceil �޼���� �־��� ���ڸ� �ø��Ͽ� ���� ����� ������ ��ȯ�մϴ�.
		// ���⼭�� 5.7�� �ø��� 6�� �ǹǷ� 6�� ��µ˴ϴ�.

		System.out.println(Math.round(5.7));
		// Math.round �޼���� �־��� ���ڸ� �ݿø��Ͽ� ���� ����� ������ ��ȯ�մϴ�.
		// ���⼭�� 5.7�� �ݿø��ϸ� 6�� �ǹǷ� 6�� ��µ˴ϴ�.
		
		System.out.println();//����
		
		System.out.println("�� ������ ��: "+((37/10)+(37%10==0?0:1)));
		//�Ϲ� ���İ� ���ǹ��� Ȱ���Ͽ� ������ �� ���
		
		System.out.println("(ceil) �� ������ ��: "+(int)(Math.ceil((double)37/10)));
		//ceil�� ����Ͽ� doouble ������ ������ ������� int�� ĳ���� ���ִ� ����
		
		System.out.println();//����
		
		System.out.println(Math.round(5.7));
		System.out.println(Math.round(5.1));
		
		
		
		
	}//main
}//class
