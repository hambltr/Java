package ch04_control;

public class Test11for {
	public static void main(String args[]){
		//알파벳 A~Z 까지 출력
		//ASCII code 값 65='A' 90='Z'
		
		//ASCII code
		for (int i=65; i<=90; i++){
			System.out.print((char)(i));
		}//for-end
		
		System.out.println();
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}//for-end
		
	}//main-end
}//class-end
