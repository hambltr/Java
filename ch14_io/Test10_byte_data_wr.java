package ch14_io;
import java.io.*;


//위의 2개 클래스는 다양한 자료형에 대하여 쓰기작업, 읽기 작업을 할 수 있다.
//b3.txt

public class Test10_byte_data_wr {
	public static void main(String[] args) {
		DataOutputStream dos = null;
		try{

			dos=new DataOutputStream(new FileOutputStream("b3.txt"));
			dos.writeInt(100);
			dos.writeChar('A');
			dos.writeDouble(2.5);
			dos.writeUTF("가나다"); //writeUTF() 메서드는 인코딩 처리까지 해준다

		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				dos.close(); //**중요**
			}catch(Exception e2){}
		}//finally-end

		//파일 내용 읽어오기
		DataInputStream dis = null;
		try{
			dis=new DataInputStream(new FileInputStream("b3.txt"));
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				dis.close(); //** 중요 **
			}catch(Exception e2){}
		}//finally-end

	}//main-end
}//class-end
