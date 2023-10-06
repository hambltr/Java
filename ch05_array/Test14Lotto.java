package ch05_array;

public class Test14Lotto {
	public static void main(String args[]){
		
		int lotto[]=new int[6];//배열선언, 배열생성
		
		for(int i=0; i<6; i++){
			lotto[i]=(int)(Math.random()*45+1);	//난수 발생
			//여기에서 중복되는 수가 발생할 경우,
			
			for (int j=0; j<i; j++){
				if (lotto[i]==lotto[j]){
					i--; //중복 발생한 값 초기화
					break; //inner_for break
					
				}//if
			}//inner_for
			
		}//out_for
		
		//배열값 출력
		for (int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}
	}//main
}//class
