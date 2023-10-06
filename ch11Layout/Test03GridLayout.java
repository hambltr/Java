package ch11Layout;
import java.awt.*;
import java.awt.event.*;


public class Test03GridLayout extends Frame {
	//����
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;


	//������=����Ʈ
	public Test03GridLayout(){
		super("GridLayout");
		b1=new Button ("1�� ��ư");
		b2=new Button ("2�� ��ư");
		b3=new Button ("3�� ��ư");
		b4=new Button ("4�� ��ư");
		b5=new Button ("5�� ��ư");
		b6=new Button ("6�� ��ư");
		b7=new Button ("7�� ��ư");
		b8=new Button ("8�� ��ư");
		b9=new Button ("9�� ��ư");

		//GridLayout ����	
		setLayout(new GridLayout(3,2));//3�� 2��
		
		//�����̳ʿ� ������Ʈ (b1, b2..) ������
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		
		
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
		new Test03GridLayout();
	}//main-end
}//class-end
