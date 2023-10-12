package ch16_util;

//���ʸ� ��� ����

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Test02_Generic {
	//����� ���� �޼���
	private void testCollection(){
		List<String> list = new ArrayList<String>();
		
		list.add(new String("hello")); //�׸� �߰�
		list.add(new String("good"));
		//list.add(new Integer(100)); //������ ����
		
		outPrint(list);
	}//testCollection()
	
	//����� ���� �޼���
	public void outPrint(Collection c){
		Iterator iter = c.iterator();
		while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ�����
			String item=(String)iter.next();
			System.out.println(item);
		}//while-end
	}//outPrint()
	public static void main(String[] args) {
		Test02_Generic t = new Test02_Generic(); //��ü����
		t.testCollection();
	}//main
}//class
