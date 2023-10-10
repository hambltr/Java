package ch15_util;
//String과 StringBuffer 실행속도 비교하는 예제
public class Test05_String_SB {
	public static void main(String[] args) {
		
		long start,end;//시간 저장할 변수 선언
		
		start=System.currentTimeMillis(); //현재 시스템 시간을 구한다 ( 밀리초 (ms) 1/1000sec )
		String str="";
		for(int i=0; i<=10000; i++){//1만
			str+=i;
			str+="+";
		}//for-end
		end=System.currentTimeMillis();//작업 종료 시간을 구한다
		
		System.out.println("String 작업 종료 시간 :" + (end-start)+" ms");
		
		//StringBuffer
		start=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100000; i++){ //10만
			sb.append(i);
			sb.append("+");
			
		}//for-end
		end=System.currentTimeMillis();
		System.out.println("StringBuffer 작업 종료 시간 :" + (end-start)+" ms");
		
		//sb.toString() 해서 리턴한다.
	}//main
}//class
