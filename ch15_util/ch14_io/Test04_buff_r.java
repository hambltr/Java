package ch14_io;
import java.io.*;
//a2.txt ���� �о����


public class Test04_buff_r {
	public static void main(String args[]){
		//FileReader fr=null;
		BufferedReader br=null;
		try{
			//fr=new FileReader("a2.txt");
			//br=new BufferedReader(fr);
			br=new BufferedReader(new FileReader("a2.txt"));
			
			String str="";//null
			while((str=br.readLine()) !=null ){//������ ���� �ƴѵ��� �ݺ� (null)
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
