package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class ClassName_Bounds extends Frame {
	//변수
	Button b1,b2,b3,b4,b5;


	//생성자=디폴트
	public ClassName_Bounds(){
		super("PanelLayout");
		
		b1=new Button ("1번 버튼");
		b2=new Button ("2번 버튼");
		b3=new Button ("3번 버튼");
		b4=new Button ("4번 버튼");
		b5=new Button ("5번 버튼");

		
		addWindowListener(new MyWin());//창종료 이벤트
		setBounds(300,300,500,500);
		setVisible(true);

	}//cons-end

	//inner-class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);

		}//we
	}//inner-class-end
	public static void main(String[] args) {
		new ClassName_Bounds();
	}//main-end
}//class-end
