package ch15_util;
import java.util.Date;
//import java.sql.Date; sql에도 date 표기가 있음
//import java.sql.*;
import java.text.SimpleDateFormat; //날짜 형식 사용

public class Test02_Date {
	public static void main(String[] args) {
		
		Date date = new Date(); //객체생성
		java.util.Date date2 = new java.util.Date();
		//앞에 java.util. 붙혀버리면 import 안하고도 끌어다 쓸 수 있음
		
		System.out.println(date);
		System.out.println("============================");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		//실행
		
		System.out.println("==========");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //년월일시분초
		System.out.println(sdf2.format(date));
		//실행
		
		System.out.println("==========");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); //년월일시분초
		System.out.println(sdf3.format(date));
		//실행
		
		System.out.println("==========");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a"); //년월일시분초 요일 ampm
		System.out.println(sdf4.format(date));
		//실행
		
	}//main-end
}//class-end
