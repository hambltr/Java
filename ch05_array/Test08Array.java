package ch05_array;

public class Test08Array {
	public static void main(String[] args) {

		int a[][]={
				{10,20},
				{30,40,50},
				{88,88,88,88,88}
		};
		System.out.println("행수: "+a.length);
		System.out.println("열 갯수: "+a[0].length);
		System.out.println("열 갯수: "+a[1].length);
		System.out.println("열 갯수: "+a[2].length);
		
		//출력
		// 10 20
		// 30 40 50
		
		for(int i=0; i<a.length; i++){//행-out
			for(int j=0; j<a[i].length; j++){//열-inner
				System.out.print(a[i][j]+" ");
				//                 행  렬
			}//inner
			System.out.println();//ㄱㅎ
		}//out 
		
	}//main
}//class
