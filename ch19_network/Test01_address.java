package ch19_network;
import java.net.*;

public class Test01_address {

	public static void main(String[] args) {

		try{
			InetAddress addr[] = InetAddress.getAllByName("www.google.com");

			for(int i=0; i<addr.length; i++){
				System.out.println(addr[i].getHostAddress()); //ip
				System.out.println(addr[i].getHostName());	  //µµ¸ÞÀÎ
			}//for-end

		}catch(Exception e){
			System.out.println(e);
		}//try-catch-end

	}//main-end

}//class-end
