package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//windowAdapter Ŭ������ ����Ͽ� â �����ϱ�
public class Test05Image extends Frame{
	//����
	Image img;
	//������
	public Test05Image() {
		super("�̹���");
		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\aa.jpg");

		addWindowListener(new MyWin());//�̺�Ʈ ���
		setSize(1450,1150);
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
	
	//paint()
	public void paint(Graphics g){
		g.drawImage(img, 130, 150,this);
		
	}
	//�޼���
	//main

	public static void main(String[] args) {
		new Test05Image();
	}


}//class-end
