package ch04_control;

public class Test15for2 {
	public static void main(String args[]){
		
/*  4��=row 4��=column
    1 2 3 4 
	1 2 3 4 
	1 2 3 4 
	1 2 3 4 
*/
		for(int i=1; i<=4; i++){//row=��
			System.out.print(i+":");
			for(int k=1; k<=4; k++){//column=��
				System.out.print(k+" ");
			}//inner-for
				System.out.println();//����		
		}//out-for
/*
 	 * * * *
	 * * * *
	 * * * *
	 * * * * 
*/
		System.out.println();//����
		
		
		for(int i=1; i<=4; i++){//row 
			for(int j=1; j<=4; j++){//column 
				System.out.print("* ");
			}//inner-for
				System.out.println();//����		
		}//out-for
		
	
	}//main-end
}//class-end
