package ch14_io;
import java.io.*;

public class Test13_Seri {
	public static void main(String[] args) throws Exception {
		Test12_Phone phone = new Test12_Phone("갤럭시S23", 1160000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ob.txt"));
		
		oos.writeObject(phone);//**
		oos.close();
		
		
		//파일 읽어오기
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ob.txt"));
		Test12_Phone phone2=(Test12_Phone)ois.readObject();//**
		System.out.println("핸드폰 이름: "+phone2.getName());
		System.out.println("핸드폰 가격: "+phone2.getPrice());
		ois.close();
		
		
	}//main-end
}//class-end
