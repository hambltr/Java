package ch05_array;

public class Test07Array {
	public static void main(String[] args) {
		//문자열을 각 문자 배열 요소로 분해하기
		
		String str="Good-After-noon-gil-dong";
		//          01234567890123 << 이따구로 인식
		//배열 길이 (갯수)  : 배열 이름.length
		//문자열 길이(글자수): str.length()
		System.out.println("str.length(): "+str.length());
		
		char ch[]=new char[str.length()]; //배열선언, 배열생성 , 문자열 길이만큼
		
		ch[0]='B';
		ch[1]='B';
			
		
		//destination : 복사 대상 : dst 
		//str.getChars(srcBegin, srcEnd, dst, dstBegin);//
		// 			     소스데이터      소스엔드   복사할대상   복사시작
		str.getChars(5,10,ch,2);
		//				 ch[2]
		
		System.out.println(str);
	
		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
		
	
	}//main
}//class
