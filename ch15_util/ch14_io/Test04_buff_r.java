package ch14_io;
import java.io.*;
//a2.txt 파일 읽어오기


public class Test04_buff_r {
	public static void main(String args[]){
		//FileReader fr=null;
		BufferedReader br=null;
		try{
			//fr=new FileReader("a2.txt");
			//br=new BufferedReader(fr);
			br=new BufferedReader(new FileReader("a2.txt"));
			
			String str="";//null
			while((str=br.readLine()) !=null ){//파일의 끝이 아닌동안 반복 (null)
				System.out.println(str);
			}//while-end
			
		}catch(Exception e){
			System.out.println(e);
			
		}finally{
			try{
				br.close();
			}catch(Exception e2){}
			
		}//finally-end
		
	}//main-end
}//class-end
