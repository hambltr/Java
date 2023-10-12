package ch15_util;
import java.util.Random;
//Random 클래스 예제

public class Test12_Random {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 1; i <= 10; i++) {
//			int a1=r.nextInt(); // 음수, 양수
//			System.out.println(a1+" "); 
			
//			int a2 = r.nextInt(10); // 0~10까지의 난수
//			System.out.println(a2);
//			
//			float a3 = r.nextFloat(); //0.0~ 1.0 사이의 난수
//			System.out.println(a3);
			
			double a4 = r.nextDouble(); //0.0~ 1.0 사이의 난수
			System.out.println(a4);
			
		}//for
		
	}//main-end
}//class-end
