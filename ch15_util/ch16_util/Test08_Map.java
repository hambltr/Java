package ch16_util;
import java.util.*;
//���� ����
//HashMap�� HashTable�� �������� �����Ͻÿ�
//��: HashTable - ������ ����� ���� (����ȭ�� ����)
//	 HashMap   - ������ ����� ���� (����ȭ�� �������� ����)


public class Test08_Map {
	public static void main(String[] args) {
		//Map<key,value>
		Map<String,String> map = new HashMap<String,String>(); //��ü����
		map.put("id", "kim");
		map.put("pw", "12345");
		map.put("name", "asdf");
	//	map.put("date", new Date()); // error - not <String> 
		map.put("date", new Date().toString()); // ��¥�� ���ڿ��� ��ȯ
		
		//���
		System.out.println(map.get("id")); //map.get("id"); : key�� �ش��ϴ� ���� ��´�.
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("date"));
		
		//BoardDTO, BoardVO ��� Spring������ HashMap�� ����ϱ⵵ �Ѵ�.
		
		
		
		
	}//main
}//class
