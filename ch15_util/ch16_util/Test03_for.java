package ch16_util;
import java.util.List;
import java.util.ArrayList;

public class Test03_for {
	public static void main(String[] args) {
		String arr[]={"kim","lee","park"};
		for(String s:arr){ //군집 데이터만 단축형for 사용
			System.out.println(s);
		}//for
		System.out.println();//개행
		
		List<String> list = new ArrayList<String>(); //객체생성
		list.add("수박");
		list.add("참외");
		list.add("오렌지");
		
		for(String s:list){
			System.out.println(s);
		}
	}//main
}//class
