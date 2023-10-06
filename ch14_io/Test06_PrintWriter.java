package ch14_io;
import java.io.*;
//생성자
//PrintWriter(OutputStream os)
//PrintWriter(OutputStream os, boolean, flushOnNewLine)
//boolean, flushOnNewLine : 개행을 할 것인지 지정
	//true = 문자열을 출력할 때 마다 출력 스트림을 비우고 개행
	//false = 저 위에 짓거리를 안함

//PrintWriter(writer w)
//PrintWriter(writer w,boolean, flushOnNewLine)

//java의 PrintWriter 객체는 Object를 비롯한 모든 객체에 print()와  println() 메서드를 지원한다.

public class Test06_PrintWriter {
	public static void main(String[] args) {
		PrintWriter pp = new PrintWriter(System.out); //객체생성
		
		Object ob=new String("문자열");
		pp.println(ob);
		pp.println('A');
		pp.println(100);
		pp.println(true);
		pp.println(1.5);
		pp.println("졸려");
		pp.println(new java.util.Date());
		
		
		pp.close();
	}//main-end
}//class-end
