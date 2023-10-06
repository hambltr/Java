package ch04_control;

public class Test03If_1 {
    public static void main(String args[]) {
   
    	int score=Integer.parseInt(args[0]);
    	char grade=' ';
    	
    	if (score>100 || score<0){
    		System.out.println("1 ~ 100 사이의 숫자를 입력하세요.");
    	}else {
    		if (score>=90) {
    			grade='A';
    			
    		}else if (score>=80){
    			grade='B';
    			
    		}else if (score>=70){
    			grade='C';
    			
    		}else if (score>=60){
    			grade='D';
    			
    		}else { 
    			grade='F';
    		
    		}
    		System.out.println("당신의 점수는 '"+score+"' 점 입니다.");
    		System.out.println("당신의 학점은 '"+grade+"' 입니다.");
    		System.out.println("수고 많으셨습니다.");

    		
    	
    		
    	}//else
    }//main
}//class
