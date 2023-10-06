package ch14_io;
import java.io.*;
//a1.txt 읽어와서 출력하기

public class Test02_FileR {
	public static void main(String[] args) {
		FileReader fr = null;
		try{
			fr=new FileReader("a1.txt");
			int a;
			while((a=fr.read()) != -1){ //파일의 끝이 아닌 경우, 반복 수행
				System.out.print((char)a);
			}//while-end
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				fr.close(); // 에러가 어쨌든 무조건 .close 해줄것!!
			}catch(Exception e2){}
		}
		
	}//main
}//class
