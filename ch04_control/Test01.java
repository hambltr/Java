package ch04_control;
//if문, 시험문제
public class Test01 {
	public static void main(String[] args) {
		
		int x=1;
		int y=7;
		if(x<20){
			int  z=++ x + y;//지역의 지역변수 (if 안에 있음)
		}//if
		System.out.println("z: "+z); 
		//z의 에러 원인을 밝히시오
		
		//A) z는 if블럭 안쪽에서 지역변수로 선언되었기에, 
		//수식이 if블럭을 벗어나면 z변수는 소멸되므로 사용할 수 없다.
	}//main
}//class
