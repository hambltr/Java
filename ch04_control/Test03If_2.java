package ch04_control;

public class Test03If_2 {
	public static void main(String args[]){
		//4와 7의 공배수 판별
		int num = Integer.parseInt(args[0]);
		if (num%4==0 && num%7==0){
			System.out.println("이 수는 4와 7의 공배수 입니다.");
		}else{
			System.out.println("이 수는 4와 7의 공배수가 아닙니다.");
		}
	}
}
