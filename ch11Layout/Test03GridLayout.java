package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class Test03GridLayout extends Frame {
	//변수
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;


	//생성자=디폴트
	public Test03GridLayout(){
		super("GridLayout");
		b1=new Button ("1번 버튼");
		b2=new Button ("2번 버튼");
		b3=new Button ("3번 버튼");
		b4=new Button ("4번 버튼");
		b5=new Button ("5번 버튼");
		b6=new Button ("6번 버튼");
		b7=new Button ("7번 버튼");
		b8=new Button ("8번 버튼");
		b9=new Button ("9번 버튼");

		//GridLayout 설정	
		setLayout(new GridLayout(3,2));//3행 2열
		
		//컨테이너에 컴포넌트 (b1, b2..) 붙히기
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		
		
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
		new Test03GridLayout();
	}//main-end
}//class-end
