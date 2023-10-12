package ch15_util;

//StringBuffer: 동적 문자열 처리, String보다 속도 빠름
public class Test04_StringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();//객체 생성
		System.out.println("capacity 용량: "+ sb.capacity()+" Byte");
		
		sb.append("Hello, ");
		sb.append("I wanna go home right now ");
		System.out.println("문자열 갯수(길이): "+sb.length());
		System.out.println(sb.toString());//객체를 String으로 변환하여 출력
		java.util.Date date=new java.util.Date();
		System.out.println(date.toString());
		System.out.println(date); //toString 없이 이래해도 되긴함
		
		sb.append(date); // 객체도 append()		
		System.out.println(sb);
		
	}//main
}//class
