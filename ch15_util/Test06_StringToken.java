package ch15_util;
import java.util.StringTokenizer;
//StringTokenizer : ���ڿ� �Ľ�
//�޼����
//nextToken(): �Ľ̵� ���ڿ��� ���ʷ� ��ȯ�Ѵ�.
//hasMoreTokens(): nextToken() ������ Token ���� ���� Ȯ��	
//countTokens(): Token�� ������ return ��

public class Test06_StringToken {

	public static void main(String[] args) {
		
		//��ū �и� ��ȣ�� ���� ������ ������ ��
		//��ū �и� ��ȣ�� ���� ǥ���� �� ������� �ʴ� ��ȣ�� �ۼ��ؾ� �Ѵ�. ex) "|" (shift+��ȭ)
		
		StringTokenizer st = new StringTokenizer("�趱��|«¥��|���뱹|���|������","|");
													//�и� ��ȣ�� "|" ���� �ϰڴ� ���� (�������� �����ϴ� ��� �� �Ƚ��൵ �˴ϴ�.)
		System.out.println("�Ľ̵� ���ڿ��� �� ����: "+st.countTokens()+" ��");
		
		System.out.println();
		
		//�Ľ̵� ���ڿ� ����ϱ�
		while(st.hasMoreTokens()){//��ū�� �ִ� ���� �ݺ� ó��
			System.out.println(st.nextToken());//�Ľ̵� ���ڿ��� ���ʷ� return
		}//while-end
		
		System.out.println();
		
		//String Ŭ������ split() �� �Ľ� �� ���� �ִ�.
		String str="�����:���α�:�븢2��";
		String temp[]=str.split(":");
		for (int i=0; i< temp.length; i++){
			System.out.println(temp[i]);
			
		}//for-end
		
	}//main
	
}//class
