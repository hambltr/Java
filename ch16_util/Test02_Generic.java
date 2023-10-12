package ch16_util;

//제너릭 사용 예제

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Test02_Generic {
	//사용자 정의 메서드
	private void testCollection(){
		List<String> list = new ArrayList<String>();
		
		list.add(new String("hello")); //항목 추가
		list.add(new String("good"));
		//list.add(new Integer(100)); //컴파일 에러
		
		outPrint(list);
	}//testCollection()
	
	//사용자 정의 메서드
	public void outPrint(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){//자료가 있는 동안 반복수행
			String item=(String)iter.next();
			System.out.println(item);
		}//while-end
	}//outPrint()
	public static void main(String[] args) {
		Test02_Generic t = new Test02_Generic(); //객체생성
		t.testCollection();
	}//main
}//class
