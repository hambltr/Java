package ch15_util;
import java.util.Date;
//import java.sql.Date; sql���� date ǥ�Ⱑ ����
//import java.sql.*;
import java.text.SimpleDateFormat; //��¥ ���� ���

public class Test02_Date {
	public static void main(String[] args) {
		
		Date date = new Date(); //��ü����
		java.util.Date date2 = new java.util.Date();
		//�տ� java.util. ���������� import ���ϰ� ����� �� �� ����
		
		System.out.println(date);
		System.out.println("============================");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		//����
		
		System.out.println("==========");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //����Ͻú���
		System.out.println(sdf2.format(date));
		//����
		
		System.out.println("==========");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��"); //����Ͻú���
		System.out.println(sdf3.format(date));
		//����
		
		System.out.println("==========");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a"); //����Ͻú��� ���� ampm
		System.out.println(sdf4.format(date));
		//����
		
	}//main-end
}//class-end
