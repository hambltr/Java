package ch04_control;

public class Test03If {
	public static void main(String args[]){
		
		int score=Integer.parseInt(args[0]);//���ڿ��� ������ ��ȯ
		char grade=' '; // ���� ���� ����
		if (score > 100 || score < 0) {
			//�߸� �Է� �������
			System.out.println("0���� 100������ ���ڸ� �Է��ϼ���.");
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
		//System.out.println("����: "+score);
		//System.out.println("����: "+grade);
		System.out.println("����: "+score+"\n����: "+grade);
		}//eles-end
	}//main-end

}//class-end
