package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//windowAdapter Ŭ������ ����Ͽ� â �����ϱ�
public class Test02Window extends Frame{
	//����
	//������
	public Test02Window() {
		super("â����");		

		addWindowListener(new MyWin());//�̺�Ʈ ���
		setSize(450,450);
		setVisible(true);
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		//�ʿ��� �޼��常 �������̵� �ϸ� �ȴ�
		public void windowClosing(WindowEvent we){
			dispose();
			System.exit(0);
		}

	}//inner-class-end

	//�޼���
	//main

	public static void main(String[] args) {
		new Test02Window();
	}


}//class-end
