package ch14_io;
import java.io.*;

public class Test03_buff_w {

	public static void main(String[] args) {
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try{
			//fw=new FileWriter("a2.txt");
			//bw=new BufferedWriter(fw);
			bw=new BufferedWriter(new FileWriter("a2.txt"));
			
			//���Ͽ� ���ڿ� �ۼ��ϱ�
			for (int i = 1; i <= 5; i++) {
				bw.write("�ٹ�ȣ: "+i+"\n");
			}//for-end
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				bw.close();
			}catch(Exception e2){}
		}//finally-end	
	}//main-end
}//class-end
