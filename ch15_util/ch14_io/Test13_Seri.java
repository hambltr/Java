package ch14_io;
import java.io.*;

public class Test13_Seri {
	public static void main(String[] args) throws Exception {
		Test12_Phone phone = new Test12_Phone("������S23", 1160000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ob.txt"));
		
		oos.writeObject(phone);//**
		oos.close();
		
		
		//���� �о����
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ob.txt"));
		Test12_Phone phone2=(Test12_Phone)ois.readObject();//**
		System.out.println("�ڵ��� �̸�: "+phone2.getName());
		System.out.println("�ڵ��� ����: "+phone2.getPrice());
		ois.close();
		
		
	}//main-end
}//class-end
