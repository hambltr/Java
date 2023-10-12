package ch16_util;
//Generic �ǽ�
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


//���ʸ��� ����ϸ� �����Ͻÿ� ������ �߻���Ų��
//Iterator �� Enumeration�� Collection(List, Vector, Properties...)��
//�����Ͽ�  �޾Ƴ� �� �ִ� ����� �����Ѵ�.

public class Test01_Generic {

	//����� ���� �޼���
	private void testCollection(){
		List list = new ArrayList(); //��ü����
		//  �������̽�           Ŭ����

//		list.add("hello"); : �̷��� �ص� String ������
//		list.add("good");
		
		list.add(new String("hello"));
		list.add(new String("good"));
		list.add(new Integer(100)); //������ ���� 

		outPrint(list); //�޼��� ȣ��
	}//testCollection()-end

	//����� ���� �޼���
	public void outPrint(Collection c){	
		Iterator iter = c.iterator();
		while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ� ����
			String item=(String)iter.next();//����� java.lang.ClassCastException ���� �߻�
			System.out.println(item);

		}//while
	}//outPrint()

	public static void main(String[] args) {
		Test01_Generic t = new Test01_Generic();
		t.testCollection();
		
	}//main-end
}//class-end
