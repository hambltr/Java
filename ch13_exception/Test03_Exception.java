package ch13_exception;
import java.io.*;

public class Test03_Exception {

	public static void main(String[] args) {
		try{
			Runtime r=Runtime.getRuntime();//
			r.exec("c:\\Windows\\System32\\notepad.exe");//�������� ����
			r.exec("c:\\Windows\\System32\\calc.exe");//�������� ����
			
			r.exec("c:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://www.naver.com");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}//main

}//class
