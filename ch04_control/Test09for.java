package ch04_control;

public class Test09for {
	public static void main(String[] args) {

		//"목요일 5회 출력하기"
		for(int i=1; i<=5; i++){// 해당 행 i는 지역변수 이므로, 아래에서 같은 변수명으로 써먹어도 됨
			System.out.println(i+") 목요일");
		}//for-end
		System.out.println();//개행
		
		//이름 10회 출력하기
		for(int k=1; k<=10; k++){
			System.out.println(k+") 강재준");
		}
		
		System.out.println();//개행
		for(int j=1; j<=15; j++){
			System.out.println(j+" 응 아니야");
		}
		
	}//main-end
}//class-end
