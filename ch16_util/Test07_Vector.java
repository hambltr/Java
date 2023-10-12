package ch16_util;
import java.util.*;
//Vector실습
public class Test07_Vector {
	public static void main(String[] args) {
		Vector<String> vec = new Vector <String>();

		vec.add("aa");
		vec.add("bb");
		vec.add("cc");
		vec.add("dd");
		vec.add("ee");

		System.out.println("size(): "+vec.size());
		System.out.println("-----단축for-----");

		//단축 for
		for(String s:vec){
			System.out.println(s);
		}//for-end

		System.out.println("-----일반for-----");
		//일반for
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}//for-end

		System.out.println("----------");
		//Iterator로 받아서 처리하기
		Iterator iter=vec.iterator();
		while(iter.hasNext()){
			//String str=(String)iter.next();
			//System.out.println(str);
			
			//Object 클래스에 toString()이 있다	
			System.out.println(iter.next().toString());
			
		}//while
		
	}//main
}//class
