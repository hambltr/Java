package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//windowAdapter 클래스를 사용하여 창 종료하기
public class Test05Image extends Frame{
	//변수
	Image img;
	//생성자
	public Test05Image() {
		super("이미지");
		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\aa.jpg");

		addWindowListener(new MyWin());//이벤트 등록
		setSize(1450,1150);
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
	
	//paint()
	public void paint(Graphics g){
		g.drawImage(img, 130, 150,this);
		
	}
	//메서드
	//main

	public static void main(String[] args) {
		new Test05Image();
	}


}//class-end
