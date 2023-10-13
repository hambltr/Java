package ch19_network;
import java.io.*;
import java.net.*;
import java.rmi.server.ExportException;

import javax.swing.tree.ExpandVetoException;

//�������α׷�
//ServerSocket : ���� ����
//Socket : ��ȭ �ϱ� ���� �ʿ�
public class SimpleServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sock = null;
		
		String msg = "�ݰ����ϴ� ������ �� 192.168.0.132";
		
		DataOutputStream out = null;
		DataInputStream in = null;
		
		try{
			ss=new ServerSocket(5555); //��������
			System.out.println("���� ���� ��..");
		}catch(Exception ex){
			System.out.println(ex);
		}
		
		while(true){
			try{
				sock=ss.accept(); //Ŭ���̾�Ʈ ������ �޴´�
				
				out=new DataOutputStream(sock.getOutputStream());
				out.writeUTF(msg); // msg������ Ŭ���̾�Ʈ�� ������
				
				in = new DataInputStream(sock.getInputStream());
				System.out.println(in.readUTF()); //Ŭ���̾�Ʈ�� ������ ������ �޾Ƽ� ���
				
				out.close();
				in.close();
				sock.close();
				
			}catch(Exception e){
				System.out.println(e);
			}
		}//while-end
	}//main-end
}//class-end
