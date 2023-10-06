package ch07_cons;
import java.awt.*;//Frame 이를 상속받아서 창을 만든다

public class Test05super extends Frame{
	//생성자
	public Test05super(){
		super("연습");//상위 클래스 생성자 호출, 생성자 안에서 첫줄에 기재해야 한다
		//this.setSize(450,450);//x,y 좌표/ 창 크기, 픽셀 단위
		//super.setSize(450,450);
		//setSize(450,450); // 창 크기 
		//setVisible(true); // 창 표시
		setBackground(Color.MAGENTA);//Math.PI
		setSize(450,450);// 창 크기 
		setVisible(true);// 창 표시
		
	}//cons_end
	
	
	public static void main(String[] args) {
		new Test05super();//객체생성, 생성자 호출
		
		
	}//main_end
}//class-end
