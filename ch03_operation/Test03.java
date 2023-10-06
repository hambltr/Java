package ch03_operation;

public class Test03 {
	public static void main(String args[]){
		
		//관계연산자
		int a=5,b=7;
		System.out.println("-------관계연산자-------");
		System.out.println(a>b);  //a는 b보다 크다
		System.out.println(a>=b); //a는 b보다 크거나 같다
		System.out.println(a<b);  //a는 b보다 작다
		System.out.println(a<=b); //a는 b보다 작거나 같다
		System.out.println(a==b); //a는 b와 같다
		System.out.println(a!=b); //a는 b와 다르다
		System.out.println(a>2);  //a는 2보다 크다
		System.out.println(7>5);  //7은 5보다 크다
		
		System.out.println("-------논리연산자-------");
		//논리연산자
		System.out.println(a>b && a<6); //a가 b보다 크다 and a가 6보다 작다. -> 두 명제가 true 일 경우, true 출력
		//                True   False  : &&(참참, and) >> False 출력
		System.out.println(a>b || a<6); //a가 b보다 크다 or a가6보다 작다. -> 두 명제 중 하나만 true 일 경우, true 출력
		//                True   False  : ||(둘 중 하나가 참이면, or) >> True 출력
		
		boolean c=true; //c 는 참이라고 변수 선언
		System.out.println(c); //c는 참이므로 true
		System.out.println(!c); //!c  :c의 부정이므로 false
		System.out.println(!!c);//!!c :c의 부정이 두번 들어갔으므로 true
	}//main-end
}//class-end
