package ch16_util;
import java.util.List;
import java.util.ArrayList;

public class Test03_for {
	public static void main(String[] args) {
		String arr[]={"kim","lee","park"};
		for(String s:arr){ //���� �����͸� ������for ���
			System.out.println(s);
		}//for
		System.out.println();//����
		
		List<String> list = new ArrayList<String>(); //��ü����
		list.add("����");
		list.add("����");
		list.add("������");
		
		for(String s:list){
			System.out.println(s);
		}
	}//main
}//class
