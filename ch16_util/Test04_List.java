package ch16_util;
import java.util.*;

public class Test04_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// 객체생성
		
		//항목추가
		list.add("인사과"); //index=0
		list.add("총무과");  		//1
		list.add("인사과");  		//2
		list.add("회계");   		//3
		list.add("인사과"); 		//4
		
		//항목 갯수 구하는 메서드 : size()
		System.out.println("size() 항목 갯수: "+list.size());
		System.out.println("=================");//개행
		
		//단축 for 사용
		for(String s:list){
			System.out.println(s);
		}//for
		
		System.out.println("=================");
		//일반 for 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get(index) "+list.get(i)); //get(index) : index에 해당하는 항목을 얻는다.
		}//for
		
		System.out.println("=================");
		
		//첫번째 항목 얻기 (n번째 -> .get(n-1))
		System.out.println("첫번째 항목: " + list.get(0));
		
		System.out.println("=================");
		
		//Iterator로 받아서 출력하시오
		Iterator iter = list.iterator(); // 순서 없이 (무순서) 처리
		while(iter.hasNext()){
			System.out.println("무순서처리: " + iter.next());
		}//while
		
	}//main
}//class
