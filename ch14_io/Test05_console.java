package ch14_io;
import java.io.*;
//System.in�� InputStream�� ��ü�̱� ������
//InputStreamReader ������ �μ��� ���޵ȴ�
//ex) InputStreamReader(InputStream is)
//	�׷� ���� InputStreamReader ��ü�� BufferedReader ������ �μ��� ����
// �̷��� ������� Ű���忡�Լ� ���� �Է� �޴´�.

//ex) new BufferedReader (new InputStreamReader(System.in))

public class Test05_console {
	public static void main(String args[]) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String strKor,strEng;
		int kor,eng;
		
		System.out.println("���� ���� �Է�: ");
		strKor=in.readLine();
		
		System.out.println("���� ���� �Է�: ");
		strEng=in.readLine();
		
		kor=Integer.parseInt(strKor);//���ڿ��� ������ ��ȯ
		eng=Integer.parseInt(strEng);//���ڿ��� ������ ��ȯ
		int tot=kor+eng;
		double avg=(double)tot/2;
		
		System.out.println();
		System.out.println("tot: "+tot);
		System.out.println("avg: "+avg);
		
		in.close();//*�߿�*
		
	}//main-end
}//class-end
