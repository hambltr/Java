package ch15_util;

//StringBuffer: ���� ���ڿ� ó��, String���� �ӵ� ����
public class Test04_StringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();//��ü ����
		System.out.println("capacity �뷮: "+ sb.capacity()+" Byte");
		
		sb.append("Hello, ");
		sb.append("I wanna go home right now ");
		System.out.println("���ڿ� ����(����): "+sb.length());
		System.out.println(sb.toString());//��ü�� String���� ��ȯ�Ͽ� ���
		java.util.Date date=new java.util.Date();
		System.out.println(date.toString());
		System.out.println(date); //toString ���� �̷��ص� �Ǳ���
		
		sb.append(date); // ��ü�� append()		
		System.out.println(sb);
		
	}//main
}//class
