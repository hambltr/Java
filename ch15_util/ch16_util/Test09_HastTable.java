package ch16_util;
import java.util.*;

public class Test09_HastTable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>(); //��ü����
		//			key    value
		
		ht.put("id", "kim");
		ht.put("pw", "12345");
		ht.put("name", "asdf");
		ht.put("addr", "Guro-Gu");
		
		//���
		System.out.println(ht.get("id"));
		System.out.println(ht.get("pw"));
		System.out.println(ht.get("name"));
		System.out.println(ht.get("addr"));
		
	}//main
}//class
