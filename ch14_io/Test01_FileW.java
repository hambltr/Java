package ch14_io;
import java.io.*;
//a1.txt 형식으로 저장
//문자 스트림을 사용하면 유니코드로 처리되므로, 메모장으로 읽을 수 있다.

public class Test01_FileW {
	public static void main(String[] args) {
		
		FileWriter fw=null;
		
		try{
			fw=new FileWriter("a1.txt"); //객체생성
			for (int i = 0; i < 4; i++) {
				fw.write("줄번호: "+i+"\n");//파일에 쓰기 작업
			}//for-end
			
		}catch(IOException e){
			System.out.println(e);
		}finally{
			try{
				fw.close();
			}catch(Exception e2){}
		}//finally-end		
	}//main-end	
}//class-end

