package ch15_util;
import java.util.StringTokenizer;
//StringTokenizer : 문자열 파싱
//메서드들
//nextToken(): 파싱된 문자열을 차례로 반환한다.
//hasMoreTokens(): nextToken() 다음에 Token 잔존 여부 확인	
//countTokens(): Token의 갯수를 return 함

public class Test06_StringToken {

	public static void main(String[] args) {
		
		//토큰 분리 기호는 넣지 않으면 공백이 됨
		//토큰 분리 기호는 문장 표현에 잘 사용하지 않는 기호로 작성해야 한다. ex) "|" (shift+원화)
		
		StringTokenizer st = new StringTokenizer("김떡순|짬짜면|순대국|김밥|갈비탕","|");
													//분리 기호는 "|" 으로 하겠다 선언 (공백으로 구분하는 경우 꼭 안써줘도 됩니다.)
		System.out.println("파싱된 문자열의 총 갯수: "+st.countTokens()+" 개");
		
		System.out.println();
		
		//파싱된 문자열 출력하기
		while(st.hasMoreTokens()){//토큰이 있는 동안 반복 처리
			System.out.println(st.nextToken());//파싱된 문자열을 차례로 return
		}//while-end
		
		System.out.println();
		
		//String 클래스의 split() 로 파싱 할 수도 있다.
		String str="서울시:구로구:대륭2차";
		String temp[]=str.split(":");
		for (int i=0; i< temp.length; i++){
			System.out.println(temp[i]);
			
		}//for-end
		
	}//main
	
}//class
