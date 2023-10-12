package ch16_util;
import java.util.Set; 
import java.util.HashSet; 
import java.util.Iterator;

public class Test06_Set_Lotto {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		while(set.size()<6){
			int a=(int)(Math.random()*45+1);
			String str=a+"";
			set.add(str);
		}//while
		
		//Ãâ·Â
		for(String s:set){
			System.out.println(s+" ");
		}//for
	}//main
}//class
