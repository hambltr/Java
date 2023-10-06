package ch11Layout;
import java.awt.*; //Frame, Button
import java.awt.event.*;
//â����


public class Test01FlowLayout extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	
	//������
	public Test01FlowLayout() {
		super("Layout");	
		
		b1=new Button ("1�� ��ư");
		b2=new Button ("2�� ��ư");
		b3=new Button ("3�� ��ư");
		b4=new Button ("4�� ��ư");
		b5=new Button ("5�� ��ư");

		//Flowlayout ����
		setLayout(new FlowLayout());
		
		//�����̳ʿ� ������Ʈ(b1,b2..) ������ 
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

	//�޼���
	//main

	public static void main(String[] args) {
		new Test01FlowLayout();
	}


}//class-end
