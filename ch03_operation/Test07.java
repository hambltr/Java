package ch03_operation;

public class Test07 {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.equals("hello")); //false
		System.out.println(str.equals("Hello")); //true
		System.out.println(str.equalsIgnoreCase("hello")); //true
		
		System.out.println("-------------------");
		
	/*
		instanceof �ǽ�
	*/
		
		String str2=new String("abc");//��ü����
		Object obj=new Object();//��ü����, >> Object�� �ڹ� �� �ֻ��� Ŭ����
		System.out.println(str2 instanceof String);//true
		System.out.println(str2 instanceof Object);//true : Ŭ������ ������� true
		System.out.println(obj instanceof Object);//true
		System.out.println(obj instanceof String);//false : Ŭ������ ������� false
		
	}//main-end
}//class-end
