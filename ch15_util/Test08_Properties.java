package ch15_util;
import java.util.Properties;
import java.io.*;

//I/O , DB �۾��� Exception �ʼ�!!

//Properties Ŭ������ ��� ����
public class Test08_Properties {
	//����
	//������
	public Test08_Properties(){
		Properties pro = new Properties();//��ü����

		try{
			pro.load(new FileInputStream("C:\\_work\\java_work\\db.properties"));
		}catch(Exception e){
			System.out.println(e);
		}
	
		//key ���� ���ؼ� ���� ��´�.
		String driver=pro.getProperty("DRIVER");
		String url=pro.getProperty("URL");
		String user=pro.getProperty("USER");
		String pwd=pro.getProperty("PWD");
		
		//DB �����Ͽ�
		//DB ó��
		//DB ���
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
		
	}//cons-end
	
	
	//�޼���
	//main
	public static void main(String[] args) {
		new Test08_Properties();//��ü����, ������ ȣ��
	}
	
}
