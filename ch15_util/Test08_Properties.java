package ch15_util;
import java.util.Properties;
import java.io.*;

//I/O , DB 작업에 Exception 필수!!

//Properties 클래스의 사용 예제
public class Test08_Properties {
	//변수
	//생성자
	public Test08_Properties(){
		Properties pro = new Properties();//객체생성

		try{
			pro.load(new FileInputStream("C:\\_work\\java_work\\db.properties"));
		}catch(Exception e){
			System.out.println(e);
		}
	
		//key 값을 통해서 값을 얻는다.
		String driver=pro.getProperty("DRIVER");
		String url=pro.getProperty("URL");
		String user=pro.getProperty("USER");
		String pwd=pro.getProperty("PWD");
		
		//DB 연동하여
		//DB 처리
		//DB 출력
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
		
	}//cons-end
	
	
	//메서드
	//main
	public static void main(String[] args) {
		new Test08_Properties();//객체생성, 생성자 호출
	}
	
}
