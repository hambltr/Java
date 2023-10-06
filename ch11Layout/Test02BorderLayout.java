package ch11Layout;
import java.awt.*; 
import java.awt.event.*;
//창종료


public class Test02BorderLayout extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	TextArea ta;
	
	//생성자
	public Test02BorderLayout() {
		super("BorderLayout");	
		
		b1=new Button ("1번 버튼");
		b2=new Button ("2번 버튼");
		b3=new Button ("3번 버튼");
		b4=new Button ("4번 버튼");
		b5=new Button ("5번 버튼");

		ta=new TextArea();
		
		//BorderLayout은 window 계열의 디폴트이다.
		//배치
		add(b1, "North");
		add(b2, "South");
		add(b3, "East");
		add(b4, "West");
		//add(b5, "Center");
		add(ta, "Center");
		
	
		
		
		addWindowListener(new MyWin());
		//setBounds(x, y, width, height);
		
		setBounds(100,100,500,500);
		setVisible(true);
		
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		//오버라이딩: 상속받은 메서드 재정의
		
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}

	}//inner-class-end

	//메서드
	//main

	public static void main(String[] args) {
		new Test02BorderLayout();
	}


}//class-end