package ch15_util;


public class Test10_String {
	public static void main(String[] args) {

		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2); //true �� ��ȯ
		
		//========================================
		
		String s3="Hello";
		String s4="hello";
		System.out.println(s3==s4); //false �� ��ȯ
		
		String s5=new String("hello");
		String s6=new String("hello");
		System.out.println(s5==s6); //false �� ��ȯ

		
		System.out.println(s5.equals(s6)); //true �� ��ȯ : s5 s6 ���ڿ��� ���� ������ true
		
		System.out.println(s5.toString().equals(s6.toString()));
		//������ ǥ�� : (s5.toString().equals(s6.toString())) = (s5.equals(s6))
	}
}
