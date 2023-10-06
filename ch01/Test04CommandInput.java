package ch01;

public class Test04CommandInput {
	public static void main(String args[]){
		System.out.println("인수 갯수:"+args.length);
		System.out.println("args[0]"+args[0]);
		System.out.println("args[1]"+args[1]);
		System.out.println("args[2]"+args[2]);
		
/* 		이클립스에서 실행하면 에러가 발생하는데,
		
	    Run menu >> Run Configurations... >> Arguments 탭 
		 >> Program arguments >> 값 지정 >> apply >> Run 
		 
		 이는 String args[]에 변수값을 넣어주기 위함입니다.
		 
		 만약 변수명에 띄어쓰기가 들어간다면, 쌍 따옴표를 사용하여 묶어줘야 합니다.
		 
		 ex) "alpha to omega" 
		
		cmd 창에서의 실행
		
		C:\_work\java_work\JavaPro\bin>java ch01.Test04CommandInput aaa bbb ccc
		인수 갯수:3
		args[0]aaa
		args[1]bbb
		args[2]ccc 
*/
		
		
	}//main-end
}//class-end

/*
 	명령줄 인수 (매개변수)
	Java 어플리케이션에는 반드시 main()이라는 정적 메소드가 포함되어야 한다.
	이 메소드는 String 객체배열인 인수(args) 하나를 갖는다.
	ex) main(String args[]) << args 앞 뒤에 [] 가 위치해도 상관 없다.

	이 인수의 객체들은 사용자가 명령줄에 입력 할 수 있는 모든 인수를 표현할 수 있다.

	명령줄 인수의 갯수(몇개)는 int 형이고, (식: args.length) 를 통해서 구한다.
	인수는 args[0], args[1], args[2], ... 등으로 엑세스 된다.
*/
