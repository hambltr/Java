package ch02_dataType;

public class Test05 {
	public static void main(String args[]){
		//정수
		//10진을 2진으로 출력
		//10진을 8진으로 출력
		//10진을 16진으로 출력
		
		int a=10;
		System.out.println(a);//10진수 출력
		System.out.println(Integer.toBinaryString(a));//2진수
		System.out.println(Integer.toOctalString(a));//8진수
		System.out.println(Integer.toHexString(a));//16진수
		
		System.out.println("------------------------------");
		
		int b=014;// 숫자 앞에 0이 오면 8진  >> 12
		int c=0xA;// 숫자 앞에 0x가 오면 16진  >> 10
		
		System.out.println("b: "+b);
		System.out.println("8진수의 b: "+Integer.toOctalString(b));//8진수
		System.out.println("c: "+c);
		System.out.println("16진수의 c: "+Integer.toHexString(c));//16진수
		
		
		
	}//main-end
}//class-end
