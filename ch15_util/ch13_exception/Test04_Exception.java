package ch13_exception;
//throw: 예외 생성
//throws: 제어권을 메서드를 호출한 곳으로 던지다.

public class Test04_Exception {
	public static void main(String args[]){
		
		int jumsu[]={66,77,88,99,100};
		try{
			//				 math.max(5,7)
			double avg=Jumsu.calcAvg(jumsu);//메서드 호출하고 결과값 받기
			System.out.println("평균: "+avg);
		}catch(JumsuException e){
			System.out.println(e);
		}
	}//main-end
}//class-end===========================

class Jumsu{
	public static double calcAvg(int score[]) throws JumsuException{
		if(score.length != 5){//예외 발생 조건
			throw new JumsuException("점수 배열 예외가 발생했습니다.");
			
		}//if-end
		
		//정상처리, 합을 구하고, 평균을 구해서 리턴해준다
		
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];// sum=sum+score[i]
		}//for-end
		double avg=(double)sum/score.length;
		
		return avg;
		
	}//clacAvg()-end
}//class-end=============================

class JumsuException extends Exception{
	public JumsuException(String msg){
		super(msg);//상위클래스 (Exception) 생성자 호출
	}
}//============================================================





