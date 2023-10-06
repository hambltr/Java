package ch04_control;

public class Test03If {
	public static void main(String args[]){
		
		int score=Integer.parseInt(args[0]);//문자열을 정수로 변환
		char grade=' '; // 학점 넣을 변수
		if (score > 100 || score < 0) {
			//잘못 입력 했을경우
			System.out.println("0부터 100까지의 숫자를 입력하세요.");
		}else {
			 if (score>=90) {
			grade='A'; 
			
		}else if(score>=80){
			grade='B';
					
		}else if(score>=70){
			grade='C';
			
		}else if(score>=60){
			grade='D';
			
		}else {
			grade='F';
			
		}
		//System.out.println("점수: "+score);
		//System.out.println("학점: "+grade);
		System.out.println("점수: "+score+"\n학점: "+grade);
		}//eles-end
	}//main-end

}//class-end
