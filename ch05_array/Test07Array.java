package ch05_array;

public class Test07Array {
	public static void main(String[] args) {
		//���ڿ��� �� ���� �迭 ��ҷ� �����ϱ�
		
		String str="Good-After-noon-gil-dong";
		//          01234567890123 << �̵����� �ν�
		//�迭 ���� (����)  : �迭 �̸�.length
		//���ڿ� ����(���ڼ�): str.length()
		System.out.println("str.length(): "+str.length());
		
		char ch[]=new char[str.length()]; //�迭����, �迭���� , ���ڿ� ���̸�ŭ
		
		ch[0]='B';
		ch[1]='B';
			
		
		//destination : ���� ��� : dst 
		//str.getChars(srcBegin, srcEnd, dst, dstBegin);//
		// 			     �ҽ�������      �ҽ�����   �����Ҵ��   �������
		str.getChars(5,10,ch,2);
		//				 ch[2]
		
		System.out.println(str);
	
		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
		
	
	}//main
}//class
