package ch03_operation;

public class Test03 {
	public static void main(String args[]){
		
		//���迬����
		int a=5,b=7;
		System.out.println("-------���迬����-------");
		System.out.println(a>b);  //a�� b���� ũ��
		System.out.println(a>=b); //a�� b���� ũ�ų� ����
		System.out.println(a<b);  //a�� b���� �۴�
		System.out.println(a<=b); //a�� b���� �۰ų� ����
		System.out.println(a==b); //a�� b�� ����
		System.out.println(a!=b); //a�� b�� �ٸ���
		System.out.println(a>2);  //a�� 2���� ũ��
		System.out.println(7>5);  //7�� 5���� ũ��
		
		System.out.println("-------��������-------");
		//��������
		System.out.println(a>b && a<6); //a�� b���� ũ�� and a�� 6���� �۴�. -> �� ������ true �� ���, true ���
		//                True   False  : &&(����, and) >> False ���
		System.out.println(a>b || a<6); //a�� b���� ũ�� or a��6���� �۴�. -> �� ���� �� �ϳ��� true �� ���, true ���
		//                True   False  : ||(�� �� �ϳ��� ���̸�, or) >> True ���
		
		boolean c=true; //c �� ���̶�� ���� ����
		System.out.println(c); //c�� ���̹Ƿ� true
		System.out.println(!c); //!c  :c�� �����̹Ƿ� false
		System.out.println(!!c);//!!c :c�� ������ �ι� �����Ƿ� true
	}//main-end
}//class-end
