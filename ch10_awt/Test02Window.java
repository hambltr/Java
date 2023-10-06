package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//windowAdapter 클래스를 사용하여 창 종료하기
public class Test02Window extends Frame{
	//변수
	//생성자
	public Test02Window() {
		super("창종료");		

		addWindowListener(new MyWin());//이벤트 등록
		setSize(450,450);
		setVisible(true);
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		//필요한 메서드만 오버라이딩 하면 된다
		public void windowClosing(WindowEvent we){
			dispose();
			System.exit(0);
		}

	}//inner-class-end

	//메서드
	//main

	public static void main(String[] args) {
		new Test02Window();
	}


}//class-end
