package ch05_array;

public class Test06Array {
	public static void main(String[] args) {
		int a[]={50,60,70};//�迭����, �迭����, �⺻��
		int b[];//�迭����
		
		b=a;//���� :: *�߿�* :: �̰ɷ� a,b ��� ������ �迭�� ���� : Java�� ���� C�� �ȵ�
		//���� : ���� ���� ���� *****
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+" "+b[i]);
		}//for
		
	}//main
}//class


