package ch11Layout;
import java.awt.*; 
import java.awt.event.*;
//â����


public class Test02BorderLayout extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	TextArea ta;
	
	//������
	public Test02BorderLayout() {
		super("BorderLayout");	
		
		b1=new Button ("1�� ��ư");
		b2=new Button ("2�� ��ư");
		b3=new Button ("3�� ��ư");
		b4=new Button ("4�� ��ư");
		b5=new Button ("5�� ��ư");

		ta=new TextArea();
		
		//BorderLayout�� window �迭�� ����Ʈ�̴�.
		//��ġ
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
		//�������̵�: ��ӹ��� �޼��� ������
		
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}

	}//inner-class-end

	//�޼���
	//main

	public static void main(String[] args) {
		new Test02BorderLayout();
	}


}//class-end