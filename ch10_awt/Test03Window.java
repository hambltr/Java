package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//이름없는 클래스 사용
public class Test03Window extends Frame{
	//변수
	//생성자
	public Test03Window(){
		super("창종료");

		//이벤트 등록
		addWindowListener(new WindowAdapter() 
		{//이 부분이 이름 없는 클래스 = 익명클래스 = Anonymus(어나니머스)
			//메서드 오버라이딩
			public void windowClosing(WindowEvent we){
				System.exit(0);//프로그램 종료
			}//WindowClosing()-end
		}//이름 없는 클래스 - end

		);
		
		setSize(450,450);
		setVisible(true);
		
	}//cons-end
	
	//main
	public static void main(String[] args) {
		new Test03Window(); //객체생성, 생성자 호출
	}//main-end

}//class-end
