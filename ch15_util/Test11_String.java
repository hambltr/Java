package ch15_util;

public class Test11_String {
	public static void main(String[] args) {
		String str="Good Afternoon";
		System.out.println("소문자로 변환: "+str.toLowerCase());//소문자로 변환
		System.out.println("대문자로 변환: "+ str.toUpperCase());//대문자로 변환
		System.out.println();
		
		//concat(); 문자열을 합치는 메서드
		String s1="Hello, ";
		String s2="I'm under the water ";
		System.out.println(s1.concat(s2));
		System.out.println();
		
		//문자 replace
		String s3="banana";
		System.out.println(s3.replace('a', 'o'));
		System.out.println();
		
		String s4="오늘은 평범한 화요일 입니다.";
		System.out.println(s4.replace("평범한", "그저 그런"));
	}//main-end
}//class-end
