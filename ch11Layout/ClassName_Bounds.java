package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class ClassName_Bounds extends Frame {
	//����
	Button b1,b2,b3,b4,b5;


	//������=����Ʈ
	public ClassName_Bounds(){
		super("PanelLayout");
		
		b1=new Button ("1�� ��ư");
		b2=new Button ("2�� ��ư");
		b3=new Button ("3�� ��ư");
		b4=new Button ("4�� ��ư");
		b5=new Button ("5�� ��ư");

		
		addWindowListener(new MyWin());//â���� �̺�Ʈ
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
