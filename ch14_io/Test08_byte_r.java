package ch14_io;
import java.io.*;


public class Test08_byte_r {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("b1.txt");
			int a=-1;
			while((a=fis.read()) != -1){// ������ ���� �ƴ� ���� �ݺ� ����
				System.out.print(a+"");
			}//while-end
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				fis.close();
			}catch(Exception e2){}
		}
		
		
	}//main-end
}//class-end
