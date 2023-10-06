package ch05_array;
//2차 배열 예제
public class Test09Array {
	public static void main(String[] args) {
		
		double ki[][]={
					  {177.7, 166.6},
					  {188.8, 157.7}
		};
		
		
		//2차원 배열은 2중 for문 사용
		for(int i=0; i<ki.length; i++){
			for(int j=0; j<ki[i].length; j++){
				System.out.print(ki[i][j]+"  ");
			}//inner
			System.out.println();//행 구분 개행
			
		}//out
	}//main
}
//class