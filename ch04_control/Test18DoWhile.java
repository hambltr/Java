package ch04_control;
//do~while �ǽ� :: �ٵ� do while �߾Ⱦ� �� while�� ���̾���
public class Test18DoWhile {
	public static void main(String args[]){
		//"�ݿ���" 5�� ���


		int i=1;
		do{
			System.out.println(i+"�ݿ���");
			i++;
		}while(i<=5);
		System.out.println();
		//---------------------------------------

		i=1;
		do{
			System.out.println(i+" y'all name");
			i++;
		}while(i<=10);
		System.out.println();

		System.out.println();


		//---------------------------------------
		System.out.println();
		//����: 1~20���� ¦���� ���
		// i ���� ����
		i=1;
		do{
			if (i%2==0){
				System.out.print(i+" ");
			}//if	
			i++;
		}while(i<=20);

	}//main
}//class
