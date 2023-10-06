package ch04_control;
import java.util.Scanner;
public class Test07Switch {
	public static void main(String[] args) {
		//연산자를 입력 받고 그에 해당하는 연산을 수행하시오.
		
		int x=10;
		int y=7;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자 + - * / % 중 하나를 입력하세요: ");
		
		char oper=scan.next().charAt(0);//문자열에서 0번째 문자를 불러오기 객체.메서드();
		//GoodMorning
		//0123456789
		
		switch(oper){
		case'+':
			System.out.println(x+"+"+y+"="+(x+y)+" 입니다.");
			break;
		case'-':
			System.out.println(x+"-"+y+"="+(x-y)+" 입니다.");
			break;
		case'*':
			System.out.println(x+"*"+y+"="+(x*y)+" 입니다.");
			break;
		case'/':
			System.out.println(x+"/"+y+"="+(x/y)+" 입니다.");
			break;
		case'%':
			System.out.println(x+"%"+y+"="+(x%y)+" 입니다.");
			break;
		}
	}
}
