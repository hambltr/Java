package ch16_util;
import java.util.Set; // �������̽�
import java.util.HashSet; // Ŭ����
import java.util.Iterator; // ��� �÷��� Ÿ���� �ڷḦ �޾Ƽ� ó���� �� �ִ�

//Set, HashSet : �ߺ� ��� �ȵȴ� : (�� �� �Ⱦ�) : �ζ� �������� ��

public class Test05_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //��ü����
		
		set.add("�λ��");
		set.add("�ѹ���");
		set.add("�λ��");
		set.add("ȸ��");
		set.add("�λ��");
		
		System.out.println("size(): "+set.size());
		//Set, HashSet �ߺ� ��� �Ұ� 
		
		System.out.println("===================");
		
		//���� for ���
		for(String s:set){
			System.out.println(s);
		}
		System.out.println("===================");
		
		//Iterator ���
		Iterator iter = set.iterator();
		while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ� ����
			System.out.println(iter.next());		
		}//while
		
	}//main

}//class
