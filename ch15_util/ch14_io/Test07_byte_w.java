package ch14_io;
import java.io.*;
//����Ʈ��Ʈ�� io �ǽ�

public class Test07_byte_w {
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("b1.txt");
			for (int i = 1; i < 8; i++) {
				fos.write(i); //���Ͽ� ���� �۾�
				
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
