package ch14_io;
import java.io.*;
//바이트스트림 io 실습

public class Test07_byte_w {
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("b1.txt");
			for (int i = 1; i < 8; i++) {
				fos.write(i); //파일에 쓰기 작업
				
			}//for-end
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				fos.close();
			}catch(Exception e2){}
		}
		
	}//main-end
}//class-end
