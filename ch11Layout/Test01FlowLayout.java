package ch11Layout;
import java.awt.*; //Frame, Button
import java.awt.event.*;
//창종료


public class Test01FlowLayout extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	
	//생성자
	public Test01FlowLayout() {
		super("Layout");	
		
		b1=new Button ("1번 버튼");
		b2=new Button ("2번 버튼");
		b3=new Button ("3번 버튼");
		b4=new Button ("4번 버튼");
		b5=new Button ("5번 버튼");

		//Flowlayout 설정
		setLayout(new FlowLayout());
		
		//컨테이너에 컴포넌트(b1,b2..) 붙히기 
		this.add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		
		
		addWindowListener(new MyWin());
		setSize(450,450);
		setVisible(true);
		
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}

	}//inner-class-end

	//메서드
	//main

	public static void main(String[] args) {
		new Test01FlowLayout();
	}


}//class-end
