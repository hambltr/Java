package ch15_util;
import java.util.Properties;
import java.util.Enumeration; //�������� ���� �޾Ƽ� ó���� �� ���

public class Test07_Properties {

	public static void main(String[] args) {
		
		Properties pro = new Properties();// ��ü����
		
		//       key, value
		pro.put("id", "kim");
		pro.put("pw", "12345");
		pro.put("name","Jhon-Cena");
		
		//�Ӽ��� ���
		//key�� �ش��ϴ� ���� ���� �� ���
		
		String id=pro.getProperty("id");
		String pw=pro.getProperty("pw");
		String name=pro.getProperty("name");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		
	}//main-end
	
}//class-end
