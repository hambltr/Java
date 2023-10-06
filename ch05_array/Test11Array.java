package ch05_array;
//3차원 배열, 3중 for문
public class Test11Array {
	public static void main(String[] args) {
		//a b c
		//d e f 0번째 면
		//
		//g h i
		//j k l 1번째 면

		char ch[][][]={
				{{'a','b','c'},{'d','e','f'}},
				{{'g','h','i'},{'j','k','l'}}
		};

		for(int i=0; i<2; i++){//면
			for(int j=0; j<2; j++){//행
				for(int k=0; k<3; k++){//열

					System.out.print(ch[i][j][k]+" ");
//										면   행   열
				}//inner-for
				System.out.println();//행구분
			}//middle-for
			System.out.println();//면구분
		}//out-for
	}//main
}//class
