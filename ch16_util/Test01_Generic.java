package ch16_util;
//Generic 실습
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


//제너릭을 사용하면 컴파일시에 에러를 발생시킨다
//Iterator 는 Enumeration과 Collection(List, Vector, Properties...)를
//통합하여  받아낼 수 있는 기능을 제공한다.

public class Test01_Generic {

	//사용자 정의 메서드
	private void testCollection(){
		List list = new ArrayList(); //객체생성
		//  인터페이스           클래스

//		list.add("hello"); : 이렇게 해도 String 형식임
//		list.add("good");
		
		list.add(new String("hello"));
		list.add(new String("good"));
		list.add(new Integer(100)); //컴파일 에러 

		outPrint(list); //메서드 호출
	}//testCollection()-end

	//사용자 정의 메서드
	public void outPrint(Collection c){	
		Iterator iter = c.iterator();
		while(iter.hasNext()){//자료가 있는 동안 반복 수행
			String item=(String)iter.next();//실행시 java.lang.ClassCastException 예외 발생
			System.out.println(item);

		}//while
	}//outPrint()

	public static void main(String[] args) {
		Test01_Generic t = new Test01_Generic();
		t.testCollection();
		
	}//main-end
}//class-end
