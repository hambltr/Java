package ch04_control;

public class Test14for {
	public static void main(String[] args) {
		// 1-10, ¦���� ���� ���Ͽ� ���, (for�� if�� ���)

		int sum = 0;
		for (int i = 1; i<=10; i++) {
			if (i%2==0) {
				sum += i;
			}//if-end
		}//for-end
		System.out.println("1-10 ¦���� ��: " + sum);

		int sum2 =0;
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				sum2 += i;
			}//if-end
		}//for-end
		System.out.println("1-10 Ȧ���� ��: " + sum2);

	}//main-end
}//class-end

