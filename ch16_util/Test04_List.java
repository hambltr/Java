package ch16_util;
import java.util.*;

public class Test04_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// ��ü����
		
		//�׸��߰�
		list.add("�λ��"); //index=0
		list.add("�ѹ���");  		//1
		list.add("�λ��");  		//2
		list.add("ȸ��");   		//3
		list.add("�λ��"); 		//4
		
		//�׸� ���� ���ϴ� �޼��� : size()
		System.out.println("size() �׸� ����: "+list.size());
		System.out.println("=================");//����
		
		//���� for ���
		for(String s:list){
			System.out.println(s);
		}//for
		
		System.out.println("=================");
		//�Ϲ� for ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get(index) "+list.get(i)); //get(index) : index�� �ش��ϴ� �׸��� ��´�.
		}//for
		
		System.out.println("=================");
		
		//ù��° �׸� ��� (n��° -> .get(n-1))
		System.out.println("ù��° �׸�: " + list.get(0));
		
		System.out.println("=================");
		
		//Iterator�� �޾Ƽ� ����Ͻÿ�
		Iterator iter = list.iterator(); // ���� ���� (������) ó��
		while(iter.hasNext()){
			System.out.println("������ó��: " + iter.next());
		}//while
		
	}//main
}//class
