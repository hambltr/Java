package ch08_class;

public class hw {

	public static void main(String[] args) {
		String jumin=args[0];
		String ju= jumin.substring(7,8);
		int j= Integer.parseInt(ju);
		char ch= jumin.charAt(7); //7��° ���� �Ѱ��� ��´�.
		
		
		if(j==1 || j==3){
			System.out.println(jumin + "��(��) �����Դϴ�");
		}else if (j==2 || j==4){
			System.out.println(jumin + "��(��) �����Դϴ�");
		}
		//:
		if(ju.equals("1")||ju.equals("3")){
			System.out.println("��");
		}else if(ju.equals("2")||ju.equals("4")){
			System.out.println("��");
		}//if-else
		
		
	/*	switch(j){
		case 1: case 3:
			System.out.println("��");
		break;
		
		case 2: case 4:
			System.out.println("��");
		break;
		}//switch-end 
	
		
		if(ch=='1' || ch=='3'){
			System.out.println("��");
			
		}else if (ch=='2' || ch=='4'){ 
			System.out.println("��");
		}//else_end
		
		//
		switch(ch){
		case '1':
		case '3':
			System.out.println("��");
		break;
		
		case '2':
		case '4':
			System.out.println("��");
		break;
		
		}//switch-end
*/		
		
		
	}//main

}//class

//switch-case�� �غ��ʼ�