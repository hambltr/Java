package ch04_control;

public class Test03If_1 {
    public static void main(String args[]) {
   
    	int score=Integer.parseInt(args[0]);
    	char grade=' ';
    	
    	if (score>100 || score<0){
    		System.out.println("1 ~ 100 ������ ���ڸ� �Է��ϼ���.");
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
    		System.out.println("����� ������ '"+score+"' �� �Դϴ�.");
    		System.out.println("����� ������ '"+grade+"' �Դϴ�.");
    		System.out.println("���� �����̽��ϴ�.");

    		
    	
    		
    	}//else
    }//main
}//class
