package ch14_io;
import java.io.*;
//������
//PrintWriter(OutputStream os)
//PrintWriter(OutputStream os, boolean, flushOnNewLine)
//boolean, flushOnNewLine : ������ �� ������ ����
	//true = ���ڿ��� ����� �� ���� ��� ��Ʈ���� ���� ����
	//false = �� ���� ���Ÿ��� ����

//PrintWriter(writer w)
//PrintWriter(writer w,boolean, flushOnNewLine)

//java�� PrintWriter ��ü�� Object�� ����� ��� ��ü�� print()��  println() �޼��带 �����Ѵ�.

public class Test06_PrintWriter {
	public static void main(String[] args) {
		PrintWriter pp = new PrintWriter(System.out); //��ü����
		
		Object ob=new String("���ڿ�");
		pp.println(ob);
		pp.println('A');
		pp.println(100);
		pp.println(true);
		pp.println(1.5);
		pp.println("����");
		pp.println(new java.util.Date());
		
		
		pp.close();
	}//main-end
}//class-end
