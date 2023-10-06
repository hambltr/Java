package ch14_io;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class Test09_byte_buff_wr {
	
	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try{
			bos=new BufferedOutputStream(new FileOutputStream("b2.txt"));
			
			for (int i = 1; i < 11; i++) {
				bos.write(i);//파일에 쓰기
			}//for-end
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				bos.close();
			}catch (Exception e2){}
		}//finally-end
		
		//파일 읽기
		
		BufferedInputStream bis=null;
		try{
			bis=new BufferedInputStream(new FileInputStream("b2.txt"));
			
			int a=-1;
			//int a : 초기화 해도 되는데 안해도 됨 근데 안하면 걍  a출력할때 안나옴
			while((a=bis.read()) != -1){//파일 끝이 아닌 동안 반복수행
				System.out.print(a+" ");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				bis.close();
			}catch (Exception e2){}
		}
	}//main-end
}//class-end
