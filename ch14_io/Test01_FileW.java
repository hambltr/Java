package ch14_io;
import java.io.*;
//a1.txt �������� ����
//���� ��Ʈ���� ����ϸ� �����ڵ�� ó���ǹǷ�, �޸������� ���� �� �ִ�.

public class Test01_FileW {
	public static void main(String[] args) {
		
		FileWriter fw=null;
		
		try{
			fw=new FileWriter("a1.txt"); //��ü����
			for (int i = 0; i < 4; i++) {
				fw.write("�ٹ�ȣ: "+i+"\n");//���Ͽ� ���� �۾�
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

