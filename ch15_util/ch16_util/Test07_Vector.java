package ch16_util;
import java.util.*;
//Vector�ǽ�
public class Test07_Vector {
	public static void main(String[] args) {
		Vector<String> vec = new Vector <String>();

		vec.add("aa");
		vec.add("bb");
		vec.add("cc");
		vec.add("dd");
		vec.add("ee");

		System.out.println("size(): "+vec.size());
		System.out.println("-----����for-----");

		//���� for
		for(String s:vec){
			System.out.println(s);
		}//for-end

		System.out.println("-----�Ϲ�for-----");
		//�Ϲ�for
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}//for-end

		System.out.println("----------");
		//Iterator�� �޾Ƽ� ó���ϱ�
		Iterator iter=vec.iterator();
		while(iter.hasNext()){
			//String str=(String)iter.next();
			//System.out.println(str);
			
			//Object Ŭ������ toString()�� �ִ�	
			System.out.println(iter.next().toString());
			
		}//while
		
	}//main
}//class
