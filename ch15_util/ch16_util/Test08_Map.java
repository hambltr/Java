package ch16_util;
import java.util.*;
//면접 문제
//HashMap과 HashTable의 차이점을 설명하시오
//답: HashTable - 스레드 기능이 있음 (동기화를 지원)
//	 HashMap   - 스레드 기능이 없음 (동기화를 지원하지 않음)


public class Test08_Map {
	public static void main(String[] args) {
		//Map<key,value>
		Map<String,String> map = new HashMap<String,String>(); //객체생성
		map.put("id", "kim");
		map.put("pw", "12345");
		map.put("name", "asdf");
	//	map.put("date", new Date()); // error - not <String> 
		map.put("date", new Date().toString()); // 날짜를 문자열로 변환
		
		//출력
		System.out.println(map.get("id")); //map.get("id"); : key에 해당하는 값을 얻는다.
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("date"));
		
		//BoardDTO, BoardVO 대신 Spring에서는 HashMap을 사용하기도 한다.
		
		
		
		
	}//main
}//class
