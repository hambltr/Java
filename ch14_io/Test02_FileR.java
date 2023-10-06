package ch14_io;
import java.io.*;
//a1.txt �о�ͼ� ����ϱ�

public class Test02_FileR {
	public static void main(String[] args) {
		FileReader fr = null;
		try{
			fr=new FileReader("a1.txt");
			int a;
			while((a=fr.read()) != -1){ //������ ���� �ƴ� ���, �ݺ� ����
				System.out.print((char)a);
			}//while-end
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				fr.close(); // ������ ��·�� ������ .close ���ٰ�!!
			}catch(Exception e2){}
		}
		
	}//main
}//class
