package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class Test04PanelLayout extends Frame {
	//변수
	Button b1,b2,b3,b4,b5,b6,b7;
	Panel pNorth, pSouth;

	//생성자
	public Test04PanelLayout(){
		super("Panel사용예제");
		
		b1=new Button ("1번 버튼");
		b2=new Button ("2번 버튼");
		b3=new Button ("3번 버튼");
		b4=new Button ("4번 버튼");
		b5=new Button ("5번 버튼");
		b6=new Button ("6번 버튼");
		b7=new Button ("7번 버튼");

		pNorth=new Panel();
		pSouth=new Panel();
		
		pNorth.setBackground(Color.MAGENTA);
		pSouth.setBackground(Color.CYAN);
		
		//Panel에 버튼 붙히기
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pNorth.add(b4);
		
		pSouth.add(b5);
		pSouth.add(b6);
		pSouth.add(b7);
				
		//Frame에  Panel 붙히기
		add(pNorth,"North");
		add(pSouth,"South");
		
		
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
		new Test04PanelLayout();
	}//main-end
}//class-end
