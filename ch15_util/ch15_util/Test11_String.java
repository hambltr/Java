package ch15_util;

public class Test11_String {
	public static void main(String[] args) {
		String str="Good Afternoon";
		System.out.println("�ҹ��ڷ� ��ȯ: "+str.toLowerCase());//�ҹ��ڷ� ��ȯ
		System.out.println("�빮�ڷ� ��ȯ: "+ str.toUpperCase());//�빮�ڷ� ��ȯ
		System.out.println();
		
		//concat(); ���ڿ��� ��ġ�� �޼���
		String s1="Hello, ";
		String s2="I'm under the water ";
		System.out.println(s1.concat(s2));
		System.out.println();
		
		//���� replace
		String s3="banana";
		System.out.println(s3.replace('a', 'o'));
		System.out.println();
		
		String s4="������ ����� ȭ���� �Դϴ�.";
		System.out.println(s4.replace("�����", "���� �׷�"));
	}//main-end
}//class-end
