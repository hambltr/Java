package ch01;
//명령들 인수값 받기
public class Test05CommandInput {
	public static void main(String args[]){
		
		int su1=Integer.parseInt(args[0]);// integer.parseInt("123") : 문자열을 정수로 변환
		int su2=Integer.parseInt(args[1]);// integer.parseInt("123") : 문자열을 정수로 변환
		int s1=su1+su2;//덧셈 (합)
		int s2=su1-su2;//뺄셈 (차)
		
		System.out.println("두 수를 더한 값은 "+s1+" 입니다.");
		System.out.println("두 수를 뺀 값은 "+s2+" 입니다.");
		
		/* 
		숫자 : 연산을 할 수 있어야 숫자임
		주민번호, 전화번호, 우편번호 : 문자열 (String)
		
		Integer.parseInt >> 문자열을 정수로 변환
		""+정수 >> 정수를 문자열로 자동 변환, 이를 문자열 연결 또는 문자열 결합 이라고 합니다.
		
			Java에서 메서드와 클래스 이름을 정의할 때, 
			메서드명을 식별하기 위한 규칙으로 카멜 표기법(Camel Case)을 사용합니다. 
			이 규칙에 따라 메서드명은 소문자로 시작하고, 다음 단어의 시작 부분에 대문자를 사용합니다. 
			따라서 parseInt와 같이 대문자로 시작하는 메서드명이 권장되며, 
			이 규칙을 따르지 않는 경우 컴파일 오류가 발생할 수 있습니다.
		 
		이클립스에서 실행하면, 에러가 발생합니다.
		이 에러는 코드에 오류가 있는 것이 아닌, 배열 값이 지정되지 않아서 발생하는 에러입니다.
		그러므로 다음과 같이 배열 값을 지정해 주면 됩니다.
		
		Run Configurations >> arguments >> program arguments 
		>> 값 입력 및 apply >> Run
		*/
		
		//""+정수 : 실습
		int a=100;
		int b=200;
		
		System.out.println("정수를 문자열로 변환하기 실습");
		String str1=""+a;//정수를 문자열로 변환, 연산 안 됨
		String str2=""+b;
		System.out.println(a+b);//정수연산
			//이는 정수로 선언한 a와 b를 불러와 연산했으므로
			//100+200이 연산되어 300의 값으로 출력됩니다.
		System.out.println(str1+str2);//문자열 연결하여 출력 됨
			// str1, str2 라는 선언에서 문자형으로 변환된 100과 200이 있을 뿐이므로
			// 출력값은 연산된 값이 아닌 100200 입니다.
		
		
		
	}//main-end
}//class-end
