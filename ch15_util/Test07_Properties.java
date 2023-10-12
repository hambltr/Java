package ch15_util;
import java.util.Properties;
import java.util.Enumeration; //여러개의 값을 받아서 처리할 때 사용

public class Test07_Properties {

	public static void main(String[] args) {
		
		Properties pro = new Properties();// 객체생성
		
		//       key, value
		pro.put("id", "kim");
		pro.put("pw", "12345");
		pro.put("name","Jhon-Cena");
		
		//속성값 얻기
		//key에 해당하는 값을 얻을 때 사용
		
		String id=pro.getProperty("id");
		String pw=pro.getProperty("pw");
		String name=pro.getProperty("name");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		
	}//main-end
	
}//class-end
