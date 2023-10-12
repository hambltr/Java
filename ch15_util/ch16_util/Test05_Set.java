package ch16_util;
import java.util.Set; // 인터페이스
import java.util.HashSet; // 클래스
import java.util.Iterator; // 모든 컬렉션 타입의 자료를 받아서 처리할 수 있다

//Set, HashSet : 중복 허용 안된다 : (얘 잘 안씀) : 로또 찍을때나 씀

public class Test05_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //객체생성
		
		set.add("인사과");
		set.add("총무과");
		set.add("인사과");
		set.add("회계");
		set.add("인사과");
		
		System.out.println("size(): "+set.size());
		//Set, HashSet 중복 허용 불가 
		
		System.out.println("===================");
		
		//단축 for 사용
		for(String s:set){
			System.out.println(s);
		}
		System.out.println("===================");
		
		//Iterator 사용
		Iterator iter = set.iterator();
		while(iter.hasNext()){//자료가 있는 동안 반복 수행
			System.out.println(iter.next());		
		}//while
		
	}//main

}//class
