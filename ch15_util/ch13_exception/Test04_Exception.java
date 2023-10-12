package ch13_exception;
//throw: ���� ����
//throws: ������� �޼��带 ȣ���� ������ ������.

public class Test04_Exception {
	public static void main(String args[]){
		
		int jumsu[]={66,77,88,99,100};
		try{
			//				 math.max(5,7)
			double avg=Jumsu.calcAvg(jumsu);//�޼��� ȣ���ϰ� ����� �ޱ�
			System.out.println("���: "+avg);
		}catch(JumsuException e){
			System.out.println(e);
		}
	}//main-end
}//class-end===========================

class Jumsu{
	public static double calcAvg(int score[]) throws JumsuException{
		if(score.length != 5){//���� �߻� ����
			throw new JumsuException("���� �迭 ���ܰ� �߻��߽��ϴ�.");
			
		}//if-end
		
		//����ó��, ���� ���ϰ�, ����� ���ؼ� �������ش�
		
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
		super(msg);//����Ŭ���� (Exception) ������ ȣ��
	}
}//============================================================





