package ch05_array;
//배열은 지역에서 선언해도 자동으로 초기화 

public class Test03Array {
	public static void main(String awrgs[]){
		
		int a[]=new int[3];
		double d[]=new double[3];
		String str[]=new String[3];
		
		for (int i=0; i<3; i++){
			System.out.println(a[i]+" "+d[i]+" "+str[i]);
		}//for
		
	}//main
}//class
