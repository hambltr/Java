package ch04_control;

public class Test15for2 {
	public static void main(String args[]){
		
/*  4青=row 4凯=column
    1 2 3 4 
	1 2 3 4 
	1 2 3 4 
	1 2 3 4 
*/
		for(int i=1; i<=4; i++){//row=青
			System.out.print(i+":");
			for(int k=1; k<=4; k++){//column=凯
				System.out.print(k+" ");
			}//inner-for
				System.out.println();//俺青		
		}//out-for
/*
 	 * * * *
	 * * * *
	 * * * *
	 * * * * 
*/
		System.out.println();//俺青
		
		
		for(int i=1; i<=4; i++){//row 
			for(int j=1; j<=4; j++){//column 
				System.out.print("* ");
			}//inner-for
				System.out.println();//俺青		
		}//out-for
		
	
	}//main-end
}//class-end
