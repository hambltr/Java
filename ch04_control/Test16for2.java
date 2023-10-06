package ch04_control;

public class Test16for2 {
	public static void main(String[] args) {

/*		// *
		// * *
		// * * * 
		// * * * *
 */
		for(int i=1; i<=4; i++){//row - 가로줄
			for(int j=1; j<=i; j++){//column - 세로줄
				System.out.print("* ");
			}//inner-for
			System.out.println();//개행		

		}//out-for

		System.out.println("-----------------------------");
/*		####*
		###**
 		##***	
		#****
*/
		for(int i=1; i<=4; i++){

			for(int j=1; j<=(5-i); j++){
				System.out.print("#");
			}//inner-for

			for(int j=1; j<=i; j++){
				System.out.print("*");
			}//inner-for
			System.out.println();//개행
		}//out-for

		System.out.println("-----------------------------");

		for(int i=1; i<=4; i++){

			for(int j=1; j<=(5-i); j++){
				System.out.print(" ");
			}//inner-for

			for(int j=1; j<=(i*2-1); j++){
				System.out.print("*");
			}//inner-for
			System.out.println();//개행
		}//out-for

		System.out.println("-----------------------------");

		//구구단 출력 (ex. 2*1=2)
		
		for(int i=1; i<=9; i++){//행
			System.out.println();
			for(int j=2; j<=9; j++){//열
				System.out.print(j+"*"+i+"="+(i*j)+" \t");

			}//inner-for
		}//out-for
	}//main
}//class
