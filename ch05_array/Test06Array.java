package ch05_array;

public class Test06Array {
	public static void main(String[] args) {
		int a[]={50,60,70};//배열선언, 배열생성, 기본값
		int b[];//배열선언
		
		b=a;//대입 :: *중요* :: 이걸로 a,b 모두 동일한 배열을 가짐 : Java만 가능 C는 안됨
		//대입 : 같은 곳을 참조 *****
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+" "+b[i]);
		}//for
		
	}//main
}//class


