package ch14_io;
import java.io.*;
//System.in은 InputStream의 객체이기 때문에
//InputStreamReader 생성자 인수로 전달된다
//ex) InputStreamReader(InputStream is)
//	그런 다음 InputStreamReader 객체가 BufferedReader 생성자 인수로 들어간다
// 이러한 방법으로 키보드에게서 값을 입력 받는다.

//ex) new BufferedReader (new InputStreamReader(System.in))

public class Test05_console {
	public static void main(String args[]) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String strKor,strEng;
		int kor,eng;
		
		System.out.println("국어 점수 입력: ");
		strKor=in.readLine();
		
		System.out.println("영어 점수 입력: ");
		strEng=in.readLine();
		
		kor=Integer.parseInt(strKor);//문자열을 정수로 변환
		eng=Integer.parseInt(strEng);//문자열을 정수로 변환
		int tot=kor+eng;
		double avg=(double)tot/2;
		
		System.out.println();
		System.out.println("tot: "+tot);
		System.out.println("avg: "+avg);
		
		in.close();//*중요*
		
	}//main-end
}//class-end
