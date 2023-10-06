package ch14_io;
import java.io.*;


public class Test08_byte_r {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("b1.txt");
			int a=-1;
			while((a=fis.read()) != -1){// 파일의 끝이 아닌 동안 반복 수행
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
