package ch14_io;
import java.io.*;


//���� 2�� Ŭ������ �پ��� �ڷ����� ���Ͽ� �����۾�, �б� �۾��� �� �� �ִ�.
//b3.txt

public class Test10_byte_data_wr {
	public static void main(String[] args) {
		DataOutputStream dos = null;
		try{

			dos=new DataOutputStream(new FileOutputStream("b3.txt"));
			dos.writeInt(100);
			dos.writeChar('A');
			dos.writeDouble(2.5);
			dos.writeUTF("������"); //writeUTF() �޼���� ���ڵ� ó������ ���ش�

		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				dos.close(); //**�߿�**
			}catch(Exception e2){}
		}//finally-end

		//���� ���� �о����
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
				dis.close(); //** �߿� **
			}catch(Exception e2){}
		}//finally-end

	}//main-end
}//class-end
