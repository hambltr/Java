package ch04_control;

public class Test01If {
	public static void main(String[] args) {
		//if문 예제
		//if(7<3){
		//System.out.println("7>3");
		//} false 인 경우 걍 실행을 안해버림

		//어떤 수를 입력 받아서 이 수가 홀수인지 짝수인지 판별
		int num2=Integer.parseInt(args[0]);//문자열을 숫자로 변환
		if (num2%2==0){
			System.out.println("입력하신 숫자 '"+num2+"'은/는 짝수 입니다.");
		}//홀짝 if-end

		else if (num2%2 !=0){
			System.out.println("입력하신 숫자 '"+num2+"'은/는 홀수 입니다.");
		}//홀짝 else-end 

		System.out.println("----------------------------");
		
		//어떤 수를 입력받아서 3의 배수인지 판별
		int num3=Integer.parseInt(args[1]);
		if (num3%3==0){
			System.out.println("입력하신 숫자 '"+num3+"'은/는 3의 배수 입니다.");
		}//3의배수 if-end
		
		else if (num3%3!=0){
			System.out.println("입력하신 숫자 '"+num3+"'은/는 3의 배수가 아닙니다.");
		}//3의배수 else-end

		System.out.println("----------------------------");
		
		//어떤 수를 입력받아서 7의 배수인지 판별
		int num7=Integer.parseInt(args[2]);
		if (num7%7==0){
			System.out.println("입력하신 숫자 '"+num7+"'은/는 7의 배수 입니다.");
		}//3의배수 if-end
		
		else if (num7%7!=0){
			System.out.println("입력하신 숫자 '"+num7+"'은/는 7의 배수가 아닙니다.");
		}//3의배수 else-end
		
	}//main-end
}//class-end