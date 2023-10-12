package ch15_util;
//String�� StringBuffer ����ӵ� ���ϴ� ����
public class Test05_String_SB {
	public static void main(String[] args) {
		
		long start,end;//�ð� ������ ���� ����
		
		start=System.currentTimeMillis(); //���� �ý��� �ð��� ���Ѵ� ( �и��� (ms) 1/1000sec )
		String str="";
		for(int i=0; i<=10000; i++){//1��
			str+=i;
			str+="+";
		}//for-end
		end=System.currentTimeMillis();//�۾� ���� �ð��� ���Ѵ�
		
		System.out.println("String �۾� ���� �ð� :" + (end-start)+" ms");
		
		//StringBuffer
		start=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100000; i++){ //10��
			sb.append(i);
			sb.append("+");
			
		}//for-end
		end=System.currentTimeMillis();
		System.out.println("StringBuffer �۾� ���� �ð� :" + (end-start)+" ms");
		
		//sb.toString() �ؼ� �����Ѵ�.
	}//main
}//class
