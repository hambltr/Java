package ch04_control;
//break�� �ǽ�
public class Test20Break {
	public static void main(String[] args) {
	
		for(int i=1; i<=10000; i++){
			System.out.println(i+" Hi");
			if(i==10) break; //for �� loop Ż��
		}//for
		System.out.println();//����
		
		int j=1;
		while(j<=1000){
			System.out.println(j+ " Aloha");
			if(j==5) break; //while�� loop Ż��
			j++;
		}
		
	}//main

}//class
