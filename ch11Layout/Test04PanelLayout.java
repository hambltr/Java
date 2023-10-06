package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class Test04PanelLayout extends Frame {
	//����
	Button b1,b2,b3,b4,b5,b6,b7;
	Panel pNorth, pSouth;

	//������
	public Test04PanelLayout(){
		super("Panel��뿹��");
		
		b1=new Button ("1�� ��ư");
		b2=new Button ("2�� ��ư");
		b3=new Button ("3�� ��ư");
		b4=new Button ("4�� ��ư");
		b5=new Button ("5�� ��ư");
		b6=new Button ("6�� ��ư");
		b7=new Button ("7�� ��ư");

		pNorth=new Panel();
		pSouth=new Panel();
		
		pNorth.setBackground(Color.MAGENTA);
		pSouth.setBackground(Color.CYAN);
		
		//Panel�� ��ư ������
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pNorth.add(b4);
		
		pSouth.add(b5);
		pSouth.add(b6);
		pSouth.add(b7);
				
		//Frame��  Panel ������
		add(pNorth,"North");
		add(pSouth,"South");
		
		
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
		new Test04PanelLayout();
	}//main-end
}//class-end
