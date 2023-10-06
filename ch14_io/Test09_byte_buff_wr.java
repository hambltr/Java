package ch14_io;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class Test09_byte_buff_wr {
	
	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try{
			bos=new BufferedOutputStream(new FileOutputStream("b2.txt"));
			
			for (int i = 1; i < 11; i++) {
				bos.write(i);//���Ͽ� ����
			}//for-end
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				bos.close();
			}catch (Exception e2){}
		}//finally-end
		
		//���� �б�
		
		BufferedInputStream bis=null;
		try{
			bis=new BufferedInputStream(new FileInputStream("b2.txt"));
			
			int a=-1;
			//int a : �ʱ�ȭ �ص� �Ǵµ� ���ص� �� �ٵ� ���ϸ� ��  a����Ҷ� �ȳ���
			while((a=bis.read()) != -1){//���� ���� �ƴ� ���� �ݺ�����
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
