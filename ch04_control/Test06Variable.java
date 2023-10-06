package ch04_control;

public class Test06Variable {
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.aa();

	}//main-end
}//class-end


/*	
  	지역변수는 자동으로 초기화 안 됨, 메서드 안에서만 선언
 	전역변수는 자동으로 초기화 됨, 메서드 밖에서만 선언
*/

class Demo{
	int age;		//전역변수 0
	double height;  //전역변수 0.0
	char ch;		//공백으로 초기화
	String str;		//null로 초기화
	
	public void aa(){
		System.out.println(age);
		System.out.println(height);
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void bb(){
		int a;
		double d;
		char c;
		String s;
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
	}

}//class-end