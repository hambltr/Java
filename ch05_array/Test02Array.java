package ch05_array;
//���������� �ڵ����� �ʱ�ȭ , �޼��� �ۿ��� ����
//���������� �ڵ����� �ʱ�ȭ ���� ����, �޼��� �ȿ��� ����
//�迭�� �������� �����ص� �ڵ����� �ʱ�ȭ 

//static �޼���� static���� ����� ����, �޼��常 ��� �Ǵ� ȣ�� �� �� �ִ�
public class Test02Array {
	static int max; //�������� : �ڵ����� �ʱ�ȭ
	
	public static void aa(){
		System.out.println("aa() �Դϴ�. ");
	}//aa()

	public static void main(String args[]){
		System.out.println(max);
		aa();//�޼��� ȣ��
		
		//�迭�� ���������� �ڵ����� �ʱ�ȭ ��
		int a[]=new int[3]; //�迭����, �迭����
		for(int i=0; i<a.length; i++){
			System.out.println("a["+i+"]: "+(a[i]));
		}//for
	}//main
}//class
