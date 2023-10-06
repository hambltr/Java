package ch04_control;
//break문 실습
public class Test20Break {
	public static void main(String[] args) {
	
		for(int i=1; i<=10000; i++){
			System.out.println(i+" Hi");
			if(i==10) break; //for 블럭 loop 탈출
		}//for
		System.out.println();//개행
		
		int j=1;
		while(j<=1000){
			System.out.println(j+ " Aloha");
			if(j==5) break; //while블럭 loop 탈출
			j++;
		}
		
	}//main

}//class
