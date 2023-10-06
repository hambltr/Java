package ch08_class;

public class hw {

	public static void main(String[] args) {
		String jumin=args[0];
		String ju= jumin.substring(7,8);
		int j= Integer.parseInt(ju);
		char ch= jumin.charAt(7); //7번째 문자 한개를 얻는다.
		
		
		if(j==1 || j==3){
			System.out.println(jumin + "은(는) 남자입니다");
		}else if (j==2 || j==4){
			System.out.println(jumin + "은(는) 여자입니다");
		}
		//:
		if(ju.equals("1")||ju.equals("3")){
			System.out.println("남");
		}else if(ju.equals("2")||ju.equals("4")){
			System.out.println("여");
		}//if-else
		
		
	/*	switch(j){
		case 1: case 3:
			System.out.println("남");
		break;
		
		case 2: case 4:
			System.out.println("여");
		break;
		}//switch-end 
	
		
		if(ch=='1' || ch=='3'){
			System.out.println("남");
			
		}else if (ch=='2' || ch=='4'){ 
			System.out.println("여");
		}//else_end
		
		//
		switch(ch){
		case '1':
		case '3':
			System.out.println("남");
		break;
		
		case '2':
		case '4':
			System.out.println("여");
		break;
		
		}//switch-end
*/		
		
		
	}//main

}//class

//switch-case로 해보십쇼