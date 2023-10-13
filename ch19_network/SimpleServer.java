package ch19_network;
import java.io.*;
import java.net.*;
import java.rmi.server.ExportException;

import javax.swing.tree.ExpandVetoException;

//서버프로그램
//ServerSocket : 서버 구동
//Socket : 대화 하기 위해 필요
public class SimpleServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sock = null;
		
		String msg = "반갑습니다 서버의 말 192.168.0.132";
		
		DataOutputStream out = null;
		DataInputStream in = null;
		
		try{
			ss=new ServerSocket(5555); //서버구동
			System.out.println("서버 구동 중..");
		}catch(Exception ex){
			System.out.println(ex);
		}
		
		while(true){
			try{
				sock=ss.accept(); //클라이언트 접속을 받는다
				
				out=new DataOutputStream(sock.getOutputStream());
				out.writeUTF(msg); // msg내용을 클라이언트로 보낸다
				
				in = new DataInputStream(sock.getInputStream());
				System.out.println(in.readUTF()); //클라이언트가 보내준 내용을 받아서 출력
				
				out.close();
				in.close();
				sock.close();
				
			}catch(Exception e){
				System.out.println(e);
			}
		}//while-end
	}//main-end
}//class-end
