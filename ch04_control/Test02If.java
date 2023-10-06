package ch04_control;

public class Test02If {
	public static void main(String[] args) {
		//문제: 어떤 수를 입력 받아서, 이 수가 양수인지 음수인지 판별

		int num=Integer.parseInt(args[0]);
		if (num<0){
			System.out.println("입력하신 숫자 '"+num+"'은/는 음수 입니다.");
		}
		else if (num>0){
			System.out.println("입력하신 숫자 '"+num+"'은/는 양수 입니다.");			
		}
		else if (num==0){
			System.out.println("입력하신 숫자 '"+num+"'은/는 음수도 양수도 아닌 '0' 입니다.");	
		}

	}//class-end
}//main-end
